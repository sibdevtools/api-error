package com.github.simple_mocks.error_service.api.rq;

import com.github.simple_mocks.error_service.api.dto.ErrorLocalizationId;
import jakarta.annotation.Nonnull;

import java.util.Locale;

/**
 * Localize error request
 *
 * @param errorLocalizationId localization error identity
 * @param userLocale          user locale
 * @author sibmaks
 * @since 0.0.11
 */
public record LocalizeErrorRq(@Nonnull ErrorLocalizationId errorLocalizationId,
                              @Nonnull Locale userLocale) {
}
