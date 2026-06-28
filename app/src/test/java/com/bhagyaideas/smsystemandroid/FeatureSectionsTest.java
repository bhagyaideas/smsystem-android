package com.bhagyaideas.smsystemandroid;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.List;

public class FeatureSectionsTest {
    @Test
    public void homeSectionsExposeTheThreeNativeFlows() {
        List<FeatureSection> sections = FeatureSections.home();

        assertEquals(3, sections.size());
        assertEquals(R.string.viewer_title, sections.get(0).getTitleResId());
        assertEquals(R.string.stock_mover_title, sections.get(1).getTitleResId());
        assertEquals(R.string.sample_manager_title, sections.get(2).getTitleResId());
    }
}
