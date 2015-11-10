/**
 * The programatic interface for the Battleship Model class.
 * This interface supports communication with both the view
 * and controller classes in the Battleship application.
 * 
 * @author Sam Cooledge
 * @author Molly Allen
 * @author Kellan Nealy
 * @author Timothy Davis
 */

//The order for the following methods is subject to  peer review and change

public interface BattleshipInterface {
  
  /**
   * Makes a shot during Play Mode.
   * @param loc The designator for the shot
   * @return The status of the shot. See the shotStatus constants
   * @throws IllegalStateException The game is not in Play Mode
   */
 public ShotStatus makeShot(Location loc);

 /** 
  * @param location that represents location for the ship
  * @return true if location is within bounds and contains no shot already. 
  */
 public boolean isLegalShot(Location loc);
 
 /**
  * resets the offensive and defensive grid for both players, initializes new game.
  */
 public void newGame();
 
 /**
  * begins setup mode followed by game mode
  * mode is enum variable type for getGamemode();
  * @return current game mode: setup or play
  */
 public Mode getGameMode();
 
 /** 
  * Method works out players turn
  * @return TurnStatus: player A's or player B's turn
  */
 public TurnStatus getTurnStatus();
 
 /**
  * using the same Location class Dan defined
  * @param start that represents location for first spot
  * @param end that represents ending location.
  * @param mode that represents current game mode
  * @param a ship enum that represents the ship to be placed
  */
 public void placeShip(Location start, Location end, Mode mode, Ship ship);
  
  /**
  * @param location that represents location for first spot
  * @param that represents ending location
  * @return true if its within bounds and there is no ship at that current spot. 
  */
 public boolean isLegalLocation(Location loc);
 
  /**
   * views are going to need to see offensive grid
   * @param curPlayer uses enum TurnStatus 
   * @return String view of offensive or defensive grid
   */
 public String getOffensiveGrid(TurnStatus curPlayer);
 
  /**
   * views are going to need to see defensive grid
   * @param curPlayer uses enum TurnStatus 
   * @return String view of offensive or defensive grid
   */
 public String getDefensiveGrid(TurnStatus curPlayer);
 
 /**
  * @return true if all of the ships of one player have been sunk
  */
 public boolean isGameOver();

  /**
  * terminate the game when isGameOver returns true, declare winner
  */
 public void endGame();
 
 /**
  * A helper class for location
  */
 class Location {
    /**
  * The row
  */
    char row;
    /**
  * The column
  */
    int col;
 }

 /**
  * helper enumerated type for ship, stores the ship lengths
  */
  enum Ship {
   
  AIRCRAFT_CARRIER (5),
  BATTLESHIP (4),
  CRUISER (3),
  DESTROYER (2);
  
  private final int length;
  
  Ship(int length) {
   this.length = length;
  }
  
  private int getLength() {
   return length;
  }
 };
  
 /**
  * Helper enumerated type for return status. The SUNK_XXX
  * values indicate HIT. The current player's turn continues
  * until the return status is MISS.
  */
 enum ShotStatus {
  // return status, miss
  MISS, 
  // return status, hit, doesn't sink a ship
  HIT, 
  // return status, hit, sunk destroyer 
  SUNK_DESTROYER, 
  // return status, hit, sunk cruiser
  SUNK_CRUISER, 
  // return status, hit, sunk battleship
  SUNK_BATTLESHIP, 
  // return status, hit, sunk aircraft carrier
  SUNK_AIRCRAFT_CARRIER, 
  // return status, location was already played or invalid
  DO_OVER
 };
 
  /**
  * helper enumerated type for Mode, SETUP mode and PLAY mode
  */
 enum Mode {
  // return mode, players setting up defensive grids
  // players do not access to their offensive grids in this mode
  SETUP, 
  // return mode, players taking shots on each others' defensive grids
  // players modifying their offensive grids
  PLAY 
 };
 
  /**
  * helper enumerated type for TurnStatus, Either PLAYER_A's or PLAYER_B's turn
  */
 enum TurnStatus {
  // return turnStatus, it is player A's turn
  // can only access player A's defensive and offensive grid
  PLAYER_A, 
  // return turnStatus, it is player B's turn
  // can only access player B's defensive and offensive grid
  PLAYER_B 
 };
}