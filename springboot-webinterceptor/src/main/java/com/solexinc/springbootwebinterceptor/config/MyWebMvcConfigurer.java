package com.solexinc.springbootwebinterceptor.config;

import com.solexinc.springbootwebinterceptor.Intercetors.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(new MyInterceptor())
                    .addPathPatterns("/**")
                    .excludePathPatterns(
                            "/contents/index.html",
                            "/user/login.html");
            //html静态资源*.js,*.css等也需要排除在拦截器之外

    }
}
