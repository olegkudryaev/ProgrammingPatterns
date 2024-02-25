package com.programmingpatterns.patterns.strategy.strategyForDucks.behaviorImpl;

import com.programmingpatterns.patterns.strategy.strategyForDucks.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
