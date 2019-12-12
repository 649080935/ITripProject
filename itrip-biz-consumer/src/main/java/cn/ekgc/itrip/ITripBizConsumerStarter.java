package cn.ekgc.itrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ITripBizConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(ITripBizConsumerStarter.class, args);
	}
}
