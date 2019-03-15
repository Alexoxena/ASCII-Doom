
public class Player extends GameTile{ //erbt davon
	
	
	public String toString(){ //Zeichen Spieler ist @
		return "@";
	}
	
	public void moveLeft(){
		position.x--;  //position.x = position.x-1
	}

	public void moveRight(){
		position.x++;
	}
	
	public void moveUp(){
		position.y++;
	}
	
	public void moveDown(){
		position.y--;
	}
}
