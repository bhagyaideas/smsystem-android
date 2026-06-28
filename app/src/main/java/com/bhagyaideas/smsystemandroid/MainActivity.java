package com.bhagyaideas.smsystemandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<FeatureSection> sections = FeatureSections.home();
        bindSection(sections.get(0), R.id.viewer_title, R.id.viewer_description, R.id.viewer_button);
        bindSection(sections.get(1), R.id.stock_mover_title, R.id.stock_mover_description,
                R.id.stock_mover_button);
        bindSection(sections.get(2), R.id.sample_manager_title,
                R.id.sample_manager_description, R.id.sample_manager_button);
    }

    private void bindSection(FeatureSection section, int titleViewId, int descriptionViewId,
            int buttonViewId) {
        TextView titleView = findViewById(titleViewId);
        TextView descriptionView = findViewById(descriptionViewId);
        Button buttonView = findViewById(buttonViewId);

        titleView.setText(section.getTitleResId());
        descriptionView.setText(section.getDescriptionResId());
        buttonView.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, section.getActivityClass())));
    }
}
