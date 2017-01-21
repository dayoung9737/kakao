package com.hanbit.kakao.util;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanbit.kakao.R;
import com.hanbit.kakao.domain.MemberBean;

import java.util.ArrayList;

/**
 * Created by hb2004 on 2017-01-14.
 */

public class Member_Adapter extends BaseAdapter{
    ArrayList<MemberBean> list;
    LayoutInflater inflater;
    private  int[]photos={
            R.drawable.default_profile, //int binary 값으로 저장 됨
            R.drawable.donut,
            R.drawable.eclair,
            R.drawable.froyo,
            R.drawable.gingerbread,
            R.drawable.honeycomb,
            R.drawable.icecream,
            R.drawable.jellybean,
            R.drawable.kitkat,
            R.drawable.lollipop

    };

    public Member_Adapter(ArrayList<MemberBean> list, LayoutInflater inflater) {
        this.list = list;
     //   this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();

    }

    @Override
    public Object getItem(int i) {
        return list.get(i);

    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View v, ViewGroup g) {
        ViewHolder holder;
        if(v==null){

            v = inflater.inflate(R.layout.member_list,null);
            holder = new ViewHolder();
            holder.ivPhoto = (ImageView) v.findViewById(R.id.iv_photo);
            holder.tvName= (TextView) v.findViewById(R.id.tv_name);

            v.setTag(holder);
        }else{
            holder = (ViewHolder) v.getTag();

        }



        return null;
    }
    //inner class
    static class ViewHolder{
        ImageView ivPhoto;
        TextView tvName;
        TextView tvPhoto;

    }
}
