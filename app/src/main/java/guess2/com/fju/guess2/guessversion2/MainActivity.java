package guess2.com.fju.guess2.guessversion2;

import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
                int random = 5;
                int max = 10;
                int min = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {        /*自弄生成*/
        super.onCreate(savedInstanceState);                    /*自弄生成*/
        setContentView(R.layout.activity_main);                 /*自弄生成*/

        Button bSend = (Button) findViewById(R.id.b_send);              /*從畫面取得元件*/
        bSend.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                EditText edNumber = (EditText) findViewById(R.id.ed_number);    /*從畫面取得元件*/
                int n = Integer.parseInt(edNumber.getText().toString());

                if(n>max){
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage("超過最大值")
                            .setTitle("結果")
                            .setPositiveButton("確定",null)
                            .show();
                }
                if(n<min){
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage("低於最小值")
                            .setTitle("結果")
                            .setPositiveButton("確定",null)
                            .show();
                }
                if(n== random){
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage("答對了")
                            .setTitle("結果")
                            .setNegativeButton("確定",null)
                            .show();
                }
            }
        });

    }
}
