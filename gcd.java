import java.util.Scanner;
public class ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t,y=1,x,z,temp,temp1;
		System.out.println("Enter the first number");
		int a=in.nextInt();
		System.out.println("Enter the second number");
		int b=in.nextInt();
		x=a;
		z=b;
		while(true)
		{
			if(a>b)
			{
				if(a%b==0)
				{
					temp=b;
					break;
				}
				else
				{
					a=a%b;
				}
			}
			else
			{
				if(b%a==0)
				{
					temp=a;
					break;
				}
				else
				{
					b=b%a;
				}
			}
		}
		System.out.println(temp);
	}
}