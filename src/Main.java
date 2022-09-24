public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int part = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += part;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // Задание 2
        System.out.println("Задание 2");
        float totalWithPersent = 0F;
        float percent = 0.01F;
        for (int i = 1; i <= 12; i++) {
            totalWithPersent = (totalWithPersent + part) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + " %.2f " + totalWithPersent + " рублей");
        }
    }
}