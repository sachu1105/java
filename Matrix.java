import java.util.Scanner;
public class Matrix
{
	public static void main(String[] args)
{
		Scanner s1=new Scanner(System.in);
			System.out.println("Enter the number of rows and column");
				int r=s1.nextInt();
				int c=s1.nextInt();
				int a[][]=new int[r][c];
//readin g matric//

			System.out.println("Enter the matrix");
				for(int i=0;i<r;i++)
	{
				for(int j=0;i<c;i++)
				{
				a[i][j]=s1.nextInt();
				}	
	}

			

//printing matrix//

			System.out.println("Matrix is");
				for(int i=0;i<r;i++)
	{
				for(int j=0;i<c;i++)
				{
			

			System.out.println(a[i][j]);

				}	
	}


	

}
}
			