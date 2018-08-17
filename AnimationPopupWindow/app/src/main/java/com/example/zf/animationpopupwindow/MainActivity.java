package com.example.zf.animationpopupwindow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.example.zf.animationpopupwindow.helper.PopupWindowShowHelper;
import com.example.zf.animationpopupwindow.listener.OnPopupWindowDismissListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnPopupWindowDismissListener {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroup);
    }

    public void hairstyleBookClick(View view) {
        if (PopupWindowShowHelper.isHairstyleBookPopupShow()) {
            radioGroup.clearCheck();
            return;
        }
        List<String> hairstyle = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            hairstyle.add("hairstyle - " + i);
        }
        PopupWindowShowHelper.showHairstylePopup(this, view, hairstyle, this);
    }

    public void hairLengthClick(View view) {
        if (PopupWindowShowHelper.isHairLengthPopupShow()) {
            radioGroup.clearCheck();
            return;
        }
        List<String> length = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            length.add("length - " + i);
        }
        PopupWindowShowHelper.showHairLengthPopup(this, view, length, this);
    }

    public void fringeClick(View view) {
        if (PopupWindowShowHelper.isFringePopupShow()) {
            radioGroup.clearCheck();
            return;
        }
        List<String> fringe = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            fringe.add("fringe - " + i);
        }
        PopupWindowShowHelper.showHairFringePopup(this, view, fringe, this);
    }

    public void centerClick(View view) {
        if (PopupWindowShowHelper.isCenterPopupShow()) {
            radioGroup.clearCheck();
            return;
        }
        List<String> center = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            center.add("center - " + i);
        }
        PopupWindowShowHelper.showHairCenterPopup(this, view, center, this);
    }

    public void colorClick(View view) {
        if (PopupWindowShowHelper.isColorPopupShow()) {
            radioGroup.clearCheck();
            return;
        }
        List<String> color = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            color.add("color - " + i);
        }
        PopupWindowShowHelper.showHairColorPopup(this, view, color, this);
    }

    public void textureClick(View view) {
        if (PopupWindowShowHelper.isTexturePopupShow()) {
            radioGroup.clearCheck();
            return;
        }
        List<String> texture = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            texture.add("texture - " + i);
        }
        PopupWindowShowHelper.showHairTexturePopup(this, view, texture, this);
    }

    @Override
    public void onPopupDismiss() {
        radioGroup.clearCheck();
    }

    @Override
    public void onDismissComplete() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        PopupWindowShowHelper.releasePopup();
    }
}
