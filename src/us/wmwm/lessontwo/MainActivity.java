package us.wmwm.lessontwo;

import us.wmwm.lessontwo.fragments.ContentFragment;
import us.wmwm.lessontwo.fragments.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends FragmentActivity {

	ListFragment listFragment;
	ContentFragment contentFragment;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		if(!false) {
			
			Intent i = new Intent(this, SmallTabletActivity.class);
			startActivity(i);
			finish();
			return;
		}
		
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		listFragment = new ListFragment();
		
		
		ft.replace(R.id.ListFragment, listFragment);
		
		View content = findViewById(R.id.ContentFragment);
		if(content!=null) {
			contentFragment = new ContentFragment();
			ft.replace(R.id.ContentFragment, contentFragment);
		}
		
		ft.commit();
		
		
		listFragment.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapter, View view, int position,
					long id) {
				String number = adapter.getItemAtPosition(position).toString();
				
				if(contentFragment!=null) {
					contentFragment.setData(number);
				} else {
					System.out.println(number);
				}
			}
		});				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
