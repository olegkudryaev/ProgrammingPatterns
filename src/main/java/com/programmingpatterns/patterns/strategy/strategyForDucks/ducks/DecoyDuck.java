package com.programmingpatterns.patterns.strategy.strategyForDucks.ducks;

import com.programmingpatterns.patterns.strategy.strategyForDucks.behaviorImpl.FlyNoWay;
import com.programmingpatterns.patterns.strategy.strategyForDucks.behaviorImpl.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
