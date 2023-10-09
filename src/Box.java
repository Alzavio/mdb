import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    private String[] items = new String[10];

    public double volume() {
        System.out.println("");
        return width * height * depth;
    }

    public String[] addItem(String name) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = name;
                System.out.println("Item added");
                return items;
            }
        }
        System.out.println("No item added, box is full");
        return items;
    }

    public String[] removeItem(String name) {
        for (int i = 0; i < items.length; i++) {
            if (Objects.equals(items[i], name)) {
                items[i] = null;
                System.out.println("Item removed");
                return items;
            }
        }
        System.out.println("Item doesn't exist");
        return items;
    }

    
    public void printItems() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

}

