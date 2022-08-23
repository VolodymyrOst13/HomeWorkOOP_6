package anonymusClassesAndEnums.task2;

public class Main {
    public static void main(String[] args) {
        Animals flamingo = Animals.FLAMINGO;
        System.out.println(flamingo);

        System.out.println();

        int age = flamingo.getAge();
        String years = flamingo.getYears();
        System.out.println("Flamingo have - " + age + " " + years );

        System.out.println();

        Animals elephant = Animals.ELEPHANT;
        System.out.println(elephant);

        System.out.println();

        Animals cat = Animals.CAT;
        System.out.println(cat);

        System.out.println();

        Animals dog = Animals.DOG;
        System.out.println(dog);

    }
}
