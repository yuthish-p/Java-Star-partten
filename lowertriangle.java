package partteran;

public class lowertriangle {
	public static void main(String a[])
	{
		int row=4;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=row;k>i;k--)
			{
				System.out.print("* ");
			}
			
			
		
			System.out.println();
		}
	}

}
