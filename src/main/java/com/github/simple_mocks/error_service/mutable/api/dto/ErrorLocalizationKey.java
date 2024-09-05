package com.github.simple_mocks.error_service.mutable.api.dto;

import jakarta.annotation.Nonnull;

import java.util.Locale;

/**
 * @author sibmaks
 * @since 0.0.10
 */
public record ErrorLocalizationKey(@Nonnull String errorCode,
                                   @Nonnull Locale userLocale) {
}
