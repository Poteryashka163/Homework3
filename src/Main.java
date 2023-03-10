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
        byte numberByte = -128;
        short numberShort = 128;
        int numbetInt = 32767;
        long numberLong = 2147483600L;
        float numberFloat = 3.423f;
        double numberDoble = 3.4;
        System.out.println("        Решение задачи 1.    ");
        System.out.println("Значение переменной numberByte с типом byte равно: "+ numberByte);
        System.out.println("Значение переменной numberShort с типом short равно: "+ numberShort);
        System.out.println("Значение переменной numbetInt с типом int равно: "+ numbetInt);
        System.out.println("Значение переменной numberLong с типом long равно: "+ numberLong);
        System.out.println("Значение переменной numberFloat с типом float равно: "+ numberFloat);
        System.out.println("Значение переменной numberDoble с типом double равно: "+ numberDoble);
        System.out.println("");
    }
    public static void task2 () {
        System.out.println("        Решение задачи 2.    ");
        System.out.println("double numberDoble1 = 27.12");
        System.out.println("long numbetLong = 987678965549l");
        System.out.println("double numberDoble = 2.786");
        System.out.println("int numbetInt1 = 569");
        System.out.println("short numberShort = -159");
        System.out.println("int numbetInt = 27897");
        System.out.println("byte numberByte = 67");
        System.out.println("");
    }
    public static void task3 () {
        System.out.println("        Решение задачи 3.    ");
        int studentsPavlova = 23;
        int studentsSergeevna = 27;
        int studentsAndreevni = 30;
        int listov = 480;
        int papperAsstudent = 480 / ( studentsAndreevni + studentsPavlova + studentsSergeevna );
        System.out.println("На каждого ученика рассчитано " +papperAsstudent+ " листов бумаги.");
        System.out.println("");
    }
    public static void task4 () {
        System.out.println("        Решение задачи 4.    ");
        int time1 = 2;
        int time2 = 20;
        int time3 = 24 * 60;
        int time4 = 3 * 24 * 60;
        int time5 = 30 * 24 * 60;
        int mashinaTomin = 16/time1;
        int bottles1 = time2 * mashinaTomin;
        int bottles2 = time3 * mashinaTomin;
        int bottles3 = time4 * mashinaTomin;
        int bottles4 = time5 * mashinaTomin;
        System.out.println("За " +time2+ "минут машина произвела " +bottles1+ "штук бутылок.");
        System.out.println("За " +time3+ "минут машина произвела " +bottles2+ "штук бутылок.");
        System.out.println("За " +time4+ "минут машина произвела " +bottles3+ "штук бутылок.");
        System.out.println("За " +time5+ "минут машина произвела " +bottles4+ "штук бутылок.");
        System.out.println("");
    }
    public static void task5 () {
        System.out.println("        Решение задачи 5.    ");
        int kraski = 120;
        int whiteDye = 2;
        int brownDye = 4;
        int kraskiNaclassov = whiteDye + brownDye;
        int classov = kraski / kraskiNaclassov;
        int classovWhiteDye = classov * whiteDye;
        int classowBrownDye = classov * brownDye;
        System.out.println("В школе, где " +classov+ " классов, нужно " +classovWhiteDye+ " банок белой краски и " +classowBrownDye+ " банок коричневой краски.");
        System.out.println("");

    }
    public static void task6 () {
        System.out.println("        Решение задачи 6.    ");
        int banana = 5;
        int bananaVes = 80;
        int milk = 200;
        int milkVes100 = 105;
        int icecream = 2;
        int icecreamVes = 100;
        int egs = 4;
        int egsVes = 70;
        int milkDoli = milk / 100;
        int cocktailGramm = (banana * bananaVes)+(milkDoli * milkVes100)+(icecream * icecreamVes)+(egs * egsVes);
        double cocktailKg = cocktailGramm / 1000;
        System.out.println("Вес спортзавтрака "+cocktailGramm+" грамм или "+cocktailKg+" кг.");
        System.out.println("");
    }
    public static void task7 () {
        System.out.println("        Решение задачи 7.    ");
        int poxydanie250 = 250;
        int poxydanie500 = 500;
        int vesSbrosit = 7;
        int vesSbrositKg = vesSbrosit * 1000;
        int dnei250 = vesSbrositKg / poxydanie250;
        int dnti500 = vesSbrositKg / poxydanie500;
        int dneiSredni = (dnei250 + dnti500) / 2;
        System.out.println(+dnei250+" дней понадобится на похудение, если терять по " +poxydanie250+" грамм день.");
        System.out.println(+dnti500+" дней понадобится на похудение, если терять по " +poxydanie500+" грамм день.");
        System.out.println(+dneiSredni+" дней в среднем понадобится для похудения.");
        System.out.println("");
    }
    public static void task8 () {
        System.out.println("        Решение задачи 8.    ");
        int payMasha = 67760;
        int payDenis = 83690;
        int payKristina = 76230;
        int indexaciaMasha = ( payMasha / 100 ) * 10 + payMasha;
        int indexaciaDenis = ( payDenis / 100) * 10 + payDenis;
        int indexaciaKristina = ( payKristina / 100 ) * 10 + payKristina;
        int raznicaZpMasha = ( indexaciaMasha * 12 ) - ( payMasha * 12 );
        int raznicaZpDenis = ( indexaciaDenis * 12 ) - ( payDenis * 12 );
        int raznicaZpKristina = ( indexaciaKristina * 12 ) - ( payKristina * 12 );
        System.out.println("Маша теперь получает " +indexaciaMasha+ " рублей. Годовой доход вырос на " +payMasha+ " рублей.");
        System.out.println("Денис теперь получает " +indexaciaDenis+ " рублей. Годовой доход вырос на " +payDenis+ " рублей.");
        System.out.println("Кристина теперь получает " +indexaciaKristina+ " рублей. Годовой доход вырос на " +payKristina+ " рублей.");
    }


}