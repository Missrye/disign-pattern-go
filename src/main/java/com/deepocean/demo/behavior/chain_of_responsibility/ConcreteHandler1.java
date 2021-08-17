package com.deepocean.demo.behavior.chain_of_responsibility;

public class ConcreteHandler1 extends Handler {

    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    @Override
    public void handle(Request request) {
        if (request.getType() == RequestType.TYPE1) {
            System.out.println(request.getName());
            return;
        }

        if (successor != null) {
            successor.handle(request);
        }
    }
}
