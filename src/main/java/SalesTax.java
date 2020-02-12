
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dalto
 */
public class SalesTax {
public static void main(String [] args) {
  
Scanner keyboard = new Scanner(System.in);
double stateSalesTax, purchaseAmount, countySalesTax, totalSalesTax, total;
System.out.print("What is the purchase amount?");
purchaseAmount=keyboard.nextDouble( );

stateSalesTax=0.04*purchaseAmount;
countySalesTax=0.02*purchaseAmount;
totalSalesTax=stateSalesTax+countySalesTax;
total=totalSalesTax+purchaseAmount;


System.out.println("Purchase " + purchaseAmount);
System.out.println("State Tax " + stateSalesTax);
System.out.println("County Tax " + countySalesTax);
System.out.println("Total Tax " + totalSalesTax);
System.out.println("Total Sale " + total);

}
}

