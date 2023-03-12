package homework.hw2;

public class Main {
    public static void main(String[] args) {
        Human hum = new Human();
        hum.name = "Посетитель";
        Market mk = new Market();
        mk.update(hum);
    }

}
