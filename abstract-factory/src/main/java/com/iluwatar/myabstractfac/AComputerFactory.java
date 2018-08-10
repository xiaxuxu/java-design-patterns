package com.iluwatar.myabstractfac;

public class AComputerFactory implements ComputerFactory {
    @Override
    public CPU createCPU() {
        return new ACPU();
    }

    @Override
    public Mouse createMouse() {
        return new AMouse();
    }

    @Override
    public Screen createScreen() {
        return new AScreen();
    }
}
