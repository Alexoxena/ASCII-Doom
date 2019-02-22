
public class GameMain {
	

	public static void main(String[] args) {
		
		Position position1 = new Position (2,2);
		Position position2 = new Position (2,2);
		
		WallTile wand = new WallTile (position1);
		EmptyTile empty = new EmptyTile (position2);
		

		
		System.out.println(position1.equals(position2));
		
		System.out.println(wand);
		
		System.out.println(empty);
		
			
	}

}
