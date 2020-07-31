public class Moneyc 
{
	public static void main (String[] args) 
	{
	int quarters= 12;
	int dimes= 20;
	int nickels= 30;
	int pennies= 150;
	int totalpennies = calculatePennies(quarters,dimes,nickels,pennies);
	int totalquarters = calculateQuarter(totalpennies);
	System.out.println(totalpennies);
   System.out.println(totalquarters);
	}
	public static int calculatePennies(int quarter,int dimes,int nickels,int pennies)
	{
	int total = (quarter * 25 + dimes * 10 + nickels * 5 + pennies);
	return total;
	}
	public static int calculateQuarter(int totalpennies)
	{
	int quart = totalpennies/25;
   return quart;
	}
}