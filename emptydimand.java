package partteran;

public class emptydimand {
	public static void main(String a[])
	{
		int row = 8;
		int col = 4;
		for(int r=0;r<=row;r++)
		{
			int c= r > col ? row- r : r;
			for(int s=row;s>c;s--)
			{
				System.out.print(" ");
			}
			for(int i=0;i<=c;i++)
			{
				if(i == 0 || i == row)
				{
				
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			for(int i=0;i<=c;i++)
			{
				if(i == col || i == c)
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
