package tera.nebelwolfi.tera.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import tera.nebelwolfi.tera.R;
import tera.nebelwolfi.tera.main.web.WebViewActivity;

/**
 * Created by Nebelwolfi on 18.02.2015.
 */

public class InitialActivity extends Activity {

    private Button button;

    public void onCreate(Bundle savedInstanceState) {
        final Context context = this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button = (Button) findViewById(R.id.buttonUrl);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, WebViewActivity.class);
                startActivity(intent);
            }

        });
    }
}