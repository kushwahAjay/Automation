package Scripts;

public class COLSwap {

	public static void main(String[] args) {
		int arr[][]={{1,2,3},{2,4,7},{1,3,5}};
		
		System.out.println("printing the elements");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			int k = arr.length-1;
			
			for(int j=0;j<arr.length/2;j++)
			{
				int temp=0;
				temp=arr[i][j];
				arr[i][j]=arr[i][k];
				arr[i][k]=temp;
			}
			k--;
			
		}
		System.out.println();
		System.out.println("printing the elements after swaping the cols");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
			

	}

	}


