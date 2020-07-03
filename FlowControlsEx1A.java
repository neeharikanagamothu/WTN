//Write a program to check if a given integer number is Positive, Negative, or Zero.
public class FlowControlsEx1A {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	if(a==0)
		System.out.println("Zero");
	else if(a<0)
		System.out.println("Negative Number");
	else
		System.out.println("Positive Number");
}
}
