package com.deepocean.jdk.collection;

import java.util.*;
import java.util.function.Function;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {{
            add("1");
            add("2");
            add("3");
        }};

        // size()
        System.out.println(list.size());

        // isEmpty()
        System.out.println(list.isEmpty());

        // contains(Object o)
        System.out.println(list.contains("3"));
        System.out.println(list.contains("4"));

        // iterator()
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // toArray()
        Object[] arr1 = list.toArray();
        System.out.println(Arrays.toString(arr1));

        // toArray(T[] a)
        String[] arr2 = list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr2));

        // add(E e)
        list.add("4");
        System.out.println(list);

        // remove(Object o)
        list.remove("4");
        System.out.println(list);

        // containsAll(Collection<?> c)
        List<String> curr1 = Arrays.asList("1", "3");
        List<String> curr2 = Arrays.asList("2", "4");
        System.out.println(list.containsAll(curr1));
        System.out.println(list.containsAll(curr2));

        // removeAll(Collection<?> c)
        list.removeAll(curr1);
        System.out.println(list);
        list.addAll(curr1);
        System.out.println(list);

        // retainAll(Collection<?> c)
        boolean b = list.retainAll(curr1);
        System.out.println(b + " : " + list);
        list.add("2");
        System.out.println(list);

        // replaceAll(UnaryOperator<E> operator)
        list.replaceAll(x -> x = x + "0");
        System.out.println(list);
        list.replaceAll(x -> x = x.substring(0, 1));
        System.out.println(list);

        // sort(Comparator<? super E> c)
        // big -> small
        list.sort(((o1, o2) -> Integer.parseInt(o2) - Integer.parseInt(o1)));
        System.out.println("sort: " + list);
        // small -> big
        list.sort(Comparator.comparingInt(Integer::parseInt));
        System.out.println(list);
        // natural -> small -> big
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        // order law assigned
        list.sort(Comparator.comparing((Objects::hashCode)));
        System.out.println(list);
        list.sort(Comparator.comparing(Integer::parseInt));
        System.out.println(list);
        list.sort(Comparator.comparing(String::length).thenComparingInt(Integer::parseInt).reversed());
        System.out.println(list);


        // clear()
        list.clear();
        System.out.println(list);

        // equals(Object o)

        // hashCode()

        // get(int index)

        // set(int index, E element)

        // add(int index, E element)

        // remove(int index)

        // indexOf(Object o)
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");
        System.out.println(list.indexOf("1"));

        // lastIndexOf(Object o)
        System.out.println(list.lastIndexOf("1"));

        // listIterator()
        ListIterator<String> iterator1 = list.listIterator();
        System.out.println("iterator1 starts...");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        // listIterator(int index)
        ListIterator<String> iterator2 = list.listIterator(1);
        System.out.println("iterator2 starts...");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        // subList(int fromIndex, int toIndex)
        System.out.println("list: " + list);
        List<String> subList = list.subList(1, 3);  // R -> [)
        System.out.println(subList);

        // spliterator()
        // 并行迭代器
        for (int i = 0; i < 5000; i++) {
            list.add(i + "0");
        }
        Spliterator<String> spliterator = list.spliterator();
        spliterator.forEachRemaining(System.out::println);
    }
}
