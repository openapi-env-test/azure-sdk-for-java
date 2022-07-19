// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.authorization.generated.models.AccessReviewHistoryDefinitionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Access Review History Definition Instance properties. */
@Fluent
public final class AccessReviewHistoryInstanceProperties {
    /*
     * Date time used when selecting review data, all reviews included in data
     * start on or after this date. For use only with one-time/non-recurring
     * reports.
     */
    @JsonProperty(value = "reviewHistoryPeriodStartDateTime")
    private OffsetDateTime reviewHistoryPeriodStartDateTime;

    /*
     * Date time used when selecting review data, all reviews included in data
     * end on or before this date. For use only with one-time/non-recurring
     * reports.
     */
    @JsonProperty(value = "reviewHistoryPeriodEndDateTime")
    private OffsetDateTime reviewHistoryPeriodEndDateTime;

    /*
     * The display name for the parent history definition.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Status of the requested review history instance data. This is either
     * requested, in-progress, done or error. The state transitions are as
     * follows - Requested -> InProgress -> Done -> Expired
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private AccessReviewHistoryDefinitionStatus status;

    /*
     * Date time when the history data report is scheduled to be generated.
     */
    @JsonProperty(value = "runDateTime")
    private OffsetDateTime runDateTime;

    /*
     * Date time when the history data report is scheduled to be generated.
     */
    @JsonProperty(value = "fulfilledDateTime")
    private OffsetDateTime fulfilledDateTime;

    /*
     * Uri which can be used to retrieve review history data. To generate this
     * Uri, generateDownloadUri() must be called for a specific
     * accessReviewHistoryDefinitionInstance. The link expires after a 24 hour
     * period. Callers can see the expiration date time by looking at the 'se'
     * parameter in the generated uri.
     */
    @JsonProperty(value = "downloadUri", access = JsonProperty.Access.WRITE_ONLY)
    private String downloadUri;

    /*
     * Date time when history data report expires and the associated data is
     * deleted.
     */
    @JsonProperty(value = "expiration")
    private OffsetDateTime expiration;

    /**
     * Get the reviewHistoryPeriodStartDateTime property: Date time used when selecting review data, all reviews
     * included in data start on or after this date. For use only with one-time/non-recurring reports.
     *
     * @return the reviewHistoryPeriodStartDateTime value.
     */
    public OffsetDateTime reviewHistoryPeriodStartDateTime() {
        return this.reviewHistoryPeriodStartDateTime;
    }

    /**
     * Set the reviewHistoryPeriodStartDateTime property: Date time used when selecting review data, all reviews
     * included in data start on or after this date. For use only with one-time/non-recurring reports.
     *
     * @param reviewHistoryPeriodStartDateTime the reviewHistoryPeriodStartDateTime value to set.
     * @return the AccessReviewHistoryInstanceProperties object itself.
     */
    public AccessReviewHistoryInstanceProperties withReviewHistoryPeriodStartDateTime(
        OffsetDateTime reviewHistoryPeriodStartDateTime) {
        this.reviewHistoryPeriodStartDateTime = reviewHistoryPeriodStartDateTime;
        return this;
    }

    /**
     * Get the reviewHistoryPeriodEndDateTime property: Date time used when selecting review data, all reviews included
     * in data end on or before this date. For use only with one-time/non-recurring reports.
     *
     * @return the reviewHistoryPeriodEndDateTime value.
     */
    public OffsetDateTime reviewHistoryPeriodEndDateTime() {
        return this.reviewHistoryPeriodEndDateTime;
    }

    /**
     * Set the reviewHistoryPeriodEndDateTime property: Date time used when selecting review data, all reviews included
     * in data end on or before this date. For use only with one-time/non-recurring reports.
     *
     * @param reviewHistoryPeriodEndDateTime the reviewHistoryPeriodEndDateTime value to set.
     * @return the AccessReviewHistoryInstanceProperties object itself.
     */
    public AccessReviewHistoryInstanceProperties withReviewHistoryPeriodEndDateTime(
        OffsetDateTime reviewHistoryPeriodEndDateTime) {
        this.reviewHistoryPeriodEndDateTime = reviewHistoryPeriodEndDateTime;
        return this;
    }

    /**
     * Get the displayName property: The display name for the parent history definition.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for the parent history definition.
     *
     * @param displayName the displayName value to set.
     * @return the AccessReviewHistoryInstanceProperties object itself.
     */
    public AccessReviewHistoryInstanceProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the status property: Status of the requested review history instance data. This is either requested,
     * in-progress, done or error. The state transitions are as follows - Requested -&gt; InProgress -&gt; Done -&gt;
     * Expired.
     *
     * @return the status value.
     */
    public AccessReviewHistoryDefinitionStatus status() {
        return this.status;
    }

    /**
     * Get the runDateTime property: Date time when the history data report is scheduled to be generated.
     *
     * @return the runDateTime value.
     */
    public OffsetDateTime runDateTime() {
        return this.runDateTime;
    }

    /**
     * Set the runDateTime property: Date time when the history data report is scheduled to be generated.
     *
     * @param runDateTime the runDateTime value to set.
     * @return the AccessReviewHistoryInstanceProperties object itself.
     */
    public AccessReviewHistoryInstanceProperties withRunDateTime(OffsetDateTime runDateTime) {
        this.runDateTime = runDateTime;
        return this;
    }

    /**
     * Get the fulfilledDateTime property: Date time when the history data report is scheduled to be generated.
     *
     * @return the fulfilledDateTime value.
     */
    public OffsetDateTime fulfilledDateTime() {
        return this.fulfilledDateTime;
    }

    /**
     * Set the fulfilledDateTime property: Date time when the history data report is scheduled to be generated.
     *
     * @param fulfilledDateTime the fulfilledDateTime value to set.
     * @return the AccessReviewHistoryInstanceProperties object itself.
     */
    public AccessReviewHistoryInstanceProperties withFulfilledDateTime(OffsetDateTime fulfilledDateTime) {
        this.fulfilledDateTime = fulfilledDateTime;
        return this;
    }

    /**
     * Get the downloadUri property: Uri which can be used to retrieve review history data. To generate this Uri,
     * generateDownloadUri() must be called for a specific accessReviewHistoryDefinitionInstance. The link expires after
     * a 24 hour period. Callers can see the expiration date time by looking at the 'se' parameter in the generated uri.
     *
     * @return the downloadUri value.
     */
    public String downloadUri() {
        return this.downloadUri;
    }

    /**
     * Get the expiration property: Date time when history data report expires and the associated data is deleted.
     *
     * @return the expiration value.
     */
    public OffsetDateTime expiration() {
        return this.expiration;
    }

    /**
     * Set the expiration property: Date time when history data report expires and the associated data is deleted.
     *
     * @param expiration the expiration value to set.
     * @return the AccessReviewHistoryInstanceProperties object itself.
     */
    public AccessReviewHistoryInstanceProperties withExpiration(OffsetDateTime expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
