package com.github.simple_mocks.error_service.api.dto;

import jakarta.annotation.Nonnull;

/**
 * Error localization identity
 *
 * @param source error localization source
 * @param code   error code
 * @author sibmaks
 * @since 0.0.2
 */
public record ErrorLocalizationId(
        @Nonnull ErrorSource source,
        @Nonnull String code
) {
}
