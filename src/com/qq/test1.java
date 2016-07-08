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
public class test1  extends Activity{
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.login1);
			 new Handler().postDelayed(new Runnable() {
				public void run() {
					Intent it = new Intent();
					Toast toast=Toast.makeText(test1.this, "¿ªÆôQQÖ®ÂÃ", Toast.LENGTH_SHORT);
					toast.show();		
					it.setClass(test1.this, test2.class);
					startActivity(it);
					finish();
				}
			}, 500);
		}
	
}
