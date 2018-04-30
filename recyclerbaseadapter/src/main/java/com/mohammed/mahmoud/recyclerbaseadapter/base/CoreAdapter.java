package com.mohammed.mahmoud.recyclerbaseadapter.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class CoreAdapter <T> extends RecyclerView.Adapter<MyCustomViewHolder> {
    protected Context mContext;
    protected List<T> mDatas;
    public CoreAdapter(Context context, List<T> datas) {
        mContext = context;
        mDatas = datas;
    }


    @NonNull
    @Override
    public MyCustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }
}
