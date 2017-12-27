package com.zz.springcloud.zuulfilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import javax.servlet.http.HttpServletRequest;

public class Filter extends ZuulFilter  {

	/**
	 * 返回一个字符串代表过滤器的类型
	 * pre表示被路由之前
	 */
    @Override
    public String filterType() {
        return "pre";
    }

	/**
	 * 过滤顺序
	 */

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String accessToken = String.valueOf(request.getParameter("Token"));
        if(!accessToken.equals("zz")) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
        return null;
    }

}
