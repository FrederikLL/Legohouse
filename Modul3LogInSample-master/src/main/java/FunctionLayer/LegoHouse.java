/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author frizz
 */
public class LegoHouse {
    
    private int length;
    private int width;
    private int height;
    private ArrayList<Layer> layers;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public ArrayList<Layer> getLayers() {
        return layers;
    }
    
    public LegoHouse( int length, int width, int height ) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public HashMap<String, Integer> getTotalBricks() {
        HashMap<String, Integer> totalBricks = new HashMap();
        totalBricks.put("fourXtwo", 0);
        totalBricks.put("twoXtwo", 0);
        totalBricks.put("oneXtwo", 0);
        for(Layer l : layers) {
            int fourXtwo = totalBricks.get("fourXtwo");
            totalBricks.put("fourXtwo", l.getLength().getBricks().get("fourXtwo") + fourXtwo);
            int twoXtwo = totalBricks.get("twoXtwo");
            totalBricks.put("twoXtwo", l.getLength().getBricks().get("twoXtwo") + twoXtwo);
            int oneXtwo = totalBricks.get("oneXtwo");
            totalBricks.put("oneXtwo", l.getLength().getBricks().get("oneXtwo") + oneXtwo);
        }
        
        return totalBricks;
    }

    public void addLayer(Layer layer) {
        layers.add(layer);
    }

    @Override
    public String toString() {
        return "Legohouse{" + "length=" + length + ", width=" + width + ", height=" + height + ", layers=" + layers + '}';
    }
    
    
}
