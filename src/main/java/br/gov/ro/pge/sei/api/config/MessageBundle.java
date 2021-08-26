package br.gov.ro.pge.sei.api.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageBundle {

    private static ResourceBundleMessageSource messageSource;

    public MessageBundle(@Qualifier("resourceBundleMessagesSource") ResourceBundleMessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public static String getMessage(String code) {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(code, null, locale);
    }
}
