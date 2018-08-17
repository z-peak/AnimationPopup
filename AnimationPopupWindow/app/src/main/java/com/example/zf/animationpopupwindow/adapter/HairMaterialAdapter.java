package com.example.zf.animationpopupwindow.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.zf.animationpopupwindow.R;

import java.util.List;

public class HairMaterialAdapter extends RecyclerView.Adapter<HairMaterialAdapter.MyHolder> {

    private List<String> mData;
    private Context mContext;

    public HairMaterialAdapter(@Nullable List<String> data) {
        this.mData = data;
    }

    public void setNewData(List<String> data) {
        this.mData = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(mContext).inflate(R.layout.xm_sd_hair_material_popup_item, null, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.tvHairLength.setText(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {
        private LinearLayout llItem;
        private ImageView ivHairLength;
        private TextView tvHairLength;

        public MyHolder(View view) {
            super(view);
            llItem = view.findViewById(R.id.llItem);
            ivHairLength = view.findViewById(R.id.ivHairLength);
            tvHairLength = view.findViewById(R.id.tvHairLength);
        }
    }
}
