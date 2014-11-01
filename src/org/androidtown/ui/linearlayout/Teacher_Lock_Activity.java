package org.androidtown.ui.linearlayout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class Teacher_Lock_Activity extends Activity {
	
	//시간표 객체 생성
	GridView GridSchedule;
	ScheduleAdapter adapter;
	
	//시간표 설정다이얼로그 선언
	Timeset_Dialog timeset;
	
	ImageView lockset_button;
	ImageView timetableset_button;
	ImageView locknow_button;
	ImageView unlocknow_button;
	
	
	ImageView set1time_button;
	ImageView set2time_button;
	ImageView set3time_button;
	ImageView set4time_button;
	ImageView set5time_button;
	ImageView set6time_button;
	ImageView set7time_button;
	ImageView set8time_button;
	ImageView set9time_button;
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.teacher_lock_layout);
        lockset_button = (ImageView)findViewById(R.id.lockset_button);
        timetableset_button = (ImageView)findViewById(R.id.timetableset_button);
        locknow_button = (ImageView)findViewById(R.id.locknow_button);
        unlocknow_button = (ImageView)findViewById(R.id.unlocknow_button);
        
        //다이얼로그 이미지
        set1time_button = (ImageView)findViewById(R.id.one_set_button);
        set2time_button = (ImageView)findViewById(R.id.two_set_button);
        set3time_button = (ImageView)findViewById(R.id.three_set_button);
        set4time_button = (ImageView)findViewById(R.id.four_set_button);
        set5time_button = (ImageView)findViewById(R.id.five_set_button);
        set6time_button = (ImageView)findViewById(R.id.six_set_button);
        set7time_button = (ImageView)findViewById(R.id.seven_set_button);
        set8time_button = (ImageView)findViewById(R.id.eight_set_button);
        set9time_button = (ImageView)findViewById(R.id.nine_set_button);
        
        
        
        //gridlayout 설정
        GridSchedule = (GridView)findViewById(R.id.schedule);
        adapter = new ScheduleAdapter(this);
        
        GridSchedule.setAdapter(adapter);
        
		

        
        lockset_button.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				
				Log.i("gridview", "lockset = "+adapter.scheduleinfo.setlock_available);
				if (adapter.scheduleinfo.setlock_available == true){
					timetableset_button.setVisibility(View.VISIBLE);
					locknow_button.setVisibility(View.VISIBLE);
					unlocknow_button.setVisibility(View.VISIBLE);
					adapter.scheduleinfo.setlock_unavailable();
					Log.i("gridview", "lockset changed = "+adapter.scheduleinfo.setlock_available);
				}else
				{
					timetableset_button.setVisibility(View.INVISIBLE);
					locknow_button.setVisibility(View.INVISIBLE);
					unlocknow_button.setVisibility(View.INVISIBLE);
					adapter.scheduleinfo.setlock_available();
					Log.i("gridview", "lockset changed = "+adapter.scheduleinfo.setlock_available);
				}
			}
        	
        });
        timetableset_button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {

				timeset = new Timeset_Dialog();
				timeset.show(getFragmentManager(),"MYTAG");    // 알림창 띄우기
				
			}
        	
        });
	}

}
