package com.springapp.model;

import java.util.*;

/**
 * Created by mk on 29.04.2017.
 */
public class BunchOf {

    private List<SomeLine> datLines;

    public List<SomeLine> getDatLines() {
        if (datLines == null) {
            datLines = new ArrayList<>();
        }
        return datLines;
    }

    public void setDatLines(List<SomeLine> datLines) {
        this.datLines = datLines;
    }
}
