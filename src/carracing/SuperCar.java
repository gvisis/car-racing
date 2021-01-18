package carracing;

public class SuperCar extends Car {
    private boolean isSpoilerUp;

    // Constructor
    public SuperCar(String name, int maxSpeed) {
        super(name, maxSpeed);
        this.isSpoilerUp = false;
    }

    public void accelerate() {
        isSpoilerUp = (Math.random() < 0.5) ? true : false;
        //  accelerates from 1 to 10
        if (!isSpoilerUp) {
            this.currentSpeed += (int) (Math.random() * 20 + 1);
        } else {
            this.currentSpeed += (int) (Math.random() * 10 + 1);
        }

        if (this.currentSpeed > this.maxSpeed) {
            this.currentSpeed = this.maxSpeed;
        }
    }

    public void decelerate() {
        isSpoilerUp = (Math.random() < 0.5) ? true : false;
        // Decelerates from 1 to 5
        if (isSpoilerUp) {
            this.currentSpeed -= (int) (Math.random() * 10 + 1);
        } else {
            this.currentSpeed -= (int) (Math.random() * 5 + 1);
        }

        if (this.currentSpeed < 0) {
            this.currentSpeed = 0;
        }
    }
}

/*
* sunkesnis uzdavinys:
* sukurti klase su Sportine masina
*   masina turi spoileri kuris arba pakeltas arba nuleist
*   jeigu spoileris = true tai pakeltas
*   jeigu spoileris = false tai nuleistas
*
*   Pries nusprendziant ar masina ar stabdys ar gazuos, reikia paziureti ar tai sportine masina;
*
*   Jei tai sportine masina, tai 50% tikimybe, kad pasikeis spoilerio pozicija
*
SportineMasina, jeigu metode gazuok():
*   jei spoileris nuleistas - gazuoja 2 kartus greiciau
*   jei spoileris pakeltas - gazuoja tiek pat kiek standartine masina ( niekas nesikeicia)
*
* metode stabdyk():
*   jei spoileris pakeltas - stabdo 2 kartus greiciau;
* *
* Nesumuoja greicio
* Negaliu patikrint ar veikia maxspeed;
 */