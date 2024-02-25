package com.programmingpatterns.patterns.strategy.challengeShareStrategy;

import com.programmingpatterns.patterns.strategy.challengeShareStrategy.cameraApp.BasicCameraApp;
import com.programmingpatterns.patterns.strategy.challengeShareStrategy.cameraApp.PhoneCameraApp;
import com.programmingpatterns.patterns.strategy.challengeShareStrategy.shareStrategyOmpl.Email;
import com.programmingpatterns.patterns.strategy.challengeShareStrategy.shareStrategyOmpl.Social;
import com.programmingpatterns.patterns.strategy.challengeShareStrategy.shareStrategyOmpl.Txt;

import java.util.Scanner;

public class PhotoWithPhone {
 
	public static void main(String[] args) {
 
		PhoneCameraApp cameraApp = new BasicCameraApp();
		String share = getSharing();
		switch (share) {
			case("t"): cameraApp.setShareStrategy(new Txt()); break;
			case("e"): cameraApp.setShareStrategy(new Email()); break;
			case("s"): cameraApp.setShareStrategy(new Social()); break;
			default: cameraApp.setShareStrategy(new Txt());
		}
		cameraApp.take();
		cameraApp.edit();
		cameraApp.save();
		cameraApp.share();
	}
	public static String getSharing() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Share with txt (t), email (e), or social media (s)?");
		String appName = scanner.next();
		scanner.close();
		return appName;
	}
}
