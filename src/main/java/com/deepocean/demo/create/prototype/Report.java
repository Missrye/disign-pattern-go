package com.deepocean.demo.create.prototype;

import java.util.ArrayList;
import java.util.List;

public class Report implements Prototype {
    private List<String> parts;

    public Report() {
        this.parts = new ArrayList<>();
    }

    public Report(List<String> parts) {
        this.parts = parts;
    }

    // 耗时操作
    public void loadData() {
        parts.clear();
        parts.add("~~~~~~~~~~~~~~~~~");
        parts.add("=================");
        parts.add("~~~~~~~~~~~~~~~~~");
    }

    public List<String> getContents() {
        return parts;
    }


    @Override
    public Prototype copy() {
        List<String> clone = new ArrayList<>(parts);
        return new Report(clone);
    }
}
