// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
                            /*Задача 3
В стране Y население — 12 миллионов человек.
Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
Рассчитайте, какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.
В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».*/

        int populationInY = 12_000_000;
        int conditionalNumber = 1_000;
        int natalityHuman = 17;
        int deathRateHuman = 8;
        int countYears = 10;
        for ( int i = 1; i <= countYears;i++){
            int natalityHumanTotal = populationInY / conditionalNumber * natalityHuman;
            int deathRateHumanTotal = populationInY / conditionalNumber * deathRateHuman;
            int growthHumanOnYear = natalityHumanTotal - deathRateHumanTotal;
            populationInY+=growthHumanOnYear;
            if(i<5){
                System.out.println("за " +i+"-й год численность населения составляет "
                        +populationInY+" ,прирост составляет "+growthHumanOnYear+" человек.");
            }
            else {
                System.out.println("за " +i+" лет численность населения составляет "
                         +populationInY+" ,прирост составляет "+growthHumanOnYear+" человек.");
            }
        }

    }
}