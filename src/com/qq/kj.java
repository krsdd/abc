package com.qq;
import com.qq.test3;


import com.example.qq.R;

import android.R.anim;
import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class kj extends Activity{
	
	private WebView web1;
	public  String[] names = {"����ٻ","�Ž��","��ѩӨ","������","������","������","��ѧ��"};

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.testa);
		
		
		web1=new WebView(this);
		web1.getSettings().setJavaScriptEnabled(true); 
		web1.loadUrl("http://user.qzone.qq.com/1652323977/infocenter?ptsig=akxgsKzovd0GY8n2XjFECCVMdNjTr6j-ZdOqKKKvLjM");
		setContentView(web1);  
 
    }  
    //���û���  
    //����Activity���onKeyDown(int keyCoder,KeyEvent event)����  
    public boolean onKeyDown(int keyCode, KeyEvent event) {  
        if ((keyCode == KeyEvent.KEYCODE_BACK) && web1.canGoBack()) {  
            web1.goBack(); //goBack()��ʾ����WebView����һҳ��  
            return true;  
        }  
        return false;  
	}

}
