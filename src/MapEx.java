import java.util.HashMap;
import java.util.Map;

public class MapEx {
	public static void main(String[] args) {
		Map<String, String> map;
		map = new HashMap();
		
		map.put("key1" , "value1");
		map.put("key2" , "value2");
		map.put("key3" , "value3");
		
		for(String key : map.keySet()) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
	}
}
