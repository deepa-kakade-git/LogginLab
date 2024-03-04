import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class LogginLabTest {
    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void thresholdExceeds() {
        Integer finalLimit = 5;

        LogginLab lab = new LogginLab();
        lab.setThreshold(finalLimit);

        for (Integer i = 1; i <= finalLimit; i++) {
            if (lab.thresholdExceeds(i)) {
                logger.log(Level.INFO, "Threshold not reached! It is "+i);
                assertTrue(lab.thresholdExceeds(i));
            } else {
                logger.log(Level.INFO, "Threshold finally reached!");
                assertFalse(lab.thresholdExceeds(i));
            }
        }
    }
    @org.junit.Test
    public void thresholdReached(){
        int threshold = 10;

        LogginLab lab = new LogginLab();
        lab.setThreshold(threshold);

        for(int i = threshold - 1 ; i <=threshold + 1; i++){
            if (lab.threshholdReached(i)) {
                logger.log(Level.INFO, "Limit exceed the threshold" + i);
                assertTrue(lab.threshholdReached(i));
            } else {
                logger.log(Level.INFO, "LThreshold is not exceeded !" + i);
                assertFalse((lab.threshholdReached(i)));
            }
        }
    }
}
