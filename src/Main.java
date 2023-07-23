public class Main {
    public static void main(String[] args) {

        int ostshet = 100; // кол-во рублей на 1 бонус
        int popolnenie = 1001; // стоимость билета
        int bonus = 0; // начальное значение бонусов

        if (popolnenie > 1000) {
            bonus = popolnenie /100;
        }

        System.out.println("Остаток на счете после пополнения " +(ostshet + popolnenie + bonus));
        System.out.println("Количество бонусных рублей " + bonus);


    }
}