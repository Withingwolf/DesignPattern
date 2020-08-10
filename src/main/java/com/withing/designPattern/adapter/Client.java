package com.withing.designPattern.adapter;

import org.junit.Test;

/**
 * @author huangweixin7
 * @date 2020/8/10 22:51:36
 * description: Client
 */
public class Client {

    @Test
    public void testPCInterface() {
        PCInterface pcInterface = new MediaToPcAdapter();
        pcInterface.read("mouse");
        pcInterface.read("mp3");
        pcInterface.read("camera");
    }
}
