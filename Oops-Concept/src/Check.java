import java.util.HashMap;
import java.util.Map;

public class Check {
	
	public void add(Object o) {
		
	}
	
public void add(String o) {
		
	}

public void add(Integer o) {
	
}

public static void main(String[] args) {
	
	Map<String, String> map = new HashMap<>();
	map.put("Manish", "Hello");
	
	System.out.println(map.get("manish").toString());
	System.out.println(map.get("Hello"));
}


}
