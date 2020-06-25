public class FlowControlsEx14 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int rem,value=0;
	while(n!=0)
	{
		rem=n%10;
		value=value+rem;
		n=n/10;
		
	}
	System.out.println(value);
}
}