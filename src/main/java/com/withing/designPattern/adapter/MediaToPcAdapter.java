package com.withing.designPattern.adapter;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author huangweixin7
 * @date 2020/8/10 22:54:43
 * description: MediaToPCAdpater
 */
public class MediaToPcAdapter implements PCInterface {

    private static ConcurrentHashMap<String, MediaInterface> map = new ConcurrentHashMap<>();

    static {
        map.put("mp3", new Mp3Memory());
        map.put("camera", new CameraMemory());
    }

    void readMouse() {
        System.out.println("read Mouse");
    }

    @Override
    public void read(String type) {
        if ("mouse".equalsIgnoreCase(type)) {
            readMouse();
        } else {
            MediaInterface mediaInterface = map.get(type);
            if (mediaInterface != null) {
                System.out.println("read " + mediaInterface.readMedia());
            }
        }
    }
}
