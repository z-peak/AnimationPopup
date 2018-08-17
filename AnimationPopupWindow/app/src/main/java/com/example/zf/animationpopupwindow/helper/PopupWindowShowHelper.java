package com.example.zf.animationpopupwindow.helper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.example.zf.animationpopupwindow.R;
import com.example.zf.animationpopupwindow.listener.OnPopupWindowDismissListener;
import com.example.zf.animationpopupwindow.popup.HairLengthPopupWindow;
import com.example.zf.animationpopupwindow.utils.PixelUtils;

import java.util.List;

public class PopupWindowShowHelper {
    private static HairLengthPopupWindow hairstyleBookPopupWindow;
    private static HairLengthPopupWindow hairLengthPopupWindow;
    private static HairLengthPopupWindow fringePopupWindow;
    private static HairLengthPopupWindow centerPopupWindow;
    private static HairLengthPopupWindow colorPopupWindow;
    private static HairLengthPopupWindow texturePopupWindow;

    public static void showHairstylePopup(Context context, View view, List<String> length, @NonNull OnPopupWindowDismissListener onDismissListener) {
        if (hairstyleBookPopupWindow == null) {
            View contentView = LayoutInflater.from(context).inflate(R.layout.xm_sd_hair_length_popup, null, false);
            hairstyleBookPopupWindow = new HairLengthPopupWindow(context, contentView, LinearLayout.LayoutParams.MATCH_PARENT, PixelUtils.dip2px(context, 100));
        }
        hairstyleBookPopupWindow.setFocusable(false);
        hairstyleBookPopupWindow.setData(length);
        hairstyleBookPopupWindow.setOnPopupWindowDismissListener(onDismissListener);
        hairstyleBookPopupWindow.showAsDropDown(view, 0, 0);
    }

    public static void showHairLengthPopup(Context context, View view, List<String> length, @NonNull OnPopupWindowDismissListener onDismissListener) {
        if (hairLengthPopupWindow == null) {
            View contentView = LayoutInflater.from(context).inflate(R.layout.xm_sd_hair_length_popup, null, false);
            hairLengthPopupWindow = new HairLengthPopupWindow(context, contentView, LinearLayout.LayoutParams.MATCH_PARENT, PixelUtils.dip2px(context, 100));
        }
        hairLengthPopupWindow.setFocusable(false);
        hairLengthPopupWindow.setData(length);
        hairLengthPopupWindow.setOnPopupWindowDismissListener(onDismissListener);
        hairLengthPopupWindow.showAsDropDown(view, 0, 0);
    }

    public static void showHairFringePopup(Context context, View view, List<String> length, @NonNull OnPopupWindowDismissListener onDismissListener) {
        if (fringePopupWindow == null) {
            View contentView = LayoutInflater.from(context).inflate(R.layout.xm_sd_hair_length_popup, null, false);
            fringePopupWindow = new HairLengthPopupWindow(context, contentView, LinearLayout.LayoutParams.MATCH_PARENT, PixelUtils.dip2px(context, 100));
        }
        fringePopupWindow.setFocusable(false);
        fringePopupWindow.setData(length);
        fringePopupWindow.setOnPopupWindowDismissListener(onDismissListener);
        fringePopupWindow.showAsDropDown(view, 0, 0);
    }

    public static void showHairCenterPopup(Context context, View view, List<String> length, @NonNull OnPopupWindowDismissListener onDismissListener) {
        if (centerPopupWindow == null) {
            View contentView = LayoutInflater.from(context).inflate(R.layout.xm_sd_hair_length_popup, null, false);
            centerPopupWindow = new HairLengthPopupWindow(context, contentView, LinearLayout.LayoutParams.MATCH_PARENT, PixelUtils.dip2px(context, 100));
        }
        centerPopupWindow.setFocusable(false);
        centerPopupWindow.setData(length);
        centerPopupWindow.setOnPopupWindowDismissListener(onDismissListener);
        centerPopupWindow.showAsDropDown(view, 0, 0);
    }

    public static void showHairColorPopup(Context context, View view, List<String> length, @NonNull OnPopupWindowDismissListener onDismissListener) {
        if (colorPopupWindow == null) {
            View contentView = LayoutInflater.from(context).inflate(R.layout.xm_sd_hair_length_popup, null, false);
            colorPopupWindow = new HairLengthPopupWindow(context, contentView, LinearLayout.LayoutParams.MATCH_PARENT, PixelUtils.dip2px(context, 100));
        }
        colorPopupWindow.setFocusable(false);
        colorPopupWindow.setData(length);
        colorPopupWindow.setOnPopupWindowDismissListener(onDismissListener);
        colorPopupWindow.showAsDropDown(view, 0, 0);
    }

    public static void showHairTexturePopup(Context context, View view, List<String> length, @NonNull OnPopupWindowDismissListener onDismissListener) {
        if (texturePopupWindow == null) {
            View contentView = LayoutInflater.from(context).inflate(R.layout.xm_sd_hair_length_popup, null, false);
            texturePopupWindow = new HairLengthPopupWindow(context, contentView, LinearLayout.LayoutParams.MATCH_PARENT, PixelUtils.dip2px(context, 100));
        }
        texturePopupWindow.setFocusable(false);
        texturePopupWindow.setData(length);
        texturePopupWindow.setOnPopupWindowDismissListener(onDismissListener);
        texturePopupWindow.showAsDropDown(view, 0, 0);
    }

    public static boolean isHairstyleBookPopupShow() {
        return hairstyleBookPopupWindow != null && hairstyleBookPopupWindow.isShowing();
    }

    public static boolean isHairLengthPopupShow() {
        return hairLengthPopupWindow != null && hairLengthPopupWindow.isShowing();
    }

    public static boolean isFringePopupShow() {
        return fringePopupWindow != null && fringePopupWindow.isShowing();
    }

    public static boolean isCenterPopupShow() {
        return centerPopupWindow != null && centerPopupWindow.isShowing();
    }

    public static boolean isColorPopupShow() {
        return colorPopupWindow != null && colorPopupWindow.isShowing();
    }

    public static boolean isTexturePopupShow() {
        return texturePopupWindow != null && texturePopupWindow.isShowing();
    }

    public static void cancelPopup() {
        if (hairstyleBookPopupWindow != null) hairstyleBookPopupWindow.onDismiss();
        if (hairLengthPopupWindow != null) hairLengthPopupWindow.onDismiss();
        if (fringePopupWindow != null) fringePopupWindow.onDismiss();
        if (centerPopupWindow != null) centerPopupWindow.onDismiss();
        if (colorPopupWindow != null) colorPopupWindow.onDismiss();
        if (texturePopupWindow != null) texturePopupWindow.onDismiss();
    }

    public static void releasePopup() {
        cancelPopup();
        hairstyleBookPopupWindow = null;
        hairLengthPopupWindow = null;
        fringePopupWindow = null;
        centerPopupWindow = null;
        colorPopupWindow = null;
        texturePopupWindow = null;
    }
}
