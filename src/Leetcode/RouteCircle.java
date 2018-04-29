package Leetcode;

/**
 * RouteCircle class.
 * Leetcode Question 657.
 */
public class RouteCircle {

  /**
   * Judges if robots makes a circle.
   * @param moves Robot moves.
   * @return True if circle is formed.
   */
  public boolean judgeCircle( String moves ) {
    int x = 0;
    int y = 0;
    for( char move: moves.toCharArray() ) {
      if( move == 'U' )
        y++;
      else if( move == 'D')
        y--;
      else if( move == 'L' )
        x--;
      else if( move == 'R' )
        x++;
    }
    return x == 0 && y == 0;
  }

  /**
   * Main method.
   * @param args Main arguments.
   */
  public static void main( String args[] ) {
    RouteCircle routeCircle = new RouteCircle();
    String testInput[] = new String[]{"UD", "LL"};
    for( int i = 0; i < testInput.length; i++ )
      System.out.println( routeCircle.judgeCircle( testInput[i] ) );

  }
}
