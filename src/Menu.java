import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Menu {
public int subTotal;
public static int runningTotal;
private static int itemPrice;
static boolean ordering = true;
static Scanner input = new Scanner(System.in);

public static void calender(String[] args){
   Date now = new Date();
      System.out.println("toString(): " + now);     
}
 

public static void menu(){
    System.out.println("Select Option(1 - 5) \n1. Standard (£8) \n2. OAP (£6)\n3. Student (£6) \n4. Child (£4) \n5. Done \n Enter Option:" );
}
public static int ticketPrice(int ticket) {
    if (ticket == 1) {
        System.out.println("Order Standard Ticket");
        itemPrice = 8;
    }
    if (ticket == 2) {
        System.out.println("Order OAP Ticket");
        itemPrice = 6;
    }
    if (ticket == 3) {
        System.out.println("Order Student Ticket");
        itemPrice = 6;
    }
    if (ticket == 4) {
        System.out.println("Order Chilld Ticket");
        itemPrice = 4;
    }
    quantity();
    return itemPrice;
}
public static int quantity() {
    System.out.println("Enter quantity");       
    int quantity = input.nextInt();
    subTotal(quantity, itemPrice);
    return quantity;
 }
public static int subTotal(int quantity, int ticketPrice) {
    int subTotal = quantity*itemPrice;
    System.out.println("Subtotal: "+ subTotal);
    runningTotal += subTotal;
    return subTotal;
}
public static void done(){
    ordering = false;
    System.out.println("Your Total is " + runningTotal);
    System.out.println("Enjoy the movie!");
}
public static void main(String[] args) {
    int menuOption;
    int ticket = 0;
    input = new Scanner(System.in); 
    do{
        int runningTotal=0;
        menu();
        menuOption = input.nextInt();    
        switch(menuOption){
            case 1:
                ticket = 1;
                ticketPrice(ticket);
                break;
            case 2:
                ticket = 2;
                ticketPrice(ticket);
                break;
            case 3:
                ticket = 3;
                ticketPrice(ticket);
                break;
            case 4:
                ticket = 4;
                ticketPrice(ticket);
                break;
            case 5:
                done();
                break;      
            default:
                System.out.println("Invalid option.");
        }

    } while(ordering); {
}
}
}