package com.programmingpatterns.patterns.strategy.challengeShareStrategy.shareStrategyOmpl;

import com.programmingpatterns.patterns.strategy.challengeShareStrategy.shareStrategy.ShareStrategy;

public class Txt implements ShareStrategy {
	public void share() {
		System.out.println("I'm txting the photo");
	}
}
