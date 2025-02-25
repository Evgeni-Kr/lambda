package Lambda;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {/*
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(1);
        list.add(13);
        list.add(124);
        list.add(0);
        list.add(23);
        list.forEach(System.out::println);
        List<Integer> list2 = Arrays.asList(1,23,4,5,6,7);
        list2.forEach(System.out::print);

        int x = 5;
        String y = String.valueOf(x);
        System.out.print("\n"+y);
        SortedSet<SortClass> sortList = new TreeSet<>();
        sortList.add(new SortClass(15,"Lena "));
        sortList.add(new SortClass(14,"Elena "));
        sortList.add(new SortClass(17,"Leona "));
        sortList.add(new SortClass(151,"Leonida "));
        sortList.add(new SortClass(17,"Leonid "));
        sortList.forEach(System.out::print);*/

        List<SortClass> sortList2 = new ArrayList<>();
        sortList2.add(new SortClass(151, "Lena "));
        sortList2.add(new SortClass(141, "Elena "));
        sortList2.add(new SortClass(171, "Leona "));
        sortList2.add(new SortClass(1511, "Leonida "));
        sortList2.add(new SortClass(171, "Leonid "));
        sortList2.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        sortList2.forEach(System.out::println);

        List<ComparatorClass> cc = new ArrayList<>();
        cc.add(new ComparatorClass(12, "Petrochenko"));
        cc.add(new ComparatorClass(12, "Petrov"));
        cc.add(new ComparatorClass(12, "Solomonov"));
        cc.add(new ComparatorClass(12, "Ivanov"));
        cc.add(new ComparatorClass(12, "Игорь"));
        cc.add(new ComparatorClass(12, "Игорь"));

        cc.sort((s1, s2) -> s1.getSurname().compareTo(s2.getSurname()));
        cc.forEach(System.out::println);

        List<Integer> geminiQuests = Arrays.asList(1, 2, 3, 4, 5, -1, -2, -3, -4, -5);
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println("++++++++++++++++++++++++++++++++++");
        for (int i : geminiQuests) {
            if (isPositive.test(i)) {
                System.out.println(i);
            }
        }
        Predicate<Integer> isEven = x -> x % 2 == 0;
        for (int i : geminiQuests) {
            if (isEven.test(i)) {
                System.out.println(i);
            }
        }

        evaluate(geminiQuests, n -> n < 0);
         List<Integer> geminiRemove = new ArrayList(geminiQuests);
         remove(geminiRemove, n-> n<0);
         System.out.println("________________________________________");
         geminiRemove.forEach(System.out::println);
        System.out.println("________________________________________");

        List<Integer> numList = List.of(1,3,5,6,42,45,6);


        numList.stream().sorted((s1,s2)-> s1-s2).forEach(System.out::println);
        int totalSum = numList.stream().reduce(0,Integer::sum);
        System.out.println(totalSum);
    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for (int list1 : list) {
            if (predicate.test(list1)) {
                System.out.println("================================");
                System.out.println(list1);
                break;
            }
        }
    }

    public static void remove(List<Integer> list, Predicate<Integer> predicate){
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int element = iterator.next();
            if(predicate.test(element)){
                iterator.remove();
            }
        }
    }
    public static int sum(List<Integer> list){
        int sum = 0;
        for(int i: list){
            sum+=i;
        }
        return sum;
    }
}