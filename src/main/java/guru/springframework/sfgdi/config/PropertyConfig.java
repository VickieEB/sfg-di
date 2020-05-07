package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebeans.DummyDatasource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class PropertyConfig {

    @Value("${di.username}")
    String username;

    @Value("${di.password}")
    String password;

    @Value("${di.dburl}")
    String dburl;

    @Bean
    public DummyDatasource dummyDatasource(){
        DummyDatasource dummyDatasource = new DummyDatasource();
        dummyDatasource.setUsername(username);
        dummyDatasource.setPassword(password);
        dummyDatasource.setDburl(dburl);

        return dummyDatasource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
