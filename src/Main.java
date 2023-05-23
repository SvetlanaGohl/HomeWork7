public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {

        System.out.println("ЗАДАЧА 1");
        int purpose = 2495000;
        int saving = 15000;
        int capital = 0;
        int i = 1;
        while (purpose >= capital) {
            System.out.println("Месяц " + i + " - сумма накоплений равна " + saving * i + " рублей.");
            i++;
            purpose = purpose - saving;
        }
    }

    public static void task2() {

        System.out.println("ЗАДАЧА 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
        for (int x = 10; x >= 1; x = x - 1) {
            System.out.print(x + " ");
        }
    }

    public static void task3() {

        System.out.println("ЗАДАЧА 3");
        int population = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            int birthRate = population / 1000 * 17;
            int deadRate = population / 1000 * 8;
            population = population + birthRate - deadRate;

            System.out.println("Год " + year + " численность населения составляет " + population);
        }
    }

    public static void task4() {

        System.out.println("ЗАДАЧА 4");
        double percentDeposit = 0.07;
        double deposit = 15_000;
        for (int month = 1; deposit <= 12_000_000; month++) {
            deposit += deposit * percentDeposit;
            System.out.println("Месяц " + month + " сумма накоплений " + deposit);
        }
    }

    public static void task5() {

        System.out.println("ЗАДАЧА 5");
        double percentDeposit = 0.07;
        double deposit = 15_000;
        for (int month = 1; deposit <= 12_000_000; month++) {
            deposit += deposit * percentDeposit;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений " + deposit);
            }
        }
    }

    public static void task6() {

        System.out.println("ЗАДАЧА 6");
        double percentDeposit = 0.07;
        double deposit = 15_000;
        int accumulationTime = 9;
        for (int month = 1; month <= accumulationTime * 12; month++) {
            deposit += deposit * percentDeposit;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений " + deposit);
            }
        }
    }

    public static void task7() {

        System.out.println("ЗАДАЧА 7");
        int friday = 1;
        int daysMonth = 31;
        for (; friday <= daysMonth; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + " число, необходимо подготовить отчет.");
        }
    }

    public static void task8() {

        System.out.println("ЗАДАЧА 8");
        int startCometFlight = 1800;
        int endCometFlight = 2100;
        for (int yearComet = 1820; yearComet >= startCometFlight && yearComet <= endCometFlight; yearComet++) {
            if (yearComet % 79 == 0) {
                System.out.println(yearComet);}

        }
    }
}
