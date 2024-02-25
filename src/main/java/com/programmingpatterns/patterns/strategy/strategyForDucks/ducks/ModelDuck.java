package com.programmingpatterns.patterns.strategy.strategyForDucks.ducks;

import com.programmingpatterns.patterns.strategy.strategyForDucks.behaviorImpl.FlyNoWay;
import com.programmingpatterns.patterns.strategy.strategyForDucks.behaviorImpl.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
