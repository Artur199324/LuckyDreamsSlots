package net.luckydreams.game.ldsadditional;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import net.luckydreams.game.R;
import net.luckydreams.game.actLDS.SlotActivityLDS;
import net.luckydreams.game.actLDS.StartActivityLDS;
import net.luckydreams.game.actLDS.WheelActivityLDS;

import java.util.ArrayList;

public class Ini {

    public static ArrayList<ImageView> inImg(SlotActivityLDS mainActivity ){
        mainActivity.im1 = mainActivity.findViewById(R.id.imm1);
        mainActivity.im2 = mainActivity.findViewById(R.id.imm4);
        mainActivity.im3 = mainActivity.findViewById(R.id.imm7);
        mainActivity.im4 = mainActivity.findViewById(R.id.imm2);
        mainActivity.im5 = mainActivity.findViewById(R.id.imm5);
        mainActivity.im6 = mainActivity.findViewById(R.id.imm8);
        mainActivity.im7 = mainActivity.findViewById(R.id.imm3);
        mainActivity.im8 = mainActivity.findViewById(R.id.imm6);
        mainActivity.im9 = mainActivity.findViewById(R.id.imm9);
        ArrayList<ImageView> arrayListim = new ArrayList<>();
        arrayListim.add(mainActivity.im1);
        arrayListim.add(mainActivity.im2);
        arrayListim.add(mainActivity.im3);
        arrayListim.add(mainActivity.im4);
        arrayListim.add(mainActivity.im5);
        arrayListim.add(mainActivity.im6);
        arrayListim.add(mainActivity.im7);
        arrayListim.add(mainActivity.im8);
        arrayListim.add(mainActivity.im9);
        return arrayListim;
    }

    public static void inBU(SlotActivityLDS mainActivity){
        mainActivity.buttonPlay = mainActivity.findViewById(R.id.buttonPlay);
        mainActivity.buttonpla = mainActivity.findViewById(R.id.buttonpla);
        mainActivity.buttonmin = mainActivity.findViewById(R.id.buttonmin);
        mainActivity.buttonMax = mainActivity.findViewById(R.id.buttonMax);
        mainActivity.buttonBa = mainActivity.findViewById(R.id.buttonBa);
    }

    public static void inTex(SlotActivityLDS mainActivity){
        mainActivity.textViewSco = mainActivity.findViewById(R.id.textViewSco);
        mainActivity.textViewBe = mainActivity.findViewById(R.id.textViewBe);
        mainActivity.textViewWi = mainActivity.findViewById(R.id.textViewWi);
        mainActivity.textViewLS = mainActivity.findViewById(R.id.textViewLS);
        mainActivity.textViewSco.setText("Score: "+SaveLDS.getScoreLDS());
        mainActivity.textViewBe.setText("Bet : "+SaveLDS.getBetLDS());
        mainActivity.textViewMB = mainActivity.findViewById(R.id.textViewMB);
    }

    public static void inPoi(SlotActivityLDS mainActivity){
        mainActivity.imageViewPoi = mainActivity.findViewById(R.id.imageViewPoi);
        mainActivity.textViewRP = mainActivity.findViewById(R.id.textViewRP);
        mainActivity.buttonPoi = mainActivity.findViewById(R.id.buttonPoi);
        mainActivity.buttonMen = mainActivity.findViewById(R.id.buttonMen);
    }

    public static void inST(StartActivityLDS startActivityLDS){
        startActivityLDS.textViewSSSS = startActivityLDS.findViewById(R.id.textViewSSSS);
        startActivityLDS.buttonSG = startActivityLDS.findViewById(R.id.buttonSG);
        startActivityLDS.buttonSW = startActivityLDS.findViewById(R.id.buttonSW);
        startActivityLDS.buttonSE = startActivityLDS.findViewById(R.id.buttonSE);
        startActivityLDS.textViewSSSS.setText("Score: "+SaveLDS.getScoreLDS());
        startActivityLDS.buttonSG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityLDS.startActivity(new Intent(startActivityLDS.getApplicationContext(),SlotActivityLDS.class));
                startActivityLDS.finishAffinity();
            }
        });

        startActivityLDS.buttonSW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityLDS.startActivity(new Intent(startActivityLDS.getApplicationContext(),WheelActivityLDS.class));
                startActivityLDS.finishAffinity();
            }
        });

        startActivityLDS.buttonSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityLDS.finishAffinity();
            }
        });

    }

    public static void inWe(WheelActivityLDS wheelActivityLDS){
        wheelActivityLDS.textViewSSWW = wheelActivityLDS.findViewById(R.id.textViewSSWW);
        wheelActivityLDS.textViewSSWW.setText("Score: "+SaveLDS.getScoreLDS());
        wheelActivityLDS.imageViewWhel = wheelActivityLDS.findViewById(R.id.imageViewWhel);
        wheelActivityLDS.buttonPlW = wheelActivityLDS.findViewById(R.id.buttonPlW);
        wheelActivityLDS.buttonBEW = wheelActivityLDS.findViewById(R.id.buttonBEW);
        wheelActivityLDS.textViewWIWH = wheelActivityLDS.findViewById(R.id.textViewWIWH);

    }
}
