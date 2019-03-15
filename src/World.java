
public class World {
	
	public GameField field;
	
	public Player player;
	
	
	
	public World (){
		field = new GameField (3,5, "###   ###   ###");
		player = new Player ();
		player.position.x = 1;
		player.position.y = 1;

	}
	
	public String toString() {
		String s = field.toString();
		s = player.draw(s,field.breite);
		
		String result = "\\ ";
		for( int column = 0; column < field.breite; ++column) {
			result += (column % 10);
		}
		result += "\n";
		
		for( int row = 0; row < s.length()/field.breite; ++row) {
			result += row%10 + " " + s.substring( row*field.breite, (row+1)*field.breite) + "\n";
		}
		return result;
	}
	
	
	
	public void keyPressed(String s) {
		if( s.isEmpty() ) {
			return;
		}
		switch( s.charAt(0) ) {
			case 'w':
				player.moveUp();

				break;	
					
			case 's':
				player.moveDown();
				break;
			case 'a': 
				player.moveLeft();
				break;
			case 'd':
				player.moveRight();
				break;
			default:
				System.out.println("Key not found");
				break;
		}
		
		
}
	boolean checkCollision(int iWidth){
		
		player.position equals (//entsprechendes WallTile)
		
	}

}
