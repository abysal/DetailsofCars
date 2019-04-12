package com.example.carsdetails;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
private TextView textScrollable1;
private EditText textMake1, textYear1, textColor1, textPurchasePrice1, textEngineSize1;
private Button buttonCreateCar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initItems();
    }
    private void initItems(){
        textMake1 = findViewById(R.id.textMake1);
        textYear1 = findViewById(R.id.textYear1);
        textColor1 = findViewById(R.id.textColor1);
        textPurchasePrice1 = findViewById(R.id.textPurchasePrice1);
        textEngineSize1 = findViewById(R.id.textEngineSize1);

        textScrollable1 = findViewById(R.id.textScrollable1);
        textScrollable1.setMovementMethod(new ScrollingMovementMethod());

        buttonCreateCar2 = findViewById(R.id.buttonCreateCar1);
        buttonCreateCar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailsModel model = new DetailsModel(textMake1.getText().toString(), textYear1.getText().toString(),
                textColor1.getText().toString(), textPurchasePrice1.getText().toString(), textEngineSize1.getText().toString());
                textScrollable1.setText(textScrollable1.getText()+"\r\n"+model.toString());
            }
        });
    }
}