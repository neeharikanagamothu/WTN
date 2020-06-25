public class ArraysEx8 {
public static void main(String[] args) {
	int arr[]= {1,6,2,3,4,7,9,8,3,2};
	int sum=0;
	boolean add=true;
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]!=6 && add==true)
			 sum=sum+arr[i];
		 else if(arr[i]==6)
		 {
			 if((i+1)==arr.length)
				 sum=sum+arr[i];
			 else
				 add=false;
		 }
		 else if(arr[i]==7)
			 add=true;
	 }
	 System.out.println(sum);
}
}