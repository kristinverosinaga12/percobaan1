package com.example.pljc_pc.percobaan1;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText nama = (EditText) findViewById(R.id.etNama);
        final EditText alamat = (EditText) findViewById(R.id.etAlamat);
        final RadioGroup kelas = (RadioGroup) findViewById(R.id.rgkls);
        final TextView hobi = (TextView) findViewById(R.id.ethobi);
        final Button reset = (Button) findViewById(R.id.btBatal);
        final Button Simpan = (Button) findViewById(R.id.btsimpan);
        final Bundle bundle = new Bundle();


        Simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBulider = new
                        AlertDialog.Builder(MainActivity.this);
                alertDialogBulider.setMessage(("Simpan Data Ini?"));
                alertDialogBulider.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Ya", Toast.LENGTH_SHORT).show();
                         bundle.putString("nama", nama.getText().toString());
                         bundle.putString("alamat", alamat.getText().toString());
                         bundle.putString("kelas", kelas.getTag().toString());
                         bundle.putString("hobi", hobi.getText().toString());

                        Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }

                });
                alertDialogBulider.setNegativeButton("no", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                /*alertDialogBulider.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                */

               AlertDialog alertDialog = alertDialogBulider.create();
               alertDialog.show();
            }
        });



        //Simpan.setOnClickListener(new View.OnClickListener() {
           // @Override
          //  public void onClick(View v) {
            //    Bundle bundle = new Bundle();
              //  bundle.putString("nama", nama.getText().toString());
               // bundle.putString("alamat", alamat.getText().toString());
               // bundle.putString("kelas", kelas.getTag().toString());
                //bundle.putString("hobi", hobi.getText().toString());



           // }
      // });

    }

}
