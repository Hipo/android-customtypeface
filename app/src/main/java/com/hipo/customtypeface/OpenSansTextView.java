package com.hipo.customtypeface;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by baris on 29/12/14.
 */
public class OpenSansTextView extends TextView {
    /**
     *
     * Extend the view that you wish to create and call init()
     */
    public OpenSansTextView(Context context) {
        super(context);
    }

    public OpenSansTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public OpenSansTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }
    private void init(Context context,AttributeSet attrs){
        Utils.initTypeface(this, context, attrs);
    }
}
