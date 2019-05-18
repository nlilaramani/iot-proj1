/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.azure.cosmosdb.sample;

/**
 *
 * @author Owner
 */
public class VectorCollection {
    public static Vector getFirstVector(){
        Vector v=new Vector();
        v.setTs(System.currentTimeMillis());
        v.setId("1");
        v.setName("Site 1");
        v.setValues(new double[] {65.1,22.3,44.5,12.4,33.6});
        return v;
    }
    
}
