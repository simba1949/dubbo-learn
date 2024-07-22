package vip.openpark.jdk.spi;

import vip.openpark.jdk.spi.spi.ILog;

import java.util.ServiceLoader;

/**
 * @author anthony
 * @version 2024/7/22
 * @since 2024/7/22 10:01
 */
public class JdkSpiApplication {
    public static void main(String[] args) {
        ServiceLoader<ILog> serviceLoader = ServiceLoader.load(ILog.class);
        for (ILog iLog : serviceLoader) {
            iLog.log("hello world");
        }
    }
}