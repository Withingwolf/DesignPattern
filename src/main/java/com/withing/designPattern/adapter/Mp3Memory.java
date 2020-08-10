package com.withing.designPattern.adapter;

/**
 * @author huangweixin7
 * @date 2020/8/10 22:52:41
 * description: Mp3Memory
 */
public class Mp3Memory implements MediaInterface {
    @Override
    public String readMedia() {
        return "mp3 memory";
    }
}
