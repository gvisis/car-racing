public class CarRacing {

    public static int carRandomMove(int number) {
        int randomNumber = (int) (Math.random() * number + 1);
        return randomNumber;
    }

    public static void main(String[] args) {
        int[] cars = new int[8];
        int[] carTotalMove = new int[cars.length];
        int distance = 150;
        for (int i = 0; i < cars.length; i++) {
            cars[i] = i + 1;
            int carMoves = 0;
            for (int j = 0; j < cars.length; j++) {
                carMoves = carRandomMove(10);
                carTotalMove[j] = carTotalMove[j] + carMoves;
                System.out.printf("Car %d total moves: %d\n", cars[i], carTotalMove[j]);
            }
            System.out.printf("Car %d moves by: %d\n", cars[i], carMoves);
        }
    }
}

//i = 0 , i maziau uz 8
//    j = 0; j < 8

// pavaziuoti gali nuo 1-10 imtinai .
// iteracijos metu masina pavaziuoja po random  skaiciu;
// tada tikrinam ar kuri masina nuvaziavo 1000km ;
// sekancia iteracija masina pavaziavo po random skaiciu
// nuvaziavus kas 100km parodyti masinu nuvaziuota atstuma;
// vel tikrinti ar kuri nors pavaziavo 1000km
// Bent vienai masinai kirtus finiso linija ( pasiekus skaiciu 10 ir daugiau)
