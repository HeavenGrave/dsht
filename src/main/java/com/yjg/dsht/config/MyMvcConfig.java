package com.yjg.dsht.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        //super.addViewControllers(registry);
        //浏览器发送/atguigu请求来到 success
        registry.addViewController("/atguigu").setViewName("success");
    }

    //所有的WebMvcConfigurerAdapter组件会一起起作用
    @Bean//将组件注册在容器
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter= new WebMvcConfigurerAdapter(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("index");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/ok.html").setViewName("main");
                registry.addViewController("/book.html").setViewName("lists");
                registry.addViewController("/appok.html").setViewName("appmain");
                registry.addViewController("/sure.html").setViewName("add");

            }
            @Override
            public void addInterceptors(InterceptorRegistry registry){
//               super.addInterceptors(registry);
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/ok.html");
            }
        };
        return adapter;
    }

}
