package net.luckydreams.game.modLDS;

import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import net.luckydreams.game.actLDS.WheelActivityLDS;

import java.util.Random;

public class WhelMovLDS {

    Random random;
    int old = 0;
    int dd = 0;

    public void whelM(ImageView imageView, WheelActivityLDS wheelActivityLDS) {
        random = new Random();
        old = dd % 360;
        dd = random.nextInt(3600) + 720;

        RotateAnimation rotateAnimation =
                new RotateAnimation(old, dd, RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(3600);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new DecelerateInterpolator());
        rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                WhelRESLDS.whelRES(wheelActivityLDS, 360 - (dd % 360));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        imageView.startAnimation(rotateAnimation);
    }
}
