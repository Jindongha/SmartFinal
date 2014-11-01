package org.androidtown.ui.linearlayout;

import android.util.Log;

public class ScheduleInfo {
	public static int table_lock[];
	
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

}
