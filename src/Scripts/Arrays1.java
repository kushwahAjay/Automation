package Scripts;

public class Arrays1 {

	public static void main(String[] args) {
		int a1[][]={{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;int sum1=0;
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a1.length;j++)
			{
				if(i==j)
				{
				sum=sum+a1[i][j];
				
				}
				if(i+j==2)
				{
					sum1=sum1+a1[i][j];
				}
					
			}
		
		}
       System.out.println(sum);
       System.out.println(sum1);
	}

}
