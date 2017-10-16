package pl.koisuru.hitorisearchforlove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button przycisk1;
    private Button przycisk2;
    private Button przycisk3;
    private Button przycisk4;
    private TextView textView;
    private ImageView bish1;
    private int dialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        przycisk1 = (Button)findViewById(R.id.przyci);
        przycisk2 = (Button)findViewById(R.id.przyc);
        przycisk3 = (Button)findViewById(R.id.przy);
        przycisk4 = (Button)findViewById(R.id.hitori);
        textView = (TextView)findViewById(R.id.dialog);
        bish1 = (ImageView)findViewById(R.id.bish);
        //bish1.setVisibility(View.VISIBLE);


        przycisk1.setText(getString(R.string.prolog));
        dialog = 1;
        przycisk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dialog==1){
                    bish1.setImageDrawable(getResources().getDrawable(R.drawable.gusta));

                    textView.setVisibility(View.VISIBLE);
                    textView.setText(getString(R.string.gus1));
                    przycisk2.setVisibility(View.VISIBLE);
                    przycisk2.setText(getString(R.string.opcja1));
                    przycisk1.setText(getString(R.string.opcja2));
                    przycisk3.setVisibility(View.VISIBLE);
                    przycisk3.setText(getString(R.string.opcja3));
                    dialog=2;
                }
                // else if (a==2){

                //} return ;


            }
        });



    }
}
