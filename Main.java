import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p1 = new HotDrink("Choko", 1, 60, 30);
        Product p2 = new HotDrink("Moko", 1.5, 40, 30);
        Product p3 = new HotDrink("Moca", 0.3, 70, 50);
        Product p4 = new HotDrink("Chaca", 2.25, 55, 50);
        List<HotDrink> hList1 = new ArrayList<HotDrink>();
        HotDrinkVendingMachine hdMachine = new HotDrinkVendingMachine(Arrays.<HotDrink>asList((HotDrink)p1, (HotDrink)p2, (HotDrink)p3, (HotDrink)p4));
        System.out.println(p1);
    }
}
