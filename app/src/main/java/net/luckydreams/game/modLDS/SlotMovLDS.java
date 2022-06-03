package net.luckydreams.game.modLDS;

import static net.luckydreams.game.actLDS.SlotActivityLDS.be;
import static net.luckydreams.game.actLDS.SlotActivityLDS.sc;

import android.content.Context;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.widget.ImageView;

import net.luckydreams.game.R;
import net.luckydreams.game.actLDS.SlotActivityLDS;
import net.luckydreams.game.ldsadditional.SaveLDS;

import java.util.ArrayList;
import java.util.Random;

public class SlotMovLDS {

    Random random;
    int r0;
    int r1;
    int r2;
    int r3;
    int r4;
    int wwwin = 0;
    ArrayList<ImageView> arrayListIMg;

    public ArrayList<ImageView> getArrayListIMg() {
        return arrayListIMg;
    }

    public void setArrayListIMg(ArrayList<ImageView> arrayListIMg) {
        this.arrayListIMg = arrayListIMg;
    }

    public void moveSlotLDS() {
        random = new Random();

        wwwin = 0;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 0;

        new CountDownTimer(1200, 5) {

            @Override
            public void onTick(long l) {
                int aaa = random.nextInt(5);
                int bbb = random.nextInt(5);
                int ccc = random.nextInt(5);
                if (aaa == 0) {
                    arrayListIMg.get(0).setImageResource(R.drawable.vvv1);
                    arrayListIMg.get(0).setTag(1);
                }

                if (aaa == 1) {
                    arrayListIMg.get(0).setImageResource(R.drawable.vvv2);
                    arrayListIMg.get(0).setTag(2);
                }
                if (aaa == 2) {
                    arrayListIMg.get(0).setImageResource(R.drawable.vvv3);
                    arrayListIMg.get(0).setTag(3);
                }
                if (aaa == 3) {
                    arrayListIMg.get(0).setImageResource(R.drawable.vvv4);
                    arrayListIMg.get(0).setTag(4);
                }
                if (aaa == 4) {
                    arrayListIMg.get(0).setImageResource(R.drawable.vvv5);
                    arrayListIMg.get(0).setTag(5);
                }


                if (bbb == 0) {
                    arrayListIMg.get(1).setImageResource(R.drawable.vvv1);
                    arrayListIMg.get(1).setTag(1);
                }

                if (bbb == 1) {
                    arrayListIMg.get(1).setImageResource(R.drawable.vvv2);
                    arrayListIMg.get(1).setTag(2);
                }
                if (bbb == 2) {
                    arrayListIMg.get(1).setImageResource(R.drawable.vvv3);
                    arrayListIMg.get(1).setTag(3);
                }
                if (bbb == 3) {
                    arrayListIMg.get(1).setImageResource(R.drawable.vvv4);
                    arrayListIMg.get(1).setTag(4);
                }
                if (bbb == 4) {
                    arrayListIMg.get(1).setImageResource(R.drawable.vvv5);
                    arrayListIMg.get(1).setTag(5);
                }


                if (ccc == 0) {
                    arrayListIMg.get(2).setImageResource(R.drawable.vvv1);
                    arrayListIMg.get(2).setTag(1);
                }

                if (ccc == 1) {
                    arrayListIMg.get(2).setImageResource(R.drawable.vvv2);
                    arrayListIMg.get(2).setTag(2);
                }
                if (ccc == 2) {
                    arrayListIMg.get(2).setImageResource(R.drawable.vvv3);
                    arrayListIMg.get(2).setTag(3);
                }
                if (ccc == 3) {
                    arrayListIMg.get(2).setImageResource(R.drawable.vvv4);
                    arrayListIMg.get(2).setTag(4);
                }
                if (ccc == 4) {
                    arrayListIMg.get(2).setImageResource(R.drawable.vvv5);
                    arrayListIMg.get(2).setTag(5);
                }
            }

            @Override
            public void onFinish() {


            }
        }.start();


        new CountDownTimer(1400, 5) {

            @Override
            public void onTick(long l) {
                int aaa = random.nextInt(5);
                int bbb = random.nextInt(5);
                int ccc = random.nextInt(5);
                if (aaa == 0) {
                    arrayListIMg.get(3).setImageResource(R.drawable.vvv1);
                    arrayListIMg.get(3).setTag(1);
                }

                if (aaa == 1) {
                    arrayListIMg.get(3).setImageResource(R.drawable.vvv2);
                    arrayListIMg.get(3).setTag(2);
                }
                if (aaa == 2) {
                    arrayListIMg.get(3).setImageResource(R.drawable.vvv3);
                    arrayListIMg.get(3).setTag(3);
                }
                if (aaa == 3) {
                    arrayListIMg.get(3).setImageResource(R.drawable.vvv4);
                    arrayListIMg.get(3).setTag(4);
                }
                if (aaa == 4) {
                    arrayListIMg.get(3).setImageResource(R.drawable.vvv5);
                    arrayListIMg.get(3).setTag(5);
                }


                if (bbb == 0) {
                    arrayListIMg.get(4).setImageResource(R.drawable.vvv1);
                    arrayListIMg.get(4).setTag(1);
                }

                if (bbb == 1) {
                    arrayListIMg.get(4).setImageResource(R.drawable.vvv2);
                    arrayListIMg.get(4).setTag(2);
                }
                if (bbb == 2) {
                    arrayListIMg.get(4).setImageResource(R.drawable.vvv3);
                    arrayListIMg.get(4).setTag(3);
                }
                if (bbb == 3) {
                    arrayListIMg.get(4).setImageResource(R.drawable.vvv4);
                    arrayListIMg.get(4).setTag(4);
                }
                if (bbb == 4) {
                    arrayListIMg.get(4).setImageResource(R.drawable.vvv5);
                    arrayListIMg.get(4).setTag(5);
                }

                if (ccc == 0) {
                    arrayListIMg.get(5).setImageResource(R.drawable.vvv1);
                    arrayListIMg.get(5).setTag(1);
                }

                if (ccc == 1) {
                    arrayListIMg.get(5).setImageResource(R.drawable.vvv2);
                    arrayListIMg.get(5).setTag(2);
                }
                if (ccc == 2) {
                    arrayListIMg.get(5).setImageResource(R.drawable.vvv3);
                    arrayListIMg.get(5).setTag(3);
                }
                if (ccc == 3) {
                    arrayListIMg.get(5).setImageResource(R.drawable.vvv4);
                    arrayListIMg.get(5).setTag(4);
                }
                if (ccc == 4) {
                    arrayListIMg.get(5).setImageResource(R.drawable.vvv5);
                    arrayListIMg.get(5).setTag(5);
                }
            }

            @Override
            public void onFinish() {

            }
        }.start();


        new CountDownTimer(1600, 5) {

            @Override
            public void onTick(long l) {
                int aaa = random.nextInt(5);
                int bbb = random.nextInt(5);
                int ccc = random.nextInt(5);
                if (aaa == 0) {
                    arrayListIMg.get(6).setImageResource(R.drawable.vvv1);
                    arrayListIMg.get(6).setTag(1);
                }

                if (aaa == 1) {
                    arrayListIMg.get(6).setImageResource(R.drawable.vvv2);
                    arrayListIMg.get(6).setTag(2);
                }
                if (aaa == 2) {
                    arrayListIMg.get(6).setImageResource(R.drawable.vvv3);
                    arrayListIMg.get(6).setTag(3);
                }
                if (aaa == 3) {
                    arrayListIMg.get(6).setImageResource(R.drawable.vvv4);
                    arrayListIMg.get(6).setTag(4);
                }
                if (aaa == 4) {
                    arrayListIMg.get(6).setImageResource(R.drawable.vvv5);
                    arrayListIMg.get(6).setTag(5);
                }


                if (bbb == 0) {
                    arrayListIMg.get(7).setImageResource(R.drawable.vvv1);
                    arrayListIMg.get(7).setTag(1);
                }

                if (bbb == 1) {
                    arrayListIMg.get(7).setImageResource(R.drawable.vvv2);
                    arrayListIMg.get(7).setTag(2);
                }
                if (bbb == 2) {
                    arrayListIMg.get(7).setImageResource(R.drawable.vvv3);
                    arrayListIMg.get(7).setTag(3);
                }
                if (bbb == 3) {
                    arrayListIMg.get(7).setImageResource(R.drawable.vvv4);
                    arrayListIMg.get(7).setTag(4);
                }
                if (bbb == 4) {
                    arrayListIMg.get(7).setImageResource(R.drawable.vvv5);
                    arrayListIMg.get(7).setTag(5);
                }

                if (ccc == 0) {
                    arrayListIMg.get(8).setImageResource(R.drawable.vvv1);
                    arrayListIMg.get(8).setTag(1);
                }

                if (ccc == 1) {
                    arrayListIMg.get(8).setImageResource(R.drawable.vvv2);
                    arrayListIMg.get(8).setTag(2);
                }
                if (ccc == 2) {
                    arrayListIMg.get(8).setImageResource(R.drawable.vvv3);
                    arrayListIMg.get(8).setTag(3);
                }
                if (ccc == 3) {
                    arrayListIMg.get(8).setImageResource(R.drawable.vvv4);
                    arrayListIMg.get(8).setTag(4);
                }
                if (ccc == 4) {
                    arrayListIMg.get(8).setImageResource(R.drawable.vvv5);
                    arrayListIMg.get(8).setTag(5);
                }
            }

            @Override
            public void onFinish() {

                for (int i = 0; i < arrayListIMg.size(); i++) {
                    if ((int) arrayListIMg.get(i).getTag() == 1) {


                        r0++;
                    }

                    if ((int) arrayListIMg.get(i).getTag() == 2) {

                        r1++;
                    }

                    if ((int) arrayListIMg.get(i).getTag() == 3) {

                        r2++;
                    }

                    if ((int) arrayListIMg.get(i).getTag() == 4) {

                        r3++;
                    }

                    if ((int) arrayListIMg.get(i).getTag() == 5) {
                        r4++;
                    }
                }

                resetLDS();


            }
        }.start();
    }

    boolean gggg = false;

    public void resetLDS() {


        if (r0 > r1 && r0 > r2 && r0 > r3 && r0 > r4) {

            for (int i = 0; i < arrayListIMg.size(); i++) {

                if ((int) arrayListIMg.get(i).getTag() == 1) {

                    animateLDS(arrayListIMg.get(i));
                }
            }
            gggg = true;
            res(r0);
        }

        if (r1 > r0 && r1 > r2 && r1 > r3 && r1 > r4) {
            for (int i = 0; i < arrayListIMg.size(); i++) {

                if ((int) arrayListIMg.get(i).getTag() == 2) {

                    animateLDS(arrayListIMg.get(i));
                }
            }
            gggg = true;
            res(r1);
        }

        if (r2 > r0 && r2 > r1 && r2 > r3 && r2 > r4) {
            for (int i = 0; i < arrayListIMg.size(); i++) {

                if ((int) arrayListIMg.get(i).getTag() == 3) {

                    animateLDS(arrayListIMg.get(i));
                }
            }
            gggg = true;
            res(r2);
        }

        if (r3 > r0 && r3 > r1 && r3 > r2 && r3 > r4) {
           ;
            for (int i = 0; i < arrayListIMg.size(); i++) {

                if ((int) arrayListIMg.get(i).getTag() == 4) {

                    animateLDS(arrayListIMg.get(i));
                }
            }
            gggg = true;
            res(r3);
        }

        if (r4 > r0 && r4 > r1 && r4 > r2 && r4 > r3) {
            for (int i = 0; i < arrayListIMg.size(); i++) {

                if ((int) arrayListIMg.get(i).getTag() == 5) {
                    animateLDS(arrayListIMg.get(i));
                }
            }
            gggg = true;
            res(r4);
        }

        if (!gggg) {
            new CountDownTimer(1000,1000){

                @Override
                public void onTick(long l) {
                    mainActivity.textViewLS.setVisibility(View.VISIBLE);
                }

                @Override
                public void onFinish() {
                    mainActivity.textViewLS.setVisibility(View.INVISIBLE);
                    if (SaveLDS.getScoreLDS() == 0){
                        SaveLDS.saveBetLDS(0);
                        be = 0;
                        mainActivity.textViewBe.setText("Bet : 0");
                        mainActivity.poiLDS();
                    }
                }
            }.start();


        } else {
            gggg = false;
        }
    }


    SlotActivityLDS mainActivity;

    public SlotActivityLDS getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(SlotActivityLDS mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void animateLDS(ImageView imageView) {
        Vibrator v = (Vibrator) mainActivity.getSystemService(Context.VIBRATOR_SERVICE);
        new CountDownTimer(1900, 900) {

            @Override
            public void onTick(long l) {
                imageView.setBackground(mainActivity.getResources().getDrawable(R.drawable.recten));
                v.vibrate(400);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView.setBackgroundColor(Color.TRANSPARENT);
                    }
                }, 700);
            }

            @Override
            public void onFinish() {


            }
        }.start();

    }

    public void res(int kk) {
        if (kk > 2) {
            wwwin = be + be;
            sc += wwwin;
            mainActivity.textViewWi.setText("Win : " + wwwin);
            mainActivity.textViewSco.setText("Score: " + sc);
            SaveLDS.saveScoreLDS(sc);
            if (kk > 4) {
                wwwin = be + be+ be;
                sc += wwwin;
                mainActivity.textViewWi.setText("Win : " + wwwin);
                mainActivity.textViewSco.setText("Score: " + sc);
                SaveLDS.saveScoreLDS(sc);
            }
        } else {
            new CountDownTimer(1000,1000){

                @Override
                public void onTick(long l) {
                    mainActivity.textViewLS.setVisibility(View.VISIBLE);
                }

                @Override
                public void onFinish() {
                    mainActivity.textViewLS.setVisibility(View.INVISIBLE);

                    if (SaveLDS.getScoreLDS() == 0){
                        SaveLDS.saveBetLDS(0);
                        be = 0;
                        mainActivity.textViewBe.setText("Bet : 0");
                        mainActivity.poiLDS();
                    }
                }
            }.start();
        }
    }
}
