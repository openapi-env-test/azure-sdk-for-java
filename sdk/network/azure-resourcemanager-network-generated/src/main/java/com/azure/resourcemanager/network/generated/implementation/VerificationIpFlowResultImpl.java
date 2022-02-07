// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.VerificationIpFlowResultInner;
import com.azure.resourcemanager.network.generated.models.Access;
import com.azure.resourcemanager.network.generated.models.VerificationIpFlowResult;

public final class VerificationIpFlowResultImpl implements VerificationIpFlowResult {
    private VerificationIpFlowResultInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    VerificationIpFlowResultImpl(
        VerificationIpFlowResultInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Access access() {
        return this.innerModel().access();
    }

    public String ruleName() {
        return this.innerModel().ruleName();
    }

    public VerificationIpFlowResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
