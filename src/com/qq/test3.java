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
	
	public  String[] names = {"����ٻ","�Ž��","��ѩӨ","������","������","������","��ѧ��"};
	private String[] mess = {"��������","�ļ�������","�õ�","ͼƬ","...","����","���Ը���˵��"};
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


