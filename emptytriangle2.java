package partteran;

public class emptytriangle2 {
	public static void main(String a[])
	{
		int row=5;
		for(int  r=0;r<=row;r++)
		{
			for(int s=r;s<=row;s++)
			{ 
				System.out.print(" ");
			}
			for(int i=0;i<=r;i++)
			{
				if(r == row || i == 0 )
				{
					System.out.print("*");
					
				}else {
				
					System.out.print(" ");
				}
			}
			for(int i=1;i<=r;i++)
			{
				if(r == row || i == r )
				{
					System.out.print("*");
					
				}else {
				
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
