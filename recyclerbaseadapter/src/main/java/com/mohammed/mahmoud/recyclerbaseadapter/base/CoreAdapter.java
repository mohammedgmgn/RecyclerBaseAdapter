package com.mohammed.mahmoud.recyclerbaseadapter.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import com.mohammed.mahmoud.recyclerbaseadapter.base.base.ItemViewDelegate;
import com.mohammed.mahmoud.recyclerbaseadapter.base.base.MyCustomViewHolder;

import java.util.List;

public abstract class CoreAdapter <T> extends MultiItemTypeAdapter<T> {
    private Context mContext;
    private List<T> mDatas;
    private LayoutInflater mInflater;
    private int mLayoutId;

    public CoreAdapter(Context context,final int layoutId, List<T> datas) {
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
                CoreAdapter.this.convert(holder, t, position);
            }
        });
    }


    protected abstract void convert(RecyclerView.ViewHolder holder, T t, int position);

}
