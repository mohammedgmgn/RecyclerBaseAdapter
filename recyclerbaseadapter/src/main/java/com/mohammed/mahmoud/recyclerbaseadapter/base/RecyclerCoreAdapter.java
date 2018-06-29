package com.mohammed.mahmoud.recyclerbaseadapter.base;

import android.content.Context;
import android.view.LayoutInflater;

import com.mohammed.mahmoud.recyclerbaseadapter.base.base.ItemViewDelegate;
import com.mohammed.mahmoud.recyclerbaseadapter.base.base.MyCustomViewHolder;

import java.util.List;

public abstract class RecyclerCoreAdapter<T> extends MultiItemTypeAdapter<T> {
    private Context mContext;
    private List<T> mDatas;
    private LayoutInflater mInflater;
    private int mLayoutId;

    public RecyclerCoreAdapter(Context context, final int layoutId, List<T> datas) {
        super(context,datas);
        mContext = context;
        mDatas = datas;
        mLayoutId = layoutId;
        mDatas = datas;
        addItemViewDelegate(new ItemViewDelegate<T>()
        {
            @Override
            public int getItemViewLayoutId()
            {
                return layoutId;
            }

            @Override
            public boolean isForViewType( T item, int position)
            {
                return true;
            }

            @Override
            public void convert(MyCustomViewHolder holder, T t, int position)
            {
                RecyclerCoreAdapter.this.convert(holder, t, position);
            }
        });
    }


    protected abstract void convert(MyCustomViewHolder holder, T t, int position);

}
