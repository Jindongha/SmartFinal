package org.androidtown.ui.linearlayout;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;


public class Timeset_Dialog extends DialogFragment {
	Teacher_Lock_Activity teacher_lock;

	public Dialog onCreateDialog(Bundle savedInstanceState){
		AlertDialog.Builder mBuilder = new AlertDialog.Builder(getActivity());
		LayoutInflater mLayoutInflater = getActivity().getLayoutInflater();
		mBuilder.setView(mLayoutInflater.inflate(R.layout.classtime_dialog,null)).setPositiveButton("설정", new DialogInterface.OnClickListener(){
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		}).setNegativeButton("취소", new DialogInterface.OnClickListener(){
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		});
		mBuilder.setTitle("시간 설정");
		
			
		
		
		return mBuilder.create();
	}
	public void onStop(){
		super.onStop();
	}

}
