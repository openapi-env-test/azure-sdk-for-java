// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scan.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.scan.fluent.models.ScanningAccountInner;
import com.azure.resourcemanager.scan.models.ProvisioningState;
import com.azure.resourcemanager.scan.models.ScanningAccount;
import com.azure.resourcemanager.scan.models.ScanningAccountPatch;
import java.util.Collections;
import java.util.Map;

public final class ScanningAccountImpl implements ScanningAccount, ScanningAccount.Definition, ScanningAccount.Update {
    private ScanningAccountInner innerObject;

    private final com.azure.resourcemanager.scan.AzureScanningManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String aadClientId() {
        return this.innerModel().aadClientId();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ScanningAccountInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.scan.AzureScanningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private ScanningAccountPatch updateScanningAccountPatch;

    public ScanningAccountImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ScanningAccount create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureScanningAccounts()
                .create(resourceGroupName, accountName, this.innerModel(), Context.NONE);
        return this;
    }

    public ScanningAccount create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureScanningAccounts()
                .create(resourceGroupName, accountName, this.innerModel(), context);
        return this;
    }

    ScanningAccountImpl(String name, com.azure.resourcemanager.scan.AzureScanningManager serviceManager) {
        this.innerObject = new ScanningAccountInner();
        this.serviceManager = serviceManager;
        this.accountName = name;
    }

    public ScanningAccountImpl update() {
        this.updateScanningAccountPatch = new ScanningAccountPatch();
        return this;
    }

    public ScanningAccount apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureScanningAccounts()
                .updateWithResponse(resourceGroupName, accountName, updateScanningAccountPatch, Context.NONE)
                .getValue();
        return this;
    }

    public ScanningAccount apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureScanningAccounts()
                .updateWithResponse(resourceGroupName, accountName, updateScanningAccountPatch, context)
                .getValue();
        return this;
    }

    ScanningAccountImpl(
        ScanningAccountInner innerObject, com.azure.resourcemanager.scan.AzureScanningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "scanningAccounts");
    }

    public ScanningAccount refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureScanningAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, Context.NONE)
                .getValue();
        return this;
    }

    public ScanningAccount refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureScanningAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, context)
                .getValue();
        return this;
    }

    public ScanningAccountImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ScanningAccountImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ScanningAccountImpl withAadClientId(String aadClientId) {
        if (isInCreateMode()) {
            this.innerModel().withAadClientId(aadClientId);
            return this;
        } else {
            this.updateScanningAccountPatch.withAadClientId(aadClientId);
            return this;
        }
    }

    public ScanningAccountImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
