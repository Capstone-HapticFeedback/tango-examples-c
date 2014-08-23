package com.google.tango.hellotangojni;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	TangoJNINative tangoJNINative;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TangoJNINative.onCreate();
	}
	
	@Override
	protected void onResume()
	{
		super.onResume();
		TangoJNINative.onResume();
	}

	@Override
	protected void onPause()
	{
		super.onPause();
		TangoJNINative.onPause();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}