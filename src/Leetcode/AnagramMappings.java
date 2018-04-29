package Leetcode;

import java.util.Hashtable;

/**
 * Leetcode.AnagramMappings Class.
 * Leetcode Question 760.
 */
public class AnagramMappings {
  /**
   * Index mapping from A to B.
   * @param A First Array.
   * @param B Second Array.
   * @return Anagram Index Mapping.
   */
  public int[] anagramMapping( int[] A, int[] B ) {
    Hashtable indexMapping = new Hashtable();
    int result[] = new int[A.length];

    for ( int i = 0; i < B.length; i++ ) {
      indexMapping.put( B[i], i );
    }

    for( int i = 0; i < A.length; i++ ) {
      result[i] = (int) indexMapping.get( A[i] );
    }
    return result;
  }

  /**
   * Main method.
   * @param args Main Arguments.
   */
  public static void main( String args[] ) {
    AnagramMappings anagramMappings = new AnagramMappings();
    int A[] = new int[]{12, 28, 46, 32, 50};
    int B[] = new int[]{50, 12, 32, 46, 28};
    int[] result = anagramMappings.anagramMapping( A, B );

    for( int i = 0; i < result.length; i++ ) {
      System.out.println( result[i] );
    }
  }
}
