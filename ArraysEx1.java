public class ArraysEx1 {
public static void main(String[] args) {
	int arr[]=new int[] {1,2,3,4,5};
	int sum=0;
	float avg=1;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
		avg=avg*arr[i];
	}
	System.out.println("Sum ="+sum);
	System.out.println("Avg ="+avg);
}
}