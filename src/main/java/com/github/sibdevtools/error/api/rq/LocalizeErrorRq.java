package com.github.sibdevtools.error.api.rq;

import com.github.sibdevtools.error.api.dto.ErrorLocalizationId;
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
