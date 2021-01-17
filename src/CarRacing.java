public class CarRacing {

    public static void sortCarDistancesDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.printf("Car distance: %d km\n", array[i]);
        }
    }

    public static int randomMoveCarBy(int number) {
        return (int) (Math.random() * number + 1);
    }

    public static void main(String[] args) {
        int[] cars = new int[8];
        int distanceToReach = 1000;
        int interm = 100;
        boolean isRacing = true;

        while (isRacing) {
            for (int i = 0; i < cars.length; i++) {
                cars[i] += randomMoveCarBy(10);
            }

            // destytojo kodas
            boolean printInterm = false;

            int intermWinner = 0;
            int intermWinnerKm = 0;

            for (int i = 0; i < cars.length; i++) {
                if (cars[i] > intermWinnerKm) {
                    intermWinner = i + 1;
                    intermWinnerKm = cars[i];
                }
                if (cars[i] >= interm) {
                    printInterm = true;
                    interm += 100;
                }
            }
            if (printInterm) {
                for (int i = 0; i < cars.length; i++) {
                    System.out.print(cars[i] + "\t");
                }
                System.out.println();
                System.out.println("Pirmauja: " + intermWinner + " nuvaziavo " + intermWinnerKm);
            }

            // Check if car reached the finish line

            for (int i = 0; i < cars.length; i++) {
                if (cars[i] >= distanceToReach) {
                    System.out.printf("Car %d won the game by reaching %d km first! \n", i + 1,
                            cars[i]);

                    // Sort car distances
                    sortCarDistancesDesc(cars);
                    isRacing = false;
                    break;
                }
            }
        }
    }
}

// Kiekvieno ciklo metu turi pavaziuoti atstuma nuo 1-10 (random);
// tada tikrinam ar kuri masina nuvaziavo 1000km ;
// kai kazkuris pasiekia finiso linijos skaiciu, padeti ta skaiciu i kita int ?

// Bent vienai masinai kirtus finiso linija ( pasiekus skaiciu 10 ir daugiau) baigiasi lenktynes
// Baigus lenktynes, surusiuoti masinytes nuvaziuoto kelio MAZEJIMO tvarka.

// EXTRA: jei nors viena masina pasiekia 100km ar 200km ir t.t. atspausdinti tarpinius rezultatus;

