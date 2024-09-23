package com.github.sibdevtools.error.api.rs;

import com.github.sibdevtools.error.api.dto.LocalizedError;
import com.github.sibdevtools.common.api.dto.ErrorRsDto;
import com.github.sibdevtools.common.api.rs.StandardBodyRs;
import jakarta.annotation.Nullable;

/**
 * Localize error response dto
 *
 * @author sibmaks
 * @since 0.0.1
 */
public class LocalizeErrorRs extends StandardBodyRs<LocalizedError> {

    /**
     * Construct localize error response
     *
     * @param localizedError localized error
     */
    public LocalizeErrorRs(@Nullable LocalizedError localizedError) {
        super(localizedError);
    }

    /**
     * Construct localize error response with error
     *
     * @param error happened error
     */
    public LocalizeErrorRs(ErrorRsDto error) {
        super(error);
    }

}
