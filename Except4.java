import java.util.Scanner;

public class Except4 {

	public static void register_user(String name, String country) throws InvalidCountryException {
		if(!country.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User Registeration done Successfully");
	}
	public static void main(String args[]) {
		Except4 r = new Except4();
		
		try {
			//r.register_user("Mickey", "US");
			r.register_user("Mini", "India");
		} catch (InvalidCountryException e) {
			//System.out.println(e.getMessage());
		}
		
	}
}
