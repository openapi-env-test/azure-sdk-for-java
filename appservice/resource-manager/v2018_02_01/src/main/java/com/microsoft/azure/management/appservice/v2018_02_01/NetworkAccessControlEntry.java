/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network access control entry.
 */
public class NetworkAccessControlEntry {
    /**
     * Action object. Possible values include: 'Permit', 'Deny'.
     */
    @JsonProperty(value = "action")
    private AccessControlEntryAction action;

    /**
     * Description of network access control entry.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Order of precedence.
     */
    @JsonProperty(value = "order")
    private Integer order;

    /**
     * Remote subnet.
     */
    @JsonProperty(value = "remoteSubnet")
    private String remoteSubnet;

    /**
     * Get action object. Possible values include: 'Permit', 'Deny'.
     *
     * @return the action value
     */
    public AccessControlEntryAction action() {
        return this.action;
    }

    /**
     * Set action object. Possible values include: 'Permit', 'Deny'.
     *
     * @param action the action value to set
     * @return the NetworkAccessControlEntry object itself.
     */
    public NetworkAccessControlEntry withAction(AccessControlEntryAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get description of network access control entry.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of network access control entry.
     *
     * @param description the description value to set
     * @return the NetworkAccessControlEntry object itself.
     */
    public NetworkAccessControlEntry withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get order of precedence.
     *
     * @return the order value
     */
    public Integer order() {
        return this.order;
    }

    /**
     * Set order of precedence.
     *
     * @param order the order value to set
     * @return the NetworkAccessControlEntry object itself.
     */
    public NetworkAccessControlEntry withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Get remote subnet.
     *
     * @return the remoteSubnet value
     */
    public String remoteSubnet() {
        return this.remoteSubnet;
    }

    /**
     * Set remote subnet.
     *
     * @param remoteSubnet the remoteSubnet value to set
     * @return the NetworkAccessControlEntry object itself.
     */
    public NetworkAccessControlEntry withRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }

}
