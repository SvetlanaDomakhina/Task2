public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 2030;
        int bonus;

        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int currentBalance = balance + payment + bonus;
        System.out.println("Текущий счет: ");
        System.out.println(currentBalance);

        System.out.println("Бонусные рубли: ");
        System.out.println(bonus);

    }
}