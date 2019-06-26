package com.he.helloupms.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
//    @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
//        resolvers.add(new CurrentUserMethodArgumentResolver());
//        resolvers.add(new StringToListArgumentResolver());
//    }

    /**
     * 跨域支持
     * 或在需要支持跨域的controller上使用@CrossOrigin
     * @param registry
     */
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/api/**")
//                .allowedOrigins("http://192.168.1.97")
//                .allowedMethods("GET", "POST")
//                .allowCredentials(false)
//                .maxAge(3600);
//    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new DemoInterceptor())
//                .addPathPatterns("")//拦截配置
//                .excludePathPatterns("");//排除配置
//    }

    /**
     * 自定义资源映射
     * @param registry
     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("")//请求路径
//                .addResourceLocations("");//资源路径
//    }

    /**
     * 支持HttpMessageConverters(转换request、response的数据格式)
     * @return
     */
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig= new FastJsonConfig();
        fastJsonConfig.setCharset(Charset.forName("UTF-8"));
        fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteEnumUsingToString,SerializerFeature.WriteNonStringKeyAsString);

        fastConverter.setFastJsonConfig(fastJsonConfig);
        List<MediaType> fastMedisTypes = new ArrayList();
        fastMedisTypes.add(MediaType.APPLICATION_JSON_UTF8);
        fastConverter.setSupportedMediaTypes(fastMedisTypes);


        StringHttpMessageConverter stringConverter = new StringHttpMessageConverter();
        stringConverter.setDefaultCharset(Charset.forName("UTF-8"));
        return new HttpMessageConverters(stringConverter,fastConverter);

    }

//    @Bean
//    public SpringContextHolder springContextHolder(){
//        SpringContextHolder springContextHolder = new SpringContextHolder();
//        return springContextHolder;
//    }
}
