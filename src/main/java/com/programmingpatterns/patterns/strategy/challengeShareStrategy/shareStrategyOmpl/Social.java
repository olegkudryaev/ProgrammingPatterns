package com.programmingpatterns.patterns.strategy.challengeShareStrategy.shareStrategyOmpl;

import com.programmingpatterns.patterns.strategy.challengeShareStrategy.shareStrategy.ShareStrategy;

public class Social implements ShareStrategy {
	public void share() {
		System.out.println("I'm posting the photo on social media");
	}
}
