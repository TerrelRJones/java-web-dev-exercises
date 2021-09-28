package exercises.technology;

public class Computer {
    private String brand;
    private Double price;
    private String processor;



    public Computer(String brand, Double price) {
        processor = "4.2ghz";
        this.brand = brand;
        this.price = price;
    }

    // GETTERS
    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public String getProcessor() {
        return processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", processor='" + processor + '\'' +
                '}';
    }


}
