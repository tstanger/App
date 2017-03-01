package org.gottablast.gottablast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.gottablast.gottablast.util.IabHelper;
import org.gottablast.gottablast.util.IabResult;

/**
 * Created by travis on 2/25/2017.
 */

public class IntroActivity extends AppCompatActivity {

    public static String name = "";
    public static String email = "";

    IabHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        String base64EncodedPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgQ/DHm5LRuEYJeqyophS6H4kPzDrw2wa/urE/aDoag29apqyKpK2F4j31A/PHG5q1dm862QDsSmfah84AS40U3xCuPFK4NuMF85jfl+D6FjnquJrt76PosQPcMN3vy5HhxsDggbk7Qggmn7gJ//KAvzAHjznQAemD8Gx598rT2UlOL+UWpcNyomI0ou32XZZtpcUmVmC0GfgcdXIlYK/nPrpOMYBjxZON12hsalfH9Fvo+sFtqHroLH1w1YQtO+EC0WNWI52gzAsI2jc8TbqwYlby/n+X0VrBBgqCzXWDfj0zDf73AfUFF19KzkUvS58WvRtqBQnx/8+OasgeK77HQIDAQAB";
        mHelper = new IabHelper(this, base64EncodedPublicKey);

    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mHelper != null) try {
            mHelper.dispose();
        } catch (IabHelper.IabAsyncInProgressException e) {
            e.printStackTrace();
        }
            mHelper = null;
    }
        public void gotoMain(View v) {
            Intent intent = new Intent(this, MainActivity.class);
            TextView nameText = (TextView) findViewById(R.id.name);
            TextView emailText = (TextView) findViewById(R.id.email);
            intent.putExtra("name", nameText.getText().toString());
            intent.putExtra("email", emailText.getText().toString());
            startActivity(intent);
    }
}