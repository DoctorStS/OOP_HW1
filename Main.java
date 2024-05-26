import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p1 = new BottleOfWater("Appleish", 1, 10);
        Product p2 = new BottleOfWater("Cola", 1.5, 10);
        Product p3 = new BottleOfWater("Coca", 0.3, 10);
        Product p4 = new BottleOfWater("Caca", 2.25, 10);
        List<BottleOfWater> pList1 = new ArrayList<BottleOfWater>();
        VendingMachine vMachine = new BottleOfWaterVendingMachine(Arrays.<BottleOfWater>asList((BottleOfWater)p1, (BottleOfWater)p2, (BottleOfWater)p3, (BottleOfWater)p4));
        System.out.println(p1);
    }
}
