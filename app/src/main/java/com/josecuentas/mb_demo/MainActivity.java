package com.josecuentas.mb_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_RESULTADO = "resultado";
    //Declarar
    EditText mEdtEmail;
    EditText mEdtPassword;
    Button mBtnLogin;
    TextView mTxvMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclofacil);
        initVariables();
        initEventos();
    }

    private void initVariables() {
        //Instanciar
        mEdtEmail = (EditText) findViewById(R.id.edtEmail);
        mEdtPassword = (EditText) findViewById(R.id.edtPassword);
        mBtnLogin = (Button) findViewById(R.id.btnLogin);
        mTxvMensaje=(TextView)findViewById(R.id.txvMensaje);
    }
    private void initEventos() {
        mBtnLogin.setOnClickListener(new BtnLoginOnClickListener());
    }

    class BtnLoginOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            String emaiil = mEdtEmail.getText().toString();
            String password = mEdtPassword.getText().toString();
            //AND = && - OR = ||
            if (emaiil.equals("jose") && password.equals("jose")) {
                System.out.println("Entraste");
                //mTxvMensaje.setText("Entraste");
                changeActivity("Entraste");

            }else{
                System.out.println("No tiene acceso");
                //mTxvMensaje.setText("No tienes acceso");
                changeActivity("No tiene acceso");
            }
        }

        void changeActivity(String mensaje){
            Intent i = new Intent(MainActivity.this, MenuActivity.class);
            i.putExtra(EXTRA_RESULTADO, mensaje);
            startActivity(i);
        }
    }
}
