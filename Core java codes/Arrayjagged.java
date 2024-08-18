public class Arrayjagged {
     public static void main(String[] args){
		int nums[][]= new int[3][];
		nums [0]=new int[4];
		nums [1]=new int[2];
		nums [2]=new int[3];
		nums[0][0]=3;
		nums[0][1]=3;
		nums[0][2]=9;
		nums[0][3]=9;
		nums[1][0]=9;
		nums[1][1]=1;
		nums[2][0]=5;
		nums[2][1]=8;
		nums[2][2]=4;

		// int nums [][]={
		// 	{3,9,7,5},
		// 	{1,5},
		// 	{8,4,5}
		//  };
		
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				System.out.print(nums[i][j]+ " ");
			}
			System.out.println();
		}  
	}
}

