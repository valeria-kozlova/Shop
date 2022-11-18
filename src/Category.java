public class Category extends Product {
    private String names;

    public Category(String name, double price, double rating, String names) {
        super(name, price, rating);
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public void setNames() {
        this.names = names;
        System.out.println(this.names);
    }

    public static void fillCategory(Category notebook) {
        notebook.addProduct(new Product("HP Spectre x360", 141999, 5.0));
        notebook.addProduct(new Product("DELL XPS 13", 117990, 4.9));
        notebook.addProduct(new Product("APPLE MacBook Pro 16",269990,4.9 ));
        notebook.addProduct(new Product("ASUS ROG Zephyrus G14", 171990, 4.8));
    }
}


