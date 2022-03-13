package space.sosnovskikh.secondpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Radio extends AppCompatActivity implements View.OnClickListener {
    RadioGroup radioGroup;
    Button button_prelast;
    TextView textView2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio);
        textView2 = findViewById(R.id.textView2);
        radioGroup = findViewById(R.id.radioGroup);
        button_prelast = findViewById(R.id.button_prelast);
        button_prelast.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_prelast:
                if(radioGroup.getCheckedRadioButtonId()==R.id.radioButton1){
                    FinalResult.a+=1;
                }
                Intent intent = new Intent(this, CheckBoxing.class);
                startActivity(intent);
                finish();


        }
    }
}
