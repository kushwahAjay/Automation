package Scripts;

import java.util.Arrays;

public class ConcatArr {

	public static void main(String[] args) {
		int arr1[]={1,2,3,4};
		int arr2[]={5,6,7,8};
		int arr3[]=new int[arr1.length+arr2.length];
		int k=0;
		for(int i=0;i<arr1.length;i++)
		{
			arr3[k]=arr1[i];
			k++;
		}
		for(int j=0;j<arr2.length;j++)
		{
			arr3[k]=arr2[j];
			k++;
		
		}
		
		
		System.out.println(Arrays.toString(arr3));
	}

}
