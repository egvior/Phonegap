package com.divisadero.coffehouse;

import android.os.Bundle;
import org.apache.cordova.*;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.init();
		super.setIntegerProperty("loadUrlTimeoutValue", 70000);
		// Set by <content src="index.html" /> in config.xml
        super.loadUrl(Config.getStartUrl());
        //super.loadUrl("file:///android_asset/www/index.html")
	}

}
