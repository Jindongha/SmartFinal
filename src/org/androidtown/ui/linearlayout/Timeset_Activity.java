package org.androidtown.ui.linearlayout;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Timeset_Activity extends Activity implements OnClickListener {
	
	
	ImageView set1time_button;
	ImageView set2time_button;
	ImageView set3time_button;
	ImageView set4time_button;
	ImageView set5time_button;
	ImageView set6time_button;
	ImageView set7time_button;
	ImageView set8time_button;
	ImageView set9time_button;
	Timeset_Dialog timeset;
	public void onCreate(Bundle savedInstanceState) {
		
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.timeset_dialog);
        
        
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
        
        set1time_button.setOnClickListener(this);
        set2time_button.setOnClickListener(this);
        set3time_button.setOnClickListener(this);
        set4time_button.setOnClickListener(this);
        set5time_button.setOnClickListener(this);
        set6time_button.setOnClickListener(this);
        set7time_button.setOnClickListener(this);
        set8time_button.setOnClickListener(this);
        set9time_button.setOnClickListener(this);
        
        

        
	}

	@Override
	public void onClick(View v) {
		
		timeset = new Timeset_Dialog();
		timeset.show(getFragmentManager(), "MYTAG");    // 알림창 띄우기
		
		
	}

}
