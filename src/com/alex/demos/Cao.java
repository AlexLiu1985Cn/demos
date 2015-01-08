package com.alex.demos;

import android.app.Activity;
import android.os.Bundle;

public class Cao extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		caonijuhua();
	}

	private String caonijuhua() {
		String aa = "caonide";
		String ss = "juhua";
		String zz = aa + ss;
		return zz;
	}
}
