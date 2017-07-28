package com.method;

import java.util.HashMap;
import java.util.Map;

public class ContractTest extends Object {
	int i;
	public static void main(String[] args) {
		Map<Employee, String> cache = loadEmpDetails();
		Employee e4 = new Employee(102, 170721995);
		//System.out.println(e4.hashCode());
		System.out.println(cache.get(e4));
	}
	
	
	static Map<Employee, String> loadEmpDetails() {
		Employee e1 = new Employee(101, 20041990);
		Employee e2 = new Employee(102, 170721995);
		//System.out.println(e2.hashCode());
		Employee e3 = new Employee(103, 24041989);;
		
		Map<Employee, String> empCache = new HashMap<Employee, String>();
		empCache.put(e1, "Manish");
		empCache.put(e2, "Kavya");
		empCache.put(e3, "Amit");
		return empCache;
	}
	
	public void get() {
		System.out.println(i);
	}
}


class A extends ContractTest {
	
}

=======
>>>>>>> dea76909bd8a9585bda78a8778ea7be8ce4440e8
