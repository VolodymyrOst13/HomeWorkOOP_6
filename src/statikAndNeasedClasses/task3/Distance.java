package statikAndNeasedClasses.task3;

public class Distance {
    private final double DISTANCE;
    {
        DISTANCE = 100;
    }

    private static class Converter {
        private static double toCentimeter(){
            Distance centimeters = new Distance();
            return centimeters.DISTANCE * 1000;
        }
        private static double toKilometers(){
            Distance centimeters = new Distance();
            return centimeters.DISTANCE * 0.001;
        }
        private static double toMiles() {
            Distance miles = new Distance();
            return miles.DISTANCE * 0.000621371;
        }
        private static double toInch() {
            Distance inch = new Distance();
            return inch.DISTANCE * 39.37;
        }
    }

    public double getDISTANCE(){
        return DISTANCE;
    }

    void print() {
        System.out.println("Distance in meters - " + getDISTANCE() + "[m]");
        System.out.println("To Centimeter - " + Converter.toCentimeter() + "[cm]");
        System.out.println("To Kilometers - " + Converter.toKilometers() + "[km]");
        System.out.println("To Miles - " + Converter.toMiles() + "[mi]");
        System.out.println("To Inch - " + Converter.toInch() + "[in]");
    }
}

 class Main {
    public static void main(String[] args) {
        Distance distance = new Distance();
        distance.print();
    }

}

