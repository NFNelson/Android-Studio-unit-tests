package info.natecreates.unittestexampe;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Random;

import static info.natecreates.unittestexampe.MainActivity.addnumbers;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        Random rand = new Random();

        assertEquals("info.natecreates.unittestexampe", appContext.getPackageName());

        //test will run 10 times, you can change this to fit your needs
        for(int i = 0;i<10;i++){
            int int1 = rand.nextInt(50);
            int int2 = rand.nextInt(50);
            assertEquals(int1+int2, addnumbers(int1,int2));

        }

    }
}
