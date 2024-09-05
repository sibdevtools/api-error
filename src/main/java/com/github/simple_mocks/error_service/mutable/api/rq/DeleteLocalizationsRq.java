package com.github.simple_mocks.error_service.mutable.api.rq;

import com.github.simple_mocks.error_service.api.ErrorSource;
import com.github.simple_mocks.error_service.mutable.api.dto.ErrorLocalizationKey;
import jakarta.annotation.Nonnull;

import java.util.List;

/**
 * @author sibmaks
 * @since 0.0.10
 */
public record DeleteLocalizationsRq(@Nonnull ErrorSource errorSource,
                                    @Nonnull List<ErrorLocalizationKey> localizationKeys) {
}
