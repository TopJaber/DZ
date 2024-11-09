public class KiaOptima extends Comfort{
    private String name;
    private int price;
    private int time;

    public KiaOptima(String name, int price, int time) {
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
