// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.contoso_cdn.fluent.models.CdnWebApplicationFirewallPolicyInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of CdnWebApplicationFirewallPolicy. */
public interface CdnWebApplicationFirewallPolicy {
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
     * Gets the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the sku property: The pricing tier (defines a CDN provider, feature list and rate) of the
     * CdnWebApplicationFirewallPolicy.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the policySettings property: Describes policySettings for policy.
     *
     * @return the policySettings value.
     */
    PolicySettings policySettings();

    /**
     * Gets the rateLimitRules property: Describes rate limit rules inside the policy.
     *
     * @return the rateLimitRules value.
     */
    RateLimitRuleList rateLimitRules();

    /**
     * Gets the customRules property: Describes custom rules inside the policy.
     *
     * @return the customRules value.
     */
    CustomRuleList customRules();

    /**
     * Gets the managedRules property: Describes managed rules inside the policy.
     *
     * @return the managedRules value.
     */
    ManagedRuleSetList managedRules();

    /**
     * Gets the endpointLinks property: Describes Azure CDN endpoints associated with this Web Application Firewall
     * policy.
     *
     * @return the endpointLinks value.
     */
    List<CdnEndpoint> endpointLinks();

    /**
     * Gets the provisioningState property: Provisioning state of the WebApplicationFirewallPolicy.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the resourceState property: Resource status of the policy.
     *
     * @return the resourceState value.
     */
    PolicyResourceState resourceState();

    /**
     * Gets the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    SystemData systemData();

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
     * Gets the inner com.azure.resourcemanager.contoso_cdn.fluent.models.CdnWebApplicationFirewallPolicyInner object.
     *
     * @return the inner object.
     */
    CdnWebApplicationFirewallPolicyInner innerModel();

    /** The entirety of the CdnWebApplicationFirewallPolicy definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithSku,
            DefinitionStages.WithCreate {
    }
    /** The CdnWebApplicationFirewallPolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the CdnWebApplicationFirewallPolicy definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the CdnWebApplicationFirewallPolicy definition allowing to specify location. */
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
        /** The stage of the CdnWebApplicationFirewallPolicy definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of the Resource group within the Azure subscription.
             * @return the next definition stage.
             */
            WithSku withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the CdnWebApplicationFirewallPolicy definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The pricing tier (defines a CDN provider, feature list and rate) of the
             * CdnWebApplicationFirewallPolicy..
             *
             * @param sku The pricing tier (defines a CDN provider, feature list and rate) of the
             *     CdnWebApplicationFirewallPolicy.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /**
         * The stage of the CdnWebApplicationFirewallPolicy definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithEtag,
                DefinitionStages.WithPolicySettings,
                DefinitionStages.WithRateLimitRules,
                DefinitionStages.WithCustomRules,
                DefinitionStages.WithManagedRules {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CdnWebApplicationFirewallPolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CdnWebApplicationFirewallPolicy create(Context context);
        }
        /** The stage of the CdnWebApplicationFirewallPolicy definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the CdnWebApplicationFirewallPolicy definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: Gets a unique read-only string that changes whenever the resource is
             * updated..
             *
             * @param etag Gets a unique read-only string that changes whenever the resource is updated.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the CdnWebApplicationFirewallPolicy definition allowing to specify policySettings. */
        interface WithPolicySettings {
            /**
             * Specifies the policySettings property: Describes policySettings for policy.
             *
             * @param policySettings Describes policySettings for policy.
             * @return the next definition stage.
             */
            WithCreate withPolicySettings(PolicySettings policySettings);
        }
        /** The stage of the CdnWebApplicationFirewallPolicy definition allowing to specify rateLimitRules. */
        interface WithRateLimitRules {
            /**
             * Specifies the rateLimitRules property: Describes rate limit rules inside the policy..
             *
             * @param rateLimitRules Describes rate limit rules inside the policy.
             * @return the next definition stage.
             */
            WithCreate withRateLimitRules(RateLimitRuleList rateLimitRules);
        }
        /** The stage of the CdnWebApplicationFirewallPolicy definition allowing to specify customRules. */
        interface WithCustomRules {
            /**
             * Specifies the customRules property: Describes custom rules inside the policy..
             *
             * @param customRules Describes custom rules inside the policy.
             * @return the next definition stage.
             */
            WithCreate withCustomRules(CustomRuleList customRules);
        }
        /** The stage of the CdnWebApplicationFirewallPolicy definition allowing to specify managedRules. */
        interface WithManagedRules {
            /**
             * Specifies the managedRules property: Describes managed rules inside the policy..
             *
             * @param managedRules Describes managed rules inside the policy.
             * @return the next definition stage.
             */
            WithCreate withManagedRules(ManagedRuleSetList managedRules);
        }
    }
    /**
     * Begins update for the CdnWebApplicationFirewallPolicy resource.
     *
     * @return the stage of resource update.
     */
    CdnWebApplicationFirewallPolicy.Update update();

    /** The template for CdnWebApplicationFirewallPolicy update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CdnWebApplicationFirewallPolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CdnWebApplicationFirewallPolicy apply(Context context);
    }
    /** The CdnWebApplicationFirewallPolicy update stages. */
    interface UpdateStages {
        /** The stage of the CdnWebApplicationFirewallPolicy update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: CdnWebApplicationFirewallPolicy tags.
             *
             * @param tags CdnWebApplicationFirewallPolicy tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CdnWebApplicationFirewallPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CdnWebApplicationFirewallPolicy refresh(Context context);
}
