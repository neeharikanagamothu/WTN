public class ArraysEx2 {
public static void main(String[] args) {
	int arr[]=new int[] {1,2,3,4,5};
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Max ="+max);
		System.out.println("Min ="+min);
		
}
}