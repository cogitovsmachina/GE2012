package mx.raku.galaendeavor;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);
		getActionBar().hide();
		
		TimerTask timerTask = new TimerTask() {
			
			@Override
			public void run() {
				finish();
					startActivity(new Intent().setClass(SplashScreen.this, ProductScreen.class));
			}
		};
		Timer timer = new Timer();
		timer.schedule(timerTask, 400);
	}
		
}
