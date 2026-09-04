package io.github.sibdevtools.error.mutable.api.rq;

import io.github.sibdevtools.error.api.dto.ErrorSourceId;
import io.github.sibdevtools.error.mutable.api.dto.ErrorLocalizationKey;
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
