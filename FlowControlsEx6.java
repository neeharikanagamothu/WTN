public class FlowControlsEx6 {
	public static void main(String[] args) 
	{
		int age=Integer.parseInt(args[1]);
		String gender=args[0];
		if(gender.equals("Female")) {
			if(age>=1&&age<=58)
				System.out.println("Interest = 8.2%");
		else if(age>=59&&age<=100) 
			System.out.println("Interest = 9.2%");
		}
		else {
			if(age>=1&&age<=58)
				System.out.println("Interest = 8.4%");
		else if(age>=59&&age<=100) 
			System.out.println("Interest = 10.5%");
		}

}
}