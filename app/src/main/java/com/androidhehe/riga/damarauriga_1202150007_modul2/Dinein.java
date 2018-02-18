package com.androidhehe.riga.damarauriga_1202150007_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Dinein extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein);
        spinner = (Spinner) findViewById(R.id.spinnerTable);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
               R.array.tables_array, android.R.layout.simple_spinner_item );
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }




    public void onClickOrder(View view) {

        String a = spinner.getSelectedItem().toString();

        if (a.equalsIgnoreCase("Meja 1")) {
            Toast.makeText(this, "Anda Memilih Meja 1", Toast.LENGTH_SHORT).show();

        } else if (a.equalsIgnoreCase("Meja 2")) {
            Toast.makeText(this, "Anda Memilih Meja 2", Toast.LENGTH_SHORT).show();


        } else if (a.equalsIgnoreCase("Meja 3")) {
            Toast.makeText(this, "Anda Memilih Meja 3", Toast.LENGTH_SHORT).show();

        } else if (a.equalsIgnoreCase("Meja 4")) {
            Toast.makeText(this, "Anda Memilih Meja 4", Toast.LENGTH_SHORT).show();

        } else if (a.equalsIgnoreCase("Meja 5")) {
            Toast.makeText(this, "Anda Memilih Meja 5", Toast.LENGTH_SHORT).show();
        }
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
