package br.gov.ro.pge.sei.api.util;

import org.springframework.util.Assert;

import java.text.MessageFormat;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public final class MessageBundle extends ResourceBundle {

    private ResourceBundle resource;

    private MessageBundle(final String baseName) {
        super();
        Assert.notNull(baseName, "baseName");
        this.resource = ResourceBundle.getBundle(baseName, Locale.getDefault());
    }

    private MessageBundle(final String baseName, final Locale locale) {
        super();
        Assert.notNull(baseName, "baseName");
        Assert.notNull(locale, "locale");
        this.resource = ResourceBundle.getBundle(baseName, locale);
    }

    private MessageBundle(final ResourceBundle resource) {
        super();
        Assert.notNull(resource, "resource");
        this.resource = resource;
    }

    public static MessageBundle getMessageBundle(final String baseName) {
        return new MessageBundle(baseName);
    }

    public static MessageBundle getMessageBundle(final String baseName, final Locale locale) {
        return new MessageBundle(baseName, locale);
    }

    public static MessageBundle getMessageBundle(final ResourceBundle resource) {
        return new MessageBundle(resource);
    }

    public String getString(final String key, final Object... arguments) {
        String pattern = this.resource.getString(key);
        String msg = MessageFormat.format(pattern, arguments);
        return msg;
    }

    @Override
    protected Object handleGetObject(String key) {
        return this.resource.getString(key);
    }

    @Override
    public Enumeration<String> getKeys() {
        return Collections.enumeration(keySet());
    }

}
