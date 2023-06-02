package com.logicalPrgms;

import org.testng.annotations.Test;

public class ArraysPrgm 
{
	
	
	@Test
	public void sortArray()
		 {
		        int[] arr = {5, 2, 8, 12, 1, 6};
		        System.out.println("Original array: ");
		        printArray(arr);

		        insertionSort(arr);

		        System.out.println("Sorted array: ");
		        printArray(arr);
		    }

		    public static void insertionSort(int[] arr) {
		        int n = arr.length;
		        for (int i = 1; i < n; i++) {
		            int key = arr[i];
		            int j = i - 1;
		            while (j >= 0 && arr[j] > key) {
		                arr[j + 1] = arr[j];
		                j = j - 1;
		            }
		            arr[j + 1] = key;
		        }
		    }

		    public static void printArray(int[] arr) {
		        for (int i : arr) {
		            System.out.print(i + " ");
		        }
		        System.out.println();
		    }
	
	
	
	@Test
	public void sortArrayWithoutInbuilt()
	{
		int ar[]= {8,6,4,7,9,5};
		
//		int sr[]= new  int[ar.length];
//		int m=0;
//		for (int i = 0; i < ar.length; i++) {
			
		for (int j = 1; j <ar.length; j++) 
		{
			int max=ar[j];
			int m=j-1;
			while(max>ar[m] && m>=0)
			{
				ar[m+1]= ar[m];
				m=m-1;
			}
			ar[m+1]=max;
		}
//		sr[m]=max;
//		m++;
//		}
		for (int k = 0; k < ar.length; k++) {
			System.out.println(ar[k]);
		}
	}
	
	@Test
	public void arraySum()
	{
		int[] a= {4,-9,5,1,8,-3,6,-7};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}
	
}
