package pl.koisuru.hitorisearchforlove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView przycisk1;
    private TextView przycisk2;
    private TextView przycisk3;
    private TextView przycisk4;
    private TextView textView;
    private ImageView bish1;
    private ImageView bish2;
    private int dialog;
    private TextView textView2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        przycisk1 = (TextView)findViewById(R.id.przyci);
        przycisk2 = (TextView)findViewById(R.id.przyc);
        przycisk3 = (TextView)findViewById(R.id.przy);
        przycisk4 = (TextView) findViewById(R.id.hitori);
        textView = (TextView)findViewById(R.id.dialog);
        bish1 = (ImageView)findViewById(R.id.bish);
        bish2 = (ImageView)findViewById(R.id.bish2);
        textView2= (TextView)findViewById(R.id.dialog2);


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
                 else if (dialog==2){
                    textView.setText(getString(R.string.gus3));
                    przycisk2.setVisibility(View.INVISIBLE);
                    przycisk3.setVisibility(View.INVISIBLE);
                    przycisk1.setText(R.string.czekaj2);
                    dialog=3;

                } else if (dialog == 3){
                    bish2.setVisibility(View.VISIBLE);
                    bish2.setImageDrawable(getResources().getDrawable(R.drawable.pszwe));
                    textView2.setVisibility(View.VISIBLE);
                    textView2.setText(getString(R.string.pszemek1));
                    textView.setVisibility(View.INVISIBLE);
                    przycisk1.setText(R.string.czekaj);
                    dialog=4;
                }else if (dialog == 4){
                    textView2.setVisibility(View.INVISIBLE);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText(R.string.gus4);

                    dialog = 5;
                }else if (dialog == 5){
                    textView.setVisibility(View.INVISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    textView2.setText(R.string.pszemek2);
                    dialog=6;
                }else if (dialog==6){
                    bish2.setVisibility(View.INVISIBLE);
                    textView2.setVisibility(View.INVISIBLE);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText(R.string.gus5);
                    przycisk1.setText(R.string.opcja4);
                    dialog=7;
                }else if (dialog==7){
                    textView.setText(R.string.gus6);
                    przycisk1.setText(R.string.czekaj2);
                    dialog=8;
                }else if (dialog==8){
                    bish2.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.INVISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    textView2.setText(R.string.pszemek30);

                    dialog=9;
                }else if (dialog==9){
                    textView2.setVisibility(View.INVISIBLE);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText(R.string.gus7);
                    przycisk1.setText(R.string.opcja5);
                    dialog=10;

                }else if (dialog==10){
                    textView.setText(R.string.gus8);
                    przycisk1.setText(R.string.kropka);
                    dialog=11;
                }else if (dialog==11){
                    Intent intent = new Intent(getApplicationContext(),Ilustracja.class);
                    startActivity(intent);
                }else if (dialog==-1){
                    textView.setText("Wen wirst du heute machen?");
                    przycisk1.setText("Co ty spiewasz?");
                    przycisk2.setVisibility(View.INVISIBLE);
                    przycisk3.setVisibility(View.INVISIBLE);
                    dialog=13;
                }else if (dialog==13){
                    textView.setText("So genau wie ich?");
                    przycisk1.setText("Gustaw pomóż! przetłumacz mi to!");
                    dialog=14;
                }else if (dialog==14){
                    textView.setText("Wer nimmt Titten auf?");
                    przycisk1.setText("No pomóż mi!");
                    dialog=15;
                }else if (dialog==15){
                    textView.setText("Wer fickt bei Tag?");
                    przycisk1.setText("NIE PODCHODZ!!! NIEEE! [Pokaż ilustracje]");
                    dialog=16;} else if (dialog==16){
                    Intent intent = new Intent(getApplicationContext(),Ilustracja.class);
                    startActivity(intent);

                }else if (dialog==17){
                    textView2.setVisibility(View.INVISIBLE);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("Wer bist du?");
                    przycisk1.setText(R.string.czekaj);
                    dialog=18;

                }else if (dialog==18){
                    textView2.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.INVISIBLE);
                    textView2.setText("Mein Name ist Hans JuderFreunde, und du Verbündeter?");
                    przycisk1.setText(R.string.czekaj);
                    dialog=19;
                }else if (dialog==19){
                    textView2.setVisibility(View.INVISIBLE);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("Ich bin Gustaw,was wirst du tun?");
                    przycisk1.setText(R.string.czekaj);
                    dialog=20;

                }else if (dialog==20){
                    textView2.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.INVISIBLE);
                    textView2.setText("Ich ficke Hitori. Möchten Sie mitmachen?");
                    przycisk1.setText("ZOSTAWCIE MNIE!! [Pokaż ilustracje]");
                    dialog=16;
                }


            }
        });
        przycisk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dialog==2){
                    przycisk2.setVisibility(View.INVISIBLE);
                    przycisk3.setVisibility(View.INVISIBLE);
                    textView.setText(R.string.gus2);
                    przycisk1.setText(R.string.kropka);
                    dialog=11;
                }else if (dialog==11){ Intent intent = new Intent(getApplicationContext(),Ilustracja.class);
                    startActivity(intent);}else if (dialog==-1){
                textView2.setText("Sehr willig.");
                przycisk1.setText("NIE PODCHODZ!!! NIEEE! [Pokaż ilustracje]");
                    przycisk2.setVisibility(View.INVISIBLE);
                    przycisk3.setVisibility(View.INVISIBLE);
                dialog=11;}

            }
        });
        przycisk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dialog==2){
                    przycisk2.setVisibility(View.INVISIBLE);
                    przycisk3.setVisibility(View.INVISIBLE);
                    textView.setText(R.string.gus9);
                    przycisk1.setText(R.string.kropka);
                    dialog=11;
                }else if (dialog==11){ Intent intent = new Intent(getApplicationContext(),Ilustracja.class);
                startActivity(intent);}else if (dialog==-1){
                    textView.setText("Wen wirst du heute machen?");
                    przycisk1.setText("Co ty spiewasz?");
                    przycisk2.setVisibility(View.INVISIBLE);
                    przycisk3.setVisibility(View.INVISIBLE);

                    dialog=13;
                }else if (dialog==13){
                    textView.setText("So genau wie ich?");
                    przycisk1.setText("Gustaw pomóż! przetłumacz mi to!");
                    dialog=14;
                }else if (dialog==14){
                    textView.setText("Wer nimmt Titten auf?");
                    przycisk1.setText("No pomóż mi!");
                    dialog=15;
                }else if (dialog==15){
                    textView.setText("Wer fickt bei Tag?");
                    przycisk1.setText("NIE PODCHODZ!!! NIEEE! [Pokaż ilustracje]");
                    dialog=16;} else if (dialog==16){
                    Intent intent = new Intent(getApplicationContext(),Ilustracja.class);
                    startActivity(intent);}
            }
        });
        przycisk4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (dialog==1){
                    bish1.setImageDrawable(getResources().getDrawable(R.drawable.hans1));
                    textView.setText(R.string.hans);
                    textView.setVisibility(View.VISIBLE);
                    przycisk2.setVisibility(View.VISIBLE);
                    przycisk3.setVisibility(View.VISIBLE);
                    przycisk2.setText("Pierdol się Hans");
                    przycisk1.setText("Mów po polsku, bo cie nie rozumiem");
                    przycisk3.setText("SKĄD ZNASZ MOJE IMIE?");
                    dialog=-1;

                }

                if (dialog>=2&&dialog<=11){
                    bish2.setImageDrawable(getResources().getDrawable(R.drawable.hans1));
                    bish1.setImageDrawable(getResources().getDrawable(R.drawable.gusta));
                    bish2.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.INVISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    textView2.setText(R.string.hans);
                    przycisk2.setVisibility(View.INVISIBLE);
                    przycisk3.setVisibility(View.INVISIBLE);
                    przycisk1.setText("Gustaw umiesz sie z nim dogadać?");
                    dialog=17;
                }
                return false;
            }
        });



    }

}