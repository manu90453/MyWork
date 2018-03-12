package com.method;

public class Employee {
	int eid;
	int dob;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int tEid, int tDob) {
		this.eid = tEid;
		this.dob = tDob;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dob;
		result = prime * result + eid;
		System.out.println(result);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("Same object");
			return true;
		}
		if (obj == null) {
			System.out.println("If Object is null");
			return false;
		}
		if (!(obj instanceof Employee)) {
			System.out.println("if differnt class call");
			return false;
		}
		Employee other = (Employee) obj;
		if (dob != other.dob && eid != other.eid) {
			System.out.println("if object is not equals");
			return false;
		}
		System.out.println("If eqauls return true");
		return true;
	}
}
