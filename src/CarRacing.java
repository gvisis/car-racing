public class CarRacing {

    public static int carRandomMove(int number) {
        int randomNumber = (int) (Math.random() * number + 1);
        return randomNumber;
    }

    public static void main(String[] args) {
        int[] cars = new int[8];
        int[] carTotalMove = new int[cars.length];
        int distanceToReach = 1000;
        int currentDistance = 0;

        while (currentDistance <= distanceToReach) {
            int i;
            for (i = 0; i < cars.length; i++) {
                cars[i] = i + 1;
                for (int j = 0; j < cars.length; j++) {
                    cars[j] = j + 1;
                    int carMoves = carRandomMove(10);
                    carTotalMove[j] = carTotalMove[j] + carMoves;
                    if (carTotalMove[j] >= distanceToReach){
                        currentDistance = carTotalMove[j];
                        for (int k = 0; k < cars.length; k++){
                            System.out.printf("Car %d drove: %d km\n", k+1, carTotalMove[k]);
                        }
                        System.out.printf("Car %d won the game by reaching %d km first! \n", cars[j], currentDistance);
                        return;
                    }
                }
            }
        }
    }
}

// Kiekvieno ciklo metu turi pavaziuoti atstuma nuo 1-10 (random);
// tada tikrinam ar kuri masina nuvaziavo 1000km ;
// kai kazkuris pasiekia finiso linijos skaiciu, padeti ta skaiciu i kita int

// EXTRA: jei nors viena masina pasiekia 100km ar 200km ir t.t. atspausdinti tarpinius rezultatus;

// Bent vienai masinai kirtus finiso linija ( pasiekus skaiciu 10 ir daugiau) baigiasi lenktynes
// Baigus lenktynes, surusiuoti masinytes nuvaziuoto kelio MAZEJIMO tvarka.

// kas 100km isspausdinti nuvaziuota atstuma;

