public class FlowControlsEx17 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int temp=n;
	int curr=0,rem;
	while(temp!=0)
	{
		rem=temp%10;
		curr=curr*10+rem;
		temp=temp/10;
	}
	if(n==curr)
		System.out.println("Palindrome");
	else
		System.out.println("Not Palindrome");
		
}
}