package com.example.sdmsgroupproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomeActivity extends Activity implements OnClickListener {
	
	private Button mStudentSearch, mShuttle, mMaps, mCatalog, mCalendar, mAlertButton;
	private ImageButton mBB_button, memailButton, mwebexpressButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		// Megan
		mMaps = (Button) findViewById(R.id.maps_button);
		mMaps.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent maps = new Intent(HomeActivity.this, MapsActivity.class);
				startActivity(maps);
			}
		});

		mCatalog = (Button) findViewById(R.id.catalog_button);
		mCatalog.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent catalog = new Intent(HomeActivity.this,
						CatalogActivity.class);
				startActivity(catalog);

			}
		});

		mBB_button = (ImageButton) findViewById(R.id.bb_button);
		mBB_button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				sendToBlackboard();
			}

			protected void sendToBlackboard() {
				//String bb_url = "http://troy.blackboard.com/";
				//Intent i = new Intent(Intent.ACTION_VIEW);
				//startActivity(i);
				
				 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://troy.blackboard.com"));
				 startActivity(browserIntent);
			}

		});
		

		memailButton = (ImageButton) findViewById(R.id.email_button);

		memailButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				sendToEmail();
			}

			protected void sendToEmail() {
				//String email_url = "https://mail.troy.edu/wm/eml/login.html";
				//Intent i = new Intent(Intent.ACTION_VIEW);
				//startActivity(i);
				
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.troy.edu/wm/eml/login.html"));
				 startActivity(browserIntent);
			}

		});

		mwebexpressButton = (ImageButton) findViewById(R.id.webexpr_button);

		mwebexpressButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				sendToWebExpress();
			}

			protected void sendToWebExpress() {
				//String webexpress_url = "https://trojanweb.troy.edu/WebAdvisor/WebAdvisor?TYPE=M&PID=CORE-WBMAIN&TOKENIDX=3756752643";
				//Intent i = new Intent(Intent.ACTION_VIEW);
				//startActivity(i);
				
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://trojanweb.troy.edu/WebAdvisor/WebAdvisor?TYPE=M&PID=CORE-WBMAIN&TOKENIDX=375675264"));
				 startActivity(browserIntent);
			}

		});

		// Sanjeevani
		mStudentSearch = (Button) findViewById(R.id.student_search_button);
		mStudentSearch.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent stuSearch = new Intent(HomeActivity.this,
						StudentSearchActivity.class);
				startActivity(stuSearch);

			}
		});

		// Srivani
		mCalendar = (Button) findViewById(R.id.calendar_button);
		mCalendar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent calendar = new Intent(HomeActivity.this,
						CalendarActivity.class);
				startActivity(calendar);

			}
		});

		// Divya
		mShuttle = (Button) findViewById(R.id.shuttle_button);
		mShuttle.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent shuttle = new Intent(HomeActivity.this,
						ShuttleActivity.class);
				startActivity(shuttle);

			}
		});

		mAlertButton = (Button) findViewById(R.id.alert_button);

		mAlertButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				openAlert(v);
			}

			// This alert button will serve the purpose of searching
			// all of the data in the entire app and taking the user to the page
			// if it exists or telling the user that the page does not exist.
		});

	}

	private void openAlert(View view) {
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				HomeActivity.this);

		alertDialogBuilder.setTitle(this.getTitle() + "decision");
		alertDialogBuilder.setMessage("Record Not Found");
		// set positive button:Yes message
		alertDialogBuilder.setPositiveButton("Yes",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						// go to a new activity of the app
						Intent positiveActivity = new Intent(
								getApplicationContext(), ShuttleActivity.class);
						startActivity(positiveActivity);
					}
				});
		// set negative button: No message
		alertDialogBuilder.setPositiveButton("Stay on page",
				new android.content.DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						// cancel the alert box and put a Toast to the user
						dialog.cancel();
						Toast.makeText(getApplicationContext(),
								"No action taken", Toast.LENGTH_LONG).show();

					}
				});
		// set neutral button: Exit the app message
		alertDialogBuilder.setNeutralButton("Exit the app",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						// exit the app and go to the HOME
						HomeActivity.this.finish();

					}
				});

		AlertDialog alertDialog = alertDialogBuilder.create();
		// show alert
		alertDialog.show();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
	}

}
