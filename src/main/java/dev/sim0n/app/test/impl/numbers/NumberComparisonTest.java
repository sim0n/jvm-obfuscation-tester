package dev.sim0n.app.test.impl.numbers;

import dev.sim0n.app.test.Test;
import dev.sim0n.iridium.math.statistic.Regression;
import dev.sim0n.iridium.math.statistic.Stats;

import java.util.List;

/**
 * @author sim0n
 */
public class NumberComparisonTest implements Test {
    @Override
    public void run() {
        int[] intValues = new int[] { 813,432,784,409,600,552,923,51,275,988,774,74,693,892,957,398,636,530,472,769,106,259,450,893,355 };
        double[] doubleValues = new double[] { 15.354279285687706,5.797782664265068,8.683696317015794,1.9817656768587806,3.535287429360438,4.220760053178631,10.807260410843776,9.79012425459241,9.862795945665074,0.74113233949422,2.422188626186955,9.624071224255548,0.21480131492236743,10.736554500849767,2.7573095161824757,16.295928424685112,1.5007304056520934,11.312333434915566,0.2805255257633217,2.158320252411026,0.0,8.556101546454709,1.1028629585647993,15.846849796405586,5.932633085882487 };

        double[] randomDoubles = new double[doubleValues.length];

        for (int i = 0; i < randomDoubles.length; i++) {
            randomDoubles[i] = Math.random();
        }

        int occurrences = 0;
        for (int i = 0; i < intValues.length; i++) {
            int intValue = intValues[i];
            double doubleValue = doubleValues[i];

            if (intValue > doubleValue) {
                ++occurrences;
            } else if (intValue < doubleValue) {
            } else {
            }
        }

        double stdDev = Stats.stdDev(doubleValues);
        double kurtosis = Stats.kurtosis(doubleValues);

        System.out.println("stddev=" + stdDev);
        System.out.println("kurtosis=" + kurtosis);
        System.out.println("intercept=" + Regression.leastSquares(doubleValues, randomDoubles).intercept());

        if (occurrences - intValues.length != 0) {
            throw new IllegalArgumentException("Failed number comparison test! Occurrences: " + occurrences);
        }
    }
}
