package space.sosnovskikh.secondpractice;

import android.content.Intent;
import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CheckBoxing extends AppCompatActivity implements View.OnClickListener {
    TextView textView4;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    Button button_last;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);
        textView4 = findViewById(R.id.textView4);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        button_last = findViewById(R.id.button_last);
        button_last.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button_last:
                if(checkBox1.isChecked()){
                    FinalResult.a+=1;
                }
                if(checkBox2.isChecked()){
                    FinalResult.a-=1;
                }
                if(checkBox3.isChecked()){
                    FinalResult.a+=1;
                }
                Intent intent = new Intent(this,FinalResult.class);
                startActivity(intent);
                finish();
        }
    }
}

