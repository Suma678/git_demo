package programs;

public class ForLoop {
	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		for(int x=1; x<=n; x++)
		{
			sum+=x;
		}
		System.out.println(sum+" ");
		System.out.println(" ");
		for(int x=1; x<=10; x++)
		{
			if(x%2==0)
			{
				System.out.print(x+" ");
			}
		}
		System.out.println();
		for(int x=1; x<=10; x++)
		{
			if(x%2!=0)
			{
				System.out.print(x+" ");
			}
		}
		System.out.println();
		for (int i=3; i<=15; i++)
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
