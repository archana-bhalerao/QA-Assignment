package Org.EJ.Investcorp_Package;

import java.io.*;
import java.util.Scanner;

class denomination

{

public static void main(String args[])throws IOException

{
	
Scanner imp = new Scanner(System.in);

double den[]={2000,1000,500,100,50,20,10,5,2,1,0.50,0.25}; //storing all the denominations in an array

System.out.print("Enter any Amount: "); //Entering an amount

double amount=imp.nextDouble();
double Totalamount=0.0d;

System.out.println("\nDENOMINATIONS: \n");

System.out.println("\nCurrency Notes Count \t Total: \n");

for(int i=0;i<12;i++) //Since there are 12 different types of currencies, hence we check for each note/coin.
{
double count=0.0d;
int extracount=0, currentcount=0;
count=amount/den[i]; // counting number of den[i] notes
int icount=(int) count;
if(icount!=0 && icount<=20) //printing that denomination if the count is not zero and less than/equal to 20.

{

System.out.println((int)den[i]+"\t\t"+icount+"\t= "+(int)den[i]+"*"+icount);

Totalamount= Totalamount + den[i]*icount;
}
else if(icount>=20)
{
	extracount = (icount-20);
	currentcount=20;
	System.out.println((int)den[i]+"\t"+currentcount+"\t= "+(int)den[i]+"*"+currentcount);
	Totalamount= Totalamount + den[i]*currentcount;
}


amount=(extracount*den[i])+(amount%den[i]);
 //finding the remaining amount whose denomination is to be found

}

System.out.println("--------------------------------");

System.out.println("TOTAL\t\t\t= "+Totalamount); //printing the total amount

}

}
