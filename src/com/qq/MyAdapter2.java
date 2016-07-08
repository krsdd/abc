package com.qq;

import com.example.qq.R;
import com.qq.MyAdapter.ViewHolder;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public  class MyAdapter2 extends BaseAdapter {
	private Context mContext;
	private String[] web;
	private Button button2;
	public MyAdapter2(Context mContext,String[] web) {
		this.mContext=mContext;
		this.web=web;		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	public long getItemId(int arg0) {
		return 0;
	}
	public View getView(int arg0, View contentview, ViewGroup arg2) {
		LayoutInflater mInflater = LayoutInflater.from(mContext);
		ViewHolder holder = new ViewHolder();
		if(contentview == null){
			 contentview=  mInflater.inflate(R.layout.item, null) ;
//			 holder.pric =(TextView)contentview.findViewById(R.id.price);
//			 holder.web=(ImageView)contentview.findViewById(R.id.imabut);
			 //将Holder的标记给放入到contentView当中去
			 contentview.setTag(holder);
			}else{
			 holder =(ViewHolder)contentview.getTag();
		 }
//		 holder..setText(prives[arg0]);
		return contentview;
	}
	
	class ViewHolder{
	    private TextView names;
		private ImageView images;
		private TextView  prices;
	}

	}
	


