public class FlowControlsEx7 {
public static void main(String[] args) {
	String string=args[0];
	char c=string.charAt(0);
	int temp;
	if(c>='a' && c<='z')
	{
		System.out.print(c+"->");
		temp=(int)c;
		c=(char)(temp-32);
		System.out.println(c);
	}
	else
	{
		System.out.print(c+"->");
		temp=(int)c;
		c=(char)(temp+32);
		System.out.println(c);
	}
	
}
}