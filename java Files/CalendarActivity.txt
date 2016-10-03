package com.example.sdmsgroupproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;


public class CalendarActivity extends HomeActivity {

	private Menu simpleAdpt;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calendar);
		
		initList();
		
		ListView acList = (ListView) findViewById(R.id.list);
		SimpleAdapter simpleAdpt = new SimpleAdapter(this, calendarList, android.R.layout.simple_list_item_1, new String[] {"event"}, new int[] {android.R.id.text1});
		
		acList.setAdapter(simpleAdpt);
		
		acList
		.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			public void onItemClick(AdapterView<?> parentAdapter,
					View view, int position, long id) {

				// We know the View is a TextView so we can cast it
				TextView clickedView = (TextView) view;
				Toast.makeText(
						CalendarActivity.this,
						"Item with id [" + id + "] - Position ["
								+ position + "] - event ["
								+ clickedView.getText() + "]",
						Toast.LENGTH_SHORT).show();

			}
		});

registerForContextMenu(acList);
	
	}

	List<Map<String, String>> calendarList = new ArrayList<Map<String, String>>();
	
	private void initList() {
		calendarList.add(createEvent("event", "Jan. 1st -- New Year's Day"));
		calendarList.add(createEvent("event", "Jan. 7th -- First Day of Classes for Troy Campus"));
		calendarList.add(createEvent("event", "Jan. 7th -- First Payment Due"));
		calendarList.add(createEvent("event", "Jan 19th -- Martin Luther King, Jr. Day"));
		calendarList.add(createEvent("event", "Feb. 5th -- Second Payment Due"));
		calendarList.add(createEvent("event", "Mar. 5th -- Third Payment Due"));
		calendarList.add(createEvent("event", "Mar. 9th - 15th -- Spring Break"));
		calendarList.add(createEvent("event", "May 5th -- Dead Day"));
		calendarList.add(createEvent("event", "May 6th -- Exams Begin"));
		calendarList.add(createEvent("event", "May 8th -- Commencement for Troy Campus"));
		calendarList.add(createEvent("event", "May 18th - 25th -- Summer Break"));

		}
		
	private HashMap<String, String> createEvent(String key, String name) {
		HashMap<String, String> event = new HashMap<String, String>();
		event.put(key, name);
		
		return event;
	}
	
	
}