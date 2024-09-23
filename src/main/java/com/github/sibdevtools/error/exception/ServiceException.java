package com.github.sibdevtools.error.exception;

import com.github.sibdevtools.error.api.dto.ErrorSourceId;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import lombok.Getter;

/**
 * Common service exception.<br/>
 * Should be thrown when something wrong happened in logical usage of APIs
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
    private final ErrorSourceId sourceId;
    /**
     * Service error localization code
     */
    private final String code;

    /**
     * Construct exception with default status code {@link #DEFAULT_STATUS}
     *
     * @param sourceId      error source identity
     * @param code          service error code
     * @param systemMessage system message to log
     */
    public ServiceException(@Nonnull ErrorSourceId sourceId,
                            @Nonnull String code,
                            @Nonnull String systemMessage) {
        this(DEFAULT_STATUS, sourceId, code, systemMessage);
    }

    /**
     * Construct exception with default status code {@link #DEFAULT_STATUS} and exception cause
     *
     * @param sourceId      error source identity
     * @param code          service error code
     * @param systemMessage system message to log
     * @param cause         service exception cause
     */
    public ServiceException(@Nonnull ErrorSourceId sourceId,
                            @Nonnull String code,
                            @Nonnull String systemMessage,
                            @Nonnull Throwable cause) {
        this(DEFAULT_STATUS, sourceId, code, systemMessage, cause);
    }

    /**
     * Construct exception with specified status code
     *
     * @param status        service error status code
     * @param sourceId      error source identity
     * @param code          service error code
     * @param systemMessage system message to log
     */
    public ServiceException(int status,
                            @Nonnull ErrorSourceId sourceId,
                            @Nonnull String code,
                            @Nonnull String systemMessage) {
        this(status, sourceId, code, systemMessage, null);
    }

    /**
     * Construct exception with specified status code and cause
     *
     * @param status        service error status code
     * @param sourceId      error source identity
     * @param code          service error code
     * @param systemMessage system message to log
     * @param cause         service exception cause
     */
    public ServiceException(int status,
                            @Nonnull ErrorSourceId sourceId,
                            @Nonnull String code,
                            @Nonnull String systemMessage,
                            @Nullable Throwable cause) {
        super(systemMessage, cause);
        this.status = status;
        this.sourceId = sourceId;
        this.code = code;
    }
}
