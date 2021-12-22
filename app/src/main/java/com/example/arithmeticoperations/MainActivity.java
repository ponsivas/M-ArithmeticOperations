package com.example.arithmeticoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText V1,V2;
    TextView AD,SU,MU,DI,MD;
    Button AO,CL;
    String S;
    Float F;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        V1 = findViewById(R.id.N1);
        V2 = findViewById(R.id.N2);
        AD = findViewById(R.id.ADDI);
        SU = findViewById(R.id.SUBT);
        MU = findViewById(R.id.MULT);
        DI = findViewById(R.id.DIVI);
        MD = findViewById(R.id.MDIVI);
        AO = findViewById(R.id.ARI);
        CL = findViewById(R.id.CLR);

        AO.setOnClickListener(view -> {
            if (V1.getText().length() == 0) {
                if (V2.getText().length() == 0) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Enter the First & Second Numbers and press ARITHMETIC OPERATIONS Button", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
            else {
                F = Float.parseFloat(V1.getText().toString()) + Float.parseFloat(V2.getText().toString());
                S = Float.toString(F);
                AD.setText(S);
                F = Float.parseFloat(V1.getText().toString()) - Float.parseFloat(V2.getText().toString());
                S = Float.toString(F);
                SU.setText(S);
                F = Float.parseFloat(V1.getText().toString()) * Float.parseFloat(V2.getText().toString());
                S = Float.toString(F);
                MU.setText(S);
                F = Float.parseFloat(V1.getText().toString()) / Float.parseFloat(V2.getText().toString());
                S = Float.toString(F);
                DI.setText(S);
                F = Float.parseFloat(V1.getText().toString()) % Float.parseFloat(V2.getText().toString());
                S = Float.toString(F);
                MD.setText(S);
            }
        });

        CL.setOnClickListener(view -> {
            if (V1.getText().length() == 0) {
                if (V2.getText().length() == 0) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Perform the Logical Operations by entering the First & Second Numbers and then press CLEAR Button", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
            else {
                V1.setText("");
                V2.setText("");
                AD.setText("");
                SU.setText("");
                MU.setText("");
                DI.setText("");
                MD.setText("");
            }
        });

    }
}