public class Client {
    public static void main(String[] args) {
        VendingMachine apparat = new VendingMachine();
        apparat.addDrink(new HotDrinkAutomat("чай", 450, 65));
        apparat.addDrink(new HotDrinkAutomat("латте", 300, 50));
        apparat.addDrink(new HotDrinkAutomat("кофе", 400, 55));

        for (HotDrinkAutomat hotdrink : apparat.getVenging()) {
            System.out.println(hotdrink);
        }
        System.out.println("Поиск по имени: ");
        System.out.println(apparat.getProduct("чай", 450, 65));
    }
}
