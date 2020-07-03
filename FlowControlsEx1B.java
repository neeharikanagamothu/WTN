/*Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 
 *lastDigit(7, 17) → true lastDigit(6, 17) → false lastDigit(3, 113) → true
 */
public class FlowControlsEx1B {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=a%10;
	int d=b%10;
	if(c==d) 
		System.out.println("True");
	else 
		System.out.println("False");
}
}
