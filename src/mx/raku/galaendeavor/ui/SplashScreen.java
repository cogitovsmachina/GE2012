package mx.raku.galaendeavor.ui;

import java.util.Timer;
import java.util.TimerTask;

import mx.raku.galaendeavor.R;
import mx.raku.galaendeavor.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);
		getActionBar().hide();

		TimerTask timerTask = new TimerTask() {

			@Override
			public void run() {
				finish();
				startActivity(new Intent().setClass(SplashScreen.this,
						ProductScreen.class));
			}
		};
		Timer timer = new Timer();
		timer.schedule(timerTask, 400);
	}

}
