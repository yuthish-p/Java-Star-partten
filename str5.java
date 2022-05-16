package partteran;

public class str5 {
	public static void main(String a[])
	{
		int row =4;
		for(int i=0;i<row;i++)
		{
			for(int j=row-1;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			

			System.out.println();
		}
		
	}

}
