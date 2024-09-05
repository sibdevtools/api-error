package com.github.simple_mocks.error_service.mutable.api.rq;

import com.github.simple_mocks.error_service.api.ErrorLocalization;
import com.github.simple_mocks.error_service.api.ErrorSource;
import com.github.simple_mocks.error_service.mutable.api.dto.ErrorLocalizationKey;
import jakarta.annotation.Nonnull;

import java.util.List;
import java.util.Map;

/**
 * @author sibmaks
 * @since 0.0.10
 */
public record AddLocalizationsRq(@Nonnull ErrorSource errorSource,
                                 @Nonnull Map<ErrorLocalizationKey, List<ErrorLocalization>> localizations) {
}
