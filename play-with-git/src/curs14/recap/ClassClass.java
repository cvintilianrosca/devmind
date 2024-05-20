package curs14.recap;

import java.util.*;

public class ClassClass {
    public static void doStuff() {

    }

    public static void main(String[] args) {

        int[] ints = {2, 3, 4, -1, 4, 2, 18, 23, 25, 101, 1, 203, 203, 2018};
        ///           1  2  3   1  2  1   2   3   4   5   1   2    1     2
        int[] dp = new int[ints.length];
        dp[0] = 1;

        for (int i = 1; i < ints.length ; i++) {
            if (ints[i] > ints[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 1;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
         max = max < dp[i] ? dp[i] : max;
        }

        System.out.println(max);

    }
}


class SchindlerList implements List<Objects> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Objects> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Objects objects) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Objects> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Objects> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Objects get(int index) {
        return null;
    }

    @Override
    public Objects set(int index, Objects element) {
        return null;
    }

    @Override
    public void add(int index, Objects element) {

    }

    @Override
    public Objects remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Objects> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Objects> listIterator(int index) {
        return null;
    }

    @Override
    public List<Objects> subList(int fromIndex, int toIndex) {
        return null;
    }
}
