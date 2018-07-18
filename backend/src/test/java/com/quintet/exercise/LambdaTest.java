/*
 * For personal use;
 */

package com.quintet.exercise;

import com.quintet.BackendApplicationTests;
import com.quintet.model.local.Human;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;

public class LambdaTest extends BackendApplicationTests {

    @Test
    public void ComparatorTest() {
        List<Human> humanList = Lists.newArrayList(
                new Human("Jason", 4),
                new Human("Eric", 3),
                new Human("Gigi", 5),
                new Human("Helios", 10)
        );

        humanList.sort(Comparator.comparing(Human::getName));
        humanList.forEach(System.out::print);
    }
}
