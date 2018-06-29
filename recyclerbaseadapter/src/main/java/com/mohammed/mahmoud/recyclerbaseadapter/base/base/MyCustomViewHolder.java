package com.mohammed.mahmoud.recyclerbaseadapter.base.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public  class MyCustomViewHolder extends RecyclerView.ViewHolder {
    private SparseArray<View> mViews;
    private View mConvertView;
    private Context mContext;
    public MyCustomViewHolder (Context context, View itemView)
    {
        super(itemView);
        mContext = context;
        mConvertView = itemView;
        mViews = new SparseArray<View>();
    }
    public static MyCustomViewHolder createViewHolder(Context context, View itemView)
    {
        MyCustomViewHolder holder = new MyCustomViewHolder(context, itemView);
        return holder;
    }
    public View getConvertView()
    {
        return mConvertView;
    }


    public static MyCustomViewHolder createViewHolder(Context context, ViewGroup parent, int layoutId)
    {
        View itemView = LayoutInflater.from(context).inflate(layoutId, parent,
                false);
        MyCustomViewHolder mHolder = new MyCustomViewHolder(context, itemView);
        return mHolder;
    }
    private  <T extends View> T getView(int viewId)
    {
        View view = mViews.get(viewId);
        if (view == null)
        {
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;
    }

    public  MyCustomViewHolder setRemoteImage(String Url,int imageLayoutId){
        ImageView imageView =getView(imageLayoutId);
        Glide.with(mContext).load(Url).into(imageView);
        return this;

    }

    public MyCustomViewHolder setImageResource(int viewId, int resId) {
        ImageView view = getView(viewId);
        view.setImageResource(resId);
        return this;


    }
    public MyCustomViewHolder setImageDrawable(int viewId, Drawable drawable)
    {
        ImageView view = getView(viewId);
        view.setImageDrawable(drawable);
        return this;
    }


}
