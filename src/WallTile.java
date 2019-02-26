
public class WallTile extends GameTile{ //WallTile erbt von Game Tile
	

	public WallTile(Position position) { //vererbten tiles können konstruktor benutzen
		super(position);
	}

	public String toString(){
		
		return "#"; //Zeichen mit dem WallTile repräsentiert wird (Wall=#),gibt dieses Zeichen als WallTile aus
	}
}
