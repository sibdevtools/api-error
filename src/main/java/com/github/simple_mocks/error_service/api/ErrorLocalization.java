package com.github.simple_mocks.error_service.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Error localization, contains:<br/>
 * - source - source of error<br/>
 * - title - user friendly title<br/>
 * - message - user friendly message<br/>
 * - systemMessage - log friendly message
 *
 * @author sibmaks
 * @since 0.0.1
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorLocalization implements Serializable {
    /**
     * Human-readable title
     */
    private String title;
    /**
     * Human-readable message
     */
    private String message;
    /**
     * Log-friendly message
     */
    private String systemMessage;
}
