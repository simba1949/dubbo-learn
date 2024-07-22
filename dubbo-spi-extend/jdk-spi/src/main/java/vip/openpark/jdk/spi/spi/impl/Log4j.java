package vip.openpark.jdk.spi.spi.impl;

import vip.openpark.jdk.spi.spi.ILog;

/**
 * @author anthony
 * @version 2024/7/22
 * @since 2024/7/22 10:01
 */
public class Log4j implements ILog {
    @Override
    public void log(String msg) {
        System.out.println("Log4j: " + msg);
    }
}