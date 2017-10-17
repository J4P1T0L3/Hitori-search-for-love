package pl.koisuru.hitorisearchforlove;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Acer on 2017-10-17.
 */

public class Ilustracja extends AppCompatActivity { @Override
protected void onCreate(Bundle savedInstanceState) {


    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);

    super.onCreate(savedInstanceState);
    setContentView(R.layout.ilustracja);}
}
