import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    private List<HotDrink> hotDrinkList;
        
    public HotDrinkVendingMachine(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    public List<HotDrink> getHotDrinkList() {
        return hotDrinkList;
    }

    public void setHotDrinkList(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    @Override
    public Product getProduct(String name){
        for (Product hotDrink : hotDrinkList){
            if(hotDrink.getName().equals(name)){
                return hotDrink;
            }
        }
        return null;
    }
    
    public void addHotDrink(HotDrink hotDrink){
        this.hotDrinkList.add(hotDrink);
    }
}
