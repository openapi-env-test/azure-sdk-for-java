/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.KeyVaultReferenceResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2019_08_01.ManagedServiceIdentityType;
import com.microsoft.azure.management.appservice.v2019_08_01.ConfigReferenceLocation;
import com.microsoft.azure.management.appservice.v2019_08_01.ConfigReferenceSource;
import com.microsoft.azure.management.appservice.v2019_08_01.ResolveStatus;

class KeyVaultReferenceResourceImpl extends WrapperImpl<KeyVaultReferenceResourceInner> implements KeyVaultReferenceResource {
    private final CertificateRegistrationManager manager;
    KeyVaultReferenceResourceImpl(KeyVaultReferenceResourceInner inner, CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public String details() {
        return this.inner().details();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ManagedServiceIdentityType identityType() {
        return this.inner().identityType();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public ConfigReferenceLocation location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String reference() {
        return this.inner().reference();
    }

    @Override
    public String secretName() {
        return this.inner().secretName();
    }

    @Override
    public String secretVersion() {
        return this.inner().secretVersion();
    }

    @Override
    public ConfigReferenceSource source() {
        return this.inner().source();
    }

    @Override
    public ResolveStatus status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String vaultName() {
        return this.inner().vaultName();
    }

}
