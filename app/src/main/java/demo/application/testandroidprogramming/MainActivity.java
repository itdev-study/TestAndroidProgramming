package demo.application.testandroidprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textView;
    Button btn1 , btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Button 1 pressed :: Нажат 1");
            }
        });

        btn2.setOnClickListener(this);

    }


    public void btn3OnClick(View view){
        textView.setText("Button 3 pressed :: Нажат 3");
    }

    @Override
    public void onClick(View view) {
        textView.setText("Button 2 pressed :: Нажат 2");
    }
}
