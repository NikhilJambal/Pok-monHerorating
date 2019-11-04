package com.example.heroratingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//import com.daimajia.androidanimations.library.Techniques;
//import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    TextView   t1,t2;
    ImageView  img1;
    Button     b1;
    RatingBar  R1;
    String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.titlerate);
        t2=findViewById(R.id.result);
        img1=findViewById(R.id.charplace);

        b1=findViewById(R.id.b1);
        R1=findViewById(R.id.ratestar);


        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new  Intent(getBaseContext(),Gamemenu.class);
                startActivity(intent);


            }
        });


        R1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                answer=String.valueOf((int)(R1.getRating()));
                if(answer.equals("1"))
                {
                    img1.setImageResource(R.drawable.one);
                    /*YoYo.with(Techniques.FadeInDown)
                            .duration(500)
                            .repeat(0)
                            .playOn(img1);*/

                    t2.setText("ohh ho...");
                }


                else if (answer.equals("2"))
                {
                    img1.setImageResource(R.drawable.two);
                    t2.setText("Not Bad");
                }



                else if (answer.equals("3"))
                {
                    img1.setImageResource(R.drawable.three);
                    t2.setText("Good");
                }




                else if (answer.equals("4"))
                {
                    img1.setImageResource(R.drawable.four);
                    t2.setText("Very Good");
                }




                else if (answer.equals("5"))
                {
                    img1.setImageResource(R.drawable.five);

                    t2.setText("Awesome");
                }




            }
        });    }



}
