package exercises.technology;

public class LapTop extends Computer {
    private Boolean wifi;
    private String screenSize;

    public LapTop(String brand, Double price, Boolean wifi) {
        super(brand, price);
        this.wifi = wifi;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }
}
