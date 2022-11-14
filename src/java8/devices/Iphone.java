package java8.devices;

import java8.announcement.Announcement;

public class Iphone extends Announcement {

    private String product;
    private int memory;

    public Iphone(String name, String image, double price, String description, String product, int memory) {
        super(name, image, price, description);
        this.product = product;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Iphone" +super.toString()+
                "\nproduct: " + product +
                "\nmemory: " + memory ;
    }
}