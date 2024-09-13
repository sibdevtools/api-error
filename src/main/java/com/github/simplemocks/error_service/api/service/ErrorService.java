package com.github.simplemocks.error_service.api.service;


import com.github.simplemocks.error_service.api.rq.LocalizeErrorRq;
import com.github.simplemocks.error_service.api.rs.LocalizeErrorRs;
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
    LocalizeErrorRs localize(@Nonnull LocalizeErrorRq rq);

}
