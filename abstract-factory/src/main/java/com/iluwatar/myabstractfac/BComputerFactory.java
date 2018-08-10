package com.iluwatar.myabstractfac;

public class BComputerFactory implements ComputerFactory {
    @Override
    public CPU createCPU() {
        return new BCPU();
    }

    @Override
    public Mouse createMouse() {
        return new BMouse();
    }

    @Override
    public Screen createScreen() {
        return new BScreen();
    }
}
