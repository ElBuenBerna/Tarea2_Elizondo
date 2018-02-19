package com.iteso.tarea2_elizondo;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class ActivityMain extends AppCompatActivity {


    static int button = 0;
    static boolean cart = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton likeButton = (ImageButton) findViewById(R.id.activity_main_like);
        final Button b1 = (Button) findViewById(R.id.activity_main_small);
        final Button b2 = (Button) findViewById(R.id.activity_main_medium);
        final Button b3 = (Button) findViewById(R.id.activity_main_large);
        final Button b4 = (Button) findViewById(R.id.activity_main_elarge);
        final Button cartB = (Button) findViewById(R.id.activity_main_addToCart);
        if(cart == true){
            cartB.setText(R.string.addedToCart);
        }

        switch(button){
            case 1:
                b1.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                b1.setTextColor(getResources().getColor(R.color.white));
                b2.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b2.setTextColor(getResources().getColor(R.color.colorPrimary));
                b3.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b3.setTextColor(getResources().getColor(R.color.colorPrimary));
                b4.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b4.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;
            case 2:
                b1.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b1.setTextColor(getResources().getColor(R.color.colorPrimary));
                b2.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                b2.setTextColor(getResources().getColor(R.color.white));
                b3.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b3.setTextColor(getResources().getColor(R.color.colorPrimary));
                b4.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b4.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;
            case 3:
                b1.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b1.setTextColor(getResources().getColor(R.color.colorPrimary));
                b2.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b2.setTextColor(getResources().getColor(R.color.colorPrimary));
                b3.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                b3.setTextColor(getResources().getColor(R.color.white));
                b4.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b4.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;
            case 4:
                b1.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b1.setTextColor(getResources().getColor(R.color.colorPrimary));
                b2.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b2.setTextColor(getResources().getColor(R.color.colorPrimary));
                b3.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b3.setTextColor(getResources().getColor(R.color.colorPrimary));
                b4.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                b4.setTextColor(getResources().getColor(R.color.white));
                break;
            default:
                break;
        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                b1.setTextColor(getResources().getColor(R.color.white));
                b2.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b2.setTextColor(getResources().getColor(R.color.colorPrimary));
                b3.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b3.setTextColor(getResources().getColor(R.color.colorPrimary));
                b4.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b4.setTextColor(getResources().getColor(R.color.colorPrimary));
                button = 1;


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b1.setTextColor(getResources().getColor(R.color.colorPrimary));
                b2.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                b2.setTextColor(getResources().getColor(R.color.white));
                b3.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b3.setTextColor(getResources().getColor(R.color.colorPrimary));
                b4.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b4.setTextColor(getResources().getColor(R.color.colorPrimary));
                button = 2;
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b1.setTextColor(getResources().getColor(R.color.colorPrimary));
                b2.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b2.setTextColor(getResources().getColor(R.color.colorPrimary));
                b3.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                b3.setTextColor(getResources().getColor(R.color.white));
                b4.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b4.setTextColor(getResources().getColor(R.color.colorPrimary));
                button = 3;
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b1.setTextColor(getResources().getColor(R.color.colorPrimary));
                b2.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b2.setTextColor(getResources().getColor(R.color.colorPrimary));
                b3.setBackground(getResources().getDrawable(R.drawable.button_sizes));
                b3.setTextColor(getResources().getColor(R.color.colorPrimary));
                b4.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                b4.setTextColor(getResources().getColor(R.color.white));
                button = 4;
            }
        });
        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast likeToast = Toast.makeText(getApplicationContext(), R.string.toast_plusone, Toast.LENGTH_SHORT);
                likeToast.show();
            }
        });

        cartB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cart == true) {
                    Toast.makeText(ActivityMain.this, R.string.itemAlreadyAdded, Toast.LENGTH_LONG).show();
                } else {
                    cart = true;
                    cartB.setText(R.string.addedToCart);
                    Snackbar.make(view, R.string.addedToCart, Snackbar.LENGTH_INDEFINITE)
                            .setAction("UNDO", new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    cart = false;
                                    cartB.setText(R.string.addToCart);
                                }
                            })
                            .show();


                }
            }
        });









    }


}
