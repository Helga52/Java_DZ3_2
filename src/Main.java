public class Main {
    public static void main(String[] args) {

        int balance = 100; // остаток на счете клиента
        int amount = 1001; // сумма пополнения
        int bonus = 0; // начальное значение бонусов

        if (amount > 1000) {
            bonus = amount / 100;
        }

        System.out.println("Остаток на счете после пополнения " + (balance + amount + bonus));
        System.out.println("Количество бонусных рублей " + bonus);


    }
}