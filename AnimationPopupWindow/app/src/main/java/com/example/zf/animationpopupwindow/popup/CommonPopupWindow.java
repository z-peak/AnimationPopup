package com.example.zf.animationpopupwindow.popup;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.PopupWindow;

import com.example.zf.animationpopupwindow.listener.OnPopupWindowDismissListener;

public abstract class CommonPopupWindow extends PopupWindow {
    protected Context context;
    protected View contentView;
    protected boolean isDismiss;
    private int height;
    private OnPopupWindowDismissListener onPopupWindowDismissListener;

    public CommonPopupWindow(Context c, View contentView, int w, int h) {
        super(contentView, w, h, true);
        context = c;
        this.height = h;
        this.contentView = contentView;
        initWindow();
        initView();
        initData();
    }

    public View getContentView() {
        return contentView;
    }

    protected abstract void initView();

    protected abstract void initData();

    protected TranslateAnimation initShowAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0f, 0f, height, 0);
        translateAnimation.setDuration(300);
        translateAnimation.setInterpolator(new OvershootInterpolator(-4));
        return translateAnimation;
    }

    protected TranslateAnimation initExitAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0f, 0f, 0, height + 100);
        translateAnimation.setDuration(300);
        translateAnimation.setInterpolator(new LinearInterpolator());
        return translateAnimation;
    }

    protected void startShowAnimation() {
        contentView.startAnimation(initShowAnimation());
    }

    protected void startExitAnimation() {
        contentView.startAnimation(initExitAnimation());
    }

    protected void initWindow() {
        setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setOutsideTouchable(true);
        setTouchable(true);
    }

    @Override
    public void dismiss() {
        if (isDismiss) return;
        isDismiss = true;
        new Handler().postDelayed(() -> onDismiss(), 300);
        if (onPopupWindowDismissListener != null) {
            onPopupWindowDismissListener.onPopupDismiss();
        }
        startExitAnimation();
    }

    public void onDismiss() {
        super.dismiss();
        isDismiss = false;
        if (onPopupWindowDismissListener != null) {
            onPopupWindowDismissListener.onDismissComplete();
        }
    }

    public void showAsDropDown(View anchor, int xoff, int yoff) {
        startShowAnimation();
        onShowAsDropDown(anchor, xoff, yoff);
//        showAsDropDown(anchor, xoff, yoff);
    }

    public void onShowAsDropDown(View anchor, int xoff, int yoff) {
        super.showAsDropDown(anchor, xoff, yoff);
    }

    public void showAtLocation(View parent, int gravity, int x, int y) {
        super.showAtLocation(parent, gravity, x, y);
    }

    public void setOnPopupWindowDismissListener(OnPopupWindowDismissListener onPopupWindowDismissListener) {
        this.onPopupWindowDismissListener = onPopupWindowDismissListener;
    }
}
