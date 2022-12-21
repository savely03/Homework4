public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа 4");
        task1();
        // task2 без вывода в консоль //
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        int vr1 = 1500;
        byte vr2 = 120;
        short vr3 = 1000;
        long vr4 = 10000000L;
        float vr5 = 3.5f;
        double vr6 = 100.55;
        System.out.println("Task1:");
        System.out.printf("""
                - Значение переменной vr1 с типом int = %s;
                - Значение переменной vr2 с типом byte = %s;
                - Значение переменной vr3 с типом short = %s;
                - Значение переменной vr4 с типом long = %s;
                - Значение переменной vr5 с типом float = %s;
                - Значение переменной vr6 с типом double = %s.
                """, vr1, vr2, vr3, vr4, vr5, vr6);
    }

    public static void task2() {
        float vr1 = 27.12f;
        long vr2 = 987_678_965_549L;
        float vr3 = 2.786f;
        short vr4 = 569;
        short vr5 = -159;
        short vr6 = 27897;
        byte vr7 = 67;
    }

    public static void task3() {
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short totalPaper = 480;
        int eachStudent = totalPaper / (teacher1 + teacher2 + teacher3);
        System.out.println("Task3:");
        System.out.println(" На каждого ученика рассчитано " + eachStudent + " листов бумаги.");
    }

    public static void task4() {
        short cntMinute = 8;
        int cntTwentyMinutes = cntMinute * 20;
        int cntDay = 24 * (cntTwentyMinutes * 3);
        int cntThreeDays = cntDay * 3;
        int cntMonth = cntDay * 30;
        System.out.println("Task4:");
        System.out.printf("""
                - Количество деталей за 20 минут = %s;
                - Количество деталей за сутки = %s;
                - Количество деталей за 3 дня = %s;
                - Количество деталей за месяц = %s.
                """, cntTwentyMinutes, cntDay, cntThreeDays, cntMonth);
    }

    public static void task5() {
        byte totalClasses = 120;
        byte white = 40;
        byte brown = 80;
        System.out.println("Task4:");
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски.");
    }

    public static void task6() {
        short bananasGrams = 5 * 80;
        short milkGrams = 105 * 2;
        short iceGrams = 2 * 100;
        short eggsGrams = 4 * 70;
        int weightGrams = bananasGrams + milkGrams + iceGrams + eggsGrams;
        float weightKg = weightGrams / 1000.0f;
        System.out.println("Task6:");
        System.out.println(" Результат в граммах - " + weightGrams + " грамм;");
        System.out.println(" Результат в килограммах - " + weightKg + " килограмм.");
    }

    public static void task7() {
        short loseWeightGr = 7000;
        int cntDays1 = loseWeightGr / 250;
        int cntDays2 = loseWeightGr / 500;
        float avgDays = (cntDays1 + cntDays2) / 2.0f;
        System.out.println("Task7:");
        System.out.println("Спортсмену нужно сбросить 7 кг. (7000 гр.)");
        System.out.println(" Количество дней при похудении на 250 граммов в день - " + cntDays1 + " дн;");
        System.out.println(" Количество дней при похудении на 500 граммов в день - " + cntDays2 + " дн;");
        System.out.println("Среднее количество дней - " + avgDays + " дн.");
    }

    public static void task8() {
        int emp1 = 67_760 * 12;
        int emp2 = 83_690 * 12;
        int emp3 = 76_230 * 12;
        double emp1Increased = emp1 * 0.1f + emp1;
        double emp2Increased = emp2 * 0.1f + emp2;
        double emp3Increased = emp3 * 0.1f + emp3;
        double emp1Diff = emp1Increased - emp1;
        double emp2Diff = emp2Increased - emp2;
        double emp3Diff = emp3Increased - emp3;
        System.out.println("Task8:");
        System.out.printf("""
                - Годовой доход Маши %s руб;
                - Годовой доход Дениса %s руб;
                - Годовой доход Кристины %s руб.
                """, emp1, emp2, emp3);
        System.out.println(" Маша теперь получает " + emp1Increased + " руб. в год, годовой доход вырос на " + emp1Diff + " руб.");
        System.out.println(" Денис теперь получает " + emp2Increased + " руб. в год, годовой доход вырос на " + emp2Diff + " руб.");
        System.out.println(" Кристина теперь получает " + emp3Increased + " руб. в год, годовой доход вырос на " + emp3Diff + " руб.");
    }
}