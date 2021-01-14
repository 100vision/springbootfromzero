package com.solexinc.springbootwebinterceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
1.编写拦截器实现类，实现接口   HandlerInterceptor，

重写里面需要的三个比较常用的方法，实现自己的业务逻辑代码
 */
@SpringBootApplication
public class SpringbootWebinterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebinterceptorApplication.class, args);
    }

}
