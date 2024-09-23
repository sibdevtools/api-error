package com.github.sibdevtools.error.mutable.api.rq;

import com.github.sibdevtools.error.api.dto.ErrorSourceId;
import com.github.sibdevtools.error.mutable.api.dto.ErrorLocalizationKey;
import jakarta.annotation.Nonnull;

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
