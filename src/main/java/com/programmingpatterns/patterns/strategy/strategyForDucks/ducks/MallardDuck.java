package com.programmingpatterns.patterns.strategy.strategyForDucks.ducks;

import com.programmingpatterns.patterns.strategy.strategyForDucks.behaviorImpl.FlyWithWings;
import com.programmingpatterns.patterns.strategy.strategyForDucks.behaviorImpl.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
