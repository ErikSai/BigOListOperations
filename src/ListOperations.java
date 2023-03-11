
public class ListOperations {

    /**
     * Get the total of the values in an integer list
     * @param nums The list of integers
     * @return the sum of the values
     */
    // O(2N)
    public int sum_getImple(java.util.List<Integer> nums) {
        // 1
        int total = 0;
        // N
        for(int i = 0; i < nums.size(); i++) {
            total += nums.get(i);
        }
        // 1
        return total;
    }

    /**
     * Get the total of the values in an integer list
     * @param nums The list of integers
     * @return The sum of the values
     */
    // O(2N)
    public int sum_iteratorImple(java.util.List<Integer> nums) {
        // 1
        int total = 0;
        java.util.Iterator<Integer> it = nums.iterator();
        // O(N)
        while(it.hasNext()) {
            total += it.next();
        }
        // 1
        return total;
    }

    /**
     * Remove the even values from a list of integers.
     * The method modifies the parameter list.
     * @param nums The list of integers
     */
    // O(N^2)
    public void removeEvens_getImple(java.util.List<Integer> nums) {
        // O(N)
        for(int i = 0; i < nums.size(); i++) {
            // O(N)
            if(nums.get(i) % 2 == 0) {
                nums.remove(i);
            }
        }
    }

    /**
     * Remove the even values from a list of integers.
     * The method modifies the parameter list.
     * @param nums The list of integers
     */
    // O(3N)
    public void removeEvens_iteratorImple(java.util.List<Integer> nums) {
        java.util.Iterator<Integer> it = nums.iterator();
        // O(N)
        while(it.hasNext()) {
            // 3
            int value = it.next();
            if(value % 2 == 0) {
                it.remove();
            }
        }
    }

    /**
     * Double the values in a list of integers.
     * This method modifies the parameter list.
     * @param nums The list of integers
     */
    // O(2N)
    public void double_getImple(java.util.List<Integer> nums) {
        // O(N) loop runs N time, constant
        for(int i = 0; i < nums.size(); i++) {
            // 2
            int value = nums.get(i);
            nums.set(i, 2 * value);
        }
    }

    /**
     * Double the values in a list of integers.
     * This method modifies the parameter list.
     * @param nums The list of integers
     */
    // O(2N)
    public void double_iteratorImple(java.util.List<Integer> nums) {
        java.util.ListIterator<Integer> it = nums.listIterator();
        // O(N) due to sorting
        while(it.hasNext()) {
            // 2
            int value = it.next();
            it.set(2 * value);
        }
    }

    /**
     * Check a list of integers for duplicates
     * @param nums The list of integers
     * @return True, if at least one pair of duplicate
     * values exists in the list
     */

    public boolean hasDupes_getImple(java.util.List<Integer> nums) {
        // O(3N^2)
        for(int i = 0; i < nums.size(); i++) {
            // 1
            int value1 = nums.get(i);
            // O(N^2)
            for(int j = i + 1; j < nums.size(); j++) {
                // 3
                int value2 = nums.get(j);
                if(value1 == value2) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Check a list of integers for duplicates
     * @param nums The list of integers
     * @return True, if at least one pair of duplicate
     * values exists in the list
     */
    // O(9N)
    public boolean hasDupes_iteratorImple(java.util.List<Integer> nums) {
        java.util.Iterator<Integer> it1 = nums.iterator();
        // 1
        int index1 = -1;
        // O(3N)
        while(it1.hasNext()) {
            // 3
            index1++;
            int value1 = it1.next();
            java.util.ListIterator<Integer> it2;
            it2 = nums.listIterator(index1 + 1);
            // O(3N)
            while(it2.hasNext()) {
                // 3
                int value2 = it2.next();
                if(value1 == value2) {
                    return true;
                }
            }
        }
        // 1
        return false;
    }
}
