package zjc.starless.openssltest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OpenSslTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenSslTestApplication.class, args);
    }

}
