public class ArraysEx3 {
public static void main(String[] args) {
	int n[]=new int[]{1,3,5,7,9,13,15,17,19};
	int key=Integer.parseInt(args[0]);
	int num=0,pos=0;
	for(int i=0;i<n.length;i++)
	{
		if(n[i]==key)
		{
			num=1;
			pos=i;
		}
	}
	if(num==1)
		System.out.println(pos);
	else
		System.out.println("-1");
		
}
}