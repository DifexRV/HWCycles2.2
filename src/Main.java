public class Main {
    public static void main(String[] args) {

    System.out.println("Задача 1");
        int today = 2022;
        int toTheCurrent200 = today - 200;
        int afterTheCurrent100 = today + 100;
        for (int i = 0; i <= 3000; i = i + 79) {
            if (toTheCurrent200 <= i && i <= afterTheCurrent100)
                System.out.println(i);
            }

    System.out.println("Задача 2");
        int x = 2;
        for(int i = 1; i < 11; i++) {

            System.out.println(x + "*" + i + "=" + x * i);

        }




    }
}