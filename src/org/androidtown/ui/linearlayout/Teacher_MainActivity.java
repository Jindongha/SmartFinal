package org.androidtown.ui.linearlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;



public class Teacher_MainActivity extends Activity implements OnClickListener {
	ImageView lock_button;
	ImageView student_info_button;
	ImageView QNA_button;
	ImageView account_button;
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.teacher_main_layout);
        
        
        lock_button = (ImageView)findViewById(R.id.lock_button);
        student_info_button = (ImageView)findViewById(R.id.student_button);
        QNA_button = (ImageView)findViewById(R.id.qna_button);
        account_button = (ImageView)findViewById(R.id.account_button);
        
        lock_button.setOnClickListener(this);
        student_info_button.setOnClickListener(this);
        QNA_button.setOnClickListener(this);
        account_button.setOnClickListener(this);
          
    }

	@Override
	public void onClick(View v) {
		Intent intent;
		switch(v.getId()){
		case R.id.lock_button:
		
			intent = new Intent(getBaseContext(),Teacher_Lock_Activity.class);
			startActivity(intent);
			break;
			
		case R.id.student_button:
			
			intent = new Intent(getBaseContext(),Teacher_StudentInfo_Activity.class);
			startActivity(intent);
			break;
		case R.id.qna_button:
			
			intent = new Intent(getBaseContext(),Teacher_QNA_Activity.class);
			startActivity(intent);
			break;
		case R.id.account_button:
			
			intent = new Intent(getBaseContext(),Teacher_Account_Activity.class);
			startActivity(intent);
			break;
		
		
		};
		
	}
	

}
