public class ArraysEx10 {
public static void main(String[] args) {
	int arr[]= {1,0,1,0,0,1,1};
	int Even = 0;
	  int Odd = arr.length-1;
	  int[] array = new int[arr.length];
	  
	  for (int i = 0; i < arr.length; i++) {
	    if (arr[i] % 2 == 0) {
	      array[Even] = arr[i];
	      Even++;
	    } 
	    else {
	      array[Odd] = arr[i];
	      Odd--;
	    }
	  }
	for(int i=0;i<arr.length;i++)
	{
	System.out.print(array[i]+" ");
	}

}
}