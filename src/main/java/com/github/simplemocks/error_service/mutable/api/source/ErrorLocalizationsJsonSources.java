package com.github.simplemocks.error_service.mutable.api.source;

import java.lang.annotation.*;

/**
 * Localization source annotation
 *
 * @author sibmaks
 * @since 0.0.3
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface ErrorLocalizationsJsonSources {

    /**
     * All localization JSON sources
     *
     * @return localization sources
     */
    ErrorLocalizationsJsonSource[] value();

}
