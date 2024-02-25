package com.programmingpatterns.patterns.strategy.strategyForDucks.behaviorImpl;

import com.programmingpatterns.patterns.strategy.strategyForDucks.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
