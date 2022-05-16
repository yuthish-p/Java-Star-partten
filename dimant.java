package partteran;

public class dimant {
	public static void main(String a[])
	{
		int row =8,n=4;
		
		for(int r =0;r<=row;r++)
		{
			int col = r>n ? row-r : r;
			for(int j=n;j>=col;j--)
			{
				
				
				System.out.print(" ");
				
			}
			for(int k =0;k<=col;k++)
			{
				if(k == r )
				{
				System.out.print("* ");
			
				}
			}
			
				
			
			System.out.println();
		}
	}

}
