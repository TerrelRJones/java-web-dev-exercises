package exercises.technology;

public class Main {
    public static void main(String[] args) {
        LapTop macbook = new LapTop("Apple", 1000.00, true);
        Computer razor = new Computer("AMD", 2500.00);
        SmartPhone iPhone = new SmartPhone("Apple", 1000.00, "Max", "Black");

        System.out.println(macbook.getWifi());
        System.out.println(macbook.getBrand());
        System.out.println(razor);
        System.out.println(iPhone.getBrand());
    }
}
