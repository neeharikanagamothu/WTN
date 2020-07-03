/*Initialize two character variables in a program and display the characters in alphabetical order.
 *Example1) if the first character is 's' and second character is 'e' then the output should be e,s
 *Example2) if the first character is 'a' and second character is 'e', then the output should be a,e
 */
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
