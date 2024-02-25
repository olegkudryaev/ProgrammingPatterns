package com.programmingpatterns.patterns.strategy.strategyForDucks;


import com.programmingpatterns.patterns.strategy.strategyForDucks.behaviorImpl.FlyRocketPowered;
import com.programmingpatterns.patterns.strategy.strategyForDucks.ducks.Duck;
import com.programmingpatterns.patterns.strategy.strategyForDucks.ducks.MallardDuck;
import com.programmingpatterns.patterns.strategy.strategyForDucks.ducks.ModelDuck;

public class MiniDuckSimulator1 {
 
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
