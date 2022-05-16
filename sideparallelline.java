package partteran;

public class sideparallelline {
	public static void main(String a[])
	{
		int n=4;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j == 0 || j == n)
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
