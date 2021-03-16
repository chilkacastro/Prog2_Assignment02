/*
 * The MIT License
 *
 * Copyright 2021 Chilka Castro.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package secondassignment;

import java.util.Arrays;

/**
 * Second Assignment
 *
 * @author Chilka Castro
 */
public class SecondAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Testing methods
        // First method
        double[] nums = {2, 4, 3, 5, 10};
        System.out.println(sum(nums));

        // Second method
        double[] nums2 = {72, 75, 67, 77, 59, 65, 80};
        System.out.println(avg(nums2));

        // Third method
        double[] nums3 = {5, 6, 3, -2, 9, 0, 1, -1};
        System.out.println(min(nums3));

        // Fourth method
        double[] nums4 = {5, 7, 8, 4, 11, 3, 8, 4, 9};
        System.out.println(Arrays.toString(delete(nums4, 6)));

        // Fifth method
        double[] nums5 = generateUniformDistributionNum(6, -125, -2);
        System.out.println(Arrays.toString(nums5));

        // Sixth method
        double[] nums6 = {7.4, 7.4, 8.0, 8.2, 7.6};
        System.out.println(calcFinalScore(nums6));

    }

    /**
     * Adds all the elements of an array
     *
     * @param nums the input array to add
     * @return the sum of all the elements of the array
     */
    public static double sum(double[] nums) {
        double sum = 0;

        for (double num : nums)
            sum += num;

        return sum;
    }

    /**
     * Calculates the average of the elements of an array
     *
     * @param nums the input array to calculate
     * @return the average of the elements of an array
     */
    public static double avg(double[] nums) {
        return sum(nums) / nums.length;
    }

    /**
     * Finds the minimum element of an array
     *
     * @param nums the array to check the minimum element
     * @return the minimum element of an array
     */
    public static double min(double[] nums) {
//        Arrays.sort(nums);
//        return nums[0];
        double min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }

    /**
     * Deletes a specific element from an array
     *
     * @param nums the input array(element to delete is based on this array)
     * @param idx the index of the element to delete
     * @return a double array with a shorter length than the input array
     */
    public static double[] delete(double[] nums, int idx) {
        // Step 1: Copy nums(array) elements and then reduce length by 1
        double[] nums2 = Arrays.copyOf(nums, nums.length - 1);

        // Step 2: Copy nums' elements after the index(shifting left of nums2)
        for (int i = idx + 1; i < nums.length; i++)
            nums2[i - 1] = nums[i];

        return nums2;
    }

    /**
     * Generates a sequence of uniformly distributed numbers
     *
     * @param startNum the start number of the sequence
     * @param endNum the end number of the sequence
     * @param amount the amount/length of numbers in an array
     * @return an double array of uniformly distributed numbers
     */
    public static double[] generateUniformDistributionNum(double startNum,
            double endNum, int amount) {
        // Step 1: Create variables to store values/elements
        double[] nums;
        double distance;
        int threshold = 2;

        // Step 2: Ensures startNum is always smaller than endNum
        if (startNum > endNum) {
            double temp = startNum;
            startNum = endNum;
            endNum = temp;
        }

        // Step 3: If amount/length is less than 2
        if (amount < threshold)
            return new double[]{startNum, endNum};

        distance = (endNum - startNum) / (amount - 1);
        // Step 4: If amount/length is higher than 2
        nums = new double[amount];
        for (int i = 0; i < amount; i++) {
            nums[i] = startNum + distance * i;
        }
        return nums;
    }

    /**
     * Calculates the final score(average) of an athlete
     *
     * @param scores scores to modify and calculate
     * @return the final score(average) of an athlete
     */
    public static double calcFinalScore(double[] scores) {
        // Step 1: sum variable
        double sum = 0;

        //  Step 2: sort it
        Arrays.sort(scores);

        // Step 3: For loop to sum elements
        for (int i = 1; i < scores.length - 1; i++)
            sum += scores[i];

        // Step 4: return final score(average)
        return sum / (scores.length - 2);
    }
}
