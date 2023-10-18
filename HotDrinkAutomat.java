public class HotDrinkAutomat {
   
    private String nameHotDrinkAutomat;
    private int volumeAutomat;
    private int temperatureAutomat;

    public HotDrinkAutomat(String nameHotDrinkAutomat, int volumeAutomat, int temperatureAutomat) {
        this.nameHotDrinkAutomat = nameHotDrinkAutomat;
        this.volumeAutomat = volumeAutomat;
        this.temperatureAutomat = temperatureAutomat;
    }

    public String getName(){
        return nameHotDrinkAutomat;
    }

    

    public int getVolume(){
        return volumeAutomat;
    }

    public int getTemperature(){
        return temperatureAutomat;
    }

    @Override
    public String toString(){
        return "название напитка: " + nameHotDrinkAutomat + ", объем: " + volumeAutomat + ", температура: " + temperatureAutomat;
    }
}
