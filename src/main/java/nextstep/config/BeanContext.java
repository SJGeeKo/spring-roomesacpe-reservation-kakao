package nextstep.config;

import org.springframework.context.ApplicationContext;

public class BeanContext {

    private static ApplicationContext applicationContext;

    public static void init(ApplicationContext context) {
        applicationContext = context;
    }

    public static <T> T get(Class<T> tClass) {
        return applicationContext.getBean(tClass);
    }

}
