package partteran;

public class emptybox {
	public static void main(String a[])
	{
		int n=4;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
						
				if(i == 0 || i ==n)
				{
					System.out.print("* ");
			
				}else if(j ==0 || j== n)
			
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
