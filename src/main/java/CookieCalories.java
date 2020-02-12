
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
public class CookieCalories {
        public static void main(String args[])

     {


          Scanner input = new Scanner(System.in);

          int cookiesAte; 

          int totalCookiesBag = 40;

          int totalservings = 10;

          int caloriesperserving = 300;

          int cookiesPerserving = totalCookiesBag / totalservings;

          int calorieInEachCookie = caloriesperserving / cookiesPerserving;
          

          System.out.print("Enter number of cookies you eaten: ");

          cookiesAte = input.nextInt();

          double caloriesConsumed = cookiesAte * calorieInEachCookie;



          System.out.println("The amount of calories you have eaten is " + caloriesConsumed);

     }

} 
