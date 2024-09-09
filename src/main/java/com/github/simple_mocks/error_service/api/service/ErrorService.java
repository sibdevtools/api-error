package com.github.simple_mocks.error_service.api.service;


import com.github.simple_mocks.error_service.api.dto.LocalizedError;
import com.github.simple_mocks.error_service.api.rq.LocalizeErrorRq;
import jakarta.annotation.Nonnull;

/**
 * Error service - service for get error description by system code and error core
 *
 * @author sibmaks
 * @since 0.0.1
 */
public interface ErrorService {

    /**
     * Get error localization by system code, error code and locale
     *
     * @param rq request for localization
     * @return description of error or null
     */
    @Nonnull
    LocalizedError localize(@Nonnull LocalizeErrorRq rq);

}
