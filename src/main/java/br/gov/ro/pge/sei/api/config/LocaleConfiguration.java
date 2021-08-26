package br.gov.ro.pge.sei.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.Locale;

@Configuration
@Component
public class LocaleConfiguration {

    @Value("${br.gov.ro.pge.sei.api.properties.baseName}") private String baseName;

    @Value("${br.gov.ro.pge.sei.api.properties.language}") private String language;

    @Value("${br.gov.ro.pge.sei.api.properties.country}") private String country;

    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver acceptHeaderLocaleResolver = new AcceptHeaderLocaleResolver();
        acceptHeaderLocaleResolver.setDefaultLocale(new Locale(language, country));
        return acceptHeaderLocaleResolver;
    }

    @Bean(name = "resourceBundleMessagesSource")
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource rs = new ResourceBundleMessageSource();
        rs.setBasename(baseName);
        rs.setDefaultEncoding("UTF-8");
        rs.setUseCodeAsDefaultMessage(Boolean.TRUE);
        return rs;
    }
}
