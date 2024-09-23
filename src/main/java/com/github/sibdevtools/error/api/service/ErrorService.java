package com.github.sibdevtools.error.api.service;


import com.github.sibdevtools.error.api.rq.LocalizeErrorRq;
import com.github.sibdevtools.error.api.rs.LocalizeErrorRs;
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
