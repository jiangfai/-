package config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

// 相当于是fc-servlet.xml
@Configuration
@EnableWebMvc
@ComponentScan("com.qfedu.controller")
public class MvcConfig 
		extends WebMvcConfigurerAdapter{
	
	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		// 配置消息转换器
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 配置拦截器
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// 配置资源映射
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();	// 启用DefaultServlet处理静态资源
	}
	
	// Velocity 
	// Freemarker
	// Thymeleaf
	// Excel / PDF / Word

	// 视图解析器
	@Bean
	public ViewResolver jspViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		resolver.setOrder(10);
		return resolver;
	}
	
	@Bean
	public FreeMarkerConfigurer configurer() {
		FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
		configurer.setTemplateLoaderPath("/WEB-INF/ftl");
		configurer.setDefaultEncoding("utf-8");
		return configurer;
	}
	
	@Bean
	public ViewResolver freemarkerViewResolver() {
		FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
		resolver.setSuffix(".ftl");
		resolver.setContentType("text/html;charset=utf-8");
		resolver.setCache(true);
		resolver.setOrder(1);
		return resolver;
	}
}
