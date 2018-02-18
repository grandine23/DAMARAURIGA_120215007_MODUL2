package com.androidhehe.riga.damarauriga_1202150007_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOrder(View view) {
        if (((RadioButton)findViewById(R.id.Dinein)).isChecked()){
            Intent intent = new Intent(this, Dinein.class);
            Toast.makeText(this,"Anda telah memilih Dine In",Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }else if (((RadioButton)findViewById(R.id.TakeAway)).isChecked()){
            Intent intent = new Intent(this, TakeAway.class);
            Toast.makeText(this,"Anda telah memilih Take Away",Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }else{
            Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();
        }




    }
}
