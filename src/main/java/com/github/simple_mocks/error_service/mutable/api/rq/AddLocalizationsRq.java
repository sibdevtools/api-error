package com.github.simple_mocks.error_service.mutable.api.rq;

import com.github.simple_mocks.error_service.api.dto.LocalizedError;
import com.github.simple_mocks.error_service.api.dto.ErrorSourceId;
import com.github.simple_mocks.error_service.mutable.api.dto.ErrorLocalizationKey;
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
