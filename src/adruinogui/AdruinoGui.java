/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adruinogui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import network.Client;

/**
 *
 * @author Klaus
 */
public class AdruinoGui extends ArdruinoClient {

  private DistanceFrame distFrame;

  public AdruinoGui() {
    
    this.addBooleanString("true", "false");
    this.addBooleanString("an", "aus");
    this.addBooleanString("on", "off");
    
    distFrame = new DistanceFrame();
    distFrame.setVisible(true);
  }

  @Override
  public void signalDoubleRecieved(String name, double value) {
    Logger.getLogger(AdruinoGui.class.getName()).log(Level.INFO, "Distanz empfangen: {0}", value);
    distFrame.setDistance(value);
  }

  @Override
  public void signalBooleanRecieved(String name, boolean value) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void signalStringRecieved(String name, String value) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    new AdruinoGui();
  }

}
