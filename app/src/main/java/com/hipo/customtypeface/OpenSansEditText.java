package com.hipo.customtypeface;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by baris on 29/12/14.
 */
public class OpenSansEditText extends EditText {
    /**
     *
     * Extend the view that you wish to create and call init()
     */
    public OpenSansEditText(Context context) {
        super(context);
    }

    public OpenSansEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public OpenSansEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }
    private void init(Context context,AttributeSet attrs){
        Utils.initTypeface(this, context, attrs);
    }
}
