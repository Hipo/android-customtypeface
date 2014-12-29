package com.hipo.customtypeface;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by baris on 29/12/14.
 */
public class Utils {
    public static void initTypeface(TextView textView, Context context, AttributeSet attrs) {
       Typeface typeface;

        if (attrs != null) {
            final TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.OpenSansTextView);

            if (a.hasValue(R.styleable.OpenSansTextView_typeface)) {
                final int typefaceValue = a.getInt(R.styleable.OpenSansTextView_typeface, CustomTypeface.OpenSans_Regular);
                typeface = TypefaceManager.getTypeface(context, typefaceValue);

                a.recycle();
            } else {
                //return OpenSans_Regular if attrs file doesn't have OpenSansTextView_typeface
                typeface = TypefaceManager.getTypeface(context, CustomTypeface.OpenSans_Regular);
            }

            setTypeface(textView, typeface);
        }}


    public static void setTypeface(TextView tv, Typeface tf) {
        //Pixel Rendering
        tv.setPaintFlags(tv.getPaintFlags() | Paint.SUBPIXEL_TEXT_FLAG);
        tv.setTypeface(tf);
    }
}
