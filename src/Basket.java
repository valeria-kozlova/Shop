public class Basket extends  Category{

    public Basket(String name, double price, double rating, String names) {
        super(name, price, rating, names);
    }
    public static Basket purchasedGoods () {
        return new Basket("HP Spectre x360", 141999, 5.0, "notebook");
    }
}
