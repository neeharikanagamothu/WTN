public class FlowControlsEx5 {
public static void main(String[] args) {
	String a=args[0];
	char string=a.charAt(0);
	if((string>=65 && string<=90) || (string>=97 && string<=122))
				System.out.println("Alphabet");
	else if(string>=48 && string<=57) 
		System.out.println("Digit");
	else
		System.out.println("Special Character");
}
}