import java.util.Random;
/**
 * Controller for playing against the computer. This class simulates the basic AI for the computer to make moves
 * @author c-dub
 *
 */
public class KinectDriverComputer {         
    private int[] mapArray;
    private int globalNum;
    
    /**
     * Computer move method. Checks both lists passed in for boolean values, if player doesnt have 3 true values
     *  in a row already clicked, it will simply return a random number button to click for its next move
     * @param playerList
     * @param computerList
     * @return
     */
    public int go(boolean[] playerList, boolean[] computerList) {
    	int count = 0;        
        int whileCount = 0;
        int arrayCount = 0;
        mapArray = new int[4];
        //horizontal checking
        while(whileCount < 6) {            
            for(int i = 0; i < 4; i++) {
                for(int j = count; j < count + 4; j++) {
                   mapArray[arrayCount] = j;
                   arrayCount++;
                }
                // Checks players list passed to try to block their next horizontal move
                if((playerList[mapArray[0]] == true && playerList[mapArray[1]] == true && playerList[mapArray[2]] == true && playerList[mapArray[3]] == false) && computerList[mapArray[3]] == false) {
                	return mapArray[3];
                } else if((playerList[mapArray[0]] == false && playerList[mapArray[1]] == true && playerList[mapArray[2]] == true && playerList[mapArray[3]] == true) && computerList[mapArray[0]] == false) { 
                	return mapArray[0];
                } else if((computerList[mapArray[0]] == true && computerList[mapArray[1]] == true && computerList[mapArray[2]] == true && computerList[mapArray[3]] == false) && playerList[mapArray[3]] == false) {
                	return mapArray[3];
                } else if((computerList[mapArray[0]] == false && computerList[mapArray[1]] == true && computerList[mapArray[2]] == true && computerList[mapArray[3]] == true) && playerList[mapArray[0]] == false) { 
                	return mapArray[0];
                }
                arrayCount = 0;
                count++;                                
            }            
            count += 3;
            whileCount++;
        }
        
        //nothing returned yet, no threat from player winning    
	    whileCount = 0;    
	    count = 0;
	    arrayCount = 0;
	    mapArray = new int[4]; 
	    // vertical checking       
	        while(whileCount < 7) {            
	            for(int i = 0; i < 3; i++) {                
	            	for(int j = count; j <= count + 21; j += 7) {
	            		mapArray[arrayCount] = j;
	            		arrayCount++;
	            	}
	            	// Checks vertical player list to try to block their next move
	            	if((playerList[mapArray[0]] == true && playerList[mapArray[1]] == true && playerList[mapArray[2]] == true && playerList[mapArray[3]] == false) && computerList[mapArray[3]] == false) {
	            		return mapArray[3];
	            	} else if((playerList[mapArray[0]] == false && playerList[mapArray[1]] == true && playerList[mapArray[2]] == true && playerList[mapArray[3]] == true) && computerList[mapArray[0]] == false) { 
	            		return mapArray[0];
	            	} else if((computerList[mapArray[0]] == true && computerList[mapArray[1]] == true && computerList[mapArray[2]] == true && computerList[mapArray[3]] == false) && playerList[mapArray[3]] == false) {
	            		return mapArray[3];
	            	} else if((computerList[mapArray[0]] == false && computerList[mapArray[1]] == true && computerList[mapArray[2]] == true && computerList[mapArray[3]] == true) && playerList[mapArray[0]] == false) { 
	            		return mapArray[0];
	            	}
	                arrayCount = 0;
	                count += 7;               
	            }            
	            whileCount += 1;
	            count = whileCount;
	        }
	        
        // nothing returned yet, no threat from player winning
	    whileCount = 0;    
	    count = 0;
	    arrayCount = 0;
	    mapArray = new int[4];
	    // diagonal left checking        
	        while(whileCount < 3) {         
	            for(int i = 0; i < 4; i++) {
	                for(int j = count; j <= count + 24; j += 8) {
	                    mapArray[arrayCount] = j;
	                    arrayCount++;
	                }
	                //Checks players list to block their next move
	                if((playerList[mapArray[0]] == true && playerList[mapArray[1]] == true && playerList[mapArray[2]] == true && playerList[mapArray[3]] == false) && computerList[mapArray[3]] == false) {
	                	return mapArray[3];
	                } else if((playerList[mapArray[0]] == false && playerList[mapArray[1]] == true && playerList[mapArray[2]] == true && playerList[mapArray[3]] == true) && computerList[mapArray[0]] == false) { 
	                	return mapArray[0];
	                } else if((computerList[mapArray[0]] == true && computerList[mapArray[1]] == true && computerList[mapArray[2]] == true && computerList[mapArray[3]] == false) && playerList[mapArray[3]] == false) {
	                	return mapArray[3];
	                } else if((computerList[mapArray[0]] == false && computerList[mapArray[1]] == true && computerList[mapArray[2]] == true && computerList[mapArray[3]] == true) && playerList[mapArray[0]] == false) { 
	                	return mapArray[0];
	                }
	                arrayCount = 0;
	                count++;                
	            }            
	            count += 3;
	            whileCount++;
	        }
	        
	    // nothing returned yet, no threat from player winning        
        whileCount = 0;    
	    count = 3;
	    arrayCount = 0;
	    mapArray = new int[4];
	    // diagonal right checking	        
	        while(whileCount < 3) {	            
	            for(int i = 0; i < 4; i++) {
	                for(int j = count; j <= count + 18; j += 6) {
	                    mapArray[arrayCount] = j;
	                    arrayCount++;
	                }
	                //Checks players list diagonally to block their next move
	                if((playerList[mapArray[0]] == true && playerList[mapArray[1]] == true && playerList[mapArray[2]] == true && playerList[mapArray[3]] == false) && computerList[mapArray[3]] == false) {
	                	return mapArray[3];
	                } else if((playerList[mapArray[0]] == false && playerList[mapArray[1]] == true && playerList[mapArray[2]] == true && playerList[mapArray[3]] == true) && computerList[mapArray[0]] == false) { 
	                	return mapArray[0];
	                } else if((computerList[mapArray[0]] == true && computerList[mapArray[1]] == true && computerList[mapArray[2]] == true && computerList[mapArray[3]] == false) && playerList[mapArray[3]] == false) {
	                	return mapArray[3];
	                } else if((computerList[mapArray[0]] == false && computerList[mapArray[1]] == true && computerList[mapArray[2]] == true && computerList[mapArray[3]] == true) && playerList[mapArray[0]] == false) { 
	                	return mapArray[0];
	                }
	                arrayCount = 0;
	                count++;       
	            }            
	            count += 3;
	            whileCount ++;
	        }
	        
	     // no threat from player winning from above, randomize number and pass it on to doClick() computer turn
	     boolean globalFlag = false;
	     // loop through until we get a valid random number corresponding to an available button
	     while(globalFlag == false) {
	    	Random rand = new Random();
	 		int  n = rand.nextInt(42) + 0;    	 
	    	 if(playerList[n] == false && computerList[n] == false) {
	    		 globalNum = n;	    		 
	    		 globalFlag = true;
	    	 } 
	     }
	     return globalNum;
	    }
 
}

