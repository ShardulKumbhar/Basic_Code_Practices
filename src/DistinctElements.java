//import java.util.HashSet;
//import java.util.Set;
//
//public class DistinctElements {
//    public static void main(String[] args) {
//        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = {4, 5, 6, 7, 8};
//
//        int[] combinedArray = new int[array1.length + array2.length];
//        System.arraycopy(array1, 0, combinedArray, 0, array1.length);
//        System.arraycopy(array2, 0, combinedArray, array1.length, array2.length);
//
//        Set<Integer> distinctElements = new HashSet<>();
//
//        for (int element : combinedArray) {
//            distinctElements.add(element);
//        }
//
//        System.out.println("Distinct elements:");
//        for (int element : distinctElements) {
//            System.out.println(element);
//        }
//    }
//}
