import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Order {
    String name, destination, origin, date, seatClass;
    int quantity;
    double cost;
    long creditCard;

     Order(){

         Scanner s = new Scanner(System.in);
         System.out.println("Enter Name: ");
         this.name = s.nextLine();

         System.out.println("Enter Destination:");
         this.destination = s.nextLine();

         System.out.println("Enter Origin: ");
         this.origin = s.nextLine();

         System.out.println("Enter Date (MM/DD/YYYY");
         this.date = s.nextLine();

         System.out.println("Select class (First, Coach, Economy):");
         this.seatClass = s.nextLine();

         System.out.println("Quantity of Seats: ");
         this.quantity = s.nextInt();

         System.out.println("Cost: $546.76");
         System.out.println("Enter Credit Card");
         this.creditCard = s.nextLong();
    }

    public int generateOrderNumer(){
         return generateOrderNumerHelper();
    }
    private int generateOrderNumerHelper(){
         Random r = new Random();
         int orderNum = Math.abs(r.nextInt());
         return orderNum;
    }
}
