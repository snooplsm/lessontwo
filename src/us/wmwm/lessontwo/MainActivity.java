package us.wmwm.lessontwo;

import us.wmwm.lessontwo.fragments.ContentFragment;
import us.wmwm.lessontwo.fragments.ListFragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class MainActivity extends FragmentActivity {

	ListFragment listFragment;
	ContentFragment contentFragment;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		listFragment = (ListFragment) getSupportFragmentManager().findFragmentById(R.id.ListFragment);
		contentFragment = (ContentFragment) getSupportFragmentManager().findFragmentById(R.id.ContentFragment);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
