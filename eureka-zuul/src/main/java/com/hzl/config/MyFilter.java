package com.hzl.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: newcloud
 * @description
 * @author: zhilin
 * @create: 2020-06-21 12:43
 **/
@Component
public class MyFilter extends ZuulFilter {
//    filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
//    pre：路由之前
//    routing：路由之时
//    post： 路由之后
//    error：发送错误调用
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String contextPath = request.getContextPath();
        String requestURI = request.getRequestURI();
        return null;
    }
}
