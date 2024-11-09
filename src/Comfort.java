public abstract class Comfort implements Car{
    private String name;
    private int price;
    private int time;

    public Comfort(String name, int price, int time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }

    @Override
    public void order() {
        System.out.println("Вы заказали " + name + " из комфорт класса");
    }

    @Override
    public void start() {
        System.out.println("Машина приехала, ожидание началось. Поездка будет комфортной");
    }

    @Override
    public void go() {
        System.out.println(name + " едет. Во время поздки можете зарядить телефон. Время поездки составит " + time + " минут");
    }

    @Override
    public void finish() {
        System.out.println("Вы приехали, не забудьте оплатить поездку. Стоимость поездки составила " + price + ". Оцените качество обслуживания в комфорт классе.");
    }
}