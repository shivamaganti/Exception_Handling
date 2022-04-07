
public class Except5 {

	public static void main(String[] args) throws InvalidAgeException {
		
		String name = args[0];
		int n = Integer.parseInt(args[1]);
		
		if(n >= 18 || n < 60) 
			throw new InvalidAgeException();
		
		System.out.println(name+" "+n);
	}
	

}


