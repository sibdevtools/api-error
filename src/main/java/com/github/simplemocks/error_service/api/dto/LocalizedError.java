package com.github.simplemocks.error_service.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Localized error dto
 *
 * @author sibmaks
 * @since 0.0.1
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocalizedError implements Serializable {
    /**
     * Human-readable title
     */
    private String title;
    /**
     * Human-readable message
     */
    private String message;
}
