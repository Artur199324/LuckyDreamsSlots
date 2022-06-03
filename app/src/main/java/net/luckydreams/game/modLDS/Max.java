package net.luckydreams.game.modLDS;

import static net.luckydreams.game.actLDS.SlotActivityLDS.be;
import static net.luckydreams.game.actLDS.SlotActivityLDS.sc;

import android.widget.TextView;

import net.luckydreams.game.ldsadditional.SaveLDS;

public class Max {

    public void max(TextView textViewSco, TextView textViewBe) {
        if (SaveLDS.getScoreLDS() == 0 || SaveLDS.getScoreLDS() < 0) {
            SaveLDS.saveBetLDS(0);

        } else {

            be = SaveLDS.getScoreLDS();
            sc = 0;
            SaveLDS.saveBetLDS(be);
            textViewSco.setText("Score: " + sc);
            textViewBe.setText("Bet : " + be);
        }
    }
}
