public class WordSearch{
    private char[][]data;

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols){
      data = new char[rows][cols];
      for(int i =0; i < data.length; i++){
        for(int j =0; j < data[i].length; j++){
          data[i][j] = '_';
        }
      }
    }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for(int i =0; i < data.length; i++){
        for(int j =0; j < data[i].length; j++){
          data[i][j] = '_';
        }
      }
    }

    /**Each row is a new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
      String str = "";
      for(int i = 0; i < data.length; i++){
        for(int j = 0; j < data[i].length; j++){
          str += data[i][j];
          if(j < data[i].length-1){
            str += ' ';
          }
        }
        if(i < data.length-1){
          str += '\n';
        }
      } return str;
    }


    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned
     * and the board is NOT modified.
     */
    public boolean addWordHorizontal(String word,int row, int col){
      int letter = 0;
      boolean figures = true;
      if(data[0].length - col >= word.length()){
        for(int i = col; i < col + word.length(); i++){
          if(data[row][i] != '_'){
            if(data[row][i] != word.charAt(letter)){
              return false;
            }
          } letter++;
        } if(figures){
          for(int m = col; m < col + word.length(); m++){
            data[row][m] = word.charAt(m - col);
          }
        }  return figures;
      } return false;
    }


   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.
     */
    public boolean addWordVertical(String word,int row, int col){
      int letter = 0;
      boolean figures = true;
      if(data.length - row >= word.length()){
        for(int i = row; i < row + word.length(); i++){
          if(data[i][col] != '_'){
            if(data[i][col] != word.charAt(letter)){
              return false;
            }
          } letter++;
        } if(figures){
          for(int m = row; m < row + word.length(); m++){
            data[m][col] = word.charAt(m - row);
          }
        } return figures;
      } return false;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top left towards the bottom right, it must fit on the board,
     *and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addWordDiagonal(String word,int row, int col){
      int j = col;
      int letter = 0;
      boolean figures = true;
      if(data.length - row >= word.length() && data[0].length - col >= word.length()){
        for(int i = row; i < row+word.length(); i++){
          if(data[i][j] != '_'){
            if(data[i][j] != word.charAt(letter)){
              return false;
            }
          } letter ++;
            j++;
        } int j2 = col;
        if(figures){
          for(int m = row; m < row + word.length(); m++){
            data[m][j2] = word.charAt(m - row);
            j2++;
          }
        } return figures;
      } return false;
    }
    public boolean addWord(String word, int row, int col, int dr, int dc){
    if(row >=0 && row < data.length && col >=0 && col < data[0].length && (dr != 0 || dc !=0)){
    	if((row + (word.length()-1) * dr) >= 0 && (row + (word.length()-1) * dr) < data.length && (col + (word.length()-1) * dc) >= 0 && (col + (word.length()-1) * dc) < data[0].length){
    		for(int i = 0; i < word.length(); i++){
  		    char Thisone = data[row + i * dr][col + i * dc];
 		     if(Thisone != '_'){
 		     	if(word.charAt(i) != Thisone){
				return false; 		     	
 		     	}
 		     }
  		  }
    		}
    	} return false; 
    	for(int i = 0; i < word.length
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
