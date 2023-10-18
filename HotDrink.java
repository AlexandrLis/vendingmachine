public class HotDrink {
    
    private String nameHotDrink;
    private int volume;

    public HotDrink(String nameHotDrink, int volume) {
        this.nameHotDrink = nameHotDrink;
        this.volume = volume;
    }

    public String getProduct(){
        return nameHotDrink;
    }

    @Override
    public String toString(){
        return "название напитка: " + nameHotDrink + ", объем: " + volume;
    }
}
