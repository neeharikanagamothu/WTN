class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		super();
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India  cannot be registered");
	}
}

public class ExceptionHandlingEx4 {
	
		public void registerUser(String username, String userCountry) throws InvalidCountryException {
			if (!userCountry.equals("India"))
				throw new InvalidCountryException();
			else
				System.out.println("User registration done successfully");
			
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ExceptionHandlingEx4 registration = new ExceptionHandlingEx4();
			
			try {
				//registration.registerUser("Mickey", "US");
				registration.registerUser("Mini", "India");
			} catch (InvalidCountryException e) {
				//System.out.println(e.getMessage());
			}
		}

	}