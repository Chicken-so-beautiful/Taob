package demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
	private static final long Max_Age=24*60*60;
	
	@Bean
	public CorsFilter corsFilter()
	{
		UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
		CorsConfiguration corsConfiguration=new CorsConfiguration();
		corsConfiguration.addAllowedOrigin("http://localhost:5173/");//设置访问源地址
		corsConfiguration.addAllowedHeader("*");//设置访问源请求头
		corsConfiguration.addAllowedMethod("*");//设置访问源请求方法
		corsConfiguration.setMaxAge(Max_Age);
		source.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(source);
	}
}
