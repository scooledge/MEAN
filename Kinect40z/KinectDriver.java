/**
 * Controller for playing two players. This class checks for winning combinations
 * @author c-dub
 *
 */
public class KinectDriver {         
    private int[] mapArray;
    
    /**
     * Method to check horizontal winning combinations    
     * @param truthList
     * @return winning combination array to give the 4 buttons to be manipulated
     */
    public int[] horizontal(boolean[] truthList) {        
        int count = 0;        
        int whileCount = 0;
        int arrayCount = 0;
        mapArray = new int[4]; 
        // Horizontal winning combos. Makes arays with possible 4 button winning combinations across the board
        //  if those values are all true we have a winner, and return the 4 button array to be manipulated
        while(whileCount < 6) {            
            for(int i = 0; i < 4; i++) {
                for(int j = count; j < count + 4; j++) {
                   mapArray[arrayCount] = j;
                   arrayCount++;
                }
                if(truthList[mapArray[0]] == true && truthList[mapArray[1]] == true && truthList[mapArray[2]] == true && truthList[mapArray[3]] == true) {
                 return mapArray;
                }
                arrayCount = 0;
                count++;                                
            }            
            count += 3;
            whileCount++;
        }       
        mapArray = null;        
        return mapArray;
    }        
        
    	/**
    	 * Method to check horizontal winning combinations    
    	 * @param truthList
    	 * @return winning combination array to give the 4 buttons to be manipulated
    	 */
	    public int[] vertical(boolean[] truthList) {
	        int whileCount = 0;    
	        int count = 0;
	        int arrayCount = 0;
	        mapArray = new int[4]; 
	        // Vertical winning combos. Makes arays with possible 4 button winning combinations across the board
	        //  if those values are all true we have a winner, and return the 4 button array to be manipulated   
	        while(whileCount < 7) {            
	            for(int i = 0; i < 3; i++) {                
	            	for(int j = count; j <= count + 21; j += 7) {
	            		mapArray[arrayCount] = j;
	            		arrayCount++;
	                }
	            	if(truthList[mapArray[0]] == true && truthList[mapArray[1]] == true && truthList[mapArray[2]] == true && truthList[mapArray[3]] == true) {
	                    return mapArray;
	                }
	                arrayCount = 0;
	                count += 7;               
	            }            
	            whileCount += 1;
	            count = whileCount;
	        }
	        mapArray = null;
	        return mapArray;
	       }
        
	    /**
	     * Method to check diagonal left winning combos.
	     * @param truthList
	     * @return array with 4 button positions to be manipulated
	     */
        public int[] diagonalLeft(boolean[] truthList) {
	        int whileCount = 0;    
	        int count = 0;
	        int arrayCount = 0;
	        mapArray = new int[4];
	        // Diagonal left winning combos. Makes arays with possible 4 button winning combinations across the board
	        //  if those values are all true we have a winner, and return the 4 button array to be manipulated    
	        while(whileCount < 3) {         
	            for(int i = 0; i < 4; i++) {
	                for(int j = count; j <= count + 24; j += 8) {
	                    mapArray[arrayCount] = j;
	                    arrayCount++;
	                }
	                if(truthList[mapArray[0]] == true && truthList[mapArray[1]] == true && truthList[mapArray[2]] == true && truthList[mapArray[3]] == true) {
	                    return mapArray;
	                }
	                arrayCount = 0;
	                count++;                
	            }            
	            count += 3;
	            whileCount++;
	        }
	        mapArray = null;
	        return mapArray;
	        }
        
        /**
         * Method to check diagonal right winning combos.
         * @param truthList
         * @return array with 4 button winning combination to be manipulated
         */
        public int[] diagonalRight(boolean[] truthList) {
	        int whileCount = 0;    
	        int count = 3;
	        int arrayCount = 0;
	        mapArray = new int[4];
	        // Horizontal winning combos. Makes arays with possible 4 button winning combinations across the board
	        //  if those values are all true we have a winner, and return the 4 button array to be manipulated	        
	        while(whileCount < 3) {	            
	            for(int i = 0; i < 4; i++) {
	                for(int j = count; j <= count + 18; j += 6) {
	                    mapArray[arrayCount] = j;
	                    arrayCount++;
	                }
	                if(truthList[mapArray[0]] == true && truthList[mapArray[1]] == true && truthList[mapArray[2]] == true && truthList[mapArray[3]] == true) {
	                    return mapArray;
	                }
	                arrayCount = 0;
	                count++;       
	            }            
	            count += 3;
	            whileCount ++;
	        }
	        mapArray = null;
	        return mapArray;
	    }
 
}
