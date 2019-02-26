
public class EmptyTile extends GameTile{ //EmptyTile erbt von Game Tile

	public EmptyTile(Position position) {
		super(position);
	}

	public String toString(){ //Zeichen mit dem Emptytile  representiert wird
		
		return " ";
	}
}
