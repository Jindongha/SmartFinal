package org.androidtown.ui.linearlayout;

import android.R.color;
import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class Teacher_Lock_Activity extends Activity {
	
	
	GridView GridSchedule;
	ScheduleAdapter adapter;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.teacher_lock_layout);
        
        GridSchedule = (GridView)findViewById(R.id.schedule);
        GridSchedule.setBackgroundColor(color.black);

        adapter = new ScheduleAdapter(this);

        GridSchedule.setAdapter(adapter);
	}

}
