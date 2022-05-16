package partteran;

public class jointrinagle {
	public static void main(String args[])
	{
		int row=8,c=4;
		for(int i=0;i<=row;i++)
		{
			int col = i > c ? row-i:i;
			for(int j=0;j<col;j++)
			{
				System.out.print(" ");
			}
			for(int k=c;k>=col;k--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
	}

}
