package Scripts;

public class UnionAndIntersectionofArray 
    {
    public static void main(String[] args)
       {
	     int arr1[]={1,2,3,4};
	     int arr2[]={5,2,7,8};
	     int arr3[]=new int[arr1.length+arr2.length];
	     int k=0;
	     for(int i=0; i<arr1.length;i++)
	     {
	 			arr3[k]=arr1[i];
	 			k++;
	 		   
	 	}
	     
	     int key=0;
	 	 for(int i=0;i<arr2.length;i++)
	 	 {
	 	 
	 	for(int j=0;j<arr1.length;j++)
	 	 { 	 		
	 		key=0;
	 		
	 			if(arr2[j]==arr1[i])
	 			{
	 			     key=1;
	 			     break;
	 			}
	 	 }
	 		if(key==0)
	 		{
	 			arr3[k]=arr2[i];
	 			k++;
	 		}
	 	
	 		
	  }
	 	 for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
	 	 
}}
    