package com.rui.demo.config;
import com.rui.demo.Repostitory.UserRepository;
import com.rui.demo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;

import java.util.List;


/**
 * 路由配置
 */
@Configuration
public class RouterFunctionConfig {

    /**
     * Sevlet 请求：ServletRequest || HttpServletRequest
     * spring 5.0 重新定义了请求接口，也支持自定义，ServerRequest || Netty （web Sever)
     * 定义 GET 请求，并返回对
     * Flux 是0-N个对象集合
     * Mono是0-1个对象集合
     * Reactive 中的Flux 或Mono它是异步处理（非阻塞）
     * 中的Flux 或Mono都是Publisher
     */
    @Bean
    @Autowired
    public RouterFunction<ServerResponse> personFindUserList (UserRepository userRepository){
       return  RouterFunctions.route(RequestPredicates.GET("/person/getList"),request->{
            //Mono<ServerResponse> response=null;
            List<User> resultList=   userRepository.getList();
            Flux<User>  userFlux=Flux.fromIterable(resultList);
            return ServerResponse.ok().body(userFlux,User.class);
        });

    }
}
