package com.github.sibmaks.error_service.api;

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
 * @since 2023-04-11
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDescription implements Serializable {
    private String systemCode;
    private String code;
    private String title;
    private String message;
}
