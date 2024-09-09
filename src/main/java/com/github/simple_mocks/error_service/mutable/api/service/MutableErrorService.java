package com.github.simple_mocks.error_service.mutable.api.service;

import com.github.simple_mocks.error_service.mutable.api.rq.AddLocalizationsRq;
import com.github.simple_mocks.error_service.mutable.api.rq.DeleteLocalizationsRq;
import jakarta.annotation.Nonnull;

/**
 * Interface provide ability to change error service state
 *
 * @author sibmaks
 * @since 0.0.10
 */
public interface MutableErrorService {

    /**
     * Add localizations into error service.
     * In case if localizations already exist, then do nothing
     *
     * @param rq add request
     */
    void addLocalizations(@Nonnull AddLocalizationsRq rq);

    /**
     * Delete localizations from error service.
     * In case if localizations are already deleted, then do nothing
     *
     * @param rq deleting request
     */
    void deleteLocalizations(@Nonnull DeleteLocalizationsRq rq);
}
