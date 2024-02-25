package com.programmingpatterns.patterns.strategy.challengeShareStrategy.shareStrategyOmpl;

import com.programmingpatterns.patterns.strategy.challengeShareStrategy.shareStrategy.ShareStrategy;

public class Email implements ShareStrategy {
	public void share() {
		System.out.println("I'm emailing the photo");
	}
}
