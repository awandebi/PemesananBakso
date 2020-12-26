package com.example.pemesananbakso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int quantityT=0, quantityLc=0, quantityLm=0, quantityMs=0, quantitymin=0, quantitymie=0,
            quantityPangsit=0, quantityBaso=0, quantityBTelur=0, quantityAnak=0,
            a,b,c,d,e,f,g,h,i,j;

    CheckBox cbtea, cbleci, cblemon, cbmshake, cbmineral, cbmie, cbpangsit, cbbaso,cbtelur, cbanak;
    TextView texttea, textleci, textlemon,textshake, textmineral, textmie,textpangsit,textbaso,texttelur,textanak;
    Button submit,buy, btClear;
    TextView price, pesan, totalh, jumbay, qy,pjk,tohar, hitung;

    //------------------------------------------------------------------------------------------



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cbtea = findViewById(R.id.tmanis);
        cbleci = findViewById(R.id.tLeci);
        cblemon = findViewById(R.id.tLemon);
        cbmshake = findViewById(R.id.mShake);
        cbmineral = findViewById(R.id.Mineral);
        cbmie = findViewById(R.id.MieAym);
        cbpangsit = findViewById(R.id.MiePangsit);
        cbbaso = findViewById(R.id.BaksoUrat);
        cbtelur = findViewById(R.id.BakTelur);
        cbanak = findViewById(R.id.BaksoAnak);

        texttea = findViewById(R.id.quantity_mie);
        textleci  = findViewById(R.id.quantity_leci);
        textlemon = findViewById(R.id.quantity_lemon);
        textshake = findViewById(R.id.quantity_shake);
        textmineral = findViewById(R.id.quantity_mineral);
        textmie = findViewById(R.id.quantity_mie);
        textpangsit = findViewById(R.id.quantity_pangsit);
        textbaso = findViewById(R.id.quantity_Bakso);
        texttelur = findViewById(R.id.quantity_BaksoTelur);
        textanak = findViewById(R.id.quantity_BaksoBeranak);



        submit = findViewById(R.id.submitorder);
        btClear = findViewById(R.id.Clear_Order);
        buy = findViewById(R.id.buyer);
        pesan = findViewById(R.id.pesanan);
        qy = findViewById(R.id.beli);
        price = findViewById(R.id.price_textview);
        totalh = findViewById(R.id.harga);
        jumbay = findViewById(R.id.jumlahbayar);
        pjk = findViewById(R.id.ppn);
        tohar = findViewById(R.id.ttl);
        hitung = findViewById(R.id.hitung);


        //------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------
        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cbtea.setChecked(false);
                quantityT=0;
                display1(0);
                View a= findViewById(R.id.in1);
                View a1= findViewById(R.id.dec1);
                View a2= findViewById(R.id.quantity_teh);
                a.setVisibility(View.GONE);
                a1.setVisibility(View.GONE);
                a2.setVisibility(View.GONE);

                cbleci.setChecked(false);
                quantityLc=0;
                display2(0);
                View b= findViewById(R.id.in2);
                View b1= findViewById(R.id.dec2);
                View b2= findViewById(R.id.quantity_leci);
                b.setVisibility(View.GONE);
                b1.setVisibility(View.GONE);
                b2.setVisibility(View.GONE);

                cblemon.setChecked(false);
                quantityLm=0;
                display3(0);
                View c= findViewById(R.id.in3);
                View c1= findViewById(R.id.dec3);
                View c2= findViewById(R.id.quantity_lemon);
                c.setVisibility(View.GONE);
                c1.setVisibility(View.GONE);
                c2.setVisibility(View.GONE);

                cbmshake.setChecked(false);
                quantityMs=0;
                display4(0);
                View d= findViewById(R.id.in4);
                View d1= findViewById(R.id.dec4);
                View d2= findViewById(R.id.quantity_shake);
                d.setVisibility(View.GONE);
                d1.setVisibility(View.GONE);
                d2.setVisibility(View.GONE);

                cbmineral.setChecked(false);
                quantitymin=0;
                display5(0);
                View e= findViewById(R.id.in5);
                View e1= findViewById(R.id.dec5);
                View e2= findViewById(R.id.quantity_mineral);
                e.setVisibility(View.GONE);
                e1.setVisibility(View.GONE);
                e2.setVisibility(View.GONE);

                cbmie.setChecked(false);
                quantitymie=0;
                display6(0);
                View f= findViewById(R.id.in6);
                View f1= findViewById(R.id.dec6);
                View f2= findViewById(R.id.quantity_mie);
                f.setVisibility(View.GONE);
                f1.setVisibility(View.GONE);
                f2.setVisibility(View.GONE);

                cbpangsit.setChecked(false);
                quantityPangsit=0;
                display7(0);
                View g= findViewById(R.id.in7);
                View g1= findViewById(R.id.dec7);
                View g2= findViewById(R.id.quantity_pangsit);
                g.setVisibility(View.GONE);
                g1.setVisibility(View.GONE);
                g2.setVisibility(View.GONE);

                cbbaso.setChecked(false);
                quantityBaso=0;
                display8(0);
                View h= findViewById(R.id.in8);
                View h1= findViewById(R.id.dec8);
                View h2= findViewById(R.id.quantity_Bakso);
                h.setVisibility(View.GONE);
                h1.setVisibility(View.GONE);
                h2.setVisibility(View.GONE);

                cbtelur.setChecked(false);
                quantityBTelur=0;
                display9(0);
                View i= findViewById(R.id.in9);
                View i1= findViewById(R.id.dec9);
                View i2= findViewById(R.id.quantity_BaksoTelur);
                i.setVisibility(View.GONE);
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.GONE);

                cbanak.setChecked(false);
                quantityAnak=0;
                display10(0);
                View j= findViewById(R.id.in10);
                View j1= findViewById(R.id.dec10);
                View j2= findViewById(R.id.quantity_BaksoBeranak);
                j.setVisibility(View.GONE);
                j1.setVisibility(View.GONE);
                j2.setVisibility(View.GONE);
                pesan.setText("Daftar Pesanan");
                qy.setText("Unit");
                price.setText("Rp 0,-");
                totalh.setText("Rp 0,-");
                jumbay.setText("Rp 0,-");

            }
        });




        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String pesanan=pesan.getText().toString();
                    String kuantitas=qy.getText().toString();
                    String HargaSatuan=price.getText().toString();
                    String HargaBeli= totalh.getText().toString();
                    String TotalHarga = jumbay.getText().toString();
                    String pajak = pjk.getText().toString();
                    String JumlahBayar = tohar.getText().toString();
                    String Hitung = hitung.getText().toString();

                      Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                        intent.putExtra("menu",pesanan);
                        intent.putExtra("kuantitas", kuantitas);
                        intent.putExtra("HargaSatuan", HargaSatuan);
                        intent.putExtra("HargaBeli", HargaBeli);
                        intent.putExtra("TotalHarga", TotalHarga);
                        intent.putExtra("pajak", pajak);
                        intent.putExtra("JumlahBayar", JumlahBayar);
                        intent.putExtra("Hitung", Hitung);

                        startActivity(intent);


                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(),"Error Try Again !", Toast.LENGTH_SHORT);
                }

            }
        });


        //------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------

        cbtea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbtea.isChecked()){
                    cbtea.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    cbtea.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        //------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------
        cbtea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbtea.isChecked()) {
                    View a= findViewById(R.id.in1);
                    View a1= findViewById(R.id.dec1);
                    View a2= findViewById(R.id.quantity_teh);
                    a.setVisibility(View.VISIBLE);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);

                }else {

                    View a= findViewById(R.id.in1);
                    View a1= findViewById(R.id.dec1);
                    View a2= findViewById(R.id.quantity_teh);
                    a.setVisibility(View.GONE);
                    a1.setVisibility(View.GONE);
                    a2.setVisibility(View.GONE);
                    quantityT=0;
                    display1(0);
                }
            }
        });
        //------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------
        cbleci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbleci.isChecked()) {
                    View a= findViewById(R.id.in2);
                    View a1= findViewById(R.id.dec2);
                    View a2= findViewById(R.id.quantity_leci);
                    a.setVisibility(View.VISIBLE);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);

                }else {
                    View a= findViewById(R.id.in2);
                    View a1= findViewById(R.id.dec2);
                    View a2= findViewById(R.id.quantity_leci);
                    a.setVisibility(View.GONE);
                    a1.setVisibility(View.GONE);
                    a2.setVisibility(View.GONE);
                    quantityLc=0;
                    display2(0);
                }
            }
        });
        //------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------
        cblemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cblemon.isChecked()) {
                    View a= findViewById(R.id.in3);
                    View a1= findViewById(R.id.dec3);
                    View a2= findViewById(R.id.quantity_lemon);
                    a.setVisibility(View.VISIBLE);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);

                }else {
                    View a= findViewById(R.id.in3);
                    View a1= findViewById(R.id.dec3);
                    View a2= findViewById(R.id.quantity_lemon);
                    a.setVisibility(View.GONE);
                    a1.setVisibility(View.GONE);
                    a2.setVisibility(View.GONE);
                    quantityLm=0;
                    display3(0);
                }
            }
        });
        //------------------------------------------------------------------------
        cbmshake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbmshake.isChecked()) {
                    View a= findViewById(R.id.in4);
                    View a1= findViewById(R.id.dec4);
                    View a2= findViewById(R.id.quantity_shake);
                    a.setVisibility(View.VISIBLE);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);

                }else {
                    View a= findViewById(R.id.in4);
                    View a1= findViewById(R.id.dec4);
                    View a2= findViewById(R.id.quantity_shake);
                    a.setVisibility(View.GONE);
                    a1.setVisibility(View.GONE);
                    a2.setVisibility(View.GONE);
                    quantityMs=0;
                    display4(0);

                }
            }
        });
        //------------------------------------------------------------------------
        cbmineral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbmineral.isChecked()) {
                    View a= findViewById(R.id.in5);
                    View a1= findViewById(R.id.dec5);
                    View a2= findViewById(R.id.quantity_mineral);
                    a.setVisibility(View.VISIBLE);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);

                }else {
                    View a= findViewById(R.id.in5);
                    View a1= findViewById(R.id.dec5);
                    View a2= findViewById(R.id.quantity_mineral);
                    a.setVisibility(View.GONE);
                    a1.setVisibility(View.GONE);
                    a2.setVisibility(View.GONE);
                    quantitymin=0;
                    display5(0);
                }
            }
        });
        //------------------------------------------------------------------------
        cbmie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbmie.isChecked()) {
                    View a= findViewById(R.id.in6);
                    View a1= findViewById(R.id.dec6);
                    View a2= findViewById(R.id.quantity_mie);
                    a.setVisibility(View.VISIBLE);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);

                }else {
                    View a= findViewById(R.id.in6);
                    View a1= findViewById(R.id.dec6);
                    View a2= findViewById(R.id.quantity_mie);
                    a.setVisibility(View.GONE);
                    a1.setVisibility(View.GONE);
                    a2.setVisibility(View.GONE);
                    quantitymie=0;
                    display6(0);
                }
            }
        });
        //------------------------------------------------------------------------
        cbpangsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbpangsit.isChecked()) {
                    View a= findViewById(R.id.in7);
                    View a1= findViewById(R.id.dec7);
                    View a2= findViewById(R.id.quantity_pangsit);
                    a.setVisibility(View.VISIBLE);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);

                }else {
                    View a= findViewById(R.id.in7);
                    View a1= findViewById(R.id.dec7);
                    View a2= findViewById(R.id.quantity_pangsit);
                    a.setVisibility(View.GONE);
                    a1.setVisibility(View.GONE);
                    a2.setVisibility(View.GONE);
                    quantityPangsit=0;
                    display7(0);
                }
            }
        });
        //------------------------------------------------------------------------
        cbbaso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbbaso.isChecked()) {
                    View a= findViewById(R.id.in8);
                    View a1= findViewById(R.id.dec8);
                    View a2= findViewById(R.id.quantity_Bakso);
                    a.setVisibility(View.VISIBLE);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);

                }else {
                    View a= findViewById(R.id.in8);
                    View a1= findViewById(R.id.dec8);
                    View a2= findViewById(R.id.quantity_Bakso);
                    a.setVisibility(View.GONE);
                    a1.setVisibility(View.GONE);
                    a2.setVisibility(View.GONE);
                    quantityBaso=0;
                    display8(0);

                }
            }
        });
        //------------------------------------------------------------------------
        cbtelur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbtelur.isChecked()) {
                    View a= findViewById(R.id.in9);
                    View a1= findViewById(R.id.dec9);
                    View a2= findViewById(R.id.quantity_BaksoTelur);
                    a.setVisibility(View.VISIBLE);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);

                } else {
                    View a= findViewById(R.id.in9);
                    View a1= findViewById(R.id.dec9);
                    View a2= findViewById(R.id.quantity_BaksoTelur);
                    a.setVisibility(View.GONE);
                    a1.setVisibility(View.GONE);
                    a2.setVisibility(View.GONE);
                    quantityBTelur=0;
                    display9(0);
                }
            }
        });
        //------------------------------------------------------------------------
        cbanak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbanak.isChecked()) {
                    View a= findViewById(R.id.in10);
                    View a1= findViewById(R.id.dec10);
                    View a2= findViewById(R.id.quantity_BaksoBeranak);
                    a.setVisibility(View.VISIBLE);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);

                }else {
                    View a= findViewById(R.id.in10);
                    View a1= findViewById(R.id.dec10);
                    View a2= findViewById(R.id.quantity_BaksoBeranak);
                    a.setVisibility(View.GONE);
                    a1.setVisibility(View.GONE);
                    a2.setVisibility(View.GONE);
                    quantityAnak=0;
                    display10(0);
                }
            }
        });
        //------------------------------------------------------------------------

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= "";
                String w= "";
                String z= "";
                String x="";
                String u="";
                String k="";
                String l="";
                String zz = "";

                int bayar, pj, bay;
                a=quantityT * 15000;
                b=quantityLc * 25000;
                c=quantityLm * 25000;
                d=quantityMs * 45000;
                e=quantitymin * 5000;
                f=quantitymie * 35000;
                g=quantityPangsit * 45000;
                h=quantityBaso * 45000;
                i=quantityBTelur * 45000;
                j=quantityAnak * 90000;

                bayar = a + b + c + d + e + f + g + h + i + j;
                pj = (bayar/100)*10;
                bay = bayar + pj ;

                x = String.valueOf(bayar);
                k = String.valueOf(pj);
                l = String.valueOf(bay);
                zz = String.valueOf(bay);

                if (cbtea.isChecked()) {

                    s += "Iced Tea";
                    w += quantityT + "Pcs";
                    u += "Rp 15.000,-";
                    int har = a;
                    z += "Rp"+" "+har+",-" ;

                }


                if (cbleci.isChecked()) {
                    s += "\nLechi Tea";
                    w += "\n" + quantityLc+ "Pcs";
                    u += "\n" + "Rp 25.000,-";
                    int har = b;
                    z += "\n" +"Rp"+" "+har+",-" ;

                }

                if (cblemon.isChecked()) {
                    s += "\nLemone Tea";
                    w += "\n" + quantityLm + "Pcs";
                    u += "\n" + "Rp 25.000,-";
                    int har = c;
                    z += "\n" +"Rp"+" "+har+",-" ;

                }
                if (cbmshake.isChecked()) {
                    s += "\nMilk Shake";
                    w += "\n" + quantityMs + "Pcs";
                    u += "\n" + "Rp 45.000,-";
                    int har = d;
                    z += "\n" +"Rp"+" "+har+",-" ;

                }
                if (cbmineral.isChecked()) {
                    s += "\nMineral Water";
                    w += "\n" + quantitymin +"Pcs";
                    u += "\n" + "Rp 5.000,-";
                    int har = e;
                    z += "\n"+"Rp"+ " "+ har+",-";

                }
                if (cbmie.isChecked()) {
                    s += "\nChicken Noddle";
                    w += "\n" + quantitymie +"Pcs";
                    u += "\n" + "Rp 35.000,-";
                    int har = f;
                    z += "\n" +"Rp"+" "+har+",-" ;

                }
                if (cbpangsit.isChecked()) {
                    s += "\nPangsit Noddle";
                    w += "\n" + quantityPangsit +"Pcs";
                    u += "\n" + "Rp 45.000,-";
                    int har = g;
                    z += "\n" +"Rp"+" "+har+",-" ;

                }
                if (cbbaso.isChecked()) {
                    s += "\nMeatBall";
                    w += "\n" + quantityBaso +"Pcs";
                    u += "\n" + "Rp 45.000,-";
                    int har = h;
                    z += "\n" +"Rp"+" "+har+",-" ;

                }
                if (cbtelur.isChecked()) {
                    s += "\nEgg MeatBall";
                    w += "\n" + quantityBTelur +"Pcs";
                    u += "\n" + "Rp 45.000,-";
                    int har = i;
                    z += "\n" +"Rp"+" "+har+",-" ;

                }
                if (cbanak.isChecked()) {
                    s += "\nMineral Water";
                    w += "\n" + quantityAnak + "Pcs";
                    u += "\n" + "Rp 90.000,-";
                    int har = j;
                    z += "\n" +"Rp"+" "+har+",-" ;



                }


                pesan.setText(s);
                qy.setText(w);
                price.setText(u);
                totalh.setText(z);
                jumbay.setText("Rp"+" "+x+",-");
                pjk.setText("Rp"+" "+k+",-");
                tohar.setText("Rp"+" "+l+",-");
                hitung.setText(zz);





            }


        });

    }









    //--------------------------------------------------------------------------------------------------

    


            public void display1(int number){
        TextView quantityTTextView = findViewById(R.id.quantity_teh);
        quantityTTextView.setText("" + number);

    }
    public void increment1(View view){//printah Tombol tambah
        if (quantityT == 100){
            Toast.makeText(this,"pesanan maksimal 100pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityT = quantityT+1;
        display1(quantityT);
    }

    public void decrement1(View view){//printah Tombol tambah
        if (quantityT == 0){
            Toast.makeText(this,"pesanan minimal 1 pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityT = quantityT-1;
        display1(quantityT);
    }



    //--------------------------------------------------------------------------------------------------
    public void display2(int number){
        TextView quantityLcTextView = findViewById(R.id.quantity_leci);
        quantityLcTextView.setText("" + number);
    }
    public void increment2(View view){//printah Tombol tambah
        if (quantityLc == 100){
            Toast.makeText(this,"pesanan maksimal 100pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityLc = quantityLc+1;
        display2(quantityLc);
    }

    public void decrement2(View view){//printah Tombol tambah
        if (quantityLc == 0){
            Toast.makeText(this,"pesanan minimal 1 pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityLc = quantityLc-1;
        display2(quantityLc);
    }
    //--------------------------------------------------------------------------------------------------
    public void display3(int number){
        TextView quantityLmTextView = findViewById(R.id.quantity_lemon);
        quantityLmTextView.setText("" + number);
    }
    public void increment3(View view){//printah Tombol tambah
        if (quantityLm == 100){
            Toast.makeText(this,"pesanan maksimal 100pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityLm = quantityLm+1;
        display3(quantityLm);
    }

    public void decrement3(View view){//printah Tombol tambah
        if (quantityLm == 0){
            Toast.makeText(this,"pesanan minimal 1 pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityLm = quantityLm-1;
        display3(quantityLm);
    }
    //--------------------------------------------------------------------------------------------------
    public void display4 (int number){
        TextView quantityMsTextView = findViewById(R.id.quantity_shake);
        quantityMsTextView.setText("" + number);
    }
    public void increment4(View view){//printah Tombol tambah
        if (quantityMs == 100){
            Toast.makeText(this,"pesanan maksimal 100pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityMs = quantityMs+1;
        display4(quantityMs);
    }

    public void decrement4(View view){//printah Tombol tambah
        if (quantityMs == 0){
            Toast.makeText(this,"pesanan minimal 1 pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityMs = quantityMs-1;
        display4(quantityMs);
    }
    //--------------------------------------------------------------------------------------------------
    public void display5(int number){
        TextView quantityMinTextView = findViewById(R.id.quantity_mineral);
        quantityMinTextView.setText("" + number);
    }
    public void increment5(View view){//printah Tombol tambah
        if (quantitymin == 100){
            Toast.makeText(this,"pesanan maksimal 100pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantitymin = quantitymin+1;
        display5(quantitymin);
    }

    public void decrement5(View view){//printah Tombol tambah
        if (quantitymin == 0){
            Toast.makeText(this,"pesanan minimal 1 pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantitymin = quantitymin-1;
        display5(quantitymin);
    }
    //--------------------------------------------------------------------------------------------------
    public void display6(int number){
        TextView quantitymieTextView = findViewById(R.id.quantity_mie);
        quantitymieTextView.setText("" + number);
    }
    public void increment6(View view){//printah Tombol tambah
        if (quantitymie == 100){
            Toast.makeText(this,"pesanan maksimal 100pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantitymie = quantitymie+1;
        display6(quantitymie);
    }

    public void decrement6(View view){//printah Tombol tambah
        if (quantitymie == 0){
            Toast.makeText(this,"pesanan minimal 1 pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantitymie = quantitymie-1;
        display6(quantitymie);
    }
    //--------------------------------------------------------------------------------------------------
    public void display7(int number){
        TextView quantitypangTextView = findViewById(R.id.quantity_pangsit);
        quantitypangTextView.setText("" + number);
    }
    public void increment7(View view){//printah Tombol tambah
        if (quantityPangsit == 100){
            Toast.makeText(this,"pesanan maksimal 100pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityPangsit = quantityPangsit+1;
        display7(quantityPangsit);
    }

    public void decrement7(View view){//printah Tombol tambah
        if (quantityPangsit == 0){
            Toast.makeText(this,"pesanan minimal 1 pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityPangsit = quantityPangsit-1;
        display7(quantityPangsit);
    }
    //--------------------------------------------------------------------------------------------------
    public void display8(int number){
        TextView quantityBakTextView = findViewById(R.id.quantity_Bakso);
        quantityBakTextView.setText("" + number);
    }
    public void increment8(View view){//printah Tombol tambah
        if (quantityBaso == 100){
            Toast.makeText(this,"pesanan maksimal 100pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityBaso = quantityBaso+1;
        display8(quantityBaso);
    }

    public void decrement8(View view){//printah Tombol tambah
        if (quantityBaso == 0){
            Toast.makeText(this,"pesanan minimal 1 pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityBaso = quantityBaso-1;
        display8(quantityBaso);
    }
    //--------------------------------------------------------------------------------------------------
    public void display9(int number){
        TextView quantitybtTextView = findViewById(R.id.quantity_BaksoTelur);
        quantitybtTextView.setText("" + number);
    }
    public void increment9(View view){//printah Tombol tambah
        if (quantityBTelur == 100){
            Toast.makeText(this,"pesanan maksimal 100pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityBTelur = quantityBTelur+1;
        display9(quantityBTelur);
    }

    public void decrement9(View view){//printah Tombol tambah
        if (quantityBTelur == 0){
            Toast.makeText(this,"pesanan minimal 1 pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityBTelur = quantityBTelur-1;
        display9(quantityBTelur);
    }
    //--------------------------------------------------------------------------------------------------
    public void display10(int number){
        TextView quantityanTextView = findViewById(R.id.quantity_BaksoBeranak);
        quantityanTextView.setText("" + number);
    }
    public void increment10(View view){//printah Tombol tambah
        if (quantityAnak == 100){
            Toast.makeText(this,"pesanan maksimal 100pcs",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityAnak = quantityAnak+1;
        display10(quantityAnak);
    }

    public void decrement10(View view){//printah Tombol tambah
        if (quantityAnak == 0){
            Toast.makeText(this,"pesanan minimal 1 pcs",Toast.LENGTH_SHORT).show();
            return;

        }



        quantityAnak = quantityAnak-1;
        display10(quantityAnak);
    }

//--------------------------------------------------------------------------------------------------

}