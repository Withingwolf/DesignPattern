package com.withing.designPattern.abstractFactory;

public class SystemFactory {

    public static AbstractFactory getSystemFactory(String system){
        if("Microsoft".equals(system)){
            return new MicroSoftFactory();
        }else if ("Linux".equals(system)){
            return new LinuxFactory();
        }
        return null;
    }

}
