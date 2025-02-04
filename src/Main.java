
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int per1 = 3;
        byte per2 = 4;
        short per3 = 5;
        long per4 = 6L;
        float per5 = 7.8F;
        double per6 = 1.14;
        System.out.println("Значение переменной с типом int равно " + per1);
        System.out.println("Значение переменной с типом byte равно " + per2);
        System.out.println("Значение переменной с типом short равно " + per3);
        System.out.println("Значение переменной с типом long равно " + per4);
        System.out.println("Значение переменной с типом float равно " + per5);
        System.out.println("Значение переменной с типом double равно " + per6);
        double perem1 = 27.12;
        long perem2 = 987678965549L;
        float perem3 = 2.786F;
        short perem4 = 569;
        int perem5 = -159;
        char perem6 = 27897;
        byte perem7 = 67;
        int ludPav = 23;
        int annSerg = 27;
        int ekAndr = 30;
        int obchBumaga = 480;
        int obchUch = ludPav + annSerg + ekAndr;
        int bumUch = obchBumaga / obchUch;
        System.out.println("На каждого ученика расчитано " + bumUch + " листов бумаги");
        int but = 16;
        int min = 2;
        int butMin = but / min;
        int but20min = butMin * 20;
        int minSut = 1440;
        int butSut = butMin * minSut;
        int min3sut = minSut * 3;
        int but3sut = min3sut * butMin;
        int minMes = butSut * 30;
        int butMes = minMes * butMin;
        System.out.println("За 20 минут машина произвела " + but20min + " бутылок");
        System.out.println("За сутки машина произвела " + butSut + " бутылок");
        System.out.println("За трое суток машина произвела " + but3sut + " бутылок");
        System.out.println("За месяц машина произвела " + butMes + " бутылок");
        int bel = 2;
        int kor = 4;
        int bankObch = 120;
        int kolKlassov = bankObch / (bel + kor);
        int bankBel = bel * kolKlassov;
        int bankKor = kor * kolKlassov;
        System.out.println("В школе где " + kolKlassov + " классов, нужно " + bankBel + " банок белой краски и " + bankKor + " банок коричневой краски");
        int banana = 5;
        int weightOneBanana = 80;
        int weightBanana = banana * weightOneBanana;
        int mlMilk = 200;
        float grMilk = 1.0F;
        float weightMilk = grMilk * mlMilk;
        int iceCreamBr = 2;
        int weightIceCreamBr = 100;
        int weightIceCream = iceCreamBr * weightIceCreamBr;
        int eggs = 4;
        int weightOneEgg = 70;
        int weightEggs = eggs * weightOneEgg;
        float weightZavtrGr = weightBanana + weightMilk + weightIceCream + weightEggs;
        float weightZavtrKg = weightZavtrGr / 1000.0F;
        System.out.println("Вес завтрака спортсмена в килограммах " + weightZavtrKg);
        int goalKg = 7;
        int goalGr = goalKg * 1000;
        int minusWeightPerDay1 = 250;
        int minusWeightPerDay2 = 500;
        double days1 = goalGr / minusWeightPerDay1;
        double days2 = goalGr / minusWeightPerDay2;
        System.out.println("Спортсмен скинет 7кг за " + days1 + "если будет скидывать по 250гр в день и " + days2 + "если будет скидывать по 500 гр в день");
        double zpMasha = 67760.0;
        double zpDenis = 83690.0;
        double zpKristina = 76230.0;
        double dobZpMasha = zpMasha * 0.1;
        double dobZpDenis = zpDenis * 0.1;
        double dobZpKristina = zpKristina * 0.1;
        double newZpMasha = zpMasha + dobZpMasha;
        double newZpDenis = zpDenis + dobZpDenis;
        double newZpKristina = zpKristina + dobZpKristina;
        System.out.println("Маша теперь получает " + newZpMasha + " рублей. Годовой доход вырос на " + dobZpMasha + " рублей");
        System.out.println("Денис теперь получает " + newZpDenis + " . Годовой доход вырос на " + dobZpDenis + " рублей");
        System.out.println("Маша теперь получает " + newZpKristina + " рублей. Годовой доход вырос на " + dobZpKristina + " рублей");
    }
}
