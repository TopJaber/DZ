public class Audi extends Business{
    private String name;
    private int price;
    private int time;

    public Audi(String name, int price, int time) {
        super(name, price, time);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }
}
