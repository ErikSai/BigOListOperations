import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        List<Integer> nums2 = new LinkedList<>();
        nums2.add(1);
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        nums2.add(4);
        nums2.add(5);

        ListOperations op = new ListOperations();

        int sum = op.sum_getImple(nums);
        System.out.println("Sum: " + sum);

        int sum2 = op.sum_getImple(nums2);
        System.out.println("Sum: " + sum2);

        op.sum_iteratorImple(nums);
        System.out.println("Removed even values: " + nums);

        op.sum_iteratorImple(nums2);
        System.out.println("Removed even values: " + nums2);

        op.double_getImple(nums);
        System.out.println("Doubled values: " + nums);

        op.double_getImple(nums2);
        System.out.println("Doubled values: " + nums2);

        boolean hasDupes = op.hasDupes_getImple(nums);
        System.out.println("Duplicate values: " + hasDupes);

        boolean hasDupes2 = op.hasDupes_getImple(nums2);
        System.out.println("Duplicate values: " + hasDupes2);
    }
}
