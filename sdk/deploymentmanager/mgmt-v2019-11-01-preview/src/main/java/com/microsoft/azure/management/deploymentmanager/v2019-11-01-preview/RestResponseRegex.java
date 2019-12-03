/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019-11-01-preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The regular expressions to match the response content with.
 */
public class RestResponseRegex {
    /**
     * The list of regular expressions.
     */
    @JsonProperty(value = "matches")
    private List<String> matches;

    /**
     * Indicates whether any or all of the expressions should match with the
     * response content. Possible values include: 'All', 'Any'.
     */
    @JsonProperty(value = "matchQuantifier")
    private RestMatchQuantifier matchQuantifier;

    /**
     * Get the list of regular expressions.
     *
     * @return the matches value
     */
    public List<String> matches() {
        return this.matches;
    }

    /**
     * Set the list of regular expressions.
     *
     * @param matches the matches value to set
     * @return the RestResponseRegex object itself.
     */
    public RestResponseRegex withMatches(List<String> matches) {
        this.matches = matches;
        return this;
    }

    /**
     * Get indicates whether any or all of the expressions should match with the response content. Possible values include: 'All', 'Any'.
     *
     * @return the matchQuantifier value
     */
    public RestMatchQuantifier matchQuantifier() {
        return this.matchQuantifier;
    }

    /**
     * Set indicates whether any or all of the expressions should match with the response content. Possible values include: 'All', 'Any'.
     *
     * @param matchQuantifier the matchQuantifier value to set
     * @return the RestResponseRegex object itself.
     */
    public RestResponseRegex withMatchQuantifier(RestMatchQuantifier matchQuantifier) {
        this.matchQuantifier = matchQuantifier;
        return this;
    }

}
