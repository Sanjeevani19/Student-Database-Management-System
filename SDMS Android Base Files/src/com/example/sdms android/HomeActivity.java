package com.example.sdmsgroupproject;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeActivity extends Activity implements OnClickListener 
{
	private Button mStudentSearch, mShuttle, mMaps, mCatalog, mCalendar;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		mStudentSearch = (Button)findViewById(R.id.student_search_button);
		mStudentSearch.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Log.i("clicks", "You clicked Student Search");
				Intent i = new Intent(HomeActivity.this, StudentSearchActivity.class);
				startActivity(i);
			}
			
		});
		
		mShuttle = (Button)findViewById(R.id.shuttle_button);
		mShuttle.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Log.i("clicks", "You clicked Shuttle");
				Intent i = new Intent(HomeActivity.this, ShuttleActivity.class);
				startActivity(i);
			}
			
		});
		
		mMaps = (Button)findViewById(R.id.maps_button);
		mMaps.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Log.i("clicks", "You clicked Maps)");
				Intent i = new Intent(HomeActivity.this, MapsActivity.class);
				startActivity(i);
			}
			
		});
		
		mCatalog = (Button)findViewById(R.id.catalog_button);
		mCatalog.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Log.i("clicks", "You clicked Course Catalog");
				Intent i = new Intent(HomeActivity.this, CatalogActivity.class);
				startActivity(i);
			}
			
		});
		
		
		mCalendar = (Button)findViewById(R.id.calendar_button);
		mCalendar.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Log.i("clicks", "You clicked Academic Calendar");
				Intent i = new Intent(HomeActivity.this, CalendarActivity.class);
				startActivity(i);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}

}
