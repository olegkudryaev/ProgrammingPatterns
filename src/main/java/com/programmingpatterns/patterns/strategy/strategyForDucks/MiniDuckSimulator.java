package com.programmingpatterns.patterns.strategy.strategyForDucks;
import com.programmingpatterns.patterns.strategy.strategyForDucks.behavior.FlyBehavior;
import com.programmingpatterns.patterns.strategy.strategyForDucks.behavior.QuackBehavior;
import com.programmingpatterns.patterns.strategy.strategyForDucks.behaviorImpl.FlyRocketPowered;
import com.programmingpatterns.patterns.strategy.strategyForDucks.ducks.*;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        DecoyDuck decoy = new DecoyDuck();

        Duck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
