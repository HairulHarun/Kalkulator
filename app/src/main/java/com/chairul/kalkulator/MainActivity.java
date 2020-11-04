package com.chairul.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnTambah, btnKurang, btnKali, btnBagi;
    private EditText angka1, angka2, angka3;
    private TextView hasil;
    private CheckBox chk1, chk2, chk3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        angka1 = (EditText) findViewById(R.id.txtNumber1);
        angka2 = (EditText) findViewById(R.id.txtNumber2);
        angka3 = (EditText) findViewById(R.id.txtNumber3);
        chk1 = (CheckBox) findViewById(R.id.chk1);
        chk2 = (CheckBox) findViewById(R.id.chk2);
        chk3 = (CheckBox) findViewById(R.id.chk3);
        hasil = (TextView) findViewById(R.id.txtHasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String h = proses(Integer.parseInt(angka1.getText().toString()),
                                                    Integer.parseInt(angka2.getText().toString()),
                                                            Integer.parseInt(angka3.getText().toString()), "tambah");
                hasil.setText(h);
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String h = proses(Integer.parseInt(angka1.getText().toString()),
                        Integer.parseInt(angka2.getText().toString()),
                        Integer.parseInt(angka3.getText().toString()), "kurang");
                hasil.setText(h);
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String h = proses(Integer.parseInt(angka1.getText().toString()),
                        Integer.parseInt(angka2.getText().toString()),
                        Integer.parseInt(angka3.getText().toString()), "kali");
                hasil.setText(h);
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String h = proses(Integer.parseInt(angka1.getText().toString()),
                        Integer.parseInt(angka2.getText().toString()),
                        Integer.parseInt(angka3.getText().toString()), "bagi");
                hasil.setText(h);
            }
        });
    }

    public String proses(int angka1, int angka2, int angka3, String jenis){
        String hasil = "";
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;

        if (chk1.isChecked()){
            a1 = angka1;
        }

        if (chk2.isChecked()){
            a2 = angka2;
        }

        if (chk3.isChecked()){
            a3 = angka3;
        }

        if (jenis.equals("tambah")){
            try {
                hasil = String.valueOf(a1+a2+a3);
            }catch (Exception e){
                hasil = "Terjadi Kesalahan !";
            }
        }else if (jenis.equals("kurang")){
            try {
                hasil = String.valueOf(a1-a2-a3);
            }catch (Exception e){
                hasil = "Terjadi Kesalahan !";
            }
        }else if (jenis.equals("kali")){
            try {
                hasil = String.valueOf(a1*a2*a3);
            }catch (Exception e){
                hasil = "Terjadi Kesalahan !";
            }
        }else if (jenis.equals("bagi")){
            try {
                hasil = String.valueOf(a1/a2/a3);
            }catch (Exception e){
                hasil = "Terjadi Kesalahan !";
            }
        }

        return hasil;
    }
}