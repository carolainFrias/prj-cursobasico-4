package calc.edad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tuedad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuedad);
    }


    public void btnCalcularEdad(View view) {
        Intent myIntent = new Intent(Tuedad.this, MainActivity.class);
        Tuedad.this.startActivity(myIntent);
    }
}