package com.programmingpatterns.patterns.strategy.strategyForDucks.ducks;

import com.programmingpatterns.patterns.strategy.strategyForDucks.behaviorImpl.FlyWithWings;
import com.programmingpatterns.patterns.strategy.strategyForDucks.behaviorImpl.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
