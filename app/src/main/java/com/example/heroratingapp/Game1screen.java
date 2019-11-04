package com.example.heroratingapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Game1screen extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1screen);

        button=findViewById(R.id.btn_gamelist);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {

                    FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Pokselect p1=new Pokselect();
                fragmentTransaction.replace(R.id.my_gamelistLayout,p1);
                fragmentTransaction.commit();
            }
        });

        /* The Phone is in portrait mode
        if (findViewById(R.id.layout_portrait) != null) {
            FragmentManager manager = this.getSupportFragmentManager();

            manager.beginTransaction()
                    .hide(manager.findFragmentById(R.id.fragment3))
                    .show(manager.findFragmentById(R.id.fragment2))
                    .commit();
        }

        /// the phone is in landscape mode
        if (findViewById(R.id.layout_land) != null) {
            FragmentManager manager = this.getSupportFragmentManager();

            manager.beginTransaction()
                    .show(manager.findFragmentById(R.id.fragment2))
                    .show(manager.findFragmentById(R.id.fragment3))
                    .commit();

        }*/







    }
}


