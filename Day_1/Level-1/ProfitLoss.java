/*
Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
Hint => 
Use a single print statement to display multiline text and variables.
Profit = selling price - cost price
Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => 
The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___
*/


public class ProfitLoss{
	public static void main(String[] args){

		// create a variable to indicate cost price
		int costPrice = 129;

		// create a variable to indicate selling price
		int sellingPrice = 191;

		// create a variable to indicate profit
		int profit = sellingPrice - costPrice;

		// create a variable to indicate profit percentage
		double profitPercentage = (double)profit / (double)costPrice * 100;

		// print the detail
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);

	}
}