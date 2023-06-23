package com.matrix;

import java.util.Scanner;
class Matrix 
{
	public int[][] readMat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Order of the matrix: ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat=new int[row][col];
		System.out.println("Enter"+row*col+"elements");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	public void dispMatrix(int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//Define a method to return the sum of matrix elements

	public int sumOfMatrix(int[][] mat)
	{
		int sum=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				sum=sum+mat[i][j];
			}
		}
		return sum;
	}

	//Define a method to return the biggest element from the matrix

	public int getBiggest(int[][] mat)
	{
		int big=mat[0][0];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]>big)
					big=mat[i][j];
			}
		}
		return big;
	}

	//Define a method to return the smallest element from the matrix

	public int getSmallest(int[][] mat)
	{
		int small=mat[0][0];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]<small)
					small=mat[i][j];
			}
		}
		return small;
	}

	//Define a method to add two matrix


	public int[][]addMat(int [][]mat1,int [][]mat2)
	{
		if (mat1.length!=mat2.length||mat1[0].length!=mat2[0].length)
		{
			System.out.println("order must be same");		
			return null;
		} 
		
		int add[][]=new int[mat1.length][mat2[0].length];
		for(int i=0;i<add.length;i++)
		{
			for(int j=0;j<add[i].length;j++)
					{
					add[i][j]=mat1[i][j]+mat2[i][j];
					}
		}
		return add;
	}


	//Define a method to return how many even and odd numbers
	
	public int[] countEO(int [][] mat)
	{
		int ec=0,oc=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]%2==0)
					ec++;
				else
					oc++;
			}
		}
		int[] count={ec,oc};
			return count;
	}

	//Define a method to return how many prime numbers present in the matrix
		   
	public int countPrimeNo(int [][]mat)
	{
		int count=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				boolean pn=isPrime(mat[i][j]);
				if(pn==true)
					count++;
			}
		}
		return count;
	}
	
	public boolean isPrime(int x)
	{
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}
	
	//Define a method to return row wise biggest element?

	public int[] rowWiseBig(int [][]mat)
	{
		
		int[] big=new int[mat.length];
		for(int i=0;i<mat.length;i++)
		{
			int max=mat[i][0];
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]>max)
					max=mat[i][j];
			}
			big[i]=max;
		}
		return big;
	}
	
	//Define a method to return column wise biggest element?

	public int[] colWiseBig(int [][]mat)
	{
		
		int[] big=new int[mat[0].length];
		for(int i=0;i<mat[0].length;i++)
		{
			int max=mat[0][i];
			for(int j=0;j<mat.length;j++)
			{
				if(mat[j][i]>max)
					max=mat[j][i];
			}
			big[i]=max;
		}
		return big;
	}

	//Define a method to return row wise Sum?

	public int[] rowWiseSum(int [][]mat)
	{
		int[] sum=new int[mat.length];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				sum[i]=sum[i]+mat[i][j];
			}
		}
		return sum;
	}

	//Define a method to return column wise Sum?

	public int[] colWiseSum(int [][]mat)
	{
		int[] sum=new int[mat[0].length];
		for(int i=0;i<mat[0].length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				sum[i]=sum[i]+mat[j][i];
			}
		}
		return sum;
	}

}
