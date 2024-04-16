package com.github.simple_mocks.error_service;


import com.github.simple_mocks.error_service.api.ErrorDescription;
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
     * Get error description by system code and error code
     *
     * @param systemCode system code
     * @param code       error code
     * @param userLocale user locale
     * @return description of error or null
     */
    @Nonnull
    ErrorDescription getDescription(@Nonnull String systemCode,
                                    @Nonnull String code,
                                    @Nonnull Locale userLocale);

}
