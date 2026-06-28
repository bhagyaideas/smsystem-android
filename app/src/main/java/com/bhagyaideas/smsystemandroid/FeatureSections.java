package com.bhagyaideas.smsystemandroid;

import java.util.Arrays;
import java.util.List;

final class FeatureSections {
    private FeatureSections() {
    }

    static List<FeatureSection> home() {
        return Arrays.asList(
                new FeatureSection(R.string.viewer_title, R.string.viewer_description,
                        ViewerActivity.class),
                new FeatureSection(R.string.stock_mover_title,
                        R.string.stock_mover_description, StockMoverActivity.class),
                new FeatureSection(R.string.sample_manager_title,
                        R.string.sample_manager_description, SampleManagerActivity.class)
        );
    }
}
