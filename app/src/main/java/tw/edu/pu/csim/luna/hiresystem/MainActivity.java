package tw.edu.pu.csim.luna.hiresystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= findViewById(R.id.button);
        button2= findViewById(R.id.button2);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    public void btn_onclick(View view) {

    }

    public void btn_onclick2(View view) {
        Intent intent =new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }


}