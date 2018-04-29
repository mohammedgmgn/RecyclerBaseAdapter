package com.mohammed.mahmoud.recyclerbaseadapter.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

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

    public static MyCustomViewHolder createViewHolder(Context context,
                                              ViewGroup parent, int layoutId)
    {
        View itemView = LayoutInflater.from(context).inflate(layoutId, parent,
                false);
        MyCustomViewHolder mHolder = new MyCustomViewHolder(context, itemView);
        return mHolder;
    }

}
