package space.sosnovskikh.secondpractice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FinalResult extends AppCompatActivity implements View.OnClickListener {
    public static int a=0;
    TextView textView10;
    Button button10;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalresult);
        textView10 = findViewById(R.id.textView10);
        String res = Integer.toString(FinalResult.a);
        textView10.setText("Ваш результат "+res+"/4");
        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button10:
                finish();
        }
    }
}

