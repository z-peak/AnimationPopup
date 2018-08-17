package com.example.zf.animationpopupwindow.popup;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.zf.animationpopupwindow.R;
import com.example.zf.animationpopupwindow.adapter.HairMaterialAdapter;

import java.util.ArrayList;
import java.util.List;

public class HairLengthPopupWindow extends CommonPopupWindow {
    private RecyclerView recyclerView;
    private HairMaterialAdapter hairMaterialAdapter;
    private LinearLayoutManager mLayoutManager;
    private int width;
    private List<String> data;

    public HairLengthPopupWindow(Context c, View contentView, int w, int h) {
        super(c, contentView, w, h);
        this.width = w;

    }

    @Override
    protected void initView() {
        recyclerView = contentView.findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
//        recyclerView.addItemDecoration(new GallerySceneDesignItemDecoration(context));
    }

    @Override
    protected void initData() {
        hairMaterialAdapter = new HairMaterialAdapter(data);
        recyclerView.setAdapter(hairMaterialAdapter);
    }

    public void setData(List<String> data) {
        this.data = data;
        hairMaterialAdapter.setNewData(data);
    }
}
