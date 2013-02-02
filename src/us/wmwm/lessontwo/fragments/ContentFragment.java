package us.wmwm.lessontwo.fragments;

import us.wmwm.lessontwo.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ContentFragment extends Fragment {

	View root;
	TextView content;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		root = inflater.inflate(R.layout.fragment_content, null);
		content = (TextView) root.findViewById(R.id.content);
		return root;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		Bundle args = getArguments();
		
		if(args!=null) {
			String text = args.getString("text");
			content.setText(text);
		}
		
	}
	
	public static ContentFragment newInstance(String text) {
		Bundle bundle = new Bundle();
		bundle.putString("text", text);
		ContentFragment cf = new ContentFragment();
		cf.setArguments(bundle);
		return cf;
	}

	public void setData(String number) {
		// TODO Auto-generated method stub
		content.setText(number);
	}
	
}
