package guess2.com.fju.guess2.guessversion2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int random = 5;
    int max = 10;
    int min = 0;
    int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {        /*自弄生成*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);                 /*自弄生成*/

        final EditText edNumber = (EditText) findViewById(R.id.ed_number);    /*從畫面取得元件*/
        Button bSend = (Button) findViewById(R.id.b_send);              /*從畫面取得元件*/
        final int n = Integer.parseInt(edNumber.getText().toString());
        new AlertDialog.Builder(this)
                .setMessage("hi"+n);

//        bSend.OnClickListener(new View.OnClickListener(){
//            public void Onclick(View view){
//                        if(n>max){
//                            new AlertDialog.Builder(MainActivity.this)
//                                    .setMessage("超出最大值")
//                                    .setPositiveButton("OK",null)
//                                    .show();
//                        }else{
//                            if(n<min){
//                                new AlertDialog.Builder(MainActivity.this)
//                                        .setMessage("低於最小值")
//                                        .setPositiveButton("OK",null)
//                                        .show();
//                            }
//                        }
//
//            }
//
//        });

    }
}
