package vip.openpark.jdk.spi.spi.impl;

import vip.openpark.jdk.spi.spi.ILog;

/**
 * @author anthony
 * @version 2024/7/22
 * @since 2024/7/22 10:02
 */
public class Logback implements ILog {
    @Override
    public void log(String msg) {
        System.out.println("Logback: " + msg);
    }
}