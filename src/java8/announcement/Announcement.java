package java8.announcement;

import java.util.Objects;

public class Announcement {

    private String name;
    private String image;
    private double price;
    private String description;

    public Announcement(String name, String image, double price, String description) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "\nname: " + name +
                "\nimage: " + image +
                "\nprice: " + price +
                "\ndescription: " + description ;
    }

    public static Announcement maxPrice(Announcement[] announcements){
        double maxPrice = announcements[0].price;
        for (Announcement announcement1 : announcements) {
            if (announcement1.price > maxPrice){
                maxPrice = announcement1.price;
            }
        }
        for (Announcement announcement1 : announcements) {
            if (announcement1.price == maxPrice){
                return announcement1;
            }
        }
        return null;
    }
    public  static Announcement nameProduct(Announcement[] announcements,String nameScan){
        for (Announcement announcement : announcements) {
            if (Objects.equals(announcement.name.toLowerCase(),nameScan.toLowerCase())){
                return announcement;
            }
        }
        return  null;

    }
    public  static Announcement priceProduct(Announcement[] announcements,int scanPrice){
        for (Announcement announcement : announcements) {
            if (scanPrice == announcement.price){
                return announcement;
            }
        }
        return null;
    }
}
