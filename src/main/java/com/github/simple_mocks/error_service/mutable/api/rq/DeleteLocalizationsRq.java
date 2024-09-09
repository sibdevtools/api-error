package com.github.simple_mocks.error_service.mutable.api.rq;

import com.github.simple_mocks.error_service.api.dto.ErrorSource;
import com.github.simple_mocks.error_service.mutable.api.dto.ErrorLocalizationQualifier;
import jakarta.annotation.Nonnull;

import java.util.List;

/**
 * @author sibmaks
 * @since 0.0.10
 */
public record DeleteLocalizationsRq(@Nonnull ErrorSource errorSource,
                                    @Nonnull List<ErrorLocalizationQualifier> localizationKeys) {
}
