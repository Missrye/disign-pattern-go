package com.deepocean.designpattern.structuremode.facade;

public class Facade {

    private SubSystem subSystem = new SubSystem();

    public void watchTV() {
        subSystem.turnOnTV();
        subSystem.setCD("a movie");
        subSystem.startWatching();
    }
}

