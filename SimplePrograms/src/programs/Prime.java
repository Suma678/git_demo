package programs;

public class Prime {

	public static void main(String[] args) {
		int i, m=0, n=3, flag=0;
		
		m=n/2;
		if  (n==0 || n==1) {
			System.out.println("Number is not Prime");
			else {
				for (i=2; i<=m; i++)
				if(n%i==0)
				{
					flag=1;
					break;
				}
				else 
				
				
			}
		}	
	}

}
