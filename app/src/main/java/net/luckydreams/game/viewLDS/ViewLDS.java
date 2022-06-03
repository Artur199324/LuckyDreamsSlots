package net.luckydreams.game.viewLDS;

import android.app.Application;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import net.luckydreams.game.actLDS.SlotActivityLDS;
import net.luckydreams.game.actLDS.WheelActivityLDS;
import net.luckydreams.game.modLDS.Max;
import net.luckydreams.game.modLDS.Min;
import net.luckydreams.game.modLDS.Pla;
import net.luckydreams.game.modLDS.SlotMovLDS;
import net.luckydreams.game.modLDS.WhelMovLDS;

import java.util.ArrayList;

public class ViewLDS extends AndroidViewModel {
    SlotMovLDS slotMovLDS;
    Pla pla;
    Min min;
    Max max;
    WhelMovLDS whelMovLDS;

    public ViewLDS(@NonNull Application application) {
        super(application);
        slotMovLDS = new SlotMovLDS();
        pla = new Pla();
        min = new Min();
        max = new Max();
        whelMovLDS = new WhelMovLDS();
    }

    public void moveWhelMovLDS(ImageView imageView, WheelActivityLDS wheelActivityLDS){

        whelMovLDS.whelM(imageView,wheelActivityLDS);
    }

    public void sloMow(ArrayList<ImageView> arrayList, SlotActivityLDS mainActivity) {
        slotMovLDS.setMainActivity(mainActivity);
        slotMovLDS.setArrayListIMg(arrayList);
        slotMovLDS.moveSlotLDS();
    }

    public void plaLDS(TextView textViewSco, TextView textViewBe) {
        pla.pla(textViewSco, textViewBe);
    }

    public void minLDS(TextView textViewSco, TextView textViewBe){
        min.min(textViewSco,textViewBe);
    }

    public void maxLDS(TextView textViewSco, TextView textViewBe){
        max.max(textViewSco,textViewBe);
    }
}

