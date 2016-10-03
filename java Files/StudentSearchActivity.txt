package com.example.sdmsgroupproject;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class StudentSearchActivity extends HomeActivity {
	
	private ArrayAdapter<String> studentAdpt;
	EditText inputSearch;
	ArrayList<HashMap<String, String>> studentList;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);

		String students[] = { "John Smith", "Alan Turing", "Shadrika Green",
				"Seema Thompson", "Ashley King", "James Jhonson",
				"Della Jones", "Sam Steel", "Chris Williams", "Karen Robinson" };

		ListView studentlist = (ListView) findViewById(R.id.list);
		inputSearch = (EditText) findViewById(R.id.inputSearch);

		studentAdpt = new ArrayAdapter(this, R.layout.list_item,
				R.id.item_name, students);
		studentlist.setAdapter(studentAdpt);

		inputSearch.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence cs, int arg1, int arg2,
					int arg3) {
				// When user changed the Text
				
			 StudentSearchActivity.this.studentAdpt.getFilter().filter(cs);
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable arg0) {
				
			}
		});
		
		studentlist.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
			        int position, long id) {
			        // When clicked, show a toast with the TextView text
			        if(position == 0) {
			            //code specific to first list item    
			            Intent myIntent = new Intent(view.getContext(), JohnActivity.class);
			            startActivityForResult(myIntent, 0);
			        }

			        if(position == 1) {
			            //code specific to 2nd list item    
			            Intent myIntent = new Intent(view.getContext(), AlanActivity.class);
			            startActivityForResult(myIntent, 0);
			        }
			        
			        if(position == 2) {
			            //code specific to 2nd list item    
			            Intent myIntent = new Intent(view.getContext(), ShadrikaActivity.class);
			            startActivityForResult(myIntent, 0);
			        }
			        
			        if(position == 3) {
			            //code specific to 2nd list item    
			            Intent myIntent = new Intent(view.getContext(), SeemaActivity.class);
			            startActivityForResult(myIntent, 0);
			        }
			        
			        if(position == 4) {
			            //code specific to 2nd list item    
			            Intent myIntent = new Intent(view.getContext(), AshleyActivity.class);
			            startActivityForResult(myIntent, 0);
			        }
			        
			        if(position == 5) {
			            //code specific to 2nd list item    
			            Intent myIntent = new Intent(view.getContext(), JamesActivity.class);
			            startActivityForResult(myIntent, 0);
			        }
			        
			        if(position == 6) {
			            //code specific to 2nd list item    
			            Intent myIntent = new Intent(view.getContext(), DellaActivity.class);
			            startActivityForResult(myIntent, 0);
			        }
			        
			        if(position == 7) {
			            //code specific to 2nd list item    
			            Intent myIntent = new Intent(view.getContext(), SamActivity.class);
			            startActivityForResult(myIntent, 0);
			        }
			        
			        if(position == 8) {
			            //code specific to 2nd list item    
			            Intent myIntent = new Intent(view.getContext(), ChrisActivity.class);
			            startActivityForResult(myIntent, 0);
			        }
			        
			        if(position == 9) {
			            //code specific to 2nd list item    
			            Intent myIntent = new Intent(view.getContext(), KarenActivity.class);
			            startActivityForResult(myIntent, 0);
			        }
			       
			    }
			});

	}

}
