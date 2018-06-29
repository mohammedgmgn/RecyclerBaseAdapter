package com.mohammed.mahmoud.recyclerbaseadapter.base.base;


import com.mohammed.mahmoud.recyclerbaseadapter.base.MyCustomViewHolder;

/**
 * Created by Mohammed  on 29/6/2018.
 */
public interface ItemViewDelegate<T>
{

    int getItemViewLayoutId();

    boolean isForViewType(T item, int position);

    void convert(MyCustomViewHolder holder, T t, int position);

}
