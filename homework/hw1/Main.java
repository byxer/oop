package homework.hw1;

public class Main {

    public static void main(String[] args) {

        HotDrink coffe = new  HotDrink("coffe", 0.5, true, 80, 100);
        HotDrink tea = new  HotDrink("tea", 0.5, true, 70, 80);
        HotDrink capuchino = new  HotDrink("chocolate", 0.5, false, 60, 120);
        HotDrinksVendingMachine hotDrVenMach = new HotDrinksVendingMachine();
        hotDrVenMach.addHotDrinks(coffe);
        hotDrVenMach.addHotDrinks(capuchino);
        hotDrVenMach.addHotDrinks(tea);

        System.out.println(hotDrVenMach.getHotDrinks());

        hotDrVenMach.shopHotDrinks();
    }
}
