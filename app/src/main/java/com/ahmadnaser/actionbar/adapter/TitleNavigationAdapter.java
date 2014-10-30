package com.ahmadnaser.actionbar.adapter;

import com.ahmadnaser.actionbar.R;
import com.ahmadnaser.actionbar.model.SpinnerNavItem;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TitleNavigationAdapter extends BaseAdapter {

	private ImageView imgIcon;
	private TextView txtTitle;
	private ArrayList<SpinnerNavItem> spinnerNavItems;
	private Context context;

	public TitleNavigationAdapter(Context context,
			ArrayList<SpinnerNavItem> spinnerNavItem) {
		this.spinnerNavItems = spinnerNavItem;
		this.context = context;
	}

	@Override
	public int getCount() {
		return spinnerNavItems.size();
	}

	@Override
	public Object getItem(int index) {
		return spinnerNavItems.get(index);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) { 
        if (convertView == null) {
        	LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.list_item_title_navigation, null);
        }
        
        imgIcon = (ImageView) convertView.findViewById(R.id.imgIcon);
        txtTitle = (TextView) convertView.findViewById(R.id.txtTitle);
        
        imgIcon.setImageResource(spinnerNavItems.get(position).getIcon());
        imgIcon.setVisibility(View.GONE);
        txtTitle.setText(spinnerNavItems.get(position).getTitle());
        return convertView;
	}
	

	@Override
	public View getDropDownView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
        	LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.list_item_title_navigation, null);
        }
        
        imgIcon = (ImageView) convertView.findViewById(R.id.imgIcon);
        txtTitle = (TextView) convertView.findViewById(R.id.txtTitle);
        
        imgIcon.setImageResource(spinnerNavItems.get(position).getIcon());
        txtTitle.setText(spinnerNavItems.get(position).getTitle());
        return convertView;
	}

}
