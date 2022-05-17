package partteran;

public class croossides {
	public static void main (String a[])
	{
		int row =4;

		for(int r=0;r<=2*row;r++)
		{
		 
		
			int c = r > row ? 2*row - r : r;
			for(int i=0;i<=c;i++) // side 1
			{
				System.out.print("*");
			}
			for(int s1=c;s1<row;s1++) // space
			{
				System.out.print("  ");
			}

			for(int i=0;i<=c;i++)    //side2
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}

}
