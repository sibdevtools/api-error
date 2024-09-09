package com.github.simple_mocks.error_service.api.dto;

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
public class ErrorSource implements Serializable {
    public static final String DEFAULT_KIND_CODE = "SERVICE_STANDARD_ERRORS";

    private String systemCode;
    private String kindCode = DEFAULT_KIND_CODE;

    public ErrorSource(String systemCode) {
        this.systemCode = systemCode;
    }
}
