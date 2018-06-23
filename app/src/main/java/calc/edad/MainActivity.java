package calc.edad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    EditText txtFechaNacimiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtFechaNacimiento = (EditText) findViewById(R.id.txtFechaNac);
    }

    public void btnCalcular(View view){
        Toast.makeText(this,"Usted tiene "+ CalcularEdad() + " años de edad.",Toast.LENGTH_LONG).show();
    }

    public void btnLimpiar(View view){
        txtFechaNacimiento.setText("");
    }

    public int CalcularEdad(){
        String [] fecha = txtFechaNacimiento.getText().toString().split("/");
        int dia = Integer.parseInt(fecha[0]);
        int mes = Integer.parseInt(fecha[1]);
        int anio = Integer.parseInt(fecha[2]);
        Calendar edad = new GregorianCalendar(anio,mes,dia);
        Calendar hoy = Calendar.getInstance();
        int anios = hoy.get(Calendar.YEAR) - edad.get(Calendar.YEAR);
        edad.add(Calendar.YEAR,anios);
        if(hoy.before(edad)){
            anios--;
        }

        return anios;
    }
}
