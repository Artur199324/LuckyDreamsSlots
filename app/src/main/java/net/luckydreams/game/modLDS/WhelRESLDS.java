package net.luckydreams.game.modLDS;

import net.luckydreams.game.actLDS.WheelActivityLDS;
import net.luckydreams.game.ldsadditional.SaveLDS;

public class WhelRESLDS {

    private static int[] ooo = {200, 1000, 10000, 50000, 4000, 2000, 400, 0};
    private static float fff = 22.5f;

    public static void whelRES(WheelActivityLDS wheelActivityLDS, int dd) {

        int fx = 1;
        int fy = 3;

        for (int i = 0; i < 8; i++) {
            if (dd >= (fff * fx) && dd < (fff * fy)) {
                wheelActivityLDS.textViewWIWH.setText("Win : " + ooo[i]);
                int fgd = SaveLDS.getScoreLDS();
                fgd += ooo[i];
                SaveLDS.saveScoreLDS(fgd);
                wheelActivityLDS.textViewSSWW.setText("Score: " + fgd);
            }

            fy += 2;
            fx += 2;
        }

        if (dd >= (fff * 73) && dd < 360 || dd >= 0 && dd < (fff * 1)) {
            wheelActivityLDS.textViewWIWH.setText("Win : " + ooo[ooo.length - 1]);
        }

    }
}
