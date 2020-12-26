package com.example.pemesananbakso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView price, pesan, totalh, jumbay, qy,pjk,tohar, pembayar,kembalian,Hitung,term;
Button bayaran,menuUtama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pesan = (TextView) findViewById(R.id.pesanan);
        qy = (TextView) findViewById(R.id.beli);
        price = (TextView) findViewById(R.id.price_textview);
        totalh = (TextView) findViewById(R.id.harga);
        jumbay = (TextView) findViewById(R.id.jumlahbayar);
        pjk = (TextView) findViewById(R.id.ppn);
        tohar = (TextView) findViewById(R.id.ttl);
        pembayar = (EditText) findViewById(R.id.pembyr);
        kembalian = (TextView) findViewById(R.id.kmbl);
        Hitung = (TextView) findViewById(R.id.hitung);
        term = (TextView) findViewById(R.id.terimaksaih);
        bayaran = (Button) findViewById(R.id.pembayaran);
        menuUtama = (Button) findViewById(R.id.kembalikemenu);


        pesan.setText(getIntent().getStringExtra("menu"));
        qy.setText(getIntent().getStringExtra("kuantitas"));
        price.setText(getIntent().getStringExtra("HargaSatuan"));
        totalh.setText(getIntent().getStringExtra("HargaBeli"));
        jumbay.setText(getIntent().getStringExtra("TotalHarga"));
        pjk.setText(getIntent().getStringExtra("pajak"));
        tohar.setText(getIntent().getStringExtra("JumlahBayar"));
        Hitung.setText(getIntent().getStringExtra("Hitung"));




bayaran.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        int s = Integer.parseInt(Hitung.getText().toString());
        int i = Integer.parseInt(pembayar.getText().toString());
        int hasil = i-s;

        if (hasil >-1) {
            String kembal = String.valueOf(hasil);

            kembalian.setText("Rp. " + kembal + ",-");
            term.setVisibility(View.VISIBLE);
            term.setText("Terimakasih Sudah Memesan \n " +
                    "Jumlah pembayaran :"+ tohar.getText()+
                    "\nUang Pembayaran : "+ pembayar.getText()+
                    "\nkembalian anda :"+ kembalian.getText() +
                    "\n silahkan datang kembali");

        }else {
            Toast.makeText(getApplication(),"Uang Tidak Cukup", Toast.LENGTH_SHORT).show();
term.setVisibility(View.INVISIBLE);
        }






    }
});


menuUtama.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }
});

    }
}