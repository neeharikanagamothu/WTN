public class ArraysEx9 {
public static void main(String[] args) {
	int arr[]= {1,10,10,2};
	int i=0;
	while(i < arr.length && arr[i] != 10)
        i++;
              
    for(int j = i + 1; j < arr.length; j++) {
        if(arr[j] != 10) {
            arr[i] = arr[j];
            arr[j] = 10;
            i++;
        }
    }
                                              
    for( ; i < arr.length; i++)
        arr[i] = 0;
     for(i=0;i<arr.length;i++)
	{
	System.out.print(arr[i]+" ");
	}

}
}