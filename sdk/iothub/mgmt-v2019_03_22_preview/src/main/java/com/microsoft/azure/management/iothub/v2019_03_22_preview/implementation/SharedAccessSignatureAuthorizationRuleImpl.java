/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_03_22_preview.implementation;

import com.microsoft.azure.management.iothub.v2019_03_22_preview.SharedAccessSignatureAuthorizationRule;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.AccessRights;

class SharedAccessSignatureAuthorizationRuleImpl extends WrapperImpl<SharedAccessSignatureAuthorizationRuleInner> implements SharedAccessSignatureAuthorizationRule {
    private final DevicesManager manager;
    SharedAccessSignatureAuthorizationRuleImpl(SharedAccessSignatureAuthorizationRuleInner inner, DevicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DevicesManager manager() {
        return this.manager;
    }

    @Override
    public String keyName() {
        return this.inner().keyName();
    }

    @Override
    public String primaryKey() {
        return this.inner().primaryKey();
    }

    @Override
    public AccessRights rights() {
        return this.inner().rights();
    }

    @Override
    public String secondaryKey() {
        return this.inner().secondaryKey();
    }

}
