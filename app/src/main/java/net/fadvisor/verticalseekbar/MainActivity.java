/**
 * Created by Fahad Alduraibi on 12/4/14.
 * fadvisor.net
 */

package net.fadvisor.verticalseekbar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this.setLayoutParams(new RelativeLayout.LayoutParams(LayoutParams.FILL_PARENT, theSizeIWant));

        View rl1 = (View) findViewById(R.id.rl1);
        View rl2 = (View) findViewById(R.id.rl2);

        Log.d("fad-1H", Integer.toString(rl1.getHeight()));
        Log.d("fad-1W", Integer.toString(rl1.getWidth()));
        Log.d("fad-2H", Integer.toString(rl2.getHeight()));

//        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) someLayout.getLayoutParams();
//        params.height = 130;
//        someLayout.setLayoutParams(params);
    }

}
