package us.wmwm.lessontwo.fragments;

import android.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListFragment extends Fragment {

	ListView list;
	
	OnItemClickListener onItemClickListener;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		list = new ListView(inflater.getContext());
		return list;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		list.setAdapter(new BaseAdapter() {

			@Override
			public int getCount() {
				return 100;
			}

			@Override
			public String getItem(int position) {
				return String.valueOf(position);
			}

			@Override
			public long getItemId(int position) {
				return 0;
			}

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {				
				if(convertView==null) {
					convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_list_item_1, null);
					ViewHolder h = new ViewHolder();
					h.text = (TextView) convertView.findViewById(android.R.id.text1);
					convertView.setTag(h);
				}				
				ViewHolder h = (ViewHolder) convertView.getTag();
				h.text.setText(getItem(position));
				return convertView;
			}						
			
		});
		
		list.setOnItemClickListener(onItemClickListener);
		
	}
	
	public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
		this.onItemClickListener = onItemClickListener;
	}
	
	public static class ViewHolder {
		
		public TextView text;
		
	}
	
}
