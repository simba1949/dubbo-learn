package vip.openpark.dubbo.spi.provider.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

/**
 * {@link @Activate}
 * group：URL（org.apache.dubbo.common.URL）中的分组如果匹配则激活，如 provider、consumer
 * value：URL 中如果包含该 key 值则激活
 * before：填写扩展点列表，表示哪些扩展点要在本扩展点之前激活
 * after：表示哪些扩展点要在本扩展点之前激活
 * order：优先级（执行顺序），order 越小执行越早
 * 如：
 * {@link @Activate(group = CommonConstants.PROVIDER, order = -20000)} 针对provider端拦截
 * {@link @Activate(group = CommonConstants.CONSUMER, order = -20000)} 针对consumer端拦截
 *
 * @author anthony
 * @version 2024/7/25
 * @since 2024/7/25 10:12
 */
@Slf4j
@Activate(group = CommonConstants.PROVIDER, order = -20000)
public class LogFilter implements Filter {
    /**
     * @param invoker    调用器
     * @param invocation 调用
     * @return org.apache.dubbo.rpc.Result
     * @throws RpcException org.apache.dubbo.rpc.RpcException
     */
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        try {

            log.info("日志过滤器，执行服务前");
            // 调用下一个拦截器或者业务服务
            Result result = invoker.invoke(invocation);
            log.info("日志过滤器，执行服务后");
            return result;
        } catch (Exception e) {
            log.error("LogFilter error", e);
            return new AppResponse();
        }
    }
}