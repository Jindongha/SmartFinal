package smartclass.student.listview;

import android.view.View;
import android.widget.AdapterView;

/**
 * �̺�Ʈ�� ó���ϱ� ���� ���ο� �������̽� ����
 * 
 * @author Mike
 */
public interface OnDataSelectionListener {

	/**
	 * �̺�Ʈ ó�� �� ȣ��Ǵ� �޼ҵ�
	 */
	public void onDataSelected(AdapterView parent, View v, int position, long id);
	
}
