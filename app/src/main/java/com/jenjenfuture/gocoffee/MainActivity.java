package com.jenjenfuture.gocoffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quantitycheese=1;
    int quantityegg=1;
    int quantitysalada=1;
    int quantitymeat=1;
    int hargakeju=5000;
    int hargatelor=6000;
    int hargaselada=3000;
    int hargameat=8000;
    int total=0;
    private Button buttonresult;
    private TextView totalharga;
    private TextView ket;
    private EditText nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonresult= findViewById(R.id.order);
        totalharga=findViewById(R.id.total);
        ket=findViewById(R.id.ket);
        nama=findViewById(R.id.nama);
        buttonresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total= hargakeju+hargameat+hargaselada+hargatelor;
                boolean error = false;
                if (nama.getText().toString().equals(""))
                {
                    error = true;
                    nama.setError("This field may not be empty");
                }
                if (!error) {
                    totalharga.setText(String.valueOf(total));
                    ket.setText("Terima Kasih " + nama.getText().toString() + " , telah berbelanja di Go! Burger");
                }
            }
        });
    }

    public void incrementcheese(View view){//perintah tombol tambah
        if(quantitycheese==5){
            Toast.makeText(this,"pesanan maximal 5",Toast.LENGTH_SHORT).show();
            return;
        }
        quantitycheese = quantitycheese+1 ;
        hargakeju=hargakeju+5000;
        displaycheese(quantitycheese,hargakeju);

    }
    public void decrementcheese(View view){//perintah tombol tambah
        if (quantitycheese==0){
            Toast.makeText(this,"pesanan minimal 0",Toast.LENGTH_SHORT).show();
            return;
        }
        quantitycheese = quantitycheese -1;
        hargakeju=hargakeju-5000;
        displaycheese(quantitycheese,hargakeju);
    }
    private void displaycheese(int number1,int number2) {
        TextView jumlahKeju = (TextView) findViewById(R.id.jumlahkeju);
        TextView hargakeju = (TextView) findViewById(R.id.hargakeju);
        jumlahKeju.setText("" + number1);
        hargakeju.setText(""+number2);
    }

    public void incrementegg(View view){//perintah tombol tambah
        if(quantityegg==5){
            Toast.makeText(this,"pesanan maximal 5",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityegg = quantityegg+1 ;
        hargatelor=hargatelor+6000;
        displayegg(quantityegg,hargatelor);

    }
    public void decrementegg(View view){//perintah tombol tambah
        if (quantityegg==0){
            Toast.makeText(this,"pesanan minimal 0",Toast.LENGTH_SHORT).show();
            return;
        }
        quantityegg = quantityegg -1;
        hargatelor=hargatelor-6000;
        displayegg(quantityegg,hargatelor);
    }
    private void displayegg(int number1,int number2) {
        TextView jumlahegg = (TextView) findViewById(R.id.jumlahtelor);
        TextView hargaegg = (TextView) findViewById(R.id.hargatelor);
        jumlahegg.setText("" + number1);
        hargaegg.setText(""+number2);
    }

    public void incrementsalada(View view){//perintah tombol tambah
        if(quantitysalada==5){
            Toast.makeText(this,"pesanan maximal 5",Toast.LENGTH_SHORT).show();
            return;
        }
        quantitysalada = quantitysalada+1 ;
        hargaselada=hargaselada+3000;
        displaysalada(quantitysalada,hargaselada);

    }
    public void decrementsalada(View view){//perintah tombol tambah
        if (quantitysalada==0){
            Toast.makeText(this,"pesanan minimal 0",Toast.LENGTH_SHORT).show();
            return;
        }
        quantitysalada = quantitysalada -1;
        hargaselada=hargaselada-3000;
        displaysalada(quantitysalada,hargaselada);
    }
    private void displaysalada(int number1,int number2) {
        TextView jumlahsalada = (TextView) findViewById(R.id.jumlahsalada);
        TextView hargasalada = (TextView) findViewById(R.id.hargasalada);
        jumlahsalada.setText("" + number1);
        hargasalada.setText(""+number2);
    }

    public void incrementmeat(View view){//perintah tombol tambah
        if(quantitymeat==5){
            Toast.makeText(this,"pesanan maximal 5",Toast.LENGTH_SHORT).show();
            return;
        }
        quantitymeat = quantitymeat+1 ;
        hargameat=hargameat+8000;
        displaymeat(quantitymeat,hargameat);

    }
    public void decrementmeat(View view){//perintah tombol tambah
        if (quantitymeat==0){
            Toast.makeText(this,"pesanan minimal 0",Toast.LENGTH_SHORT).show();
            return;
        }
        quantitymeat = quantitymeat -1;
        hargameat=hargameat-8000;
        displaymeat(quantitymeat,hargameat);
    }
    private void displaymeat(int number1,int number2) {
        TextView jumlahmeat = (TextView) findViewById(R.id.jumlahbeef);
        TextView hargameat = (TextView) findViewById(R.id.hargabeef);
        jumlahmeat.setText("" + number1);
        hargameat.setText(""+number2);
    }






}
