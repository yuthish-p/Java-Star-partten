package partteran;

public class leftsideline {
	public static void main(String a[])
	{
		int n=4;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++ )
			{
				if(i == n-j)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
				
			}
			
			
			
			
			
			System.out.println();
		}
	}

}
