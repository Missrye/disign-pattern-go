package com.deepocean.demo.behavior.chain_of_responsibility;

public abstract class Handler {
    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle(Request request);
}
