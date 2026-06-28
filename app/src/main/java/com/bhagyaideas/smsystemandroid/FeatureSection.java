package com.bhagyaideas.smsystemandroid;

import android.app.Activity;

final class FeatureSection {
    private final int titleResId;
    private final int descriptionResId;
    private final Class<? extends Activity> activityClass;

    FeatureSection(int titleResId, int descriptionResId, Class<? extends Activity> activityClass) {
        this.titleResId = titleResId;
        this.descriptionResId = descriptionResId;
        this.activityClass = activityClass;
    }

    int getTitleResId() {
        return titleResId;
    }

    int getDescriptionResId() {
        return descriptionResId;
    }

    Class<? extends Activity> getActivityClass() {
        return activityClass;
    }
}
