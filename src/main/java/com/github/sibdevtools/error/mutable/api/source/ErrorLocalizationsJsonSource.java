package com.github.sibdevtools.error.mutable.api.source;

import com.github.sibdevtools.error.api.dto.ErrorSourceId;

import java.lang.annotation.*;

/**
 * Error localizations source annotation
 *
 * @author sibmaks
 * @since 0.0.13
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(ErrorLocalizationsJsonSources.class)
public @interface ErrorLocalizationsJsonSource {

    /**
     * Error source system code
     *
     * @return system code
     */
    String systemCode();

    /**
     * Error kind code
     *
     * @return kind code
     */
    String kindCode() default ErrorSourceId.DEFAULT_KIND_CODE;

    /**
     * Locale iso3 code
     *
     * @return iso3 language code
     */
    String iso3Code();

    /**
     * Path to json file
     *
     * @return path to file
     */
    String path();
}
