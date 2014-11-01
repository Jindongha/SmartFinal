package org.androidtown.ui.linearlayout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * �ڹ� �ڵ带 �̿��� ���̾ƿ��� ����� ����� �� �� �ֽ��ϴ�.
 * 
 * @author Mike
 *
 */
public class SampleLayoutCodeActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        LinearLayout mainLayout = new LinearLayout(this);
        
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
	        LinearLayout.LayoutParams.MATCH_PARENT,
	        LinearLayout.LayoutParams.WRAP_CONTENT);
        
        Button button01 = new Button(this);
        button01.setText("Button 01");
        button01.setLayoutParams(params);
        mainLayout.addView(button01);
        
        setContentView(mainLayout);
    }
 
}
