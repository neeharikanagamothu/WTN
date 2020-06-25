public class FlowControlsEx4 {
public static void main(String[] args) {
	String abc=args[0];
	char string1=abc.charAt(0);
	String def=args[1];
	char string2=def.charAt(0);
	if(string1>string2)
		System.out.println(string2+","+string1);
	else
		System.out.println(string1+","+string2);	
}
}