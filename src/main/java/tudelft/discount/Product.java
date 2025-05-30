package tudelft.discount;

public class Product {

    private String name;
    private double price;
    private String category;

    public Product (String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice () {
        return price;
    }

    public String getCategory () {
        return category;
    }

    public void setPrice (double price) {
        this.price = price;
    }
}
