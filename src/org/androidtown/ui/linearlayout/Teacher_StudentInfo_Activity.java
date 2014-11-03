package org.androidtown.ui.linearlayout;



import smartclass.student.listview.DataListView;
import smartclass.student.listview.IconTextItem;
import smartclass.student.listview.IconTextListAdapter;
import smartclass.student.listview.OnDataSelectionListener;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Toast;

public class Teacher_StudentInfo_Activity extends Activity {
	
	
	DataListView list;
	
	
	IconTextListAdapter adapter;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);


        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
        list = new DataListView(this);


        adapter = new IconTextListAdapter(this);


		Resources res = getResources();
		adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.time_lock), "진동하", "010-2971-7993", "잠금"));
		adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.time_lock), "조재현", "010-5009-2627", "잠금"));
		adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.time_lock), "현정민", "010-4826-2735", "잠금"));
		adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.time_unlock), "남종우", "010-2293-2984", "해제"));
		adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.time_lock), "최혁", "010-1818-1818", "잠금"));
		adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.time_lock), "이수진", "010-2671-8711", "잠금"));
		


		list.setAdapter(adapter);

		
		list.setOnDataSelectionListener(new OnDataSelectionListener() {
			public void onDataSelected(AdapterView parent, View v, int position, long id) {
				IconTextItem curItem = (IconTextItem) adapter.getItem(position);
				String[] curData = curItem.getData();

				Toast.makeText(getApplicationContext(), "Selected : " + curData[0], 2000).show();
			}
		});
		


        setContentView(list, params);		
        
	}
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


}
