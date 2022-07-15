// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.cdn.generated.models.DeepCreatedOrigin;
import com.azure.resourcemanager.cdn.generated.models.DeepCreatedOriginGroup;
import com.azure.resourcemanager.cdn.generated.models.EndpointPropertiesUpdateParametersDeliveryPolicy;
import com.azure.resourcemanager.cdn.generated.models.EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink;
import com.azure.resourcemanager.cdn.generated.models.EndpointProvisioningState;
import com.azure.resourcemanager.cdn.generated.models.EndpointResourceState;
import com.azure.resourcemanager.cdn.generated.models.GeoFilter;
import com.azure.resourcemanager.cdn.generated.models.OptimizationType;
import com.azure.resourcemanager.cdn.generated.models.QueryStringCachingBehavior;
import com.azure.resourcemanager.cdn.generated.models.ResourceReference;
import com.azure.resourcemanager.cdn.generated.models.UrlSigningKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * CDN endpoint is the entity within a CDN profile containing configuration information such as origin, protocol,
 * content caching and delivery behavior. The CDN endpoint uses the URL format &lt;endpointname&gt;.azureedge.net.
 */
@Fluent
public final class EndpointInner extends Resource {
    /*
     * The JSON object that contains the properties required to create an
     * endpoint.
     */
    @JsonProperty(value = "properties")
    private EndpointProperties innerProperties;

    /*
     * Read only system data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The JSON object that contains the properties required to create an endpoint.
     *
     * @return the innerProperties value.
     */
    private EndpointProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the hostname property: The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g.
     * contoso.azureedge.net.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Get the origins property: The source of the content being delivered via CDN.
     *
     * @return the origins value.
     */
    public List<DeepCreatedOrigin> origins() {
        return this.innerProperties() == null ? null : this.innerProperties().origins();
    }

    /**
     * Set the origins property: The source of the content being delivered via CDN.
     *
     * @param origins the origins value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withOrigins(List<DeepCreatedOrigin> origins) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withOrigins(origins);
        return this;
    }

    /**
     * Get the originGroups property: The origin groups comprising of origins that are used for load balancing the
     * traffic based on availability.
     *
     * @return the originGroups value.
     */
    public List<DeepCreatedOriginGroup> originGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().originGroups();
    }

    /**
     * Set the originGroups property: The origin groups comprising of origins that are used for load balancing the
     * traffic based on availability.
     *
     * @param originGroups the originGroups value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withOriginGroups(List<DeepCreatedOriginGroup> originGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withOriginGroups(originGroups);
        return this;
    }

    /**
     * Get the customDomains property: The custom domains under the endpoint.
     *
     * @return the customDomains value.
     */
    public List<CustomDomainInner> customDomains() {
        return this.innerProperties() == null ? null : this.innerProperties().customDomains();
    }

    /**
     * Get the resourceState property: Resource status of the endpoint.
     *
     * @return the resourceState value.
     */
    public EndpointResourceState resourceState() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceState();
    }

    /**
     * Get the provisioningState property: Provisioning status of the endpoint.
     *
     * @return the provisioningState value.
     */
    public EndpointProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the originPath property: A directory path on the origin that CDN can use to retrieve content from, e.g.
     * contoso.cloudapp.net/originpath.
     *
     * @return the originPath value.
     */
    public String originPath() {
        return this.innerProperties() == null ? null : this.innerProperties().originPath();
    }

    /**
     * Set the originPath property: A directory path on the origin that CDN can use to retrieve content from, e.g.
     * contoso.cloudapp.net/originpath.
     *
     * @param originPath the originPath value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withOriginPath(String originPath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withOriginPath(originPath);
        return this;
    }

    /**
     * Get the contentTypesToCompress property: List of content types on which compression applies. The value should be
     * a valid MIME type.
     *
     * @return the contentTypesToCompress value.
     */
    public List<String> contentTypesToCompress() {
        return this.innerProperties() == null ? null : this.innerProperties().contentTypesToCompress();
    }

    /**
     * Set the contentTypesToCompress property: List of content types on which compression applies. The value should be
     * a valid MIME type.
     *
     * @param contentTypesToCompress the contentTypesToCompress value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withContentTypesToCompress(List<String> contentTypesToCompress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withContentTypesToCompress(contentTypesToCompress);
        return this;
    }

    /**
     * Get the originHostHeader property: The host header value sent to the origin with each request. This property at
     * Endpoint is only allowed when endpoint uses single origin and can be overridden by the same property specified at
     * origin.If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps,
     * Blob Storage, and Cloud Services require this host header value to match the origin hostname by default.
     *
     * @return the originHostHeader value.
     */
    public String originHostHeader() {
        return this.innerProperties() == null ? null : this.innerProperties().originHostHeader();
    }

    /**
     * Set the originHostHeader property: The host header value sent to the origin with each request. This property at
     * Endpoint is only allowed when endpoint uses single origin and can be overridden by the same property specified at
     * origin.If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps,
     * Blob Storage, and Cloud Services require this host header value to match the origin hostname by default.
     *
     * @param originHostHeader the originHostHeader value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withOriginHostHeader(String originHostHeader) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withOriginHostHeader(originHostHeader);
        return this;
    }

    /**
     * Get the isCompressionEnabled property: Indicates whether content compression is enabled on CDN. Default value is
     * false. If compression is enabled, content will be served as compressed if user requests for a compressed version.
     * Content won't be compressed on CDN when requested content is smaller than 1 byte or larger than 1 MB.
     *
     * @return the isCompressionEnabled value.
     */
    public Boolean isCompressionEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isCompressionEnabled();
    }

    /**
     * Set the isCompressionEnabled property: Indicates whether content compression is enabled on CDN. Default value is
     * false. If compression is enabled, content will be served as compressed if user requests for a compressed version.
     * Content won't be compressed on CDN when requested content is smaller than 1 byte or larger than 1 MB.
     *
     * @param isCompressionEnabled the isCompressionEnabled value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withIsCompressionEnabled(Boolean isCompressionEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withIsCompressionEnabled(isCompressionEnabled);
        return this;
    }

    /**
     * Get the isHttpAllowed property: Indicates whether HTTP traffic is allowed on the endpoint. Default value is true.
     * At least one protocol (HTTP or HTTPS) must be allowed.
     *
     * @return the isHttpAllowed value.
     */
    public Boolean isHttpAllowed() {
        return this.innerProperties() == null ? null : this.innerProperties().isHttpAllowed();
    }

    /**
     * Set the isHttpAllowed property: Indicates whether HTTP traffic is allowed on the endpoint. Default value is true.
     * At least one protocol (HTTP or HTTPS) must be allowed.
     *
     * @param isHttpAllowed the isHttpAllowed value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withIsHttpAllowed(Boolean isHttpAllowed) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withIsHttpAllowed(isHttpAllowed);
        return this;
    }

    /**
     * Get the isHttpsAllowed property: Indicates whether HTTPS traffic is allowed on the endpoint. Default value is
     * true. At least one protocol (HTTP or HTTPS) must be allowed.
     *
     * @return the isHttpsAllowed value.
     */
    public Boolean isHttpsAllowed() {
        return this.innerProperties() == null ? null : this.innerProperties().isHttpsAllowed();
    }

    /**
     * Set the isHttpsAllowed property: Indicates whether HTTPS traffic is allowed on the endpoint. Default value is
     * true. At least one protocol (HTTP or HTTPS) must be allowed.
     *
     * @param isHttpsAllowed the isHttpsAllowed value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withIsHttpsAllowed(Boolean isHttpsAllowed) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withIsHttpsAllowed(isHttpsAllowed);
        return this;
    }

    /**
     * Get the queryStringCachingBehavior property: Defines how CDN caches requests that include query strings. You can
     * ignore any query strings when caching, bypass caching to prevent requests that contain query strings from being
     * cached, or cache every request with a unique URL.
     *
     * @return the queryStringCachingBehavior value.
     */
    public QueryStringCachingBehavior queryStringCachingBehavior() {
        return this.innerProperties() == null ? null : this.innerProperties().queryStringCachingBehavior();
    }

    /**
     * Set the queryStringCachingBehavior property: Defines how CDN caches requests that include query strings. You can
     * ignore any query strings when caching, bypass caching to prevent requests that contain query strings from being
     * cached, or cache every request with a unique URL.
     *
     * @param queryStringCachingBehavior the queryStringCachingBehavior value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withQueryStringCachingBehavior(QueryStringCachingBehavior queryStringCachingBehavior) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withQueryStringCachingBehavior(queryStringCachingBehavior);
        return this;
    }

    /**
     * Get the optimizationType property: Specifies what scenario the customer wants this CDN endpoint to optimize for,
     * e.g. Download, Media services. With this information, CDN can apply scenario driven optimization.
     *
     * @return the optimizationType value.
     */
    public OptimizationType optimizationType() {
        return this.innerProperties() == null ? null : this.innerProperties().optimizationType();
    }

    /**
     * Set the optimizationType property: Specifies what scenario the customer wants this CDN endpoint to optimize for,
     * e.g. Download, Media services. With this information, CDN can apply scenario driven optimization.
     *
     * @param optimizationType the optimizationType value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withOptimizationType(OptimizationType optimizationType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withOptimizationType(optimizationType);
        return this;
    }

    /**
     * Get the probePath property: Path to a file hosted on the origin which helps accelerate delivery of the dynamic
     * content and calculate the most optimal routes for the CDN. This is relative to the origin path. This property is
     * only relevant when using a single origin.
     *
     * @return the probePath value.
     */
    public String probePath() {
        return this.innerProperties() == null ? null : this.innerProperties().probePath();
    }

    /**
     * Set the probePath property: Path to a file hosted on the origin which helps accelerate delivery of the dynamic
     * content and calculate the most optimal routes for the CDN. This is relative to the origin path. This property is
     * only relevant when using a single origin.
     *
     * @param probePath the probePath value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withProbePath(String probePath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withProbePath(probePath);
        return this;
    }

    /**
     * Get the geoFilters property: List of rules defining the user's geo access within a CDN endpoint. Each geo filter
     * defines an access rule to a specified path or content, e.g. block APAC for path /pictures/.
     *
     * @return the geoFilters value.
     */
    public List<GeoFilter> geoFilters() {
        return this.innerProperties() == null ? null : this.innerProperties().geoFilters();
    }

    /**
     * Set the geoFilters property: List of rules defining the user's geo access within a CDN endpoint. Each geo filter
     * defines an access rule to a specified path or content, e.g. block APAC for path /pictures/.
     *
     * @param geoFilters the geoFilters value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withGeoFilters(List<GeoFilter> geoFilters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withGeoFilters(geoFilters);
        return this;
    }

    /**
     * Get the defaultOriginGroup property: A reference to the origin group.
     *
     * @return the defaultOriginGroup value.
     */
    public ResourceReference defaultOriginGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultOriginGroup();
    }

    /**
     * Set the defaultOriginGroup property: A reference to the origin group.
     *
     * @param defaultOriginGroup the defaultOriginGroup value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withDefaultOriginGroup(ResourceReference defaultOriginGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withDefaultOriginGroup(defaultOriginGroup);
        return this;
    }

    /**
     * Get the urlSigningKeys property: List of keys used to validate the signed URL hashes.
     *
     * @return the urlSigningKeys value.
     */
    public List<UrlSigningKey> urlSigningKeys() {
        return this.innerProperties() == null ? null : this.innerProperties().urlSigningKeys();
    }

    /**
     * Set the urlSigningKeys property: List of keys used to validate the signed URL hashes.
     *
     * @param urlSigningKeys the urlSigningKeys value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withUrlSigningKeys(List<UrlSigningKey> urlSigningKeys) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withUrlSigningKeys(urlSigningKeys);
        return this;
    }

    /**
     * Get the deliveryPolicy property: A policy that specifies the delivery rules to be used for an endpoint.
     *
     * @return the deliveryPolicy value.
     */
    public EndpointPropertiesUpdateParametersDeliveryPolicy deliveryPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().deliveryPolicy();
    }

    /**
     * Set the deliveryPolicy property: A policy that specifies the delivery rules to be used for an endpoint.
     *
     * @param deliveryPolicy the deliveryPolicy value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withDeliveryPolicy(EndpointPropertiesUpdateParametersDeliveryPolicy deliveryPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withDeliveryPolicy(deliveryPolicy);
        return this;
    }

    /**
     * Get the webApplicationFirewallPolicyLink property: Defines the Web Application Firewall policy for the endpoint
     * (if applicable).
     *
     * @return the webApplicationFirewallPolicyLink value.
     */
    public EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink() {
        return this.innerProperties() == null ? null : this.innerProperties().webApplicationFirewallPolicyLink();
    }

    /**
     * Set the webApplicationFirewallPolicyLink property: Defines the Web Application Firewall policy for the endpoint
     * (if applicable).
     *
     * @param webApplicationFirewallPolicyLink the webApplicationFirewallPolicyLink value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withWebApplicationFirewallPolicyLink(
        EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointProperties();
        }
        this.innerProperties().withWebApplicationFirewallPolicyLink(webApplicationFirewallPolicyLink);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
