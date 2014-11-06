package org.androidtown.ui.linearlayout;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ScheduleAdapter extends BaseAdapter {

	Context mContext;
	int count = 70;	
	//한글깨짐 테스트
	String[] mWeekTitleIds = { "시간","월","화","수","목","금","토" };
	private Integer[] dayIDs = {R.drawable.lock_time,R.drawable.lock_mon,R.drawable.lock_tou,R.drawable.lock_thu,R.drawable.lock_thur,R.drawable.lock_fri,R.drawable.lock_sat};
	private Integer[] timeIDs = {R.drawable.time_1,R.drawable.time_2,R.drawable.time_3,R.drawable.time_4,R.drawable.time_5,R.drawable.time_6,R.drawable.time_7,R.drawable.time_8,R.drawable.time_9};
	ScheduleInfo scheduleinfo = new ScheduleInfo();;

	ScheduleAdapter(Context context) {
		mContext = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(final int position, View oldView, ViewGroup parent) {
		// TODO Auto-generated method stub
		final ImageView v = new ImageView(mContext);
		
		
		if (oldView == null) {
			// view size(100 / 60)
			v.setLayoutParams(new GridView.LayoutParams(100, 60));
			
		} else if (position < 7) {
			v.setLayoutParams(new GridView.LayoutParams(100, 60));
			v.setImageResource(dayIDs[position]);
			

		} else if (position % 7 == 0 && position < count) {
			v.setLayoutParams(new GridView.LayoutParams(100, 80));
			v.setImageResource(timeIDs[position/7 - 1]);

		} else if (position >= 7 && position < count) {
			
			v.setLayoutParams(new GridView.LayoutParams(100, 80));
			if (scheduleinfo.getTableLock(position) == 0) v.setImageResource(R.drawable.time_unlock);
			else if (scheduleinfo.getTableLock(position) == 1) v.setImageResource(R.drawable.time_lock);
			v.setOnClickListener(new OnClickListener(){


				@Override
				public void onClick(View v_2) {
					
					//Log.i("gridview", "initial lock = "+scheduleinfo.getTableLock(position));
					if (scheduleinfo.setlock_available == true){
					
						if (scheduleinfo.getTableLock(position) == 1){
							v.setImageResource(R.drawable.time_unlock);
							scheduleinfo.setTableLock(position, 0);
						}else if(scheduleinfo.getTableLock(position) == 0){
							
							v.setImageResource(R.drawable.time_lock);
							scheduleinfo.setTableLock(position, 1);
						}
					}
					
					//Log.i("gridview", "final lock = "+scheduleinfo.getTableLock(position));
					// TODO Auto-generated method stub
					
				}
				
			});

		}
		v.setScaleType(ImageView.ScaleType.CENTER_CROP);
		return v;
	}

}