package com.github.sibdevtools.error.mutable.api.dto;

import jakarta.annotation.Nonnull;

import java.util.Locale;

/**
 * Error localization data qualifier
 *
 * @param errorCode  error localization code
 * @param userLocale user locale
 * @author sibmaks
 * @since 0.0.10
 */
public record ErrorLocalizationKey(@Nonnull String errorCode,
                                   @Nonnull Locale userLocale) {
}
