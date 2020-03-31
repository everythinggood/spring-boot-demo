import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controller", "config"})
@EnableCasClient//启用cas client
public class CasApplication {
    public static void main(String[] args) {
        SpringApplication.run(CasApplication.class, args);
    }
}