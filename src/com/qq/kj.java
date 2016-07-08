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
	public  String[] names = {"张刘倩","张金金","李雪莹","聂国章","刘晶晶","张男神","李学霸"};

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.testa);
		
		
		web1=new WebView(this);
		web1.getSettings().setJavaScriptEnabled(true); 
		web1.loadUrl("http://user.qzone.qq.com/1652323977/infocenter?ptsig=akxgsKzovd0GY8n2XjFECCVMdNjTr6j-ZdOqKKKvLjM");
		setContentView(web1);  
 
    }  
    //设置回退  
    //覆盖Activity类的onKeyDown(int keyCoder,KeyEvent event)方法  
    public boolean onKeyDown(int keyCode, KeyEvent event) {  
        if ((keyCode == KeyEvent.KEYCODE_BACK) && web1.canGoBack()) {  
            web1.goBack(); //goBack()表示返回WebView的上一页面  
            return true;  
        }  
        return false;  
	}

}
