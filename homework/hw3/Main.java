package homework.hw3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListOfDogs listDogs = new ListOfDogs();
        listDogs.setListDogs(Arrays.asList(
                new Dog("Бобик", 20, "Черный"),
                new Dog("Шарик", 15, "Белый"),
                new Dog("Полкан", 10, "Серый")));

        System.out.println("Перебор итератором:");
        Iterator<Dog> iter = listDogs.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("\nСортировка через класс ComparableOfNameDog по имени:");
        listDogs.getListDogs().sort(new ComparableOfNameDog());
        for (Dog dog: listDogs){
            System.out.println(dog);
        }

        System.out.println("\nСортировка через ссылку на метод по цвету:");
        listDogs.getListDogs().sort(Comparator.comparing(Dog::getColor));
        listDogs.forEach(System.out::println);

        System.out.println("\nСортировка через анонимный класс по весу:");
        listDogs.getListDogs().sort(new Comparator<>() {
            @Override
            public int compare(Dog dog1, Dog dog2) {
                return Integer.compare(dog1.getWeight(), dog2.getWeight());
            }
        });
        listDogs.forEach(System.out::println);
    }
}
