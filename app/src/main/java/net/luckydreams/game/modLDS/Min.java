package net.luckydreams.game.modLDS;

import static net.luckydreams.game.actLDS.SlotActivityLDS.*;

import android.widget.TextView;

import net.luckydreams.game.ldsadditional.SaveLDS;


public class Min {

    public void min(TextView textViewSco, TextView textViewBe){

        if (be == 0|| be<0){
            SaveLDS.saveBetLDS(0);
        }else {
            be -=200;
            sc +=200;
            SaveLDS.saveBetLDS(be);
            textViewSco.setText("Score: "+ sc);
            textViewBe.setText("Bet : " + be);
        }
    }
}
