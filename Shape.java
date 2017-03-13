import java.awt.*;
/**
 * This is an interface class
 * @author Aayush Shah
 */
public interface Shape{
  /**
   * Checking if point is on shape or not
   * @param x -- The X coordinate
   * @param y -- The Y Coordinate
   * @return true is yes, false otherwise
   */ 
  public boolean isOn(int x, int y);
  
  /** 
   * Boolean method check if selected
   * @return true if selected, false otherwise
   */ 
  public boolean isSelected();
  
  /**
   * get method for color
   * @return the color of shape
   */
  public Color getColor();
  
  /**
   * Set method for color
   * @param c The color
   */
  public void setColor(Color c);
  /**
   * Setter method 
   * @param b The boolean value
   */
  public void setSelected(boolean b); 
  
  /**
   * Shifting by x pixels
   * @param deltaX The x Coodrinate for shifting
   * @param deltaY The y coordinate for shifting
   */ 
  public void shiftUpperLeftBy(int deltaX, int deltaY);
  
  /**
   * moving by x pixels
   * @param newX The x Coodrinate for moving
   * @param newY The y coordinate for moving
   */
  public void moveUpperLeftTo(int newX, int newY);  
  /**
   * ToString method
   * @return string representation
   */ 
  public String toString();
  
}