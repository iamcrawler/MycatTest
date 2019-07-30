package cn.iamcrawler.crawlertest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.iamcrawler.crawlertest.mapper")
public class CrawlertestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrawlertestApplication.class, args);
    }

}
