package com.example.rabbitsb;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class StreamTest {


    @Test
    public void test1() {

        String[] charts = new String[]{"a", "b", "c", "a", "a"};
        long count = Arrays.stream(charts).count();
        System.out.println(count);
        Arrays.stream(charts).distinct().forEach(e -> System.out.println(e));
        List<Map> result = Arrays.stream(charts).map(e -> {
            Map map = new HashMap<String, Integer>();
            map.put(e, 1);
            return map;
        }).collect(Collectors.toList());
        result.forEach(e -> {
            Set set = e.entrySet();
            set.forEach(d -> System.out.println(d.toString()));

        });


        ForkJoinPool forkJoinPool = new ForkJoinPool(3);

        List<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.parallelStream().forEach((number) -> {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {

            }

        });





    }
}
