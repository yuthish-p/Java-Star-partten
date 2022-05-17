package partteran;

public class emptycrosssides {
	public static void main (String a[])
	{
		int row =4;

		for(int r=0;r<=2*row;r++)
		{
		 
		
			int c = r > row ? 2*row - r : r;
			for(int i=0;i<=c;i++) // side 1
			{
				if(i == 0 || i == c)
				{
				
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			for(int s1=c;s1<row;s1++) // space
			{
				System.out.print("  ");
			}

			for(int i=0;i<=c;i++)    //side2
			{
				if(i == 0 || i == c)
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
