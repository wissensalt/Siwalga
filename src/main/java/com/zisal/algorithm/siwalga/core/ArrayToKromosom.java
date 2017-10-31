/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.algorithm.siwalga.core;

/**
 *
 * @author Fauzi
 */
public class ArrayToKromosom {

    String[][] data;

    public ArrayToKromosom(String[][] data) {
        this.data = data;
    }
    
    public Kromosom setToKromosom(){
        Kromosom k = new Kromosom(data);
        return k;
    }
}
