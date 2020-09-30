import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Customer {

    public static void main(String[] args){
        HashMap<Integer, Order> map = new HashMap<>();

        Scanner s = new Scanner(System.in);
        Order o;
        while(true){
            mainMenu();
            int result = s.nextInt();
            if(result == 1){
                o = new Order();
                int order = o.generateOrderNumer();
                while(map.containsKey(order))
                    order = o.generateOrderNumer();
                System.out.println("Order number: " + order);
                map.put(order, o);
            }else if(result == 2) {
                System.out.println("Selected 2");
            }else if(result == 3){
                System.out.println("Enter Order Number: ");
                int order = s.nextInt();
                o = map.get(order);
                displayInfo(o);


            }
        }
    }

    public static void mainMenu(){
        System.out.println("Main Menu");
        System.out.println("1) Create new flight");
        System.out.println("2) Remove flight");
        System.out.println("3) Get flight info");
    }

    public static void displayInfo(Order o){
        System.out.println("Name: " + o.name);
        System.out.println("Destination: " + o.destination);
        System.out.println("Origin: " + o.origin);
        System.out.println("Date: " + o.date);
        System.out.println("Seat Quantity: " + o.quantity);
        System.out.println("Class: " + o.seatClass);
        System.out.println("Credit Card: " + o.creditCard);
        System.out.println();
    }
}
