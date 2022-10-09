public class Main {
    public static void main(String[] args) {

    System.out.println("Задача 1");
    int deposit = 15_000;
    int total = 0;
    int rate = 7;
    int month = 0;
        while (total < 12_000_000) {
            total = total + deposit;
            total = total + (total * rate / 100);
            month = month + 1;

            System.out.println("Размер накопления составляет " + total + " на " + month + " месяц.");
        }

    System.out.println("Задача 2");
        int deposit2 = 15_000;
        int total2 = 0;
        int rate2 = 7;
        int x = 1;
        int month2 = 0;
        for (; total2 < 12_000_000; x++) {
            total2 = total2 + deposit2;
            total2 = total2 + (total2 * rate2 / 100);
            month2 = month2 + 1;
            if (x % 6 == 0) {
            System.out.println("Размер накопления составляет " + total2 + " на " + month2 + " месяц.");}
        }

    System.out.println("Задача 3");
        int deposit3 = 15_000;
        int total3 = 0;
        int rate3 = 7;
        int z = 1;
        int month3 = 0;
            for (; month3 < 108; z++) {
            total3 = total3 + deposit3;
            total3 = total3 + (total3 * rate3 / 100);
            month3 = month3 + 1;

            if (z % 6 == 0) {
                System.out.println("Размер накопления составляет " + total3 + " на " + month3 + " месяц.");
            }
        }

    System.out.println("Задача 4");
        int friday = 1;
        for (; friday < 31; friday = friday + 7) {

            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет.");
        }



    }
}