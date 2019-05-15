package com.example.customphonebook;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PhoneBookAdapter extends BaseAdapter {

	private Context mContext;
	private List<PhoneBook> mListPhoneBook;
	
	public PhoneBookAdapter(Context context, List<PhoneBook> list) {
		mContext = context;
		mListPhoneBook = list;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mListPhoneBook.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return mListPhoneBook.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		PhoneBook entry = mListPhoneBook.get(arg0);
		
		if(arg1 == null) {
			LayoutInflater inflater = LayoutInflater.from(mContext);
			arg1 = inflater.inflate(R.layout.phonebook_row, null);
		}
		
		ImageView ivAvatar = (ImageView)arg1.findViewById(R.id.imgAvatar);
		ivAvatar.setImageBitmap(entry.getmAvatar());
		
		TextView tvName = (TextView)arg1.findViewById(R.id.tvName);
		tvName.setText(entry.getmName());
		
		TextView tvPhone = (TextView)arg1.findViewById(R.id.tvPhone);
		tvPhone.setText(entry.getmPhone());
		
		TextView tvEmail = (TextView)arg1.findViewById(R.id.tvEmail);
		tvEmail.setText(entry.getmEmail());
		return arg1;
	}

}
