package java8.devices;

import java8.announcement.Announcement;

public class Laptop extends Announcement {
    private String operatingSystem;

    public Laptop(String name, String image, double price, String description, String operatingSystem) {
        super(name, image, price, description);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Laptop" +super.toString()+
                "\noperatingSystem: " + operatingSystem ;
    }
}
