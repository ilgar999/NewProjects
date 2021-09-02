package first;

import java.util.Scanner;

public class Class_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int itemPrice, change;
        int quatres, dimes, nickels;


        System.out.println("Enter price in cents: ");
        itemPrice = scan.nextInt();

        if(itemPrice < 25 || itemPrice > 100 || itemPrice%5 != 0){

            System.out.println("Invalid price");
        }else{
            change = 100 - itemPrice;
            quatres = change / 25;

            int remainigCentsAfterQuatres = change % 25;
            dimes = remainigCentsAfterQuatres  / 10;

            int remainigCentsAfterDimes  = remainigCentsAfterQuatres % 10;
            nickels = remainigCentsAfterDimes / 5;

            System.out.println("Your change is: " + ", quatres" + quatres + " dimes and nickels" + dimes + nickels);
        }


    }

}
