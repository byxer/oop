package homework.hw3;

public class Dog {
    private String name;
    private int weight;
    private String color;

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Dog(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Песель %s, весом %d, с окрасом %s", name, weight, color);
    }
}
