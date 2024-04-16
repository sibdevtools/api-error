package com.github.simple_mocks.error_service.exception;

import jakarta.annotation.Nonnull;

import java.io.Serializable;

/**
 * Service error type
 *
 * @author sibmaks
 * @since 0.0.1
 */
public interface ServiceError extends Serializable {

    /**
     * System code what cause an error
     *
     * @return system code
     * @see com.github.simple_mocks.error_service.ErrorService
     */
    @Nonnull
    String getSystemCode();

    /**
     * Error code
     *
     * @return error code
     * @see com.github.simple_mocks.error_service.ErrorService
     */
    @Nonnull
    String getErrorCode();

}
