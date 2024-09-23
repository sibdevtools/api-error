package com.github.sibdevtools.error.mutable.api.rq;

import com.github.sibdevtools.error.api.dto.ErrorSourceId;
import com.github.sibdevtools.error.mutable.api.dto.ErrorLocalizationKey;
import com.github.sibdevtools.error.api.dto.LocalizedError;
import jakarta.annotation.Nonnull;

import java.util.Map;

/**
 * Add localizations request dto
 *
 * @param sourceId      error localization sourceId identifier
 * @param localizations error localizations
 * @author sibmaks
 * @since 0.0.10
 */
public record AddLocalizationsRq(@Nonnull ErrorSourceId sourceId,
                                 @Nonnull Map<ErrorLocalizationKey, LocalizedError> localizations) {
}
