package java8.home;

import java8.announcement.Announcement;

public class Home extends Announcement {
    private String homeType;
    private int maxGuest;

    public Home(String name, String image, double price, String description, String homeType, int maxGuest) {
        super(name, image, price, description);
        this.homeType = homeType;
        this.maxGuest = maxGuest;
    }

    @Override
    public String toString() {
        return "Home" +super.toString()+
                "\nhomeType: " + homeType +
                "\nmaxGuest: " + maxGuest ;
    }
}
