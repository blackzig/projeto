/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvc.projeto.web.config;

import br.com.mvc.projeto.web.controller.HomeController;
import javax.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class})
@PropertySource("classpath:application.properties")
public class WebMvcConfig extends WebMvcConfigurerAdapter {


    @Bean
    public ViewResolver resolver() {
        InternalResourceViewResolver url = new InternalResourceViewResolver();
        url.setPrefix("/WEB-INF/jsp/");
        url.setSuffix(".jsp");
        return url;
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }    


//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        System.out.println("transactionManager");
//        EntityManagerFactory factory = entityManagerFactory().getObject();
//        return new JpaTransactionManager(factory);
//    }
//	@Bean
//	public PlatformTransactionManager transactionManager() {
//
//		JpaTransactionManager txManager = new JpaTransactionManager();
//		txManager.setEntityManagerFactory(entityManagerFactory().getObject());
//		return txManager;
//	}
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setDatabase(Database.POSTGRESQL);
//        vendorAdapter.setGenerateDdl(true);
//
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//        factory.setJpaVendorAdapter(vendorAdapter);
//        factory.setPackagesToScan("br.com.mvc.projeto.model");
//        factory.setDataSource(dataSource());
//
//        return factory;
////        System.out.println("entityManagerFactory");
////        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
////
////        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
////        vendorAdapter.setGenerateDdl(Boolean.TRUE);
////        vendorAdapter.setShowSql(Boolean.TRUE);
////
////        factory.setDataSource(dataSource());
////        factory.setJpaVendorAdapter(vendorAdapter);
////        factory.setPackagesToScan("br.com.mvc.projeto.model");
////
////        Properties jpaProperties = new Properties();
////        jpaProperties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
////        factory.setJpaProperties(jpaProperties);
////
////        factory.afterPropertiesSet();
////        factory.setLoadTimeWeaver(new InstrumentationLoadTimeWeaver());
////        return factory;
//    }
//
////    @Bean
////    public HibernateExceptionTranslator hibernateExceptionTranslator() {
////        System.out.println("hibernateExceptionTranslator");
////        return new HibernateExceptionTranslator();
////    }
//
//    @Bean
//    public DataSource dataSource() {
//        System.out.println("dataSource");
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName(env.getProperty("db.driverClassName"));
//        dataSource.setUrl(env.getProperty("db.url"));
//        dataSource.setUsername(env.getProperty("db.username"));
//        dataSource.setPassword(env.getProperty("db.password"));
//        return dataSource;
//    }
}
