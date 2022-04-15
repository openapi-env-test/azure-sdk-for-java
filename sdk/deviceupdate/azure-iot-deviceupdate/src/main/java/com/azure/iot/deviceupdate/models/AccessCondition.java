package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameter group. */
@Fluent
public final class AccessCondition {
    /*
     * Defines the If-None-Match condition. The operation will be performed
     * only if the ETag on the server does not match this value.
     */
    @JsonProperty(value = "If-None-Match")
    private String ifNoneMatch;

    /**
     * Get the ifNoneMatch property: Defines the If-None-Match condition. The operation will be performed only if the
     * ETag on the server does not match this value.
     *
     * @return the ifNoneMatch value.
     */
    public String getIfNoneMatch() {
        return this.ifNoneMatch;
    }

    /**
     * Set the ifNoneMatch property: Defines the If-None-Match condition. The operation will be performed only if the
     * ETag on the server does not match this value.
     *
     * @param ifNoneMatch the ifNoneMatch value to set.
     * @return the AccessCondition object itself.
     */
    public AccessCondition setIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }
}
