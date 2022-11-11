import java8.announcement.Announcement;
import java8.devices.Laptop;
import java8.devices.Phone;
import java8.home.Home;
import java8.transport.Airplane;
import java8.transport.Car;
import java8.transport.Helicopter;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone", "☺", 30000, "SmartPhone", "China", 128);
        Phone phone1 = new Phone("Redmi", "☺", 15000, "SmartPhone", "japan", 64);


        Laptop laptop = new Laptop("Lenovo", "☺", 50000, "Computer", "Windows");
        Laptop laptop1 = new Laptop("Dell", "☺", 45000, "Computer", "Linux");

        Home home = new Home("Ihlas", "☺", 1500000, "Apartmant", "House", 20);
        Home home1 = new Home("PentHouse", "☺", 2500000, "House", "Flat", 50);

        Car car = new Car("BMW", "☺", 700000, "Transport", "Red", LocalDate.of(2003, 10, 3));
        Car car1 = new Car("Honda", "☺", 300000, "Transport", "Black", LocalDate.of(2010, 11, 29));

        Airplane airplane = new Airplane("Boing", "☺", 1000, "Transport");
        Airplane airplane1 = new Airplane("Tu", "☺", 120, "Transport");


        Announcement[] announcements = {phone, phone1, laptop, laptop1, home, home1, car, car1, airplane, airplane1};

        while (true) {
            System.out.println();
            System.out.println("1.Find by name.  2.Find by price.  3.Find by max Price. 4.Oll field. ");
            int number = new Scanner(System.in).nextInt();
            if (number == 1) {
                System.out.println(" Enter by produkt name ");
                String produktName = new Scanner(System.in).nextLine();
                Announcement.findByName(produktName, announcements);
            } else if (number==2) {
                System.out.println(" Enter by produkt price ");
                double produktPrice = new Scanner(System.in).nextDouble();
                Announcement.findByPrice(produktPrice, announcements);
            } else if (number==3) {
                System.out.println(Announcement.maxPriceAnnouncement(announcements));
            } else if (number==4) {
                for (Announcement announcement : announcements) {
                    System.out.println("--------------------------------------");
                    System.out.println(announcement);
                }
            }
            else {
                System.out.println(" Error !!!");
            }

        }

    }
}