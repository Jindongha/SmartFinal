package org.androidtown.ui.linearlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.GridView;
import android.widget.ImageView;

public class Teacher_Lock_Activity extends Activity{
	
	//시간표 객체 생성
	GridView GridSchedule;
	ScheduleAdapter adapter;
	
	//시간표 설정다이얼로그 선언
	Timeset_Dialog timeset;
	
	ImageView lockset_button;
	ImageView timetableset_button;
	ImageView locknow_button;
	ImageView unlocknow_button;
	
	

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.teacher_lock_layout);
        lockset_button = (ImageView)findViewById(R.id.lockset_button);
        timetableset_button = (ImageView)findViewById(R.id.timetableset_button);
        locknow_button = (ImageView)findViewById(R.id.locknow_button);
        unlocknow_button = (ImageView)findViewById(R.id.unlocknow_button);
        
        
        
        
        
        //gridlayout 설정
        GridSchedule = (GridView)findViewById(R.id.schedule);
        adapter = new ScheduleAdapter(this);
        
        GridSchedule.setAdapter(adapter);
        
		

        
        lockset_button.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				
				if (adapter.scheduleinfo.setlock_available == true){
					timetableset_button.setVisibility(View.VISIBLE);
					locknow_button.setVisibility(View.VISIBLE);
					unlocknow_button.setVisibility(View.VISIBLE);
					adapter.scheduleinfo.setlock_unavailable();
				}else
				{
					timetableset_button.setVisibility(View.INVISIBLE);
					locknow_button.setVisibility(View.INVISIBLE);
					unlocknow_button.setVisibility(View.INVISIBLE);
					adapter.scheduleinfo.setlock_available();
				}
			}
        	
        });
        
        
        //시간설정 다이얼로그 띄우기
        timetableset_button.setOnClickListener(new OnClickListener(){
        	Intent intent;
			@Override
			public void onClick(View v) {
				intent = new Intent(getBaseContext(),Timeset_Activity.class);
				startActivity(intent);

			}
        	
        });
        
        
        
	}

}
