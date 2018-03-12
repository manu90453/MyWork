


public class LambdaEx {

		// First Way
		/*public static void main(String[] args) {
		Functional functional = new MyClass();
		String name = returnName(functional);
		System.out.println("Name: "+name);
		}*/


		// Second Way
		/*public static void main(String[] args) {

		String name = returnName(new Functional() {
		@Override
		public String getName() {
		return "Manish Sharma";
		}
		});

		System.out.println("Name: "+name);
		}



		public static String returnName(Functional functional){
		return functional.getName();
		}*/


		// Third Way
		/*public static void main(String[] args) {

		String name = returnName(new Supplier<String>() {
		@Override
		public String get() {
		return "Manish Sharma";
		}
		});

		System.out.println("Name: "+name);
		}



		public static String returnName(Supplier<String> functional){
		return functional.get();
		}*/
	
		static String n = "Sharma";

		public static void main(String[] args) {

		String s = "Manish";

		String name = returnName( () -> {
			//s=s+2;
			n=s+" "+n;
			return n;
			
			
		});

		System.out.println("Name: "+name);
		}



		public static String returnName(Functional functional){
		return functional.getName();
		}

		}

		class MyClass implements Functional {

		@Override
		public String getName() {
		return "Manish Sharma";
		}

	
}
