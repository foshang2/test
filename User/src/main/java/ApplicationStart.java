import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import service.AuthInterceptor;

@SpringBootApplication
@ComponentScan(basePackages = {"entity", "service", "utils"})
@MapperScan("mapper")
public class ApplicationStart implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }


//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new AuthInterceptor())
//                .addPathPatterns("/123");  // 拦截路径
////                .excludePathPatterns("/login"); // 排除路径
//    }
}
