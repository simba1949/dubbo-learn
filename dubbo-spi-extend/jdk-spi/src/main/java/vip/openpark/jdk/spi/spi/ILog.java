package vip.openpark.jdk.spi.spi;

/**
 * @author anthony
 * @version 2024/7/22
 * @since 2024/7/22 10:01
 */
public interface ILog {
    /**
     * 打印日志
     *
     * @param msg 日志内容
     */
    void log(String msg);
}