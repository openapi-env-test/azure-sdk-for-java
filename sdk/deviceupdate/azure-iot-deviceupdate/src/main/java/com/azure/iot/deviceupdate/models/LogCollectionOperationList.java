package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of diagnostics operations with server paging support. */
@Fluent
public final class LogCollectionOperationList {
    /*
     * The collection of pageable items.
     */
    @JsonProperty(value = "value", required = true)
    private List<LogCollectionOperation> value;

    /*
     * The link to the next page of items.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The collection of pageable items.
     *
     * @return the value value.
     */
    public List<LogCollectionOperation> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The collection of pageable items.
     *
     * @param value the value value to set.
     * @return the LogCollectionOperationList object itself.
     */
    public LogCollectionOperationList setValue(List<LogCollectionOperation> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of items.
     *
     * @param nextLink the nextLink value to set.
     * @return the LogCollectionOperationList object itself.
     */
    public LogCollectionOperationList setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
