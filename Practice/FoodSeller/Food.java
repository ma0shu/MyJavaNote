package Practice.FoodSeller;

public class Food {
    public String name;
    public double price;
    public String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Food(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Food() {
    }



}
