import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhigang.xu
 * @date 2020/5/12 23:09
 */
@Configuration
public class JavaConfig {
	@Bean
	public User user(){
		return new User(101,"ganquanzhong","pwd","13995978321","china");
	}
}
