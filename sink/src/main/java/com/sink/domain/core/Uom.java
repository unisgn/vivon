package com.sink.domain.core;

/**
 * stand for Unit Of Measure;
 * @author root
 *
 */
public class Uom {

    private UomGroup group;
    private String name;
    private Uom baseUom;        // atom uom
    private boolean base;       // 
    private int rate;           // rate to atom uom
}
