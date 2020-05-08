package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebeans.DummyDatasource;
import guru.springframework.sfgdi.examplebeans.DummyJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${di.username}")
    String username;

    @Value("${di.password}")
    String password;

    @Value("${di.dburl}")
    String dburl;

    @Value("${di.jms.username}")
    String jmsUsername;

    @Value("${di.jms.password}")
    String jmsPassword;

    @Value("${di.jms.url}")
    String jmsUrl;

    @Bean
    public DummyDatasource dummyDatasource(){
        DummyDatasource dummyDatasource = new DummyDatasource();
        dummyDatasource.setUsername(env.getProperty("USERNAME"));
        dummyDatasource.setPassword(password);
        dummyDatasource.setDburl(dburl);
        return dummyDatasource;
    }

    @Bean
    public DummyJmsBroker dummyJmsBroker(){
        DummyJmsBroker dummyJmsBroker = new DummyJmsBroker();
        dummyJmsBroker.setUsername(jmsUsername);
        dummyJmsBroker.setPassword(jmsPassword);
        dummyJmsBroker.setUrl(jmsUrl);
        return  dummyJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
