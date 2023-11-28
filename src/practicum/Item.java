package practicum;

public class Item {
    public String name;
    public int price;
    public int popularity;

    public Item(String name, int price, int popularity) {
        this.name = name;
        this.price = price;
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "List{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", popularity=" + popularity +
                '}';
    }
}
