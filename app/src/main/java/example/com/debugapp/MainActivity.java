package example.com.debugapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2,t3;
    Button b;
    int n1,n2,sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.editText);
        t2=findViewById(R.id.editText2);
        t3=findViewById(R.id.editText3);
        b=findViewById(R.id.button);


    }

    public void add(View v)
    {
        try {

             n1 = Integer.parseInt(t1.getText().toString());
             Log.i("DebudApp","n1"+n1);
            n2 = Integer.parseInt(t2.getText().toString());Log.i("DebudApp","n2"+n2);
            Toast.makeText(getApplicationContext(),"create"+n1+n2,Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(),"Add"+n1+n2,Toast.LENGTH_SHORT).show();
            sum=n1+n2;
            t3.setText(String.valueOf(sum));
        }
        catch (NumberFormatException ne)
        {
            Log.e("DebugApp","Error"+ne);
        }
    }
}
