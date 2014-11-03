package smartclass.student.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

/**
 * ����Ʈ�並 ����Ͽ� ���� ������ ����Ʈ�� Ŭ����
 * 
 * @author Mike
 *
 */
public class DataListView extends ListView {

	/**
	 * ������ ����� ��ü
	 */
	private IconTextListAdapter adapter;
	
	/**
	 * ������ ������ ��ü
	 */
	private OnDataSelectionListener selectionListener;
	
	public DataListView(Context context) {
		super(context);

		init();
	}

	public DataListView(Context context, AttributeSet attrs) {
		super(context, attrs);

		init();
	}
	
	/**
	 * �ʱ�ȭ
	 */
	private void init() {
		setOnItemClickListener(new OnItemClickAdapter());
	}

	/**
	 * ����� ����
	 * 
	 * @param adapter
	 */
	public void setAdapter(BaseAdapter adapter) {
		super.setAdapter(adapter);

	}

	/**
	 * ����� ��ü ����
	 * 
	 * @return
	 */
	public BaseAdapter getAdapter() {
		return (BaseAdapter)super.getAdapter();
	}
	
	/**
	 * ������ ����
	 * 
	 * @param listener
	 */
	public void setOnDataSelectionListener(OnDataSelectionListener listener) {
		this.selectionListener = listener;
	}

	/**
	 * ������ ��ü ����
	 * 
	 * @return
	 */
	public OnDataSelectionListener getOnDataSelectionListener() {
		return selectionListener;
	}
	
	class OnItemClickAdapter implements OnItemClickListener {
		
		public OnItemClickAdapter() {
			
		}

		public void onItemClick(AdapterView parent, View v, int position, long id) {
			
			if (selectionListener == null) {
				return;
			}
			
			// �̺�Ʈ ���
			selectionListener.onDataSelected(parent, v, position, id);
			
		}
		
	}
	
}