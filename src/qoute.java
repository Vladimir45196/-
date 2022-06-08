public class qoute {
    public static void main(String[] args) {

        int pcs;
        double cost, Rus, USD, Bel, sumRus, sumBel, sumUsd;
        final int bank = 1000;
        final double courseBel = 0.043;
        final int courseUsd = 60;
        final double percent = 1.2;

        cost = 33887.00; // введите общую стоимость
        pcs = 1030;  // введите количество

        sumRus = cost + bank;
        sumBel = (cost + bank) * courseBel;
        sumUsd = (cost + bank) / courseUsd;

        Rus = (cost + bank) / pcs;
        Bel = (cost + bank) * courseBel / pcs;
        USD = (cost + bank) / courseUsd / pcs;


        System.out.println("RUS = " + " " + Rus);
        System.out.println("BLR = " + " " + Bel);
        System.out.println("USD = " + "  " + USD);

        System.out.println("Summa RUS = " + " " + sumRus);
        System.out.println("Summa BLR = " + " " + sumBel);
        System.out.println("Summa BLR = " + " " + sumUsd);

    }
}
