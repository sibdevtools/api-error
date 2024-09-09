package com.github.simple_mocks.error_service.api.dto;

import jakarta.annotation.Nonnull;

/**
 * Error localization identity
 *
 * @param sourceId error localization source identity
 * @param code     error code
 * @author sibmaks
 * @since 0.0.2
 */
public record ErrorLocalizationId(
        @Nonnull ErrorSourceId sourceId,
        @Nonnull String code
) {
}
