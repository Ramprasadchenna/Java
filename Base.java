package sample;


	class Base {

		private Base() {System.out.print("Base");}

		}

		public class Derived extends Base {

		public Derived() {System.out.println("Derived");
		}
		public static void main(String[] args) {

		new Derived();

		}

		}