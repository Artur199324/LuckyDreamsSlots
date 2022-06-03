package net.luckydreams.game.actLDS;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import net.luckydreams.game.R;
import net.luckydreams.game.ldsadditional.Ini;
import net.luckydreams.game.ldsadditional.SaveLDS;
import net.luckydreams.game.viewLDS.ViewLDS;

public class StartActivityLDS extends AppCompatActivity {
   public static ViewLDS viewLDS;
    public TextView textViewSSSS;
    public Button buttonSG,buttonSW,buttonSE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_lds);
        SaveLDS.activity = this;
        Ini.inST(this);
        getWindow().addFlags(1024);
        viewLDS =  new ViewModelProvider.AndroidViewModelFactory(getApplication()).create(ViewLDS.class);
    }
}