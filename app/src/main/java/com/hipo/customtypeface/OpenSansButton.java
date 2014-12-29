package com.hipo.customtypeface;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by baris on 29/12/14.
 */
public class OpenSansButton extends Button {
    /**
     *
     * Extend the view that you wish to create and call init()
     */

        public OpenSansButton(Context context) {
            super(context);
        }

        public OpenSansButton(Context context, AttributeSet attrs) {
            super(context, attrs);
            init(context,attrs);
        }

        public OpenSansButton(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            init(context,attrs);
        }
        private void init(Context context,AttributeSet attrs){
            Utils.initTypeface(this, context, attrs);
        }
    }

