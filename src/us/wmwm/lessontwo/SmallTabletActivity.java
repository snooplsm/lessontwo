package us.wmwm.lessontwo;

import us.wmwm.lessontwo.fragments.ContentFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class SmallTabletActivity extends FragmentActivity {

	ViewPager pager;
	
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.activity_small_tablet);
		pager = (ViewPager) findViewById(R.id.pager);
		
		pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return 10;
			}
			
			@Override
			public CharSequence getPageTitle(int position) {
				return String.valueOf(position);
			}
			
			@Override
			public Fragment getItem(int position) {
				
				String text = String.valueOf(position);
				return ContentFragment.newInstance(text);
			}
		});
	}
	
}
