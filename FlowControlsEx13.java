public class FlowControlsEx13 {
public static void main(String[] args) {
	int temp,i;
	for(i=10;i<=99;i++)
	{
		temp=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				temp=1;
				break;
			}
		}
		if(temp==0)
			System.out.println(i);
	}
}
}