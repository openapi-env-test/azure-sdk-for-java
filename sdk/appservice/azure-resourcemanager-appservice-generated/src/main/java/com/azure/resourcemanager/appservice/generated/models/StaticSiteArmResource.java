// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteArmResourceInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of StaticSiteArmResource. */
public interface StaticSiteArmResource {
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
     * Gets the sku property: Description of a SKU for a scalable resource.
     *
     * @return the sku value.
     */
    SkuDescription sku();

    /**
     * Gets the identity property: Managed service identity.
     *
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the defaultHostname property: The default autogenerated hostname for the static site.
     *
     * @return the defaultHostname value.
     */
    String defaultHostname();

    /**
     * Gets the repositoryUrl property: URL for the repository of the static site.
     *
     * @return the repositoryUrl value.
     */
    String repositoryUrl();

    /**
     * Gets the branch property: The target branch in the repository.
     *
     * @return the branch value.
     */
    String branch();

    /**
     * Gets the customDomains property: The custom domains associated with this static site.
     *
     * @return the customDomains value.
     */
    List<String> customDomains();

    /**
     * Gets the repositoryToken property: A user's github repository token. This is used to setup the Github Actions
     * workflow file and API secrets.
     *
     * @return the repositoryToken value.
     */
    String repositoryToken();

    /**
     * Gets the buildProperties property: Build properties to configure on the repository.
     *
     * @return the buildProperties value.
     */
    StaticSiteBuildProperties buildProperties();

    /**
     * Gets the privateEndpointConnections property: Private endpoint connections.
     *
     * @return the privateEndpointConnections value.
     */
    List<ResponseMessageEnvelopeRemotePrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the stagingEnvironmentPolicy property: State indicating whether staging environments are allowed or not
     * allowed for a static web app.
     *
     * @return the stagingEnvironmentPolicy value.
     */
    StagingEnvironmentPolicy stagingEnvironmentPolicy();

    /**
     * Gets the allowConfigFileUpdates property: &lt;code&gt;false&lt;/code&gt; if config file is locked for this static
     * web app; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @return the allowConfigFileUpdates value.
     */
    Boolean allowConfigFileUpdates();

    /**
     * Gets the templateProperties property: Template options for generating a new repository.
     *
     * @return the templateProperties value.
     */
    StaticSiteTemplateOptions templateProperties();

    /**
     * Gets the contentDistributionEndpoint property: The content distribution endpoint for the static site.
     *
     * @return the contentDistributionEndpoint value.
     */
    String contentDistributionEndpoint();

    /**
     * Gets the keyVaultReferenceIdentity property: Identity to use for Key Vault Reference authentication.
     *
     * @return the keyVaultReferenceIdentity value.
     */
    String keyVaultReferenceIdentity();

    /**
     * Gets the userProvidedFunctionApps property: User provided function apps registered with the static site.
     *
     * @return the userProvidedFunctionApps value.
     */
    List<StaticSiteUserProvidedFunctionApp> userProvidedFunctionApps();

    /**
     * Gets the linkedBackends property: Backends linked to the static side.
     *
     * @return the linkedBackends value.
     */
    List<StaticSiteLinkedBackend> linkedBackends();

    /**
     * Gets the provider property: The provider that submitted the last deployment to the primary environment of the
     * static site.
     *
     * @return the provider value.
     */
    String provider();

    /**
     * Gets the enterpriseGradeCdnStatus property: State indicating the status of the enterprise grade CDN serving
     * traffic to the static web app.
     *
     * @return the enterpriseGradeCdnStatus value.
     */
    EnterpriseGradeCdnStatus enterpriseGradeCdnStatus();

    /**
     * Gets the publicNetworkAccess property: State indicating whether public traffic are allowed or not for a static
     * web app. Allowed Values: 'Enabled', 'Disabled' or an empty string.
     *
     * @return the publicNetworkAccess value.
     */
    String publicNetworkAccess();

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
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteArmResourceInner object.
     *
     * @return the inner object.
     */
    StaticSiteArmResourceInner innerModel();

    /** The entirety of the StaticSiteArmResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The StaticSiteArmResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the StaticSiteArmResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the StaticSiteArmResource definition allowing to specify location. */
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
        /** The stage of the StaticSiteArmResource definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the StaticSiteArmResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithKind,
                DefinitionStages.WithRepositoryUrl,
                DefinitionStages.WithBranch,
                DefinitionStages.WithRepositoryToken,
                DefinitionStages.WithBuildProperties,
                DefinitionStages.WithStagingEnvironmentPolicy,
                DefinitionStages.WithAllowConfigFileUpdates,
                DefinitionStages.WithTemplateProperties,
                DefinitionStages.WithProvider,
                DefinitionStages.WithEnterpriseGradeCdnStatus,
                DefinitionStages.WithPublicNetworkAccess {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            StaticSiteArmResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            StaticSiteArmResource create(Context context);
        }
        /** The stage of the StaticSiteArmResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the StaticSiteArmResource definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Description of a SKU for a scalable resource..
             *
             * @param sku Description of a SKU for a scalable resource.
             * @return the next definition stage.
             */
            WithCreate withSku(SkuDescription sku);
        }
        /** The stage of the StaticSiteArmResource definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed service identity..
             *
             * @param identity Managed service identity.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }
        /** The stage of the StaticSiteArmResource definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
        /** The stage of the StaticSiteArmResource definition allowing to specify repositoryUrl. */
        interface WithRepositoryUrl {
            /**
             * Specifies the repositoryUrl property: URL for the repository of the static site..
             *
             * @param repositoryUrl URL for the repository of the static site.
             * @return the next definition stage.
             */
            WithCreate withRepositoryUrl(String repositoryUrl);
        }
        /** The stage of the StaticSiteArmResource definition allowing to specify branch. */
        interface WithBranch {
            /**
             * Specifies the branch property: The target branch in the repository..
             *
             * @param branch The target branch in the repository.
             * @return the next definition stage.
             */
            WithCreate withBranch(String branch);
        }
        /** The stage of the StaticSiteArmResource definition allowing to specify repositoryToken. */
        interface WithRepositoryToken {
            /**
             * Specifies the repositoryToken property: A user's github repository token. This is used to setup the
             * Github Actions workflow file and API secrets..
             *
             * @param repositoryToken A user's github repository token. This is used to setup the Github Actions
             *     workflow file and API secrets.
             * @return the next definition stage.
             */
            WithCreate withRepositoryToken(String repositoryToken);
        }
        /** The stage of the StaticSiteArmResource definition allowing to specify buildProperties. */
        interface WithBuildProperties {
            /**
             * Specifies the buildProperties property: Build properties to configure on the repository..
             *
             * @param buildProperties Build properties to configure on the repository.
             * @return the next definition stage.
             */
            WithCreate withBuildProperties(StaticSiteBuildProperties buildProperties);
        }
        /** The stage of the StaticSiteArmResource definition allowing to specify stagingEnvironmentPolicy. */
        interface WithStagingEnvironmentPolicy {
            /**
             * Specifies the stagingEnvironmentPolicy property: State indicating whether staging environments are
             * allowed or not allowed for a static web app..
             *
             * @param stagingEnvironmentPolicy State indicating whether staging environments are allowed or not allowed
             *     for a static web app.
             * @return the next definition stage.
             */
            WithCreate withStagingEnvironmentPolicy(StagingEnvironmentPolicy stagingEnvironmentPolicy);
        }
        /** The stage of the StaticSiteArmResource definition allowing to specify allowConfigFileUpdates. */
        interface WithAllowConfigFileUpdates {
            /**
             * Specifies the allowConfigFileUpdates property: &lt;code&gt;false&lt;/code&gt; if config file is locked
             * for this static web app; otherwise, &lt;code&gt;true&lt;/code&gt;..
             *
             * @param allowConfigFileUpdates &lt;code&gt;false&lt;/code&gt; if config file is locked for this static web
             *     app; otherwise, &lt;code&gt;true&lt;/code&gt;.
             * @return the next definition stage.
             */
            WithCreate withAllowConfigFileUpdates(Boolean allowConfigFileUpdates);
        }
        /** The stage of the StaticSiteArmResource definition allowing to specify templateProperties. */
        interface WithTemplateProperties {
            /**
             * Specifies the templateProperties property: Template options for generating a new repository..
             *
             * @param templateProperties Template options for generating a new repository.
             * @return the next definition stage.
             */
            WithCreate withTemplateProperties(StaticSiteTemplateOptions templateProperties);
        }
        /** The stage of the StaticSiteArmResource definition allowing to specify provider. */
        interface WithProvider {
            /**
             * Specifies the provider property: The provider that submitted the last deployment to the primary
             * environment of the static site..
             *
             * @param provider The provider that submitted the last deployment to the primary environment of the static
             *     site.
             * @return the next definition stage.
             */
            WithCreate withProvider(String provider);
        }
        /** The stage of the StaticSiteArmResource definition allowing to specify enterpriseGradeCdnStatus. */
        interface WithEnterpriseGradeCdnStatus {
            /**
             * Specifies the enterpriseGradeCdnStatus property: State indicating the status of the enterprise grade CDN
             * serving traffic to the static web app..
             *
             * @param enterpriseGradeCdnStatus State indicating the status of the enterprise grade CDN serving traffic
             *     to the static web app.
             * @return the next definition stage.
             */
            WithCreate withEnterpriseGradeCdnStatus(EnterpriseGradeCdnStatus enterpriseGradeCdnStatus);
        }
        /** The stage of the StaticSiteArmResource definition allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: State indicating whether public traffic are allowed or not
             * for a static web app. Allowed Values: 'Enabled', 'Disabled' or an empty string..
             *
             * @param publicNetworkAccess State indicating whether public traffic are allowed or not for a static web
             *     app. Allowed Values: 'Enabled', 'Disabled' or an empty string.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(String publicNetworkAccess);
        }
    }
    /**
     * Begins update for the StaticSiteArmResource resource.
     *
     * @return the stage of resource update.
     */
    StaticSiteArmResource.Update update();

    /** The template for StaticSiteArmResource update. */
    interface Update
        extends UpdateStages.WithKind,
            UpdateStages.WithRepositoryUrl,
            UpdateStages.WithBranch,
            UpdateStages.WithRepositoryToken,
            UpdateStages.WithBuildProperties,
            UpdateStages.WithStagingEnvironmentPolicy,
            UpdateStages.WithAllowConfigFileUpdates,
            UpdateStages.WithTemplateProperties,
            UpdateStages.WithProvider,
            UpdateStages.WithEnterpriseGradeCdnStatus,
            UpdateStages.WithPublicNetworkAccess {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        StaticSiteArmResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        StaticSiteArmResource apply(Context context);
    }
    /** The StaticSiteArmResource update stages. */
    interface UpdateStages {
        /** The stage of the StaticSiteArmResource update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }
        /** The stage of the StaticSiteArmResource update allowing to specify repositoryUrl. */
        interface WithRepositoryUrl {
            /**
             * Specifies the repositoryUrl property: URL for the repository of the static site..
             *
             * @param repositoryUrl URL for the repository of the static site.
             * @return the next definition stage.
             */
            Update withRepositoryUrl(String repositoryUrl);
        }
        /** The stage of the StaticSiteArmResource update allowing to specify branch. */
        interface WithBranch {
            /**
             * Specifies the branch property: The target branch in the repository..
             *
             * @param branch The target branch in the repository.
             * @return the next definition stage.
             */
            Update withBranch(String branch);
        }
        /** The stage of the StaticSiteArmResource update allowing to specify repositoryToken. */
        interface WithRepositoryToken {
            /**
             * Specifies the repositoryToken property: A user's github repository token. This is used to setup the
             * Github Actions workflow file and API secrets..
             *
             * @param repositoryToken A user's github repository token. This is used to setup the Github Actions
             *     workflow file and API secrets.
             * @return the next definition stage.
             */
            Update withRepositoryToken(String repositoryToken);
        }
        /** The stage of the StaticSiteArmResource update allowing to specify buildProperties. */
        interface WithBuildProperties {
            /**
             * Specifies the buildProperties property: Build properties to configure on the repository..
             *
             * @param buildProperties Build properties to configure on the repository.
             * @return the next definition stage.
             */
            Update withBuildProperties(StaticSiteBuildProperties buildProperties);
        }
        /** The stage of the StaticSiteArmResource update allowing to specify stagingEnvironmentPolicy. */
        interface WithStagingEnvironmentPolicy {
            /**
             * Specifies the stagingEnvironmentPolicy property: State indicating whether staging environments are
             * allowed or not allowed for a static web app..
             *
             * @param stagingEnvironmentPolicy State indicating whether staging environments are allowed or not allowed
             *     for a static web app.
             * @return the next definition stage.
             */
            Update withStagingEnvironmentPolicy(StagingEnvironmentPolicy stagingEnvironmentPolicy);
        }
        /** The stage of the StaticSiteArmResource update allowing to specify allowConfigFileUpdates. */
        interface WithAllowConfigFileUpdates {
            /**
             * Specifies the allowConfigFileUpdates property: &lt;code&gt;false&lt;/code&gt; if config file is locked
             * for this static web app; otherwise, &lt;code&gt;true&lt;/code&gt;..
             *
             * @param allowConfigFileUpdates &lt;code&gt;false&lt;/code&gt; if config file is locked for this static web
             *     app; otherwise, &lt;code&gt;true&lt;/code&gt;.
             * @return the next definition stage.
             */
            Update withAllowConfigFileUpdates(Boolean allowConfigFileUpdates);
        }
        /** The stage of the StaticSiteArmResource update allowing to specify templateProperties. */
        interface WithTemplateProperties {
            /**
             * Specifies the templateProperties property: Template options for generating a new repository..
             *
             * @param templateProperties Template options for generating a new repository.
             * @return the next definition stage.
             */
            Update withTemplateProperties(StaticSiteTemplateOptions templateProperties);
        }
        /** The stage of the StaticSiteArmResource update allowing to specify provider. */
        interface WithProvider {
            /**
             * Specifies the provider property: The provider that submitted the last deployment to the primary
             * environment of the static site..
             *
             * @param provider The provider that submitted the last deployment to the primary environment of the static
             *     site.
             * @return the next definition stage.
             */
            Update withProvider(String provider);
        }
        /** The stage of the StaticSiteArmResource update allowing to specify enterpriseGradeCdnStatus. */
        interface WithEnterpriseGradeCdnStatus {
            /**
             * Specifies the enterpriseGradeCdnStatus property: State indicating the status of the enterprise grade CDN
             * serving traffic to the static web app..
             *
             * @param enterpriseGradeCdnStatus State indicating the status of the enterprise grade CDN serving traffic
             *     to the static web app.
             * @return the next definition stage.
             */
            Update withEnterpriseGradeCdnStatus(EnterpriseGradeCdnStatus enterpriseGradeCdnStatus);
        }
        /** The stage of the StaticSiteArmResource update allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: State indicating whether public traffic are allowed or not
             * for a static web app. Allowed Values: 'Enabled', 'Disabled' or an empty string..
             *
             * @param publicNetworkAccess State indicating whether public traffic are allowed or not for a static web
             *     app. Allowed Values: 'Enabled', 'Disabled' or an empty string.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccess(String publicNetworkAccess);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    StaticSiteArmResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    StaticSiteArmResource refresh(Context context);

    /**
     * Description for Creates an invitation link for a user with the role.
     *
     * @param staticSiteUserRolesInvitationEnvelope Static sites user roles invitation resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return static sites user roles invitation link resource.
     */
    StaticSiteUserInvitationResponseResource createUserRolesInvitationLink(
        StaticSiteUserInvitationRequestResource staticSiteUserRolesInvitationEnvelope);

    /**
     * Description for Creates an invitation link for a user with the role.
     *
     * @param staticSiteUserRolesInvitationEnvelope Static sites user roles invitation resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return static sites user roles invitation link resource along with {@link Response}.
     */
    Response<StaticSiteUserInvitationResponseResource> createUserRolesInvitationLinkWithResponse(
        StaticSiteUserInvitationRequestResource staticSiteUserRolesInvitationEnvelope, Context context);

    /**
     * Description for Detaches a static site.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void detachStaticSite();

    /**
     * Description for Detaches a static site.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void detachStaticSite(Context context);

    /**
     * Description for Gets the application settings of a static site.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return string dictionary resource.
     */
    StringDictionary listStaticSiteAppSettings();

    /**
     * Description for Gets the application settings of a static site.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return string dictionary resource along with {@link Response}.
     */
    Response<StringDictionary> listStaticSiteAppSettingsWithResponse(Context context);

    /**
     * Description for Lists the roles configured for the static site.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return string list resource.
     */
    StringList listStaticSiteConfiguredRoles();

    /**
     * Description for Lists the roles configured for the static site.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return string list resource along with {@link Response}.
     */
    Response<StringList> listStaticSiteConfiguredRolesWithResponse(Context context);

    /**
     * Description for Gets the application settings of a static site.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return string dictionary resource.
     */
    StringDictionary listStaticSiteFunctionAppSettings();

    /**
     * Description for Gets the application settings of a static site.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return string dictionary resource along with {@link Response}.
     */
    Response<StringDictionary> listStaticSiteFunctionAppSettingsWithResponse(Context context);

    /**
     * Description for Lists the secrets for an existing static site.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return string dictionary resource.
     */
    StringDictionary listStaticSiteSecrets();

    /**
     * Description for Lists the secrets for an existing static site.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return string dictionary resource along with {@link Response}.
     */
    Response<StringDictionary> listStaticSiteSecretsWithResponse(Context context);

    /**
     * Description for Resets the api key for an existing static site.
     *
     * @param resetPropertiesEnvelope Static Site Reset Properties ARM resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resetStaticSiteApiKey(StaticSiteResetPropertiesArmResource resetPropertiesEnvelope);

    /**
     * Description for Resets the api key for an existing static site.
     *
     * @param resetPropertiesEnvelope Static Site Reset Properties ARM resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> resetStaticSiteApiKeyWithResponse(
        StaticSiteResetPropertiesArmResource resetPropertiesEnvelope, Context context);

    /**
     * Description for Deploys zipped content to a static site.
     *
     * @param staticSiteZipDeploymentEnvelope A JSON representation of the StaticSiteZipDeployment properties. See
     *     example.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void createZipDeploymentForStaticSite(StaticSiteZipDeploymentArmResource staticSiteZipDeploymentEnvelope);

    /**
     * Description for Deploys zipped content to a static site.
     *
     * @param staticSiteZipDeploymentEnvelope A JSON representation of the StaticSiteZipDeployment properties. See
     *     example.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void createZipDeploymentForStaticSite(
        StaticSiteZipDeploymentArmResource staticSiteZipDeploymentEnvelope, Context context);
}
