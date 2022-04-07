
public class InvalidCountryException extends Exception {

	public InvalidCountryException() {
		super();
		System.out.println("InvalidCountryException occured");
		System.out.println("User outside the country cannot be registered.");
	}
}
