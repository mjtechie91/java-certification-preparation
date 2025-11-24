package lambdaexpression;

public class MainTest {

    public static void main(String[] args) {

        //Anonymous class
/*        Animals animal = new Animals() {
            @Override
            public void show(String animal, int speed){
                System.out.println("A "+ animal + " can reach speed of "+ speed + " KM per hour");
            }
        };

        animal.show("Cheetah", 100);*/

        //Lambda Expression

        Animals animal = (a, s) -> {
            System.out.println("A "+ a + " can reach speed of "+ s + " KM per hour");
        };

        animal.show("Cheetah", 90);
    }
}
