package org.sample.java;

import java.util.List;

public class ListFilter {


    private final List<Integer> longListToTraverse;
    private final int threashold;

    public ListFilter(List<Integer> longListToTraverse, int threashold) {
        this.longListToTraverse = longListToTraverse;
        this.threashold = threashold;
    }


    public long calculateAcumulator(){
        return this.longListToTraverse.stream().filter(it -> it < threashold).map(Long::valueOf).reduce(0L, (a, b) -> a + b);
    }

    public long calculate(){
        return this.longListToTraverse.stream().filter(it -> it < threashold).map(Long::valueOf).reduce( (a, b) -> a + b).orElse(0L);
    }

}
