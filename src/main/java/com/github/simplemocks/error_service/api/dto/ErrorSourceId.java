package com.github.simplemocks.error_service.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Service error type
 *
 * @author sibmaks
 * @since 0.0.1
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorSourceId implements Serializable {
    /**
     * Default kind code
     */
    public static final String DEFAULT_KIND_CODE = "SERVICE_STANDARD_ERRORS";

    /**
     * System code
     */
    private String systemCode;
    /**
     * Kind code, can be used to clarify error source
     */
    private String kindCode = DEFAULT_KIND_CODE;

    /**
     * Construct error source code from system
     *
     * @param systemCode system code
     */
    public ErrorSourceId(String systemCode) {
        this.systemCode = systemCode;
    }
}
