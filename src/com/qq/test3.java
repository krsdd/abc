package com.qq;
import com.example.qq.R;

import android.R.anim;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;

public class test3 extends Activity{
	private ListView list;
	private AutoCompleteTextView acTextView;
	
	public  String[] names = {"张刘倩","张金金","李雪莹","聂国章","刘晶晶","张男神","李学霸"};
	private String[] mess = {"回来带饭","文件发给我","好的","图片","...","哈哈","考试给我说答案"};
	private int [] images ={R.drawable.lq,R.drawable.jj,R.drawable.xy,
			R.drawable.sb,R.drawable.lj,R.drawable.wo,R.drawable.bq};
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.testa);
		acTextView=(AutoCompleteTextView)findViewById(R.id.aut_Text1);
		ArrayAdapter<String> adapter1=new ArrayAdapter<String>
		(this,android.R.layout.simple_list_item_1,names);
		acTextView.setAdapter(adapter1);
		list=(ListView)findViewById(R.id.list);
		MyAdapter adapter = new MyAdapter(test3.this,names,mess,images);
		list.setAdapter(adapter);
		
             
	}
}


