package com.hansanhha.jcf;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;

public interface MySortedMap<K, V> extends MySequencedMap<K, V> {

    Comparator<? super K> comparator();

    SortedMap<K, V> subMap(K fromKey, K toKey);

    SortedMap<K, V> headMap(K toKey);

    SortedMap<K, V> tailMap(K fromKey);

    K firstKey();

    K lastKey();

    Set<K> keySet();

    Collection<V> values();

    Set<MyMap.Entry<K, V>> entrySet();

    default V putFirst(K k, V v) {
        throw new UnsupportedOperationException();
    }

    default V putLast(K k, V v) {
        throw new UnsupportedOperationException();
    }

//    default SortedMap<K, V> reversed() {
//
//    }
}