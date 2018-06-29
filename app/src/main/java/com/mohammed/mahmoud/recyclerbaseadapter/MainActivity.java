package com.mohammed.mahmoud.recyclerbaseadapter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mohammed.mahmoud.recyclerbaseadapter.base.RecyclerCoreAdapter;
import com.mohammed.mahmoud.recyclerbaseadapter.base.base.MyCustomViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Model> mDatas = new ArrayList<>();
    private RecyclerCoreAdapter<Model> mAdapter;
    private List<String> data = new ArrayList<>();
    private RecyclerCoreAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDatas();
        mRecyclerView = findViewById(R.id.id_recyclerview);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        mAdapter = new RecyclerCoreAdapter<Model>(this, R.layout.item_list, mDatas) {
            @SuppressLint("NewApi")
            @Override
            protected void convert(MyCustomViewHolder holder, Model model, int position) {
                holder.setText(R.id.item_name, mDatas.get(position).getProductName());
                holder.setImageDrawable(R.id.product_image_id,getDrawable(model.getImageId()));
            }
        };
        mRecyclerView.setAdapter(mAdapter);
    }

    private void initDatas() {
        for (int i = 0; i < 10; i++) {
            data.add(i + "");
            Model model = new Model();
            model.setPrice("50$");
            model.setProductName("Product Name");
            model.setImageId(R.drawable.ic_launcher_background);
            switch (i) {
                case 0:
                    model.setImageUrl("https://static.pexels.com/photos/211048/pexels-photo-211048-medium.jpeg");
                    break;
                case 1:
                    model.setImageUrl("https://static.pexels.com/photos/111147/pexels-photo-111147-medium.jpeg");
                    break;
                case 2:
                    model.setImageUrl("https://static.pexels.com/photos/168575/pexels-photo-168575-medium.jpeg");
                    break;
                case 3:
                    model.setImageUrl("https://static.pexels.com/photos/2713/wall-home-deer-medium.jpg");
                    break;

                case 4:
                    model.setImageUrl("https://static.pexels.com/photos/168575/pexels-photo-168575-medium.jpeg");
                    break;

            }
            mDatas.add(model);

        }
    }
}
