package com.gendigital.gabymaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapa(View v){
        Intent i = new Intent(this, MapsActivity.class);
        switch (v.getId()) {
            case R.id.btnLugar1:
                i.putExtra("LUGAR", "Cascadas de Minas viejas");
                i.putExtra("LATITUD", 22.375555);
                i.putExtra("LONGITUD", -99.318059);
                i.putExtra("PUNTERO", R.drawable.marcacascada);
                break;
            case R.id.btnLugar2:
                i.putExtra("LUGAR", "Rafting en río Tampaón");
                i.putExtra("LATITUD", 21.822945);
                i.putExtra("LONGITUD", -99.147676);
                i.putExtra("PUNTERO", R.drawable.marcarafting);
                break;
            case R.id.btnLugar3:
                i.putExtra("LUGAR", "Sótano de las Golondrinas");
                i.putExtra("LATITUD", 21.599817);
                i.putExtra("LONGITUD", -99.098954);
                i.putExtra("PUNTERO", R.drawable.marcagolondrinas);
                break;
            case R.id.btnLugar4:
                i.putExtra("LUGAR", "Xixitla, Jardines de Edward James, Las Pozas");
                i.putExtra("LATITUD", 21.396700);
                i.putExtra("LONGITUD", -98.996736);
                i.putExtra("PUNTERO", R.drawable.marcaxilitla);
                break;
        }
        startActivity(i);
    }
}
