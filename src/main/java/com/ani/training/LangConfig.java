package com.ani.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

/**
 *  - what is @Configuration annotation ? These are the classes which holds beans and gets initialized at the time of app startup.
 *  - what is @Bean annotation ? these are objects which are maintained by spring.
 *  - what is LocalResolver ? ->  We use locale resolver to resolve default locale, if locale has not provided in request
 *  - what is ResourceBundleMessageSource ? -> this class helps in selecting particular resource as the locale provided in request.
 *  - how do you create resource for different languages ? -> by creating properties file whose name is separated by _locale e.g messages_es.properties
 * */


@Configuration
public class LangConfig {

    @Bean
    public LocaleResolver localeResolver() { // default
        SessionLocaleResolver resolver = new SessionLocaleResolver();
        resolver.setDefaultLocale(Locale.US);
        return resolver;
    }

    @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasename("messages");
        return source;
    }
}
