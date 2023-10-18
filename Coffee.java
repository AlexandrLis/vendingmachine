public class Coffee extends HotDrink{
    private int temperature;

    public Coffee(String nameHotDrink, int volume, int temperature) {
        super(nameHotDrink, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString(){
        return super.toString() + ", температура: " + temperature;
    }
}
