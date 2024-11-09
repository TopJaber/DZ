public class Econom implements Car{
    private String name;
    private int price;
    private int time;

    public Econom(String name, int price, int time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }

    @Override
    public void order() {
        System.out.println("Вы заказали " + this.name + " из эконом класса");
    }

    @Override
    public void start() {
        System.out.println("Машина приехала, ожидание началось.");
    }

    @Override
    public void go() {
        System.out.println(name + " едет. Время поездки составит " + this.time + " минут");
    }

    @Override
    public void finish() {
        System.out.println("Вы приехали, не забудьте оплатить поездку. Стоимость поездки составила " + this.price + ". Оставьте отзыв.");
    }
}