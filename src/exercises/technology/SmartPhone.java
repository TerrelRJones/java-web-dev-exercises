package exercises.technology;

public class SmartPhone extends Computer{
    private String size;
    private String color;

    public SmartPhone(String brand, Double price, String size, String color) {
        super(brand, price);
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
