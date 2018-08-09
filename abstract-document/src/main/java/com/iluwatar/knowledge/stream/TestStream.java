package com.iluwatar.knowledge.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 流会使用一个提供数据的源，如集合、数组或输入/输出资源。
 * 请注意，从有序集合生成流时会保留原有的顺序。由列表生成的流，其元素顺序与列表一致。
 */
public class TestStream {
    public static void main(String[] args) {
        List<Cat> someCats=Arrays.asList(
                new Cat("小平",3,"m"),
                new Cat("哈哈",6,"f"),
                new Cat("小爱",8,"m"),
                new Cat("小鸟",8,"m"),
                new Cat("小吃",2,"f"),
                new Cat("达瓦",4,"m"),
                new Cat("岂可",6,"f"),
                new Cat("放到",1,"m")
        );
        List<String> selectSome=someCats
                .stream()
                .filter(d->d.getAge()>4)//lamda表达式：取年龄大于4的
                .map(Cat::getName)      //lamda表达式：结果取名字那一列
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(selectSome);//[哈哈, 小爱, 小鸟]
        System.out.println("map和flatMap的区别");
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner1 = new ArrayList<>();
        inner1.add(1);
        inner1.add(9);
        List<Integer> inner2 = new ArrayList<>();
        inner2.add(2);
        inner2.add(22);
        inner2.add(23);
        List<Integer> inner3 = new ArrayList<>();
        inner3.add(3);
        List<Integer> inner4 = new ArrayList<>();
        inner4.add(4);
        List<Integer> inner5 = new ArrayList<>();
        inner5.add(5);
        outer.add(inner1);
        outer.add(inner2);
        outer.add(inner3);
        outer.add(inner4);
        outer.add(inner5);
        List<Integer> result = outer.stream().flatMap(inner -> inner.stream().map(i -> i + 1)).collect(Collectors.toList());
        System.out.println(result);//[2, 10, 3, 23, 24, 4, 5, 6]
    }
}
