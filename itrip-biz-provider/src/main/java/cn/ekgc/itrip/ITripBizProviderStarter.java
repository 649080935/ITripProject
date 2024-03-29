package cn.ekgc.itrip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@MapperScan("cn.ekgc.itrip.dao")
@SpringBootApplication
public class ITripBizProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(ITripBizProviderStarter.class, args);
	}
}
