package com.programmingpatterns.patterns.strategy.strategyForDucks.behaviorImpl;

import com.programmingpatterns.patterns.strategy.strategyForDucks.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
