import java8.announcement.Announcement;
import java8.devices.Iphone;
import java8.devices.Laptop;
import java8.home.Home;
import java8.transport.Airplane;
import java8.transport.Car;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("Iphone-13", ":)", 20000,
                "Smatphone", "USA", 1000);

        Iphone iphone2 = new Iphone("Samsung", ":)", 25000,
                "Smatphone", "KGZ", 512);


        Laptop laptop1 = new Laptop("Asus", ":)", 40000,
                "Computer", "Windows");

        Laptop laptop2 = new Laptop("MAC", ":)", 50000,
                "Computer", "macOS");


        Home home1 = new Home("Ihlas", ":)", 150000,

                "house", "storey building", 5);
        Home home2 = new Home("Avandard", ":)", 200000,
                "house", "storey building", 7);


        Car car1 = new Car("Tesla", ":)", 500000,
                "automobile", "black", LocalDate.of(2020, 7, 7));

        Car car2 = new Car("Toyota Supra", ":)", 900000,
                "automobile", "white", LocalDate.of(2004, 3, 26));


        Airplane airplane1 = new Airplane("U-2", ":)", 500000, "ship");

        Airplane airplane2 = new Airplane("Antonov AN-225", ":)", 1000000, "ship");


        Announcement[] announcements = {iphone1, iphone2, laptop1, laptop2, home1, home2, car1, car2, airplane1, airplane2};


        while (true) {
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in);

            System.out.println("\n1-the most expensive item  2-name product   3-price product ");
            int scan = scanner1.nextInt();
            if (1 == scan) {
                System.out.println(Announcement.maxPrice(announcements));
            }
            if (2 == scan) {
                System.out.println("Enter the title: ");
                String nameScan = scanner2.nextLine();
                System.out.println(Announcement.nameProduct(announcements, nameScan));
            }
            if (3 == scan) {
                System.out.println("Enter amount: ");
                int scanPrice = scanner3.nextInt();
                System.out.println(Announcement.priceProduct(announcements, scanPrice));
            } else if (1 < scan && 2 < scan && 3 < scan) {
                System.out.println("$$$$$____$$$$$_____$$$$$______$$$$_____$$$$$_\n" +
                        "$$_______$$__$$____$$__$$____$$__$$____$$__$$\n" +
                        "$$$$_____$$$$$_____$$$$$_____$$__$$____$$$$$_\n" +
                        "$$_______$$__$$____$$__$$____$$__$$____$$__$$\n" +
                        "$$$$$____$$__$$____$$__$$_____$$$$_____$$__$$\n");
            }
        }
    }
}