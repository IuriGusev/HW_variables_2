// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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

    public static void task1 () {
        byte a = 1;
        short b = 123;
        int c = 123456789;
        long d = 123456789012345L;
        float e = 12.12f;
        double f = 12.12345;
        System.out.println("«Значение переменной a с типом byte равно " + a);
        System.out.println("«Значение переменной b с типом short равно " + b);
        System.out.println("«Значение переменной c с типом int равно " + c);
        System.out.println("«Значение переменной d с типом long равно " + d);
        System.out.println("«Значение переменной e с типом float равно " + e);
        System.out.println("«Значение переменной f с типом double равно " + f);
    }

    public static void task2 () {
        float f = 27.12f;
        long e = 987678965549L;
        double g = 2.786;
        short c = 569;
        short b = -159;
        int d = 27897;
        byte a = 67;
        System.out.println("«Значение переменной a с типом byte равно " + a);
        System.out.println("«Значение переменной b с типом short равно " + b);
        System.out.println("«Значение переменной c с типом short равно " + c);
        System.out.println("«Значение переменной d с типом int равно " + d);
        System.out.println("«Значение переменной e с типом long равно " + e);
        System.out.println("«Значение переменной f с типом float равно " + f);
        System.out.println("«Значение переменной g с типом double равно " + g);
    }
    public static void task3 () {
        int LPstudents = 23;
        int ASstudents = 27;
        int EAstudents = 30;
        int amountStudents = LPstudents + ASstudents + EAstudents;
        int amountPaper = 480;
        int everyStudentPaper = amountPaper / amountStudents;
        System.out.println("На каждого ученика рассчитано " + everyStudentPaper + " листов бумаги");
    }
    public static void task4 () {
        int resultMashineForMinute = 16/2;
        int resultMashineFor20Minutes = resultMashineForMinute * 20;
        int resultMashineForDay = resultMashineForMinute * 1440;
        int resultMashineFor3Days = resultMashineForDay * 3;
        int resultMashineForMonth = resultMashineFor3Days * 10;
        System.out.println("За 20 минут машина произвела " + resultMashineFor20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + resultMashineForDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела "+ resultMashineFor3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + resultMashineForMonth + " штук бутылок");
    }
    public static void task5 () {
        int needWhitePaintPerClass = 2;
        int needBrownPaintPerClass = 4;
        int amountPaintPerClass = needWhitePaintPerClass + needBrownPaintPerClass;
        int amountClasses = 120 / amountPaintPerClass;
        int amountWhitePaint = amountClasses * 2;
        int amountBrownPaint = amountClasses * 4;
        System.out.println("В школе, где " + amountClasses + " классов, нужно " + amountWhitePaint +
                " банок белой краски и " + amountBrownPaint + " банок коричневой краски.");
    }

    public static void task6 () {
        int weight5bananes = 5 * 80;
        int weight200MlMilk = 2 * 105;
        int weight2IceCream = 2 * 100;
        int weight4Egg = 4 * 70;
        int weightOfBreakfastInGramm = weight5bananes + weight200MlMilk + weight2IceCream + weight4Egg + weight4Egg;
        float weightOfBreakfastInKilo = (weight5bananes + weight200MlMilk + weight2IceCream + weight4Egg + weight4Egg)/1000F;
        System.out.println("вес завтрака в граммах будет " + weightOfBreakfastInGramm);
        System.out.println("вес завтрака в кг будет " + weightOfBreakfastInKilo);
    }
    public static void task7 () {
        int lostWeightPer250GrDay = (7 * 1000) / 250;
        int lostWeightPer500GrDay = (7 * 1000) / 500;
        int everageLostWeight = (lostWeightPer500GrDay + lostWeightPer250GrDay)/2;
        System.out.println("При потере веса 250 гр в день спортсмену потребуется " + lostWeightPer250GrDay);
        System.out.println("При потере веса 500 гр в день спортсмену потребуется " + lostWeightPer500GrDay);
        System.out.println("В среднем для похудения на 7 кг спортсмену потребуется " + everageLostWeight + " дней.");
    }
    public static void task8 () {
        int MashaSalaryMonth = 67760;
        int DenisSalaryMonth = 83690;
        int CristinaSalaryMonth = 76230;
        int newMashaSalary = MashaSalaryMonth + (MashaSalaryMonth/10);
        int newDenisSalary = DenisSalaryMonth + (DenisSalaryMonth/10);
        int newCristinaSalary = CristinaSalaryMonth + (CristinaSalaryMonth/10);
        int differenceMashaSalary = (newMashaSalary*12)-(MashaSalaryMonth*12);
        int differenceDenisSalary = (newDenisSalary*12)-(DenisSalaryMonth*12);
        int differenceCristinaSalary = (newCristinaSalary*12)-(CristinaSalaryMonth*12);
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + differenceMashaSalary + " рублей.");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + differenceDenisSalary + " рублей.");
        System.out.println("Кристина теперь получает " + newCristinaSalary + " рублей. Годовой доход вырос на " + differenceCristinaSalary + " рублей.");
    }
}