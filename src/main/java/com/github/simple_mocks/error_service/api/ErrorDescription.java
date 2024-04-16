package com.github.simple_mocks.error_service.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Error description, contains:<br/>
 * - system code - source of error<br/>
 * - code - unique system error code<br/>
 * - title - user friendly title<br/>
 * - message - user friendly message
 *
 * @author sibmaks
 * @since 0.0.1
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDescription implements Serializable {
    /**
     * System code source of error
     */
    private String systemCode;
    /**
     * Error code
     */
    private String code;
    /**
     * Human-readable title
     */
    private String title;
    /**
     * Human-readable message
     */
    private String message;
}
