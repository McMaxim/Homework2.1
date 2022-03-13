package space.sosnovskikh.secondpractice;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

class WriteAnswer extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    Button button1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.writeanswer);
        editText = findViewById(R.id.editText);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button1:
                if (editText.getText().toString().equalsIgnoreCase("12")) {
                    FinalResult.a += 1;
                }
                Intent intent = new Intent(this, Radio.class);
                startActivity(intent);
                finish();



        }
    }
}

