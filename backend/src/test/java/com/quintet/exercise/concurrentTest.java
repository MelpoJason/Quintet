/*
 * For personal use;
 */

package com.quintet.exercise;

import com.quintet.BackendApplicationTests;
import org.junit.Test;

public class concurrentTest extends BackendApplicationTests {
    public class ThreadSafeSample {
        int sharedState;

        void nonSafeAction() {
            while (sharedState < 100000) {
                int former;
                int latter;
//                synchronized (this) {
                former = sharedState++;
                latter = sharedState;
//                }
                if (former != latter - 1) {
                    System.out.print("Observed data race, former is " +
                            former + ", " + "latter is " + latter + "\n");
                }
            }
        }
    }

    @Test
    public void testConcurrent() throws InterruptedException {
        ThreadSafeSample sample = new ThreadSafeSample();
        Thread threadA = new Thread(sample::nonSafeAction);
        Thread threadB = new Thread(sample::nonSafeAction);
        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();
    }

}
