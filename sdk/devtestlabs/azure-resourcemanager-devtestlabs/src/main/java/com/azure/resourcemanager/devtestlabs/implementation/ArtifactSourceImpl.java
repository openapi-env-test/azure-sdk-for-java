// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.ArtifactSourceInner;
import com.azure.resourcemanager.devtestlabs.models.ArtifactSource;
import com.azure.resourcemanager.devtestlabs.models.ArtifactSourceFragment;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.SourceControlType;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class ArtifactSourceImpl implements ArtifactSource, ArtifactSource.Definition, ArtifactSource.Update {
    private ArtifactSourceInner innerObject;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String uri() {
        return this.innerModel().uri();
    }

    public SourceControlType sourceType() {
        return this.innerModel().sourceType();
    }

    public String folderPath() {
        return this.innerModel().folderPath();
    }

    public String armTemplateFolderPath() {
        return this.innerModel().armTemplateFolderPath();
    }

    public String branchRef() {
        return this.innerModel().branchRef();
    }

    public String securityToken() {
        return this.innerModel().securityToken();
    }

    public EnableStatus status() {
        return this.innerModel().status();
    }

    public OffsetDateTime createdDate() {
        return this.innerModel().createdDate();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String uniqueIdentifier() {
        return this.innerModel().uniqueIdentifier();
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

    public ArtifactSourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String labName;

    private String name;

    private ArtifactSourceFragment updateArtifactSource;

    public ArtifactSourceImpl withExistingLab(String resourceGroupName, String labName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        return this;
    }

    public ArtifactSource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getArtifactSources()
                .createOrUpdateWithResponse(resourceGroupName, labName, name, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ArtifactSource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getArtifactSources()
                .createOrUpdateWithResponse(resourceGroupName, labName, name, this.innerModel(), context)
                .getValue();
        return this;
    }

    ArtifactSourceImpl(String name, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = new ArtifactSourceInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public ArtifactSourceImpl update() {
        this.updateArtifactSource = new ArtifactSourceFragment();
        return this;
    }

    public ArtifactSource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getArtifactSources()
                .updateWithResponse(resourceGroupName, labName, name, updateArtifactSource, Context.NONE)
                .getValue();
        return this;
    }

    public ArtifactSource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getArtifactSources()
                .updateWithResponse(resourceGroupName, labName, name, updateArtifactSource, context)
                .getValue();
        return this;
    }

    ArtifactSourceImpl(
        ArtifactSourceInner innerObject, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.labName = Utils.getValueFromIdByName(innerObject.id(), "labs");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "artifactsources");
    }

    public ArtifactSource refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getArtifactSources()
                .getWithResponse(resourceGroupName, labName, name, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public ArtifactSource refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getArtifactSources()
                .getWithResponse(resourceGroupName, labName, name, localExpand, context)
                .getValue();
        return this;
    }

    public ArtifactSourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ArtifactSourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ArtifactSourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateArtifactSource.withTags(tags);
            return this;
        }
    }

    public ArtifactSourceImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public ArtifactSourceImpl withUri(String uri) {
        this.innerModel().withUri(uri);
        return this;
    }

    public ArtifactSourceImpl withSourceType(SourceControlType sourceType) {
        this.innerModel().withSourceType(sourceType);
        return this;
    }

    public ArtifactSourceImpl withFolderPath(String folderPath) {
        this.innerModel().withFolderPath(folderPath);
        return this;
    }

    public ArtifactSourceImpl withArmTemplateFolderPath(String armTemplateFolderPath) {
        this.innerModel().withArmTemplateFolderPath(armTemplateFolderPath);
        return this;
    }

    public ArtifactSourceImpl withBranchRef(String branchRef) {
        this.innerModel().withBranchRef(branchRef);
        return this;
    }

    public ArtifactSourceImpl withSecurityToken(String securityToken) {
        this.innerModel().withSecurityToken(securityToken);
        return this;
    }

    public ArtifactSourceImpl withStatus(EnableStatus status) {
        this.innerModel().withStatus(status);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
