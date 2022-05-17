package partteran;

public class AincreasbyLine { 
	public static void main(String a[])
	{
	
		//increase(4);
		decreasing(4);
		//SameLetterLineInBothIncressAndDecress(4);

		//triangle(4);
	}
	
	
	
//increasing partten
	
			static void increase(int n)
			{
				
				for(int row=0;row<=n;row++)
				{
					for(int i=0,p='A';i<=row;i++,p++)
					{
						System.out.print((char)p+"");
					}
					
					
					
					System.out.println();
				
				}
			}
//Decreasing 
			
			static void decreasing(int n)
			{
				
				for(int row=0;row<=n;row++)
				{
					for(int i=row,p='A';i<=n;i++,p++)
					{
						System.out.print((char)p+"");
					}
					
					
					
					System.out.println();
				
				}
		
			}
		
//SameLetterLineInBothIncressAndDecress
			
			
			static void SameLetterLineInBothIncressAndDecress(int n)
			{
				
				for(int row=0,p='A';row<=n;row++,p++)
				{
					for(int i=0;i<=row;i++)
					{
						System.out.print((char)p+" ");
					}
					
					
					
					System.out.println();
				
				}
			}
			
//triangle
			
			static void triangle(int n)
			{
				
				for(int row=0;row<=n;row++)
				{
					for(int s=row;s<=n;s++)
					{
						System.out.print(" ");
					}
					for(int i=0,p='A';i<=row;i++,p++)
					{
						System.out.print((char)p);
					}
					for(int i=0,p='A';i<row;i++,p++)
					{
						System.out.print((char)p);
					}
					
					
					
					System.out.println();
				
				}
			}
			

}

