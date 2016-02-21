package com.josecuentas.mb_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Pibe on 20/02/2016.
 */
public class MenuActivity extends AppCompatActivity {

    TextView mTxvResultado ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initVariables();
        Bundle bundle =getIntent().getExtras();
        if (bundle!=null) {
            mTxvResultado.setText(bundle.getString(MainActivity.EXTRA_RESULTADO));
        }

    }

    private void initVariables() {
        mTxvResultado=(TextView)findViewById(R.id.txvResultado);
    }
}
