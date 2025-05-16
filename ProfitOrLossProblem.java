class ProfitOrLossProblem
{
	public static void main(String args[])
	{
		double costPrice=100000;
		double sellingPrice=70000;
		double profit=0;
		double profitPer=0;
		double loss=0;
		double lossPer=0;
		if(sellingPrice>costPrice)
		{
		     profitPer=(sellingPrice-costPrice)/costPrice*100;
		     profit=sellingPrice-costPrice;
		}
		else
		{
		     lossPer=(costPrice-sellingPrice)/costPrice*100;
		     loss=costPrice-sellingPrice;
		}


		System.out.println("Bike cost Price is :"+costPrice);
		System.out.println("Bike Selling Price is :"+sellingPrice);
		System.out.println("Profit is :"+profit);
		System.out.println("loss is   :"+loss);
		System.out.println("Loss Percentage is :"+lossPer);
		System.out.println("Profit Percentage is :"+profitPer);
               
	}
}