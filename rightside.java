package partteran;

public class rightside {
	public static void main(String a[])
	{
		
		int row=4;
		for(int i=0;i<=row;i++)
		{
			
			for(int  j=0;j<=row;j++)
			{
				if(  i == j  )
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
