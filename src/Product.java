public class Product {

    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        return quantity > 0;
    }

    public boolean isCategory(String category) {
        return this.category.equals(category);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Masina", 45000.0, 5, "Auto");

        System.out.println("Name: " + product1.getName());
        System.out.println("Price: € " + product1.getPrice());
        System.out.println("Quantity: " + product1.getQuantity());
        System.out.println("Category: " + product1.getCategory());
        System.out.println("Has Stock: " + product1.hasStock());

        Product product2 = new Product("Ceas", 10000.0, 10, "Bijuterii");

        System.out.println("Name: " + product2.getName());
        System.out.println("Price: € " + product2.getPrice());
        System.out.println("Quantity: " + product2.getQuantity());
        System.out.println("Category: " + product2.getCategory());
        System.out.println("Has Stock: " + product2.hasStock());

        Product product3 = new Product("Telefon", 1500.0, 15, "Comunicatii");

        System.out.println("Name: " + product3.getName());
        System.out.println("Price: € " + product3.getPrice());
        System.out.println("Quantity: " + product3.getQuantity());
        System.out.println("Category: " + product3.getCategory());
        System.out.println("Has Stock: " + product3.hasStock());
    }

}
