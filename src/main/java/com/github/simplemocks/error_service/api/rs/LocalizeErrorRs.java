package com.github.simplemocks.error_service.api.rs;

import com.github.simplemocks.common.api.rs.StandardBodyRs;
import com.github.simplemocks.error_service.api.dto.LocalizedError;
import jakarta.annotation.Nullable;
import lombok.Builder;

/**
 * Localize error response dto
 *
 * @author sibmaks
 * @since 0.0.1
 */
@Builder
public class LocalizeErrorRs extends StandardBodyRs<LocalizedError> {

    /**
     * Construct localize error response
     *
     * @param localizedError localized error
     */
    public LocalizeErrorRs(@Nullable LocalizedError localizedError) {
        super(localizedError);
    }

}
