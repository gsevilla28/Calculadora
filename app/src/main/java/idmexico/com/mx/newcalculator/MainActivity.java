package idmexico.com.mx.newcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  TextView resultado;
    private Button buno, bdos, btres,bcuatro,bcinco,bseis,bsiete,bocho, bnueve, multi, division,resta;
    String result="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (TextView) findViewById(R.id.txtresultado);
        findViewById(R.id.uno).setOnClickListener(this);
        findViewById(R.id.dos).setOnClickListener(this);
        findViewById(R.id.tres).setOnClickListener(this);
        findViewById(R.id.cuatro).setOnClickListener(this);
        findViewById(R.id.cinco).setOnClickListener(this);
        findViewById(R.id.seis).setOnClickListener(this);
        findViewById(R.id.siete).setOnClickListener(this);
        findViewById(R.id.ocho).setOnClickListener(this);
        findViewById(R.id.nueve).setOnClickListener(this);
        findViewById(R.id.cero).setOnClickListener(this);
        findViewById(R.id.borrar).setOnClickListener(this);


        findViewById(R.id.suma).setOnClickListener(this);
        findViewById(R.id.resta).setOnClickListener(this);
        findViewById(R.id.division).setOnClickListener(this);
        findViewById(R.id.multi).setOnClickListener(this);
        findViewById(R.id.igual).setOnClickListener(this);


        buno= (Button) findViewById(R.id.uno);
        bdos= (Button) findViewById(R.id.dos);
        btres = (Button) findViewById(R.id.tres);
        bcuatro= (Button) findViewById(R.id.cuatro);
        bcinco= (Button) findViewById(R.id.cinco);
        bseis=(Button) findViewById(R.id.seis);
        bsiete= (Button) findViewById(R.id.siete);
        bocho= (Button) findViewById(R.id.ocho);
        bnueve= (Button) findViewById(R.id.nueve);

        multi= (Button) findViewById(R.id.multi);
        division = (Button) findViewById(R.id.division);
        resta = (Button) findViewById(R.id.resta);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.uno:
                result += 1;
                break;
            case R.id.dos:
                result += 2;
                break;
            case R.id.tres:
                result += 3;
                break;
            case R.id.cuatro:
                result += 4;
                break;
            case R.id.cinco:
                result += 5;
                break;
            case R.id.seis:
                result += 6;
                break;
            case R.id.siete :
                result += 7;
                break;
            case R.id.ocho:
                result += 8;
                break;
            case R.id.nueve:
                result += 9;
                break;
            case R.id.cero:
                result += 0;
                break;
            case  R.id.borrar:
                result="";
                break;
            case R.id.suma:
                result+="+";
                break;
            case R.id.resta:
                result+="+";
                break;
            case R.id.multi:
                result+="X";
                break;
            case R.id.division:
                result+="/";
                break;
            case R.id.igual:
                result +=" " + realizaOperacion();
                break;

        }
        resultado.setText(result);
    }

    private String realizaOperacion() {
        String texto = resultado.getText().toString();
        String numero1 = "";

        try {

            if (texto.contains("+") || texto.contains("/") || texto.contains("X") || texto.contains("-")) {
                numero1 = texto.substring(0, texto.indexOf("+"));
                resultado.setText(numero1);

            }
        }
        catch (Exception ex){

        }
        return numero1;
    }

    public void onRadioButtonClicked(View view){

        boolean checked = ((RadioButton)view).isChecked();

        switch (view.getId()){
            case R.id.binario:
                if (checked)
                    InhabilitaBotones();
                break;
            case R.id.decimal:
                if (checked)
                    HabilitaBotones();
                break;
        }

    }

    private void HabilitaBotones() {
        bdos.setEnabled(true);
        btres.setEnabled(true);
        bcuatro.setEnabled(true);
        bcinco.setEnabled(true);
        bseis.setEnabled(true);
        bsiete.setEnabled(true);
        bocho.setEnabled(true);
        bnueve.setEnabled(true);

        multi.setEnabled(true);
        division.setEnabled(true);
        resta.setEnabled(true);
    }

    private void InhabilitaBotones() {

        //buno.setEnabled(false);
        bdos.setEnabled(false);
        btres.setEnabled(false);
        bcuatro.setEnabled(false);
        bcinco.setEnabled(false);
        bseis.setEnabled(false);
        bsiete.setEnabled(false);
        bocho.setEnabled(false);
        bnueve.setEnabled(false);

        multi.setEnabled(false);
        division.setEnabled(false);
        resta.setEnabled(false);

    }
}
