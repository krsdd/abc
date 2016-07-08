package com.qq;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.example.qq.*;
import com.example.qq.R.id;
import com.example.qq.R.layout;
public class test2  extends Activity{
	protected void onCreate(Bundle saveInstanceState){
		super.onCreate(saveInstanceState);
		setContentView(R.layout.login);
		Button button1=(Button)findViewById(R.id.but1);
		button1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				new Handler().postDelayed(new Runnable() {
					public void run() {
						Intent it = new Intent();	
						it.setClass(test2.this, test3.class);
						startActivity(it);
						finish();	
					}
				}, 2000);
			}
		});
		
	}
}