package com.iluwatar.myabstractfac;

public class FactoryMaker {
    CPU cpu;
    Mouse mouse;
    Screen screen;
    ComputerFactory computerFactory;
    public FactoryMaker(String computerName){
        if(computerName.equals("A")){
            computerFactory=new AComputerFactory();
        }else if(computerName.equals("B")){
            computerFactory=new BComputerFactory();
        }
    }
    public void createComputer(){
        cpu=computerFactory.createCPU();
        mouse=computerFactory.createMouse();
        screen=computerFactory.createScreen();
    }

    public static void main(String[] args) {
        FactoryMaker a = new FactoryMaker("A");
        a.createComputer();
        a.cpu.getProducer();
        a.mouse.getColor();
        a.screen.getSize();
    }


}
