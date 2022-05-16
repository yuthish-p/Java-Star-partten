package partteran;

public class emptytrriangel {
	public static void main(String a[])
	{
		int n=4;
		for(int i=0;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				if(  i == n || k == 0 || k == i )
				{
				
					System.out.print(" * ");
			
				}else
				{
					System.out.print(" ");
					
				}
				}
			
			
			
			
			
			
			System.out.println();
	
		}
	}

}
