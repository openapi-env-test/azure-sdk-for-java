// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration for ARC autoprovisioning. */
@Fluent
public final class DefenderForServersGcpOfferingArcAutoProvisioningConfiguration {
    /*
     * The Azure service principal client id for agent onboarding
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * The agent onboarding service account numeric id
     */
    @JsonProperty(value = "agentOnboardingServiceAccountNumericId")
    private String agentOnboardingServiceAccountNumericId;

    /**
     * Get the clientId property: The Azure service principal client id for agent onboarding.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The Azure service principal client id for agent onboarding.
     *
     * @param clientId the clientId value to set.
     * @return the DefenderForServersGcpOfferingArcAutoProvisioningConfiguration object itself.
     */
    public DefenderForServersGcpOfferingArcAutoProvisioningConfiguration withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the agentOnboardingServiceAccountNumericId property: The agent onboarding service account numeric id.
     *
     * @return the agentOnboardingServiceAccountNumericId value.
     */
    public String agentOnboardingServiceAccountNumericId() {
        return this.agentOnboardingServiceAccountNumericId;
    }

    /**
     * Set the agentOnboardingServiceAccountNumericId property: The agent onboarding service account numeric id.
     *
     * @param agentOnboardingServiceAccountNumericId the agentOnboardingServiceAccountNumericId value to set.
     * @return the DefenderForServersGcpOfferingArcAutoProvisioningConfiguration object itself.
     */
    public DefenderForServersGcpOfferingArcAutoProvisioningConfiguration withAgentOnboardingServiceAccountNumericId(
        String agentOnboardingServiceAccountNumericId) {
        this.agentOnboardingServiceAccountNumericId = agentOnboardingServiceAccountNumericId;
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
