package com.hipo.customtypeface;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by baris on 29/12/14.
 */
public class TypefaceManager {


    public static Typeface getTypeface(Context context, int typefaceValue) {
        // If the typeface is already created get it from the sparseArray
        Typeface typeface = CustomTypeface.typefacesSparseArray.get(typefaceValue);
        if (typeface == null) {
            typeface = createTypeface(context, typefaceValue);
            CustomTypeface.typefacesSparseArray.put(typefaceValue, typeface);
        }
        return typeface;
    }
    private static Typeface createTypeface(Context context, int typefaceValue) {
        String typefacePath;
        switch (typefaceValue) {
            case CustomTypeface.OpenSans_Bold:
                typefacePath = "fonts/OpenSans-Bold.ttf";
                break;
            case CustomTypeface.OpenSans_BoldItalic:
                typefacePath = "fonts/OpenSans-BoldItalic.ttf";
                break;
            case CustomTypeface.OpenSans_ExtraBold:
                typefacePath = "fonts/OpenSans-ExtraBold.ttf";
                break;
            case CustomTypeface.OpenSans_ExtraBoldItalic:
                typefacePath = "fonts/OpenSans-ExtraBoldItalic.ttf";
                break;
            case CustomTypeface.OpenSans_Italic:
                typefacePath = "fonts/OpenSans-Italic.ttf";
                break;
            case CustomTypeface.OpenSans_Light:
                typefacePath = "fonts/OpenSans-Light.ttf";
                break;
            case CustomTypeface.OpenSans_LightItalic:
                typefacePath = "fonts/OpenSans-LightItalic.ttf";
                break;
            case CustomTypeface.OpenSans_Regular:
                typefacePath = "fonts/OpenSans-Regular.ttf";
                break;
            case CustomTypeface.OpenSans_Semibold:
                typefacePath = "fonts/OpenSans-Semibold.ttf";
                break;
            case CustomTypeface.OpenSans_SemiboldItalic:
                typefacePath = "fonts/OpenSans-SemiboldItalic.ttf";
                break;
            default:
                typefacePath = "fonts/OpenSans-Regular.ttf";
                break;
        }

        return Typeface.createFromAsset(context.getAssets(), typefacePath);
    }

}



