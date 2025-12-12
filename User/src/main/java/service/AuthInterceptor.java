package service;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) {
        // 请求处理前执行，返回true放行
        System.out.println("getPathInfo = " + request.getPathInfo());
        if (request.getPathInfo().contains("Plus")) {
            System.out.println("请求器拦截");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) {
        // 控制器方法执行后、视图渲染前执行
//        modelAndView.addObject("timestamp", System.currentTimeMillis());
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler,
                                Exception ex) {
        // 请求完成后执行（视图渲染完毕）
//        logRequest(request);
    }



}
