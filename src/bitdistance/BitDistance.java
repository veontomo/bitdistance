/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bitdistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Andrea
 */
public class BitDistance {

    /**
     * Hash map that contains "coordinate" of each element
     */
    private HashMap<Integer, String> _nodes;
    
    /**
     * _nodes length
     */
    private int _numOfNodes;
    
    /**
     * List of visited nodes
     */
    private List<Integer> _visitedNodes;

    public BitDistance() {
        this._nodes = new HashMap();
        this._visitedNodes = new ArrayList();
        this._numOfNodes = 0;
    }

    
    
    /**
     * _visitedNodes getter
     */
    public List<Integer> getVisitedNodes() {
        return _visitedNodes;
    }
    
    /**
     * Returns true of the node has been visited
     * @param n
     * @return boolean
     */
    public boolean isVisited(int n)
    {
        return this._visitedNodes.contains(n);
    }
    
    /**
     * Marks existent node as visited.
     * @param n 
     */
    public void markAsVisited(int n)
    {
        if (this._nodes.containsKey(n)){
            if (!this._visitedNodes.contains(n)){
                this._visitedNodes.add(n);
            }
        } else {
            throw new IllegalArgumentException("Node #" + n + " does not exist"
                    + " and can not be marked as visited.");
        }
        
    }

    
    /**
     * _nodes getter
     * @return HashMap
     */
    public HashMap<Integer, String> getNodes() {
        return _nodes;
    }

    /**
     * _numOfNodes getter
     * @return int
     */
    public int size() {
        return _numOfNodes;
    }
    
    public int addNode(String coord)
    {
        int len = this._numOfNodes;
        this._nodes.put(len, coord);
        this._numOfNodes++;
        return len;
    }
    
    public String getNode(int n)
    {
        return this._nodes.get(n);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
