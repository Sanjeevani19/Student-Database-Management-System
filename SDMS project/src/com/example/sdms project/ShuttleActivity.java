package com.example.sdmsgroupproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ShuttleActivity extends HomeActivity implements OnClickListener {

	private ArrayAdapter<String> shuttleAdpt;
	EditText inputSearch;
	ArrayList<HashMap<String, String>> shuttleList;

	
	@Override
	public void onCreate(Bundle savedInstanceState) {

	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_list);
	    
	    
	    String stops[] = { "11:00am -- Pace Hall", "11:30am -- Hamil Hall", "12:00pm -- University Avenue",
				"12:30pm -- University Corners", "1:00pm -- Elm Street", "1:30pm -- Brundige Street",
				"2:00pm -- Admins Block", "2:30pm -- Eldridge Hall" };
	    
	    // We get the ListView component from the layout
	    ListView lv = (ListView) findViewById(R.id.list);
	    
	    //Search Function//
			inputSearch = (EditText) findViewById(R.id.inputSearch);

			shuttleAdpt = new ArrayAdapter(this, R.layout.list_item, R.id.item_name, stops);
			lv.setAdapter(shuttleAdpt);

			inputSearch.addTextChangedListener(new TextWatcher() {

				@Override
				public void onTextChanged(CharSequence cs, int arg1, int arg2,
						int arg3) {
					// When user changed the Text
					ShuttleActivity.this.shuttleAdpt.getFilter().filter(cs);
				}

				@Override
				public void beforeTextChanged(CharSequence arg0, int arg1,
						int arg2, int arg3) {
					// TODO Auto-generated method stub

				}

				@Override
				public void afterTextChanged(Editable arg0) {
					// TODO Auto-generated method stub
				}
			});
	    
	    //End Search Function

	}
	
}