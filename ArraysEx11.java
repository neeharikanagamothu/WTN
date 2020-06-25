public class ArraysEx11 {
public static void main(String[] args) {
	int arr[]= {1,4,1,4};
	boolean isTrue = true;
	  
	  for (int i = 0; i < arr.length; i++) {
	    if (arr[i] != 1 && arr[i] != 4)
	      isTrue = false;
	  }
	System.out.print(isTrue+" ");

}
}