package edu.sjsu.cohort3.grp1.pbd;

import android.app.Activity;

import android.content.Intent;
import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.net.Uri;

public class Settings1 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings1);

		Button buttonOK = (Button)findViewById(R.id.buttonOK);
		buttonOK.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				EditText userID = (EditText)findViewById(R.id.txtUserID);
				String uid = userID.getText().toString();
				Toast.makeText(getApplicationContext(), "(DEBUG) user: "+uid, Toast.LENGTH_SHORT).show();
				Data data = new Data();
				data.setUserId(uid);
			}
		});

		Button buttonCancel = (Button)findViewById(R.id.buttonCancel);
		buttonCancel.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// DEBUG - START
				// Data data = new Data();
				// Toast.makeText(getApplicationContext(), "(DEBUG) user: "+Data.getUserId(), Toast.LENGTH_SHORT).show();
				// DEBUG - END
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
