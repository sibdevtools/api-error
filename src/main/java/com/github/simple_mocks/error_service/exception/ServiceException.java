package com.github.simple_mocks.error_service.exception;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import lombok.Getter;

/**
 * Common service exception.<br/>
 * Should be thrown when something wrong happened in logically usage of APIs
 *
 * @author sibmaks
 * @since 0.0.1
 */
@Getter
public class ServiceException extends RuntimeException {
    private static final int DEFAULT_STATUS = 503;

    /**
     * Service error status code
     */
    private final int status;
    /**
     * Service error info
     */
    private final ServiceError serviceError;

    /**
     * Construct exception with default status code {@link #DEFAULT_STATUS}
     *
     * @param serviceError  service error info
     * @param systemMessage system message to log
     */
    public ServiceException(@Nonnull ServiceError serviceError,
                            @Nonnull String systemMessage) {
        this(DEFAULT_STATUS, serviceError, systemMessage);
    }

    /**
     * Construct exception with default status code {@link #DEFAULT_STATUS} and exception cause
     *
     * @param serviceError  service error info
     * @param systemMessage system message to log
     * @param cause         service exception cause
     */
    public ServiceException(@Nonnull ServiceError serviceError,
                            @Nonnull String systemMessage,
                            @Nonnull Throwable cause) {
        this(DEFAULT_STATUS, serviceError, systemMessage, cause);
    }

    /**
     * Construct exception with specified status code
     *
     * @param status        service error status code
     * @param serviceError  service error info
     * @param systemMessage system message to log
     */
    public ServiceException(int status,
                            @Nonnull ServiceError serviceError,
                            @Nonnull String systemMessage) {
        this(status, serviceError, systemMessage, null);
    }

    /**
     * Construct exception with specified status code and cause
     *
     * @param status        service error status code
     * @param serviceError  service error info
     * @param systemMessage system message to log
     * @param cause         service exception cause
     */
    public ServiceException(int status,
                            @Nonnull ServiceError serviceError,
                            @Nonnull String systemMessage,
                            @Nullable Throwable cause) {
        super(systemMessage, cause);
        this.status = status;
        this.serviceError = serviceError;
    }
}
