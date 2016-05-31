import org.springframework.boot.SpringApplication;
import com.demo.conf.ApplicationConfigation;
import org.springframework.context.annotation.Import;

/**
 * Created by sp on 2016/5/31.
 */
@Import(ApplicationConfigation.class)
public class Application {

    public static void main(String [] args){
        SpringApplication.run(Application.class);
    }
}
