// The code for this class is similar to the code of the IntegerNode class. 
// The overloaded constructor allows the client to set the Player object, while 
// the default constructor sets the reference for the Player object to null.


public class PlayerNode {
	
	private Player player;
	private PlayerNode next;
	
	
// default constructor, initializes player and next references to null
	
	public PlayerNode() {
		
		player = null;
		next = null;
	}

// overloaded constructor passing player reference as parameter
	
	public PlayerNode(Player player) {
		setPlayer(player);
		next = null;
	}
	
// Accessor for player
	
	public Player getPlayer() {
		
		return player;
	}
	
// Accessor for next
	
	public PlayerNode getNext() {
		
		return next;
	}
	
// Mutator for player
	
	public PlayerNode setPlayer(Player player) {
		this.player = player;
		return this;
	}
	
// Mutator for next
	
	public PlayerNode setNext(PlayerNode next) {
		this.next = next;
		return this;
	}
}
