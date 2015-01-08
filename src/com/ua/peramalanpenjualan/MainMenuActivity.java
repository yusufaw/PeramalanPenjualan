package com.ua.peramalanpenjualan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainMenuActivity extends Activity implements OnClickListener {

	Button bPeramalan;
    Button bMulai;
    Button bTentang;
    Button bPetunjuk;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        
        bPeramalan = (Button) findViewById(R.id.buttonPeramalan);
        bMulai = (Button) findViewById(R.id.buttonMulai);
        bTentang = (Button) findViewById(R.id.buttonTentang);
        bPetunjuk = (Button) findViewById(R.id.buttonPetunjuk);

        bPeramalan.setOnClickListener(this);
        bMulai.setOnClickListener(this);
        bTentang.setOnClickListener(this);
        bPetunjuk.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		switch (v.getId()){
        case R.id.buttonMulai:
            Intent mulaiIntent = new Intent(this, FormPeramalanActivity.class);
            startActivity(mulaiIntent);
            break;
        case R.id.buttonTentang:
            Intent tentangIntent = new Intent(this, AboutActivity.class);
            startActivity(tentangIntent);
            break;
        case R.id.buttonPeramalan:
            Intent peramalanIntent = new Intent(this, PeramalanPenjualanActivity.class);
            startActivity(peramalanIntent);
            break;
        case R.id.buttonPetunjuk:
        	Intent petunjukIntent = new Intent(this, PetunjukActivity.class);
        	startActivity(petunjukIntent);
    }		
	}
}