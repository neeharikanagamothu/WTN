/*Write a Program to accept a String as a command line argument and print a Welcome message as given below.
 *Example1)C:\> java Sample JohnO/P Expected : Welcome John
 */
public class LanguageBasicsEx2 {
public static void main(String[] args) 
{
	String a=args[0];
	System.out.println("Welcome "+a);
}
}
