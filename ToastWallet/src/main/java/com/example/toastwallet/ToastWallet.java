/** Created By Harshad Dabhade 5-jan-2021*/

package com.example.toastwallet;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ToastWallet {

    // initializing variables
    private static View view, CustomToastView;
    private static LayoutInflater layoutInflater;
    private static Toast toast;


    // for default short toast
    public static void defaultToastShort(Context context, String string){
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
    }
    // for default long toast
    public static void defaultToastLong(Context context, String string){
        Toast.makeText(context, string, Toast.LENGTH_LONG).show();
    }

//    // for default short toast
//    public static void defaultSquareToastShort(Context context, String string){
//        Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
//    }
//    // for default long toast
//    public static void defaultSquareToastLong(Context context, String string){
//        Toast.makeText(context, string, Toast.LENGTH_LONG).show();
//    }

    /** For SUCCESS Round Toast */
    public static void successRoundToast(Context context, String string){
        CustomToastView = inflateRoundLayout(context);
        setBackgroundLayout(R.drawable.round_shape_success);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_check);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    /** For SUCCESS Toast square*/
    public static void successSquareToast(Context context, String string){
        CustomToastView = inflateSquareLayout(context);
        setBackgroundSquareLayout(R.drawable.square_shape_success);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_done);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }


    /** For SUCCESS Round Toast with time duration in int*/
    public static void successRoundToast(Context context, String string, int duration){
        CustomToastView = inflateRoundLayout(context);
        setBackgroundLayout(R.drawable.round_shape_success);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_check);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        //toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
        waitingSec(duration);
    }

    /** For SUCCESS Square Toast with time duration in int*/
    public static void successSquareToast(Context context, String string, int duration){
        CustomToastView = inflateSquareLayout(context);
        setBackgroundSquareLayout(R.drawable.square_shape_success);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_done);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        //toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
        waitingSec(duration);
    }

    /** For INFO Round Toast */
    public static void infoRoundToast(Context context, String string){
        CustomToastView = inflateRoundLayout(context);
        setBackgroundLayout(R.drawable.round_shape_info);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_info);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    /** For INFO Square Toast */
    public static void infoSquareToast(Context context, String string){
        CustomToastView = inflateSquareLayout(context);
        setBackgroundSquareLayout(R.drawable.square_shape_info);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_info);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    /** For INFO Round Toast with time duration in int*/
    public static void infoRoundToast(Context context, String string, int duration){
        CustomToastView = inflateRoundLayout(context);
        setBackgroundLayout(R.drawable.round_shape_info);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_info);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.show();
        waitingSec(duration);
    }

    /** For INFO Square Toast with time duration in int*/
    public static void infoSquareToast(Context context, String string, int duration){
        CustomToastView = inflateSquareLayout(context);
        setBackgroundSquareLayout(R.drawable.square_shape_info);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_info);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.show();
        waitingSec(duration);
    }

    /** For WARNING Round Toast */
    public static void warningRoundToast(Context context, String string){
        CustomToastView = inflateRoundLayout(context);
        setBackgroundLayout(R.drawable.round_shape_warning);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_warning);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    /** For WARNING Square Toast */
    public static void warningSquareToast(Context context, String string){
        CustomToastView = inflateSquareLayout(context);
        setBackgroundSquareLayout(R.drawable.square_shape_warning);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_warning);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    /** For WARNING Round Toast with time duration*/
    public static void warningRoundToast(Context context, String string, int duration){
        CustomToastView = inflateRoundLayout(context);
        setBackgroundLayout(R.drawable.round_shape_warning);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_warning);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.show();
        waitingSec(duration);
    }

    /** For WARNING square Toast with time duration*/
    public static void warningSquareToast(Context context, String string, int duration){
        CustomToastView = inflateSquareLayout(context);
        setBackgroundSquareLayout(R.drawable.square_shape_warning);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_warning);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.show();
        waitingSec(duration);
    }

    /** For ERROR Round Toast */
    public static void errorRoundToast(Context context, String string){
        CustomToastView = inflateRoundLayout(context);
        setBackgroundLayout(R.drawable.round_shape_error);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_cancle);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    /** For ERROR Square Toast */
    public static void errorSquareToast(Context context, String string){
        CustomToastView = inflateSquareLayout(context);
        setBackgroundSquareLayout(R.drawable.square_shape_error);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_close);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    /** For ERROR Round Toast with time duration*/
    public static void errorRoundToast(Context context, String string, int duration){
        CustomToastView = inflateRoundLayout(context);
        setBackgroundLayout(R.drawable.round_shape_error);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_cancle);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.show();
        waitingSec(duration);
    }

    /** For ERROR Square Toast with time duration*/
    public static void errorSquareToast(Context context, String string, int duration){
        CustomToastView = inflateSquareLayout(context);
        setBackgroundSquareLayout(R.drawable.square_shape_error);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_close);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.show();
        waitingSec(duration);
    }



    /** Custom Toast For USER defined Toast*/

    /** without Icon >> dynamic text color and background color */
    public static void customRoundToast(Context context, String string, int textColor, int backgroundColor, int duration){
        CustomToastView = inflateRoundLayout(context);
        setBackgroundLayout(backgroundColor);
        setToastText(string, textColor);
        ImageView imageView = setToastIcon(R.drawable.ic_check);
        imageView.setVisibility(View.GONE); // FOR ONLY TEXT
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.show();
        waitingSec(duration);
    }

//    /** without Icon >> dynamic text color and background color */
//    public static void customSquareToast(Context context, String string, int textColor, int backgroundColor, int duration){
//        CustomToastView = inflateSquareLayout(context);
//        setBackgroundSquareLayoutCustom(R.drawable.square_shape_only, backgroundColor);
//        setToastText(string, textColor);
//        ImageView imageView = setToastIcon(R.drawable.ic_done);
//        imageView.setVisibility(View.GONE); // FOR ONLY TEXT
//        toast = new Toast(context);
//        toast.setView(CustomToastView);
//        toast.show();
//        waitingSec(duration);
//    }


    /** Only Icon >> in pre-defined background gray and txt Color BLACK */
    public static void customRoundToast(Context context, String string, int icon, int duration){
        CustomToastView = inflateRoundLayout(context);
        setBackgroundLayout(R.drawable.round_shape);
        setToastText(string, Color.BLACK);
        setToastIcon(icon);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.show();
        waitingSec(duration);
    }


    /** Only Icon >> in pre-defined background gray and txt Color BLACK */
    public static void customSquareToast(Context context, String string, int icon, int duration){
        CustomToastView = inflateSquareLayout(context);
        setBackgroundSquareLayout(R.drawable.square_shape);
        setToastText(string, Color.BLACK);
        setToastIcon(icon);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.show();
        waitingSec(duration);
    }

    /** text, icon, txtColor, bgColor, duration >> all */
    public static void customRoundToast(Context context, String string, int icon, int textColor, int backgroundColor, int duration){
        CustomToastView = inflateRoundLayout(context);
        setBackgroundLayout(backgroundColor);
        setToastText(string, textColor);
        setToastIcon(icon);
        toast = new Toast(context);
        toast.setView(CustomToastView);
        toast.show();
        waitingSec(duration);
    }

//    /** text, icon, txtColor, bgColor, duration >> all */
//    public static void customSquareToast(Context context, String string, int icon, int textColor, int backgroundColor, int duration){
//        CustomToastView = inflateSquareLayout(context);
//        setBackgroundSquareLayout(backgroundColor);
//        setToastText(string, textColor);
//        setToastIcon(icon);
//        toast = new Toast(context);
//        toast.setView(CustomToastView);
//        toast.show();
//        waitingSec(duration);
//    }

    /** Ending custom */


    //To inflate square layout
    private static View inflateSquareLayout(Context context) {
        layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.toast_layout_square, null);
        return view;
    }

    // To inflate separate layout
    private static View inflateRoundLayout(Context context) {
        layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.toast_layout, null);
        return view;
    }
    private static void setBackgroundLayout(int resId){
        LinearLayout layout = view.findViewById(R.id.toastLay);
        layout.setBackgroundResource(resId);
    }

    private static void setBackgroundSquareLayout(int resId){
        LinearLayout layout = view.findViewById(R.id.square_toast_layout);
        layout.setBackgroundResource(resId);
    }

//    private static void setBackgroundSquareLayoutCustom(int resId, int backgroundcolor){
//        LinearLayout layout = view.findViewById(R.id.square_toast_layout);
//        layout.setBackgroundResource(resId);
//    }

    private static void setToastText(String string, int textColor) {
        TextView toastTitle = view.findViewById(R.id.toastTitle);
        toastTitle.setText(string);
        toastTitle.setTextColor(textColor);
    }


    private static ImageView setToastIcon(int resId) {
        ImageView toastIcon = view.findViewById(R.id.toastIcon);
        toastIcon.setImageResource(resId);
        return toastIcon;
    }


    // handling time delay for toast time duration
    private static void waitingSec(int duration) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, duration);
    }


}