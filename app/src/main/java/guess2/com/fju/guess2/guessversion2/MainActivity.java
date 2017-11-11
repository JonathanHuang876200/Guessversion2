package guess2.com.fju.guess2.guessversion2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random ran = new Random();
    int r = ran.nextInt(99) + 1;
    int max = 100;
    int min = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {        /*自弄生成*/
        super.onCreate(savedInstanceState);                    /*自弄生成*/
        setContentView(R.layout.activity_main);                 /*自弄生成*/

        Button bSend = (Button) findViewById(R.id.b_send);              /*從畫面取得元件*/

        bSend.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText edNumber = (EditText) findViewById(R.id.ed_number);    /*從畫面取得元件*/
                int n = Integer.parseInt(edNumber.getText().toString());

                if (n >= max) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage("超過最大值")
                            .setTitle("結果")
                            .setPositiveButton("確定", null)
                            .show();
                }
                if (n <= min) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage("低於最小值")
                            .setTitle("結果")
                            .setPositiveButton("確定", null)
                            .show();
                }
                if (n == r) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage("答對了")
                            .setTitle("結果")
                            .setNegativeButton("確定", null)
                            .show();
                }
                while (n > min && n < max && n < r) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage("大一點")
                            .setTitle("結果")
                            .setNegativeButton("確定", null)
                            .show();
                    TextView number0 = (TextView) findViewById(R.id.number_0);
                    String s = String.valueOf(n);
                    number0.setText(Integer.toString(n));
                    break;
                }
                while (n > min && n < max && n > r) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage("小一點")
                            .setTitle("結果")
                            .setNegativeButton("確定", null)
                            .show();
                    TextView number100 = (TextView) findViewById((R.id.number_100));
                    String s = String.valueOf(n);
                    number100.setText(Integer.toString(n));
                    break;
                }

            }
        });
    }
}
