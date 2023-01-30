package nextstep;

import nextstep.config.BeanContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class RoomEscapeApplication {

    private final ApplicationContext appContext;

    public RoomEscapeApplication(ApplicationContext appContext) {
        this.appContext = appContext;
    }

    public static void main(String[] args) {
        // 스프링 애플리케이션 실행
        SpringApplication.run(RoomEscapeApplication.class, args);

        // 콘솔 애플리케이션 실행
        ConsoleEscapeApplication.run();
    }

    @PostConstruct
    public void init() {
        BeanContext.init(appContext);
    }
}