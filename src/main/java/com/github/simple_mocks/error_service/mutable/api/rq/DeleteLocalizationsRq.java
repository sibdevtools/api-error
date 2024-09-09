package com.github.simple_mocks.error_service.mutable.api.rq;

import com.github.simple_mocks.error_service.api.dto.ErrorSourceId;
import com.github.simple_mocks.error_service.mutable.api.dto.ErrorLocalizationKey;
import jakarta.annotation.Nonnull;

import java.util.List;
import java.util.Set;

/**
 * Delete localizations request
 *
 * @param sourceId         error sourceId identifier
 * @param localizationKeys localization keys to delete
 * @author sibmaks
 * @since 0.0.10
 */
public record DeleteLocalizationsRq(@Nonnull ErrorSourceId sourceId,
                                    @Nonnull Set<ErrorLocalizationKey> localizationKeys) {
}
