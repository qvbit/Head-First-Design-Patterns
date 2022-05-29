/**
 * This pattern is known as the STRATEGY Pattern:
 * ----- Formal definition ------
 * The Strategy Pattern defines a family of alrorithms, encapsulates each one,
 * and makes them intechangeable. Strategy lets the algorithm vary independently from
 * the clients that use it.
 */
public class MainDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
