package me.rishabhkhanna.tests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etKm;
    EditText etTime;
    Button btnCal;
    TextView tvCharge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etKm = (EditText) findViewById(R.id.etOne);
        etTime = (EditText) findViewById(R.id.etTwo);
        btnCal = (Button) findViewById(R.id.btnCal);
        tvCharge = (TextView) findViewById(R.id.tvFare);
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float km = Float.valueOf(etKm.getText().toString());
                int time = Integer.parseInt(etTime.getText().toString());
                tvCharge.setText(String.valueOf(calFare(km,time)));
            }
        });
    }
// Test can be written in both kotlin and java
//    since tests are compared on jvm level, hence both can be used
//    & since kotlin is same as java on jvm level

//    constraint layout has different license than other becoz it is beta, it has beta license which needs to be accepted seprately
//    bdd - behavior driven development
//    TDD - test driven development - writing tests first before writing actual code, considering function like a black box
//    sepration of concerns

    public static float calFare(float km,int time){

    return 50 + ((km > 5) ? ((km-5) * 12) : 0f) + ((time > 15) ? (time-15) : 0);
    }
}
