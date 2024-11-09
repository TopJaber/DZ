import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Здравствуйте, для заказа доступны машины из 3 классов: Эконом, Комфорт, Бизнес");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String type = br.readLine();
        Car car = null;
        boolean flag = false;
        switch (type.toLowerCase()) {
            case "эконом":
                car = new LadaVesta("Lada Vesta", 300, 30);
                flag = true;
                break;
            case "комфорт":
                car = new KiaOptima("Kia Optima", 450, 20);
                flag = true;
                break;
            case "бизнес":
                car = new Audi("Audi A8", 700, 15);
                flag = true;
                break;
            default:
                System.out.println("Данный тип не найден");
        }
        if(flag) {
            car.order();
            car.start();
            car.go();
            car.finish();
            System.out.println("Спасибо за поездку");
        } else{
            System.out.println("Невозможно начать поездку, попробуйте заново");
        }
    }
}