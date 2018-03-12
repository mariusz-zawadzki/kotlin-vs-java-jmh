package org.sample.kotlin


class KotlinListFilter(private val longListToTraverse: List<Int>, private val threashold: Int) {


    fun calculate(): Long {
        return longListToTraverse.filter { it -> it < threashold }.map { it.toLong() }.sum()
    }

    fun calculateStreamAcumulator(): Long {
        return longListToTraverse.stream().filter { it -> it < threashold }.map { it.toLong() }.reduce(0) { a, b ->
            a + b
        }
    }

    fun calculateStream(): Long {
        return longListToTraverse.stream().filter { it -> it < threashold }.map { it.toLong() }.reduce { a, b ->
            a + b
        }.orElse(0)
    }

}