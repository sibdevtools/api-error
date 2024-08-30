package com.github.simple_mocks.error_service;


import com.github.simple_mocks.error_service.api.ErrorLocalization;
import com.github.simple_mocks.error_service.api.ErrorSource;
import jakarta.annotation.Nonnull;

import java.util.Locale;

/**
 * Error service - service for get error description by system code and error core
 *
 * @author sibmaks
 * @since 0.0.1
 */
public interface ErrorService {

    /**
     * Get error description by system code, error code and locale
     *
     * @param errorSource source of error
     * @param userLocale  user locale
     * @return description of error or null
     */
    @Nonnull
    ErrorLocalization getDescription(@Nonnull ErrorSource errorSource,
                                     @Nonnull Locale userLocale);

}
