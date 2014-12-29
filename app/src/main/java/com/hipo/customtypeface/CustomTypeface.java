package com.hipo.customtypeface;

import android.graphics.Typeface;
import android.util.SparseArray;

/**
 * Created by baris on 29/12/14.
 */
public class CustomTypeface {
    public CustomTypeface() {
    }
    /**
     * @see <a href="https://www.linkedin.com/pulse/20141118215624-117315873-sparse-array?trk=prof-post</a>
     */
    public final static SparseArray<Typeface> typefacesSparseArray = new SparseArray<>(10);

    public static final int OpenSans_Bold = 0;
    public static final int OpenSans_BoldItalic = 1;
    public static final int OpenSans_ExtraBold = 2;
    public static final int OpenSans_ExtraBoldItalic = 3;
    public static final int OpenSans_Italic = 4;
    public static final int OpenSans_Light = 5;
    public static final int OpenSans_LightItalic = 6;
    public static final int OpenSans_Regular = 7;
    public static final int OpenSans_Semibold = 8;
    public static final int OpenSans_SemiboldItalic = 9;
}
