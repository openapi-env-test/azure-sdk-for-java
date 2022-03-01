// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.account;

import com.azure.analytics.purview.account.implementation.ResourceSetRulesImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous DataPlaneAccountClient type. */
@ServiceClient(builder = ResourceSetRulesClientBuilder.class)
public final class ResourceSetRulesClient {
    @Generated private final ResourceSetRulesImpl serviceClient;

    /**
     * Initializes an instance of ResourceSetRules client.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    ResourceSetRulesClient(ResourceSetRulesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get a resource set config service model.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     advancedResourceSet: {
     *         modifiedAt: String
     *         resourceSetProcessing: String(Default/Advanced)
     *     }
     *     name: String
     *     pathPatternConfig: {
     *         acceptedPatterns: [
     *             {
     *                 createdBy: String
     *                 filterType: String(Pattern/Regex)
     *                 lastUpdatedTimestamp: Long
     *                 modifiedBy: String
     *                 name: String
     *                 path: String
     *             }
     *         ]
     *         complexReplacers: [
     *             {
     *                 createdBy: String
     *                 description: String
     *                 disabled: Boolean
     *                 disableRecursiveReplacerApplication: Boolean
     *                 lastUpdatedTimestamp: Long
     *                 modifiedBy: String
     *                 name: String
     *                 typeName: String
     *             }
     *         ]
     *         createdBy: String
     *         enableDefaultPatterns: boolean
     *         lastUpdatedTimestamp: Long
     *         modifiedBy: String
     *         normalizationRules: [
     *             {
     *                 description: String
     *                 disabled: Boolean
     *                 dynamicReplacement: Boolean
     *                 entityTypes: [
     *                     String
     *                 ]
     *                 lastUpdatedTimestamp: Long
     *                 name: String
     *                 regex: {
     *                     maxDigits: Integer
     *                     maxLetters: Integer
     *                     minDashes: Integer
     *                     minDigits: Integer
     *                     minDigitsOrLetters: Integer
     *                     minDots: Integer
     *                     minHex: Integer
     *                     minLetters: Integer
     *                     minUnderscores: Integer
     *                     options: Integer
     *                     regexStr: String
     *                 }
     *                 replaceWith: String
     *                 version: Double
     *             }
     *         ]
     *         regexReplacers: [
     *             {
     *                 condition: String
     *                 createdBy: String
     *                 description: String
     *                 disabled: boolean
     *                 disableRecursiveReplacerApplication: Boolean
     *                 doNotReplaceRegex: (recursive schema, see doNotReplaceRegex above)
     *                 lastUpdatedTimestamp: Long
     *                 modifiedBy: String
     *                 name: String
     *                 regex: (recursive schema, see regex above)
     *                 replaceWith: String
     *             }
     *         ]
     *         rejectedPatterns: [
     *             (recursive schema, see above)
     *         ]
     *         scopedRules: [
     *             {
     *                 bindingUrl: String
     *                 rules: [
     *                     {
     *                         displayName: String
     *                         isResourceSet: Boolean
     *                         lastUpdatedTimestamp: Long
     *                         name: String
     *                         qualifiedName: String
     *                     }
     *                 ]
     *                 storeType: String
     *             }
     *         ]
     *         version: Integer
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return a resource set config service model along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getResourceSetRuleWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getResourceSetRuleWithResponse(requestOptions);
    }

    /**
     * Creates or updates an resource set config.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     advancedResourceSet: {
     *         modifiedAt: String
     *         resourceSetProcessing: String(Default/Advanced)
     *     }
     *     name: String
     *     pathPatternConfig: {
     *         acceptedPatterns: [
     *             {
     *                 createdBy: String
     *                 filterType: String(Pattern/Regex)
     *                 lastUpdatedTimestamp: Long
     *                 modifiedBy: String
     *                 name: String
     *                 path: String
     *             }
     *         ]
     *         complexReplacers: [
     *             {
     *                 createdBy: String
     *                 description: String
     *                 disabled: Boolean
     *                 disableRecursiveReplacerApplication: Boolean
     *                 lastUpdatedTimestamp: Long
     *                 modifiedBy: String
     *                 name: String
     *                 typeName: String
     *             }
     *         ]
     *         createdBy: String
     *         enableDefaultPatterns: boolean
     *         lastUpdatedTimestamp: Long
     *         modifiedBy: String
     *         normalizationRules: [
     *             {
     *                 description: String
     *                 disabled: Boolean
     *                 dynamicReplacement: Boolean
     *                 entityTypes: [
     *                     String
     *                 ]
     *                 lastUpdatedTimestamp: Long
     *                 name: String
     *                 regex: {
     *                     maxDigits: Integer
     *                     maxLetters: Integer
     *                     minDashes: Integer
     *                     minDigits: Integer
     *                     minDigitsOrLetters: Integer
     *                     minDots: Integer
     *                     minHex: Integer
     *                     minLetters: Integer
     *                     minUnderscores: Integer
     *                     options: Integer
     *                     regexStr: String
     *                 }
     *                 replaceWith: String
     *                 version: Double
     *             }
     *         ]
     *         regexReplacers: [
     *             {
     *                 condition: String
     *                 createdBy: String
     *                 description: String
     *                 disabled: boolean
     *                 disableRecursiveReplacerApplication: Boolean
     *                 doNotReplaceRegex: (recursive schema, see doNotReplaceRegex above)
     *                 lastUpdatedTimestamp: Long
     *                 modifiedBy: String
     *                 name: String
     *                 regex: (recursive schema, see regex above)
     *                 replaceWith: String
     *             }
     *         ]
     *         rejectedPatterns: [
     *             (recursive schema, see above)
     *         ]
     *         scopedRules: [
     *             {
     *                 bindingUrl: String
     *                 rules: [
     *                     {
     *                         displayName: String
     *                         isResourceSet: Boolean
     *                         lastUpdatedTimestamp: Long
     *                         name: String
     *                         qualifiedName: String
     *                     }
     *                 ]
     *                 storeType: String
     *             }
     *         ]
     *         version: Integer
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     advancedResourceSet: {
     *         modifiedAt: String
     *         resourceSetProcessing: String(Default/Advanced)
     *     }
     *     name: String
     *     pathPatternConfig: {
     *         acceptedPatterns: [
     *             {
     *                 createdBy: String
     *                 filterType: String(Pattern/Regex)
     *                 lastUpdatedTimestamp: Long
     *                 modifiedBy: String
     *                 name: String
     *                 path: String
     *             }
     *         ]
     *         complexReplacers: [
     *             {
     *                 createdBy: String
     *                 description: String
     *                 disabled: Boolean
     *                 disableRecursiveReplacerApplication: Boolean
     *                 lastUpdatedTimestamp: Long
     *                 modifiedBy: String
     *                 name: String
     *                 typeName: String
     *             }
     *         ]
     *         createdBy: String
     *         enableDefaultPatterns: boolean
     *         lastUpdatedTimestamp: Long
     *         modifiedBy: String
     *         normalizationRules: [
     *             {
     *                 description: String
     *                 disabled: Boolean
     *                 dynamicReplacement: Boolean
     *                 entityTypes: [
     *                     String
     *                 ]
     *                 lastUpdatedTimestamp: Long
     *                 name: String
     *                 regex: {
     *                     maxDigits: Integer
     *                     maxLetters: Integer
     *                     minDashes: Integer
     *                     minDigits: Integer
     *                     minDigitsOrLetters: Integer
     *                     minDots: Integer
     *                     minHex: Integer
     *                     minLetters: Integer
     *                     minUnderscores: Integer
     *                     options: Integer
     *                     regexStr: String
     *                 }
     *                 replaceWith: String
     *                 version: Double
     *             }
     *         ]
     *         regexReplacers: [
     *             {
     *                 condition: String
     *                 createdBy: String
     *                 description: String
     *                 disabled: boolean
     *                 disableRecursiveReplacerApplication: Boolean
     *                 doNotReplaceRegex: (recursive schema, see doNotReplaceRegex above)
     *                 lastUpdatedTimestamp: Long
     *                 modifiedBy: String
     *                 name: String
     *                 regex: (recursive schema, see regex above)
     *                 replaceWith: String
     *             }
     *         ]
     *         rejectedPatterns: [
     *             (recursive schema, see above)
     *         ]
     *         scopedRules: [
     *             {
     *                 bindingUrl: String
     *                 rules: [
     *                     {
     *                         displayName: String
     *                         isResourceSet: Boolean
     *                         lastUpdatedTimestamp: Long
     *                         name: String
     *                         qualifiedName: String
     *                     }
     *                 ]
     *                 storeType: String
     *             }
     *         ]
     *         version: Integer
     *     }
     * }
     * }</pre>
     *
     * @param resourceSetRuleConfig ResourceSetRuleConfig implementation class.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return resourceSetRuleConfig implementation class along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateResourceSetRuleWithResponse(
            BinaryData resourceSetRuleConfig, RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateResourceSetRuleWithResponse(resourceSetRuleConfig, requestOptions);
    }

    /**
     * Deletes a ResourceSetRuleConfig resource.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteResourceSetRuleWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.deleteResourceSetRuleWithResponse(requestOptions);
    }

    /**
     * Get a resource set config service model.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>$skipToken</td><td>String</td><td>No</td><td>The skipToken parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     count: Long
     *     nextLink: String
     *     value: [
     *         {
     *             advancedResourceSet: {
     *                 modifiedAt: String
     *                 resourceSetProcessing: String(Default/Advanced)
     *             }
     *             name: String
     *             pathPatternConfig: {
     *                 acceptedPatterns: [
     *                     {
     *                         createdBy: String
     *                         filterType: String(Pattern/Regex)
     *                         lastUpdatedTimestamp: Long
     *                         modifiedBy: String
     *                         name: String
     *                         path: String
     *                     }
     *                 ]
     *                 complexReplacers: [
     *                     {
     *                         createdBy: String
     *                         description: String
     *                         disabled: Boolean
     *                         disableRecursiveReplacerApplication: Boolean
     *                         lastUpdatedTimestamp: Long
     *                         modifiedBy: String
     *                         name: String
     *                         typeName: String
     *                     }
     *                 ]
     *                 createdBy: String
     *                 enableDefaultPatterns: boolean
     *                 lastUpdatedTimestamp: Long
     *                 modifiedBy: String
     *                 normalizationRules: [
     *                     {
     *                         description: String
     *                         disabled: Boolean
     *                         dynamicReplacement: Boolean
     *                         entityTypes: [
     *                             String
     *                         ]
     *                         lastUpdatedTimestamp: Long
     *                         name: String
     *                         regex: {
     *                             maxDigits: Integer
     *                             maxLetters: Integer
     *                             minDashes: Integer
     *                             minDigits: Integer
     *                             minDigitsOrLetters: Integer
     *                             minDots: Integer
     *                             minHex: Integer
     *                             minLetters: Integer
     *                             minUnderscores: Integer
     *                             options: Integer
     *                             regexStr: String
     *                         }
     *                         replaceWith: String
     *                         version: Double
     *                     }
     *                 ]
     *                 regexReplacers: [
     *                     {
     *                         condition: String
     *                         createdBy: String
     *                         description: String
     *                         disabled: boolean
     *                         disableRecursiveReplacerApplication: Boolean
     *                         doNotReplaceRegex: (recursive schema, see doNotReplaceRegex above)
     *                         lastUpdatedTimestamp: Long
     *                         modifiedBy: String
     *                         name: String
     *                         regex: (recursive schema, see regex above)
     *                         replaceWith: String
     *                     }
     *                 ]
     *                 rejectedPatterns: [
     *                     (recursive schema, see above)
     *                 ]
     *                 scopedRules: [
     *                     {
     *                         bindingUrl: String
     *                         rules: [
     *                             {
     *                                 displayName: String
     *                                 isResourceSet: Boolean
     *                                 lastUpdatedTimestamp: Long
     *                                 name: String
     *                                 qualifiedName: String
     *                             }
     *                         ]
     *                         storeType: String
     *                     }
     *                 ]
     *                 version: Integer
     *             }
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return a resource set config service model as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listResourceSetRules(RequestOptions requestOptions) {
        return this.serviceClient.listResourceSetRules(requestOptions);
    }
}
