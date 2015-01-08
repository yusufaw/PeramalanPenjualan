package com.ua.peramalanpenjualan;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormPeramalanActivity extends Activity implements OnClickListener {
	EditText eN;
    EditText eSigmaY;
    EditText eSigmaXY;
    EditText eSigmaX2;
    EditText eX;
    TextView eHasil;
    Button bHitung;
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_peramalan);

        eN = (EditText)findViewById(R.id.editN);
        eSigmaY = (EditText)findViewById(R.id.editSigmaY);
        eSigmaXY = (EditText)findViewById(R.id.editSigmaXY);
        eSigmaX2 = (EditText)findViewById(R.id.editSigmaX2);
        eX = (EditText)findViewById(R.id.editX);
        eHasil = (TextView)findViewById(R.id.textHasil);
        bHitung = (Button) findViewById(R.id.buttonHitung);
        bHitung.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		double n = Double.parseDouble(String.valueOf(eN.getText()));
        double sigmaY = Double.parseDouble(String.valueOf(eSigmaY.getText()));
        double sigmaXY = Double.parseDouble(String.valueOf(eSigmaXY.getText()));
        double sigmaX2 = Double.parseDouble(String.valueOf(eSigmaX2.getText()));
        double x = Double.parseDouble(String.valueOf(eX.getText()));
        double a = sigmaY / n;
        double b = sigmaXY / sigmaX2;
        double resultY = a + (b*x);
        DecimalFormat df = new DecimalFormat(".##");
        eHasil.setText(String.valueOf(df.format(resultY)));
	}
}