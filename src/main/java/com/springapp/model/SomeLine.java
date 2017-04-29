package com.springapp.model;

/**
 * Created by mk on 29.04.2017.
 */
public class SomeLine {

    private String aFld, bFld, cFld, dFld;
    private String tic_0, tic_1, tic_2;

    public SomeLine(String aFld, String bFld, String cFld, String dFld, int tic_0, int tic_1, int tic_2) {
        this.aFld = aFld;
        this.bFld = bFld;
        this.cFld = cFld;
        this.dFld = dFld;
        this.tic_0 = String.valueOf(tic_0);
        this.tic_1 = String.valueOf(tic_1);
        this.tic_2 = String.valueOf(tic_2);
    }

    public String getaFld() {
        return aFld;
    }

    public void setaFld(String aFld) {
        this.aFld = aFld;
    }

    public String getbFld() {
        return bFld;
    }

    public void setbFld(String bFld) {
        this.bFld = bFld;
    }

    public String getcFld() {
        return cFld;
    }

    public void setcFld(String cFld) {
        this.cFld = cFld;
    }

    public String getdFld() {
        return dFld;
    }

    public void setdFld(String dFld) {
        this.dFld = dFld;
    }

    public String getTic_0() {
        return tic_0;
    }

    public void setTic_0(String tic_0) {
        this.tic_0 = tic_0;
    }

    public String getTic_1() {
        return tic_1;
    }

    public void setTic_1(String tic_1) {
        this.tic_1 = tic_1;
    }

    public String getTic_2() {
        return tic_2;
    }

    public void setTic_2(String tic_2) {
        this.tic_2 = tic_2;
    }
}
