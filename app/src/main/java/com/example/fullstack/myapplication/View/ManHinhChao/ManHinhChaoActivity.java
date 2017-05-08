package com.example.fullstack.myapplication.View.ManHinhChao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.fullstack.myapplication.R;
import com.example.fullstack.myapplication.View.TrangChu.TrangChuActivity;


/**
 * Created by Lenovo S410p on 6/2/2016.
 */
public class ManHinhChaoActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinhchao_layout);

        setSupportActionBar(toolbar);

         Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(2000);
                }catch (Exception e){

                }finally {
                    Intent iTrangChu = new Intent(ManHinhChaoActivity.this, TrangChuActivity.class);
                    startActivity(iTrangChu);
                }
            }
        });

        thread.start();
    }
}
