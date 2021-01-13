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
        int[] carTotalMove = new int[cars.length];
        int distanceToReach = 1000;

        while (true) {
            int j;
            for (j = 0; j < cars.length; j++) {
                cars[j] = j + 1;
                carTotalMove[j] = carTotalMove[j] + randomMoveCarBy(13);

                // Check if car reached the finish line
                if (carTotalMove[j] >= distanceToReach) {
                    System.out.printf("Car %d won the game by reaching %d km first! \n", cars[j],
                            carTotalMove[j]);

                    // Sort car distances
                    sortCarDistancesDesc(carTotalMove);
                    return;
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

