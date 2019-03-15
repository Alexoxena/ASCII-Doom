
public class GameField {

		
		 int hoehe;
		 int breite;
		
		private GameTile [][] Level;

		
		
		public GameField(int breite, int hoehe, String level){
			
		this. hoehe = hoehe; 
		this.breite = breite;
			
			Level = new GameTile [breite] [hoehe];
			
			for (int y = 0; y < hoehe; y++){
				for (int x = 0; x < breite; x++){

				switch (level.charAt(x+(y*breite))){
					case '#' : 
						Level [x][y] = new WallTile(); 
						break;
						
					case ' ' :
						Level [x][y] = new EmptyTile(); 
						break;
						
					default: 
						System.out.println("fehlerhaftes Zeichen an Position "+ x+(y*breite));
				}
				
					
				}
				
			}
			
		}
		
		public String toString() {
			String result="";
			for( int y = 0; y < hoehe; ++y) {
				for( int x = 0; x < breite; ++x) {
					result += Level[x][y].toString();
				}
			}
			
			return result;
		}
}
