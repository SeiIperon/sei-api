package br.gov.ro.pge.sei.api.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageBundle {

    private static ResourceBundleMessageSource messageSource;

    public MessageBundle(@Qualifier("resourceBundleMessageSource") ResourceBundleMessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public static String getMessage(String code) {
        return messageSource.getMessage(code, null, LocaleContextHolder.getLocale());
    }
}
