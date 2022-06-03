package net.luckydreams.game.actLDS;

import static net.luckydreams.game.actLDS.StartActivityLDS.viewLDS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import net.luckydreams.game.R;
import net.luckydreams.game.ldsadditional.Ini;

public class WheelActivityLDS extends AppCompatActivity {

    public TextView textViewSSWW,textViewWIWH;
    public ImageView imageViewWhel;
    public Button buttonPlW,buttonBEW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheel_lds);

        Ini.inWe(this);
        getWindow().addFlags(1024);
        buttonBEW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplication(),StartActivityLDS.class));
                finishAffinity();
            }
        });

        buttonPlW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewLDS.moveWhelMovLDS(imageViewWhel,WheelActivityLDS.this);
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplication(),StartActivityLDS.class));
        finishAffinity();
    }
}