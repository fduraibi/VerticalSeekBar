/**
 * Created by Fahad Alduraibi on 12/4/14.
 * fadvisor.net
 */

package net.fadvisor.verticalseekbar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View rl2 = findViewById(R.id.rl2);
        final View rl1 = findViewById(R.id.rl1);

        rl2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @SuppressWarnings("deprecation")
            @Override
            public void onGlobalLayout() {

                //int min = Math.min(rl2.getWidth(), rl2.getHeight());
                int w1 = rl1.getWidth();
                int h1 =rl1.getHeight();
                int w = rl2.getWidth();
                int h =rl2.getHeight();


                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(h, w);
                //params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);

                rl2.setLayoutParams(params);
                rl2.setRotation(270.0f);
                rl2.setTranslationX((w - h) / 2);
                rl2.setTranslationY((h - w) / 2);

                if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN)
                    rl2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                else
                    rl2.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        });

    }

}
