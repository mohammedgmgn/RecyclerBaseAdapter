package com.mohammed.mahmoud.recyclerbaseadapter.base;

import android.content.Context;

import java.util.List;

public abstract class RecyclerBaseAdapter<T> extends CoreAdapter {
    private Context context;
    private List<T> dataList;

    public RecyclerBaseAdapter(Context context, List<T> dataList) {
        super(context, dataList);
        this.context = context;
        this.dataList = dataList;
    }

    protected abstract void convertMyView(MyCustomViewHolder holder, T t, int position);

}
