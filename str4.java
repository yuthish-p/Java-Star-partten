package partteran;

public class str4 {
	public static void main(String arg[])
	{
		int row=4;
		for(int  r=0;r<row;r++)
		{
			for(int j=row-1;j>r;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=r;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
