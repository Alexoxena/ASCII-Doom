
public class GameField {

		
		private int hoehe;
		private int breite;
		
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
		
		public String toString(){ //Ausgabe der Zeichen, müssen dafür wieder in einen String
			String output = "";
			
			for (int j = 0; j < hoehe; j++){  //String wird abgeklappert, einzelne Zeichen werden auf String output drauf addiert
				
				for (int i = 0; i<breite; i++){
					
					output = output + Level [i][j].toString();
					
				}
				output = output + "\n";
				
			}
			return output;
			
		}
		
}
