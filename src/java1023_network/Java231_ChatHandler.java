package java1023_network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Vector;

public class Java231_ChatHandler implements Runnable {
	Socket socket;
	private DataInputStream dataIn;
	private DataOutputStream dataOut;
	Thread th;
	private static Vector<Java231_ChatHandler> userVec = new Vector<>();

	public Java231_ChatHandler() {

	}

	public Java231_ChatHandler(Socket socket) {
		this.socket = socket;
	}

	public void initStart() {
		try {
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			dataIn = new DataInputStream(new BufferedInputStream(is));
			dataOut = new DataOutputStream(new BufferedOutputStream(os));
			th = new Thread(this);
			th.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		userVec.addElement(this);
		while (!Thread.interrupted()) {
			try {
				String message = dataIn.readUTF();
				System.out.println(message);
				broadcast(message);
			} catch (IOException e) {
				// e.printStackTrace();
				System.out.println(socket.getInetAddress().getHostAddress() + "님이 나갔습니다.");
				return;
			}
		}
	}

	synchronized public void broadcast(String message) {
		Enumeration<Java231_ChatHandler> enu = userVec.elements();
		while (enu.hasMoreElements()) {
			Java231_ChatHandler handler = enu.nextElement();
			try {
				handler.dataOut.writeUTF(message);
				handler.dataOut.flush();
			} catch (IOException e) {
				e.printStackTrace();
				handler.stop();
			}
		}
	}

	synchronized public void stop() {
		if (th != null) {
			if (th != Thread.currentThread()) {
				th.interrupt();
				th = null;
				try {
					dataIn.close();
					dataOut.close();
				} catch (IOException e) {
					// e.printStackTrace();
				}
			}
		}
	}

}
