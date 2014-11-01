package org.androidtown.ui.linearlayout;

import android.util.Log;

public class ScheduleInfo {
	private static int table_lock[];
	public boolean setlock_available;
	
	ScheduleInfo(){
		table_lock = new int[70];
	}
	public void table_init(){
		for(int i = 0 ; i<70 ; i++) table_lock[i] = 0;
	}
	public void setTableLock(int index , int lock){
		table_lock[index] = lock;
	}
	public int getTableLock(int index){
		return table_lock[index];
	}
	public void setlock_unavailable(){
		setlock_available = false;
	}
	public void setlock_available(){
		setlock_available = true;
	}

}
