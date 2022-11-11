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
        return "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public static void findByPrice(double price1, Announcement[] announcements) {
        for (Announcement announcement : announcements) {
            if (announcement.price == price1) System.out.println(announcement);
        }

    }
    public static void findByName(String name,Announcement[] announcements){
        for (Announcement announcement : announcements) {
            if (Objects.deepEquals(announcement.name,name)) System.out.println(announcement);
        }
    }

    public static Announcement maxPriceAnnouncement(Announcement[] announcements) {
        double maxPrice = announcements[0].price;
        for (Announcement announcement : announcements) {
            if (maxPrice < announcement.price) maxPrice = announcement.price;
        }
        for (Announcement announcement : announcements) {
            if (maxPrice == announcement.price) return announcement;
        }
        return null;
    }



}
