import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List <HotDrinkAutomat> vending = new ArrayList<>();
    
    public VendingMachine addDrink(HotDrinkAutomat name){
        vending.add(name);
        return this;
    }

    public HotDrinkAutomat getProduct(String name, int vol, int hot){
        for (HotDrinkAutomat product : vending) {
            if(name.equals(product.getName()) && vol == product.getVolume() && hot == product.getTemperature()){
                return product;
            }
        }
        return null;
    }

    public List <HotDrinkAutomat> getVenging(){
        return vending;
    }
}
