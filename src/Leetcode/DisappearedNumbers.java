package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Find all disappeared numbers in Array.
 * Leetcode Question 448.
 */
public class DisappearedNumbers {

  /**
   * Returns elements that do not appear in input array.
   * @param nums Input Array.
   * @return Missing numbers.
   */
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List disapperedNumbers = new ArrayList();
    for( int i = 0; i < nums.length; i++ ) {
      int value = Math.abs( nums[i] ) - 1;
      if( nums[value] > 0 )
        nums[value] = -  nums[value];
    }

    for( int i = 0; i < nums.length; i++ ) {
      if( nums[i] > 0 )
        disapperedNumbers.add( i+1 );
    }
    return disapperedNumbers;
  }
  /**
   * Main method.
   * @param args Main arguments.
   */
  public static void main( String[] args ) {
    DisappearedNumbers disappearedNumbers = new DisappearedNumbers();
    int[] testInput = new int[]{4,3, 2, 7, 8, 2, 3, 1};
    List result = disappearedNumbers.findDisappearedNumbers(testInput);
    for( int i = 0; i < result.size(); i++ ) {
      System.out.println( result.get( i ) );
    }
  }
}
