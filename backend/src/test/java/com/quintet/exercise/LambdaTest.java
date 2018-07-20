/*
 * For personal use;
 */

package com.quintet.exercise;

import com.google.common.collect.Maps;
import com.quintet.BackendApplicationTests;
import com.quintet.model.local.Human;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaTest extends BackendApplicationTests {

    private List<Human> humanList;

    @Before
    public void setValue() {
        humanList = Lists.newArrayList(
                new Human("Jason", 4),
                new Human("Eric", 3),
                new Human("Gigi", 5),
                new Human("Helios", 10)
        );
    }

    @Test
    public void ComparatorTest() {
        humanList.sort(Comparator.comparing(Human::getName));
        humanList.forEach(System.out::println);
    }

    @Test
    public void ListToMapTest() {
        Map humanMap = Maps.newTreeMap();
        humanMap = humanList.stream().collect(Collectors.toMap(Human::getName, Function.identity(), (a, b) -> b, () -> new TreeMap<>(Comparator.reverseOrder())));
        System.out.println();
    }
}
