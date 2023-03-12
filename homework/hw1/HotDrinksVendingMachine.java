package homework.hw1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotDrinksVendingMachine implements VendingMachines {
    private List<HotDrink> hotDrinks;
    
    public HotDrinksVendingMachine() {
        this.hotDrinks = new ArrayList<>();
    }

    public void addHotDrinks(HotDrink hotDrink) {
        hotDrinks.add(hotDrink);
    }

    public List<HotDrink> getHotDrinks() {
        return hotDrinks;
    }

    @Override
    public void acceptingMoney() {
        System.out.println("Сумма принята");
    }

    @Override
    public void productDelivery() {
        System.out.print("Возьмите напиток:");
    }

    @Override
    public void deliveryOfChange() {
        System.out.println("Возьмите сдачу");
    }

    public void shopHotDrinks() {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("\nКакой напиток вы хотите купить, из перечисленных?");
            for (HotDrink hotDrink2 : hotDrinks) {
                System.out.print(hotDrink2.getDrink() + "  ");
            }
            System.out.print("\nВведите название: ");
            String inputHotDrink = scn.nextLine();
            for (HotDrink hotDrink : hotDrinks) {
                if (hotDrink.getDrink().equals(inputHotDrink)) {
                    System.out.println("Стоимость товара = " + hotDrink.getPrice());
                    System.out.print("Внесите деньги: ");
                    String enterMoney = scn.nextLine();
                    int intMoney = Integer.parseInt(enterMoney);
                    if (intMoney >= hotDrink.getPrice()) {
                        acceptingMoney();
                        productDelivery();
                        System.out.println(hotDrink);
                        int change = intMoney - hotDrink.getPrice();
                        deliveryOfChange();
                        System.out.println("Сдача = " + change);
                    } 
                    else{
                        acceptingMoney();
                        System.out.println("Недостаточно средств");
                    }

                }

            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

}