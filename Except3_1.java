
public class Except3_1 extends Except3 {

	public class ValuesOutOfRangeException extends Exception {
		public ValuesOutOfRangeException() {
			super();
			System.out.println("ValuesOutOfRangeException occured");
		}
	}
}
