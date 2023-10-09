import java.util.Objects;
import java.util.Scanner;


public class MagicalBoxDemo extends Box { 
    // this exists bc I can't code
    public MagicalBoxDemo(double length, double width, double height) {
        super(5,2,6);
    }
    public static void main(String[] args) {
        Box box = new Box(5,2,6);
        Scanner myObj = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do? (Respond with a number)");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Show everything in the box");
            System.out.println("4. Find Volume");

            String response = myObj.nextLine();

            System.out.println("");
            if (Objects.equals(response, "1")) {
                System.out.println("What do you want to add?");
                String[] item = box.addItem(myObj.nextLine());
                System.out.println(item);
            } else if (Objects.equals(response, "2")) {
                System.out.println("What do you want to remove?");
                String[] item = box.removeItem(myObj.nextLine());
                System.out.println(item);
            } else if (Objects.equals(response, "3")) {
                box.printItems();
            } else if (Objects.equals(response, "4")) {
                double vol = box.volume();
                System.out.println(vol);
            }
            System.out.println("");
        }
    }
}