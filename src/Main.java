public class Main {
    public static void main(String[] args) {

    System.out.println("Задача 1");
    int deposit = 15_000;
    int total = 0;
    int rate = 12;
    int month = 0;
        while (total < 2_459_000) {
            total = total + deposit;
            total = total + (total/100 * rate/12);
            month = month +1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

    System.out.println("Задача 2");
    int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for ( i = 10; i >= 1 ; i-- ) {
            System.out.print(i + " ");}


    System.out.println("Задача 3");
        int y = 12_000_000;
        int year = 0;
        int birthrateInYear = 17;
        int birthRatePerPerson = 1000;
        int mortalityInYear = 8;
        int totalPopulation = 0;
        for (int x = 1; x <= 10; x++) {
            totalPopulation = totalPopulation + y;
            totalPopulation = totalPopulation + (totalPopulation / birthRatePerPerson * birthrateInYear - mortalityInYear);
            year = year + 1;

            System.out.println("Год " + year + ", численность населения составляет " + totalPopulation);
        }
    }
}