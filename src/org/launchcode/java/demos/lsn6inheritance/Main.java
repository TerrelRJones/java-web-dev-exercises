package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        Cat k = new Cat(45);
        HouseCat brooklyn = new HouseCat("Brooklyn", 22);
//        brooklyn.eat();
        System.out.println(brooklyn.noise());
        System.out.println(k.noise());
    }
}
