package unit_test;

import android.test.ActivityInstrumentationTestCase2;

import com.example.jace.summer.MainActivity;

/**
 * Created by Jace on 4/17/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_sum(){
        mainActivity = getActivity();
        int intend = mainActivity.sum(1, 2);
        assertEquals(3, intend);

    }
}
