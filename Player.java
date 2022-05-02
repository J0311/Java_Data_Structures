//Since each node in our list will store a Player reference, 
// we start by defining our Player class

// The code for this class is straightforward. We declared the three instance variables, along
// with a constructor, accessors and mutators, and the standard equals and toString methods.


public class Player {
	
	private int id;
	private String name;
	private String game;
	
	
// Overloaded constructor passing instance variable parameters

	public Player(int id, String name, String game) {
			
		setID(id);
		setName(name);
		setGame(game);
		
	}
	
// Accessor for id 
	
	public int getId() {
	return id;
}

// Accessor for name
	
	public String getName() {
		return name;
	}
	
// Accessor for game
	
	public String getGame() {
		return game;
	}
	
// Mutator for Id
	
	public Player setID(int id) {
		this.id = id;
		return this;
	}
	
// Mutator for name
	
	public Player setName(String name) {
		this.name = name;
		return this;
	}
	
// Mutator for game
	
	public Player setGame(String game) {
		this.game = game;
		return this;
	}

// Equals method, compares objects. Returns true if o is a Player obj
// and id, name, and game are equal in both objects. Returns false otherwise
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Player)) {
			return false;
		}
		
		else {
			Player objPlayer = (Player) o;
			return (id == objPlayer.id && name.equals(objPlayer.name) && game.equals(objPlayer.game));
			
		}
	}
	
// toString method, returns String representation of Player object
	
	@Override
	public String toString() {
		return ("id: " + id + "\tname: " + name + "\tgame " + game);
	}
	
}
	