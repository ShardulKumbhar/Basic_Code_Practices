import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//public class Main {

//    public static void main(String[] args) {
//        System.out.println("Hello Shardul");
//
//        List<Integer> list = Arrays.asList(11, 12, 2, 5 ,284, 26 ,12);
//        System.out.println(list);
//
//        //sum of number
//        Integer Sum = list.stream().reduce((a, b) -> a + b).get();
//        System.out.println(Sum);
//
//        //avg of list
//        Double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
//        System.out.println(avg);
//
//
//        List<Integer> collect = list.stream().map(e -> e * e).filter(e -> e > 100).collect(Collectors.toList());
//
//        //square and average
//        Double collect2 = list.stream().map(e -> e * e).filter(e -> e > 100).mapToInt(e -> e).average().getAsDouble();
//
//
//        System.out.println(collect);
//        System.out.println(collect2);
//
//
//        //using map boolen checking even no.
//        List<Boolean> collect1 = list.stream().map(e -> e % 2 == 0).collect(Collectors.toList());
//
//        List<Integer> collect3 = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
//
//        //odd number
//        List<Integer> collect4 = list.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
//        System.out.println(collect1);
//        System.out.println(collect3);
//        System.out.println(collect4);

//        //pre fix 2
//        List<Integer> collect5 = list.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
//        System.out.println(collect5);
//
//        Set<Integer> collect6 = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
//        System.out.println(collect6);
//
//        //find max
//        Integer integer = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
//        System.out.println(integer);

//        //sort
//        List<Integer> integer1 = list.stream().sorted().collect(Collectors.toList());
//        System.out.println(integer1);
//
//        //sort in decending
//        List<Integer> integer2 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//        System.out.println(integer2);

//        //limit to first3
//        Integer integer3 = list.stream().limit(3).reduce((a, b) -> a + b).get();
//        System.out.println(integer3);

//        //skip first 3
//        Integer integer4 = list.stream().skip(3).reduce((a, b) -> a + b).get();
//        System.out.println(integer4);
//
//    }}

