class Bank
{
	String name="SBI";
	private int minBalance=5000;
	float interest=3.5f;
	
	public void setminBalance(int amount)
	{
		if(amount>5000)
		{
			this.minBalance=amount;
		}
	}
	
	public int display()
	{
		return this.minBalance;
	}
	
	public static void main(String[] args)
	{
		Bank branchManager=new Bank();
		System.out.println(branchManager.name);
		branchManager.openAccount();
	}
	public void openAccount()
	{
		System.out.println("Check");
	}
	private void closeAccount()
	{
		System.out.println("Account closed");
	}
}
