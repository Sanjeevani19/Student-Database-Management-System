package com.example.sdmsgroupproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class CatalogActivity extends HomeActivity {

	private Menu catalogAdpt;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
   
		initList();
		
		ListView cataloglist = (ListView) findViewById(R.id.list);
		
		
		SimpleAdapter catalogAdpt = new SimpleAdapter(this, courseList, android.R.layout.simple_list_item_1, new String[] {"course"}, new int[] {android.R.id.text1});
		cataloglist.setAdapter(catalogAdpt);
		
		registerForContextMenu(cataloglist);
	}
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {

		super.onCreateContextMenu(menu, v, menuInfo);
		AdapterContextMenuInfo aInfo = (AdapterContextMenuInfo) menuInfo;

		// We know that each row in the adapter is a Map
		HashMap map = (HashMap) catalogAdpt.getItem(aInfo.position);
		menu.setHeaderTitle("Options for " + map.get("course"));
		menu.add(1, 1, 1, "Details");
		menu.add(1, 2, 2, "Delete");

	}

	List<Map<String, String>> courseList = new ArrayList<Map<String, String>>();

	private void initList() {
		courseList.add(createCourse("course", "2250 Computer Science I"));
		courseList.add(createCourse("course", "2255 Computer Science II"));
		courseList.add(createCourse("course", "3310 Foundations of Computer Science"));
		courseList.add(createCourse("course", "4420 Intro to Database Systems"));
		courseList.add(createCourse("course", "3323 Data Structures"));
		courseList.add(createCourse("course", "3365 Intro to Comp. Org. and Arch."));
		courseList.add(createCourse("course", "3329 Analysis of Algorithms"));
		courseList.add(createCourse("course", "3332 Software Engineering I"));
		courseList.add(createCourse("course", "3360 Concepts of Obj-Oriented Prog. I"));
		courseList.add(createCourse("course", "3370 Nature of Prog. Lang."));
		courseList.add(createCourse("course", "4448 Operating Systems"));
		courseList.add(createCourse("course", "4445 Data Comm. and Networking"));
		courseList.add(createCourse("course", "3372 Formal Lang. and Thry of Comp."));
		courseList.add(createCourse("course", "2215 Applied Discrete Mathematics"));
		courseList.add(createCourse("course", "2210 Applied Statistics"));

	}

	private HashMap<String, String> createCourse(String key, String name) {
		HashMap<String, String> course = new HashMap<String, String>();
		course.put(key, name);

		return course;
	}

}
