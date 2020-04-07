import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"casshiro.*"})
//@EnableJpaRepositories(basePackages = "shiro.repository")
//@EntityScan(basePackages = "shiro.entity")
public class CasShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasShiroApplication.class, args);
    }

}
