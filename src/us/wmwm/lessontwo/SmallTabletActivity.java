package us.wmwm.lessontwo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class SmallTabletActivity extends FragmentActivity {

	ViewPager pager;
	
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.activity_small_tablet);
		pager = (ViewPager) findViewById(R.id.pager);
	}
	
}
