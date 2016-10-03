package com.example.sdmsgroupproject;

import android.os.Bundle;
import android.widget.ImageView;

public class MapsActivity extends HomeActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_maps);
		ImageView img = (ImageView) findViewById(R.id.campus_parking_map);
		img.setBackgroundResource(R.drawable.parking_map);

	}
}
