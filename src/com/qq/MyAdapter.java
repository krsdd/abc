package com.qq;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qq.R;

public class MyAdapter extends BaseAdapter {
  private Context mcontext ;
  private String[] names;
  private String[] prives;
  private int[] iamges;
  private ImageButton button2;
   public MyAdapter(Context mcontext,String[] names,String[] prices,int[] iamges) {
	// TODO Auto-generated constructor stub
	    this.names = names;
	    this.prives = prices;
	    this.iamges = iamges;
	    this.mcontext = mcontext;
	   
	    		
}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return names.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View contentview, ViewGroup arg2) {
		// TODO Auto-generated method stub
		//创建一个布局映射器,listView的每一个小的item的值是可以覆盖的，但是他们的tag只需要给标记了，下次遇到可以直接使用标记就可以了，省去了从新开辟内存，节约内存，以达到内存的优化，可以
		//更加大批量的处理大数据
		LayoutInflater mInflater = LayoutInflater.from(mcontext);
	
		 ViewHolder holder = new ViewHolder();
		 //如果contentview为null，表示要开始映射布局并且放入内容等
		 if(contentview == null){
				//将某一个具体的小布局给映射到布局映射器当中去
			 contentview=  mInflater.inflate(R.layout.item, null) ;
			 holder.images = (ImageView)contentview.findViewById(R.id.img);
			 holder.names  =(TextView)contentview.findViewById(R.id.tv);
			 holder.prices =(TextView)contentview.findViewById(R.id.price);
//			 holder.webss=(ImageView)contentview.findViewById(R.id.imabut);
			 //将Holder的标记给放入到contentView当中去
			 contentview.setTag(holder);
		 }else{
			 holder =(ViewHolder)contentview.getTag();
		 }
		 holder.images.setBackgroundResource(iamges[arg0]);
		 holder.names.setText(names[arg0]);
		 holder.prices.setText(prives[arg0]);
		 button2=(ImageButton)contentview.findViewById(R.id.imabut);
		 button2.setOnClickListener(new OnClickListener() {
		public void onClick(View arg0) {
					Intent it=new Intent();
					it.setClass(mcontext, test4.class);
					mcontext.startActivity(it);
				}
			});
		return contentview;
	}
	
	class ViewHolder{
		private TextView names;
		private ImageView images;
		private TextView  prices;
	}

}
