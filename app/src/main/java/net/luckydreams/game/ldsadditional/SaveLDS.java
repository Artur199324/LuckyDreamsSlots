package net.luckydreams.game.ldsadditional;

import android.app.Activity;
import android.content.Context;

public class SaveLDS {

    public static Activity activity;

    public static void saveScoreLDS(int s) {
        activity.getSharedPreferences(activity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("ssss", s).apply();
    }

    public static int getScoreLDS() {
        return activity.getSharedPreferences(activity.getPackageName(), Context.MODE_PRIVATE).getInt("ssss", 2000);
    }

    public static void saveBetLDS(int s) {
        activity.getSharedPreferences(activity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("bbbb", s).apply();
    }

    public static int getBetLDS() {
        return activity.getSharedPreferences(activity.getPackageName(), Context.MODE_PRIVATE).getInt("bbbb", 0);
    }
}
