import java.util.Scanner;
class MultiplicationOf2Matrices 
{
	public static void main(String[] args) 
	{
		int[][] res = new int[2][2];
		int [][] a = new int [2][2];
		int [][] b = new int [2][2];
        
         Scanner sc = new Scanner(System.in);
		
          //matrix A
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
		    System.out.println("Enter A["+i+"]["+j+"] = ");
			a[i][j] = sc.nextInt();
			}
			
		}
		//Matrix B
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
		    System.out.println("Enter B["+i+"]["+j+"] = ");
			b[i][j] = sc.nextInt();
			}
		}
		//resultant matrix
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i].length;k++)
				{
                  res[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		
		
	
	System.out.println("A Matrix");
          printMatrix(a);
		  System.out.println("B Matrix");
          printMatrix(b);
		  System.out.println("res Matrix");
          printMatrix(res);

	}
	
	public static void printMatrix(int[][] arr)
	{
	for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
		    System.out.print(+arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
