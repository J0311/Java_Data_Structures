// Test class for PlayerSortedLinkedList 

public class PlayerSortedLinkedListTest {
   
     public static void main( String [ ] args ) {
    	 
// We instantiate our usual four Player objects p1, p2, p3, and p4
    	 
      Player p1 = new Player( 7, "Sarah","Mario" );
      Player p2 = new Player( 2, "Jin","Golf" );
      Player p3 = new Player( 5, "Ajay","Sonic" );
      Player p4 = new Player( 8, "Gino","Diablo" );

//  We choose the id values so that our four test cases will be covered when we 
// successively insert the Player objects. We instantiate the PlayerSortedLinkedList 
// players object      
      
      PlayerSortedLinkedList players = new PlayerSortedLinkedList( );
      
// We first traverse the empty list
      
      System.out.println( "Number of items in the list: "
         + players.getNumberOfItems( ) + "\n" + players.toString( ) );

      System.out.println( "inserting " + p1 );
      players.insert( p1 ); // insert in empty list
      
      System.out.println( "Number of items in the list: "
         + players.getNumberOfItems( ) + "\n" + players.toString( ) );

      System.out.println( "inserting " + p2 );
      players.insert( p2 );    // insert at the beginning of the list
      
      System.out.println( "Number of items in the list: "
         + players.getNumberOfItems( ) + "\n" + players.toString( ) );

      System.out.println( "inserting " + p3 );
      players.insert( p3 ); // insert in the middle of the list
      
      System.out.println( "Number of items in the list: "
         + players.getNumberOfItems( ) + "\n" + players.toString( ) );

      System.out.println( "inserting " + p4 );
      players.insert( p4 ); // insert at the end of the list
      
      System.out.println( "Number of items in the list: "
         + players.getNumberOfItems( ) + "\n" + players.toString( ) );
    }
  }