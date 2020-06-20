package example;
public class Average {

    /**
     * Returns the average of an array of numbers
     * @param the array of integer numbers
     * @return the average of the numbers
     */
    
     public float average(final int[] nums) {
        float result = 0;
        // Add your code
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        result = result/nums.length;
        return result;
    }
    
    public static void main(final String[] args) {
        // Add your code
        final int[] numbers = {1, 2};
        Average s = new Average();
        float result = s.average(numbers);
        System.out.println(result);
    }
}
