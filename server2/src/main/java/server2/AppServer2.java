package server2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by chanwook on 2015. 1. 30..
 */
@Configuration
@EnableRedisHttpSession
@ComponentScan
@EnableAutoConfiguration
public class AppServer2 {

    @Bean
    public JedisConnectionFactory connectionFactory() {
        return new JedisConnectionFactory();
    }

    public static void main(String[] args) {
        SpringApplication.run(AppServer2.class, args);
    }
}
