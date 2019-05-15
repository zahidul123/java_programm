package com.example.customphonebook;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView lvPhone;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lvPhone = (ListView)findViewById(R.id.listPhone);
		
		List<PhoneBook> listPhoneBook = new ArrayList<PhoneBook>();
		listPhoneBook.add(new PhoneBook(BitmapFactory.decodeResource(getResources(), R.drawable.avatar_1), "Contact 1", "01987-254-254", "av1@gmail.com"));
		listPhoneBook.add(new PhoneBook(BitmapFactory.decodeResource(getResources(), R.drawable.avatar_2), "Contact 2", "01877-245-123", "av2@gmail.com"));
		listPhoneBook.add(new PhoneBook(BitmapFactory.decodeResource(getResources(), R.drawable.avatar_3), "Contact 3", "01784-254-124", "av3@gmail.com"));
		
		PhoneBookAdapter adapter = new PhoneBookAdapter(this, listPhoneBook);
		lvPhone.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
