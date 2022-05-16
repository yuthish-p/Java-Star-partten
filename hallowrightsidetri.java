package partteran;

public class hallowrightsidetri {
	public static void main (String a[])
	{
		int n=4;
		for(int i=0;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				if(i == 0 || j == i || j == n)
				
					{
					System.out.print("* ");
					}else
					{
						System.out.print("  ");
					}
			}
			System.out.println();
		}
	}

}
