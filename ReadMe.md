# CustomTypeface

CustomTypeface is a demo-library for setting custom typefaces to views . We used OpenSans as an example but you can modify this library and use any typeface as you want.



#Usage
You should extend the view that you want set typeface as below ;

```
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
```

And set the typeface from xml
```

         <com.hipo.customtypeface.OpenSansTextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="OpenSans_Bold"
                    app:typeface="OpenSans_Bold" />
```



#Installation
###### These steps are required for publishing aar file into your local repository.For further detail see https://www.linkedin.com/pulse/publishing-aar-local-repository-baris-emre-efe?trk=prof-post
 - Clone library into your workspace
 - Modify build.gradle file and change the repository location
 - Run
 - ```sh
        ./gradlew uploadArchives
```
from Android Studio's terminal

 - Add this dependency into your project
   ```
        compile 'com.hipo.customtypeface:library:+'
```


### Credits
CustomTypeface is brought to you by Baris Emre Efe and the Hipo Team


