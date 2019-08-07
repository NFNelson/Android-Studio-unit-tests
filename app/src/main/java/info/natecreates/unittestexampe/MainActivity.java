package info.natecreates.unittestexampe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static int addnumbers(int num1, int num2){
        //simple addition just to demonstrate unit tests
        return num1 + num2;


    }
}
