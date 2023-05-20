public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {

        System.out.println("ЗАДАЧА 1");
        int purpose = 2495000;
        int saving = 15000;
        int capital = 0;
        int i = 1;
        while (purpose>= capital) {
            System.out.println("Месяц " + i + " - сумма накоплений равна " + saving * i + " рублей.");
            i++;
            purpose = purpose - saving;
       }
    }
}