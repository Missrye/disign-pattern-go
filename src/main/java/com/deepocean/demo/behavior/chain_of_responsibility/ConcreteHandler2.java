package com.deepocean.demo.behavior.chain_of_responsibility;

public class ConcreteHandler2 extends Handler {

    public ConcreteHandler2(Handler successor) {
        super(successor);
    }

    @Override
    public void handle(Request request) {
        if (request.getType() == RequestType.TYPE2) {
            System.out.println(request.getName());
            return;
        }

        if (successor != null) {
            successor.handle(request);
        }
    }
}
