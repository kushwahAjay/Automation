package Scripts;

public class SiftLeftByNinty {

	public static void main(String[] args) {
		int arr[][]={{1,2,3},{2,4,7},{1,3,5}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=arr[j][i];
			}
			int k=arr.length-1;
			
				
			
			for(int j=0;j<arr.length/2;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[k][j];
				arr[k][j]=temp;
				k--;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}

	}

}
