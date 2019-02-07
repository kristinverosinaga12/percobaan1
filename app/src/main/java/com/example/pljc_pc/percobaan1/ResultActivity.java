package com.example.pljc_pc.percobaan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        getSupportActionBar().setTitle("Hasil Input");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle bundle = null;
        bundle = this.getIntent().getExtras();

        final TextView tvnama = (TextView) findViewById(R.id.tvnama);
        final TextView tvalamat = (TextView) findViewById(R.id.tvalamat);
        final TextView tvkelas = (TextView) findViewById(R.id.tvkelas);
        final TextView tvhobi = (TextView) findViewById(R.id.tvhobi);

        tvnama.setText(bundle.getString("nama"));
        tvalamat.setText(bundle.getString("alamat"));
        tvkelas.setText(bundle.getString("kelas"));
        tvhobi.setText(bundle.getString("hobi"));
    }
}
