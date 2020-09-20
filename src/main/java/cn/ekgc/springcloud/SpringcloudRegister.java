package cn.ekgc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudRegister
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringcloudRegister.class,args);
    }
}
