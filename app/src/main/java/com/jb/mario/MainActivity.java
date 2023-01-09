package com.jb.mario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result, category, tvTip, tvWeigth, tvHeigth;
    EditText weight, height;
    Button compute;
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.activity_main_tv_display);
        category = findViewById(R.id.activity_main_tv_category);
        tvTip = findViewById(R.id.activity_main_tv_tip);
        tvWeigth = findViewById(R.id.activity_main_tv_weigth);
        tvHeigth = findViewById(R.id.activity_main_tv_heigth);
        weight = findViewById(R.id.activity_main_edt_weight);
        height = findViewById(R.id.acticity_main_edt_heigth);
        compute = findViewById(R.id.activity_main_btn_compute);

        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //COMPUTE BMI
                double w = 0, h = 0;

                try{
                    w = Double.parseDouble(weight.getText().toString());
                    h = Double.parseDouble(height.getText().toString());
                }
                catch (Exception e){
                    tvTip.setText(getString(R.string.tip_hint1));
                    clearEntry();
                    return;
                }

                if(h > 0 && w > 0){
                    tvTip.setText("");

                    person = new Person(w, h);
                    person.computeBmi();

                    result.setText(getString(R.string.result) + " " + person.getBmi());

                    switch (person.findCategory()){
                        case 1 : category.setText(getString(R.string.tip1));
                                 break;
                        case 2 : category.setText(getString(R.string.tip2));
                                 break;
                        case 3 : category.setText(getString(R.string.tip3));
                                 break;
                        case 4 : category.setText(getString(R.string.tip4));
                                 break;
                        case 5 : category.setText(getString(R.string.tip5));
                                 break;
                        case 6 : category.setText(getString(R.string.tip6));
                                 break;
                        case 7 : category.setText(getString(R.string.tip7));
                                 break;
                        case 8 : category.setText(getString(R.string.tip8));
                                 break;
                    }

                    tvWeigth.setText(getString(R.string.value1) + " : " + String.valueOf(w) + " kg");
                    tvHeigth.setText(getString(R.string.value2) + " : " + String.valueOf(h) + " m");
                    clearEntry();
                }
                else{
                    tvTip.setText(getString(R.string.tip_hint2));
                    clearEntry();
                }
            }
        });
    }

    private void clearEntry(){
        height.setText("");
        weight.setText("");
    }
}