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
		//����һ������ӳ����,listView��ÿһ��С��item��ֵ�ǿ��Ը��ǵģ��������ǵ�tagֻ��Ҫ������ˣ��´���������ֱ��ʹ�ñ�ǾͿ����ˣ�ʡȥ�˴��¿����ڴ棬��Լ�ڴ棬�Դﵽ�ڴ���Ż�������
		//���Ӵ������Ĵ��������
		LayoutInflater mInflater = LayoutInflater.from(mcontext);
	
		 ViewHolder holder = new ViewHolder();
		 //���contentviewΪnull����ʾҪ��ʼӳ�䲼�ֲ��ҷ������ݵ�
		 if(contentview == null){
				//��ĳһ�������С���ָ�ӳ�䵽����ӳ��������ȥ
			 contentview=  mInflater.inflate(R.layout.item, null) ;
			 holder.images = (ImageView)contentview.findViewById(R.id.img);
			 holder.names  =(TextView)contentview.findViewById(R.id.tv);
			 holder.prices =(TextView)contentview.findViewById(R.id.price);
//			 holder.webss=(ImageView)contentview.findViewById(R.id.imabut);
			 //��Holder�ı�Ǹ����뵽contentView����ȥ
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
