package com.robolectricunittest;

import android.widget.Button;
import android.widget.TextView;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.Matchers.equalTo;

/**
 * Created by e on 10-09-2017.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {

    public MainActivity activity;
    @Before
    public void setUp() throws Exception {
        activity = Robolectric.buildActivity(MainActivity.class).create().resume().get();
    }

    @Test
    public void checkActivityNotNull() throws Exception {
        Assert.assertNotNull(activity);
    }

    @Test
    public void clickButton() throws Exception
    {
        Button button =(Button)activity.findViewById(R.id.btn_click);
        TextView textView =(TextView)activity.findViewById(R.id.text_view);
        button.callOnClick();
        Assert.assertThat(textView.getText().toString(), equalTo(activity.getString(R.string.app_name)));


    }
}
