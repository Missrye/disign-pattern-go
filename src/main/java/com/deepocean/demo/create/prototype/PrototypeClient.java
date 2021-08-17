package com.deepocean.demo.create.prototype;

import java.util.List;

public class PrototypeClient {
    public static void main(String[] args) {
        Report report = new Report();
        report.loadData();

        Report reportWithTitle = (Report) report.copy();
        List<String> contents = reportWithTitle.getContents();
        contents.add("-------------------------");
        contents.add(">>>>>>>>>>>>>>>>>>>>>>>>>");

        for (String s : contents) {
            System.out.println(s);
        }
    }
}
