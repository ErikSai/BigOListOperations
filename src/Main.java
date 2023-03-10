import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        ListOperations op = new ListOperations();

        int sum = op.sum_getImple(nums);
        System.out.println("Sum: " + sum);

        op.sum_iteratorImple(nums);
        System.out.println("Removed even values: " + nums);

        op.double_getImple(nums);
        System.out.println("Doubled values: " + nums);

        boolean hasDupes = op.hasDupes_getImple(nums);
        System.out.println("Duplicate values: " + hasDupes);
    }
}
