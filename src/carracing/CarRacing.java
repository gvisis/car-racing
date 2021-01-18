package carracing;

public class CarRacing {

    public static void sortCarDistancesDesc(Car[] masinos) {
        System.out.println("========== Results ==========");
        for (int i = 0; i < masinos.length; i++) {
            for (int j = i + 1; j < masinos.length; j++) {
                if (masinos[i].distance < masinos[j].distance) {
                    int temp = masinos[i].distance;
                    String tempName = masinos[i].name;
                    masinos[i].distance = masinos[j].distance;
                    masinos[i].name = masinos[j].name;
                    masinos[j].distance = temp;
                    masinos[j].name = tempName;
                }
            }
            System.out.printf("%d. %s distance: %d km\n", i + 1, masinos[i].name, masinos[i].distance);
        }
    }


    public static void main(String[] args) {
        Car[] racingCar = {
                new Car("Audi", 150),
                new Car("Ford", 160),
                new Car("Volkswagen", 170),
                new Car("Bmw", 190),
                new SuperCar("Bentley", 250),
                new SuperCar("Ferrari", 350),
                new SuperCar("Bugatti", 290)
        };

        int distanceToReach = 500;
        int interm = 100;
        boolean isRacing = true;

        while (isRacing) {
            for (Car currentCar : racingCar) {
                currentCar.drive();
//                System.out.println(currentCar.getName() + " speed: " + currentCar.getCurrentSpeed() + " distance: " + currentCar.getDistance());
            }

            boolean printInterm = false;

            String intermWinner = " ";
            int intermWinnerKm = 0;

            for (Car car : racingCar) {
                if (car.getDistance() > intermWinnerKm) {
                    intermWinner = car.getName();
                    intermWinnerKm = car.getDistance();
                }
                if (car.getDistance() >= interm) {
                    printInterm = true;
                    interm += 100;
                }
            }
            if (printInterm) {
                for (int i = 0; i < racingCar.length; i++) {
                    System.out.print(racingCar[i].getName() + " " + racingCar[i].getDistance() + " | ");
                }
                System.out.println();
                System.out.println("Leader: " + intermWinner + " distance " + intermWinnerKm);
                System.out.println("-------------------");
            }

            // Check if car reached the finish line

            for (int i = 0; i < racingCar.length; i++) {
                if (racingCar[i].getDistance() >= distanceToReach) {
                    System.out.printf("Car %s won the game by reaching %d km first! \n\n", racingCar[i].getName(),
                            distanceToReach);

                    // Sort car distances
                    isRacing = false;
                    break;
                }
            }
        }
        sortCarDistancesDesc(racingCar);
    }
}