package edu.sjsu.cohort3.grp1.pbd;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//menu.add("Test");
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem menuItem) {
		switch(menuItem.getItemId()) {
		case R.id.action_settings:
			Intent settings1 = new Intent(MainActivity.this, edu.sjsu.cohort3.grp1.pbd.Settings1.class);
			startActivity(settings1);
			return true;
		default:
			return super.onOptionsItemSelected(menuItem);
		}
	}
}
