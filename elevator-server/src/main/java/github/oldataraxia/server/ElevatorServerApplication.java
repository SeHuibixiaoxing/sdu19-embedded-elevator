package github.oldataraxia.server;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("github.oldataraxia.server.Dao.Mapper")
public class ElevatorServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElevatorServerApplication.class, args);
    }

}
