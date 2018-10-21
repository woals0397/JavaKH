package exam;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class Inventory {
	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getAmount;
	private int inventoryAmount;

	public Inventory() {

	}

	public Inventory(String productName, Date putDate, int putAmount) {
		this.productName = productName;
		this.putDate = putDate;
		this.putAmount = putAmount;
	}

	public String toString() {
		return null;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}
	
}

public class MapTest {
	public static void main(String[] args) {
		Map<String, Inventory> map = new HashMap<String, Inventory>();
		Inventory iv = new Inventory("삼성 갤럭시S7", new Date(), 30);
		map.put("삼성 갤럭시S7", iv);
		System.out.println(iv.getGetDate());
	}
}
