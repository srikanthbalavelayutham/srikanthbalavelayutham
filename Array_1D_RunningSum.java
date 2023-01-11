package basics;

public class Array_1D_RunningSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums= {1,2,3,4};
		
		int total=0;
		
		for(int i=0;i<nums.length;i++)
		{
			total=total+nums[i];
			nums[i]=total;
		}
		
		//System.out.println(total);
		
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+"||");
		}

	}

}
