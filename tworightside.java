package partteran;

public class tworightside {
	public static void main(String a[])
	{
		int n=4;
		for(int r=0;r<=2*n;r++)
		{
			int col = r >n ? 2*n-r:r;
			for(int j =0;j<=col;j++)
			{
				System.out.print("* ");
			}
			
			
			
			
			
			System.out.println();
		}
	}

}
