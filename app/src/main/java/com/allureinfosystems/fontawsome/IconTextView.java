package com.allureinfosystems.fontawsome;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.Gravity;

    class IconTextView extends androidx.appcompat.widget.AppCompatTextView {

        private Context context;

        public IconTextView(Context context) {
            super(context);
            this.context = context;
            createView();
        }

        public IconTextView(Context context, AttributeSet attrs) {
            super(context, attrs);
            this.context = context;
            createView();
        }

        private void createView() {
         //   setGravity(Gravity.BOTTOM);
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                    "fontawesomesolid.otf");
            setTypeface(tf);
        }

    }



