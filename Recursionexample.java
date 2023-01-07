package recursionpractise;

public class Recursionexample {
	int sum=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recursionexample test=new Recursionexample();
		test.display(5);
		//int sum=0;

	}
	
	public void display(int num)
	{
		
		sum=sum+num;
		System.out.println(num);
		num--;
		if(num>0)
		{
		display(num);
		}
		else {
			System.out.println(sum);
		}
		
	
	}
	
	

}
