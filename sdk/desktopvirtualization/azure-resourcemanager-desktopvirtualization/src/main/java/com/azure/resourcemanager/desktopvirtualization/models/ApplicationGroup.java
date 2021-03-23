// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ApplicationGroupInner;
import java.util.Map;

/** An immutable client-side representation of ApplicationGroup. */
public interface ApplicationGroup {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the managedBy property: The fully qualified resource ID of the resource that manages this resource.
     * Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment
     * will not delete the resource if it is removed from the template since it is managed by another resource.
     *
     * @return the managedBy value.
     */
    String managedBy();

    /**
     * Gets the kind property: Metadata used by portal/tooling/etc to render different UX experiences for resources of
     * the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type. If supported, the resource provider must
     * validate and persist this value.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the etag property: The etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal etag convention. Entity tags are used for comparing two or more entities from
     * the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24),
     * If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the identity property: The identity property.
     *
     * @return the identity value.
     */
    ResourceModelWithAllowedPropertySetIdentity identity();

    /**
     * Gets the sku property: The sku property.
     *
     * @return the sku value.
     */
    ResourceModelWithAllowedPropertySetSku sku();

    /**
     * Gets the plan property: The plan property.
     *
     * @return the plan value.
     */
    ResourceModelWithAllowedPropertySetPlan plan();

    /**
     * Gets the objectId property: ObjectId of ApplicationGroup. (internal use).
     *
     * @return the objectId value.
     */
    String objectId();

    /**
     * Gets the description property: Description of ApplicationGroup.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the friendlyName property: Friendly name of ApplicationGroup.
     *
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * Gets the hostPoolArmPath property: HostPool arm path of ApplicationGroup.
     *
     * @return the hostPoolArmPath value.
     */
    String hostPoolArmPath();

    /**
     * Gets the workspaceArmPath property: Workspace arm path of ApplicationGroup.
     *
     * @return the workspaceArmPath value.
     */
    String workspaceArmPath();

    /**
     * Gets the applicationGroupType property: Resource Type of ApplicationGroup.
     *
     * @return the applicationGroupType value.
     */
    ApplicationGroupType applicationGroupType();

    /**
     * Gets the migrationRequest property: The registration info of HostPool.
     *
     * @return the migrationRequest value.
     */
    MigrationRequestProperties migrationRequest();

    /**
     * Gets the cloudPcResource property: Is cloud pc resource.
     *
     * @return the cloudPcResource value.
     */
    Boolean cloudPcResource();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.desktopvirtualization.fluent.models.ApplicationGroupInner object.
     *
     * @return the inner object.
     */
    ApplicationGroupInner innerModel();

    /** The entirety of the ApplicationGroup definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithHostPoolArmPath,
            DefinitionStages.WithApplicationGroupType,
            DefinitionStages.WithCreate {
    }
    /** The ApplicationGroup definition stages. */
    interface DefinitionStages {
        /** The first stage of the ApplicationGroup definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ApplicationGroup definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the ApplicationGroup definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithHostPoolArmPath withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the ApplicationGroup definition allowing to specify hostPoolArmPath. */
        interface WithHostPoolArmPath {
            /**
             * Specifies the hostPoolArmPath property: HostPool arm path of ApplicationGroup..
             *
             * @param hostPoolArmPath HostPool arm path of ApplicationGroup.
             * @return the next definition stage.
             */
            WithApplicationGroupType withHostPoolArmPath(String hostPoolArmPath);
        }
        /** The stage of the ApplicationGroup definition allowing to specify applicationGroupType. */
        interface WithApplicationGroupType {
            /**
             * Specifies the applicationGroupType property: Resource Type of ApplicationGroup..
             *
             * @param applicationGroupType Resource Type of ApplicationGroup.
             * @return the next definition stage.
             */
            WithCreate withApplicationGroupType(ApplicationGroupType applicationGroupType);
        }
        /**
         * The stage of the ApplicationGroup definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithManagedBy,
                DefinitionStages.WithKind,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithSku,
                DefinitionStages.WithPlan,
                DefinitionStages.WithDescription,
                DefinitionStages.WithFriendlyName,
                DefinitionStages.WithMigrationRequest {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ApplicationGroup create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ApplicationGroup create(Context context);
        }
        /** The stage of the ApplicationGroup definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ApplicationGroup definition allowing to specify managedBy. */
        interface WithManagedBy {
            /**
             * Specifies the managedBy property: The fully qualified resource ID of the resource that manages this
             * resource. Indicates if this resource is managed by another Azure resource. If this is present, complete
             * mode deployment will not delete the resource if it is removed from the template since it is managed by
             * another resource..
             *
             * @param managedBy The fully qualified resource ID of the resource that manages this resource. Indicates if
             *     this resource is managed by another Azure resource. If this is present, complete mode deployment will
             *     not delete the resource if it is removed from the template since it is managed by another resource.
             * @return the next definition stage.
             */
            WithCreate withManagedBy(String managedBy);
        }
        /** The stage of the ApplicationGroup definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Metadata used by portal/tooling/etc to render different UX experiences for
             * resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type. If supported, the
             * resource provider must validate and persist this value..
             *
             * @param kind Metadata used by portal/tooling/etc to render different UX experiences for resources of the
             *     same type; e.g. ApiApps are a kind of Microsoft.Web/sites type. If supported, the resource provider
             *     must validate and persist this value.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
        /** The stage of the ApplicationGroup definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity property..
             *
             * @param identity The identity property.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ResourceModelWithAllowedPropertySetIdentity identity);
        }
        /** The stage of the ApplicationGroup definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku property..
             *
             * @param sku The sku property.
             * @return the next definition stage.
             */
            WithCreate withSku(ResourceModelWithAllowedPropertySetSku sku);
        }
        /** The stage of the ApplicationGroup definition allowing to specify plan. */
        interface WithPlan {
            /**
             * Specifies the plan property: The plan property..
             *
             * @param plan The plan property.
             * @return the next definition stage.
             */
            WithCreate withPlan(ResourceModelWithAllowedPropertySetPlan plan);
        }
        /** The stage of the ApplicationGroup definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description of ApplicationGroup..
             *
             * @param description Description of ApplicationGroup.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the ApplicationGroup definition allowing to specify friendlyName. */
        interface WithFriendlyName {
            /**
             * Specifies the friendlyName property: Friendly name of ApplicationGroup..
             *
             * @param friendlyName Friendly name of ApplicationGroup.
             * @return the next definition stage.
             */
            WithCreate withFriendlyName(String friendlyName);
        }
        /** The stage of the ApplicationGroup definition allowing to specify migrationRequest. */
        interface WithMigrationRequest {
            /**
             * Specifies the migrationRequest property: The registration info of HostPool..
             *
             * @param migrationRequest The registration info of HostPool.
             * @return the next definition stage.
             */
            WithCreate withMigrationRequest(MigrationRequestProperties migrationRequest);
        }
    }
    /**
     * Begins update for the ApplicationGroup resource.
     *
     * @return the stage of resource update.
     */
    ApplicationGroup.Update update();

    /** The template for ApplicationGroup update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithDescription, UpdateStages.WithFriendlyName {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ApplicationGroup apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ApplicationGroup apply(Context context);
    }
    /** The ApplicationGroup update stages. */
    interface UpdateStages {
        /** The stage of the ApplicationGroup update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: tags to be updated.
             *
             * @param tags tags to be updated.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ApplicationGroup update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description of ApplicationGroup..
             *
             * @param description Description of ApplicationGroup.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the ApplicationGroup update allowing to specify friendlyName. */
        interface WithFriendlyName {
            /**
             * Specifies the friendlyName property: Friendly name of ApplicationGroup..
             *
             * @param friendlyName Friendly name of ApplicationGroup.
             * @return the next definition stage.
             */
            Update withFriendlyName(String friendlyName);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ApplicationGroup refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ApplicationGroup refresh(Context context);
}
