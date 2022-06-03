package net.luckydreams.game.actLDS;

import static net.luckydreams.game.actLDS.StartActivityLDS.viewLDS;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import net.luckydreams.game.R;
import net.luckydreams.game.ldsadditional.Ini;
import net.luckydreams.game.ldsadditional.SaveLDS;
import net.luckydreams.game.viewLDS.ViewLDS;

import java.util.ArrayList;

public class SlotActivityLDS extends AppCompatActivity {

    public ImageView im1, im2, im3, im4, im5, im6, im7, im8, im9, imageViewPoi;
    public Button buttonPlay;

    public TextView textViewSco, textViewBe, textViewWi, textViewMB, textViewLS, textViewRP;
    public Button buttonpla, buttonmin, buttonMax, buttonBa, buttonPoi, buttonMen;
    public static int sc;
    public static int be = 0;
    boolean fff = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(1024);

        ArrayList<ImageView> arrayList = Ini.inImg(this);
        Ini.inBU(this);
        Ini.inTex(this);
        Ini.inPoi(this);
        bbb();
        sc = SaveLDS.getScoreLDS();
        be = SaveLDS.getBetLDS();
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewWi.setText("Win : 0");
                SaveLDS.saveScoreLDS(sc);
                if (SaveLDS.getBetLDS() == 0) {
                    textViewMB.setVisibility(View.VISIBLE);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            textViewMB.setVisibility(View.INVISIBLE);
                        }
                    }, 1000);

                } else {
                    if (!fff) {
                        sc -= SaveLDS.getBetLDS();
                        textViewSco.setText("Score: " + sc);
                    } else {
                        fff = false;
                    }
                    viewLDS.sloMow(arrayList, SlotActivityLDS.this);

                }

            }
        });
    }

    public void bbb() {
        buttonpla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewLDS.plaLDS(textViewSco, textViewBe);
                fff = true;
            }
        });

        buttonmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewLDS.minLDS(textViewSco, textViewBe);
                fff = true;
            }
        });

        buttonMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewLDS.maxLDS(textViewSco, textViewBe);
                fff = true;
            }
        });


        buttonBa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplication(),StartActivityLDS.class));
                finishAffinity();
            }
        });

        if (SaveLDS.getScoreLDS() == 0){
            poiLDS();
        }
    }


    public void poiLDS() {
        imageViewPoi.setVisibility(View.VISIBLE);
        textViewRP.setVisibility(View.VISIBLE);
        buttonPoi.setVisibility(View.VISIBLE);
        buttonMen.setVisibility(View.VISIBLE);

        buttonPoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),WheelActivityLDS.class));
                finishAffinity();
            }
        });

        buttonMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplication(),StartActivityLDS.class));
                finishAffinity();
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplication(),StartActivityLDS.class));
        finishAffinity();
    }
}