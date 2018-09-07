package vivekapps.com.flashlight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by vivek on 9/7/2018.
 */

public class GreenFlashLightActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.green);
        Button redButton = (Button)(findViewById(R.id.red_button));
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GreenFlashLightActivity.this,RedFlashLightActivity.class);
                startActivity(intent);
                //finish();
            }
        });

    }
}
