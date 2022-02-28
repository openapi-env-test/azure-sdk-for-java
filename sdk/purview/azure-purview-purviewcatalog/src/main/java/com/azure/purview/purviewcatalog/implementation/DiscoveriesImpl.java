// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Discoveries. */
public final class DiscoveriesImpl {
    /** The proxy service used to perform REST calls. */
    private final DiscoveriesService service;

    /** The service client containing this operation class. */
    private final PurviewCatalogServiceRestApiDocumentClientImpl client;

    /**
     * Initializes an instance of DiscoveriesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DiscoveriesImpl(PurviewCatalogServiceRestApiDocumentClientImpl client) {
        this.service =
                RestProxy.create(DiscoveriesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PurviewCatalogServiceRestApiDocumentDiscoveries to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{Endpoint}/catalog/api")
    @ServiceInterface(name = "PurviewCatalogServic")
    private interface DiscoveriesService {
        @Post("/search/query")
        @ExpectedResponses({200})
        Mono<Response<BinaryData>> query(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData searchRequest,
                RequestOptions requestOptions,
                Context context);

        @Post("/search/suggest")
        @ExpectedResponses({200})
        Mono<Response<BinaryData>> suggest(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData suggestRequest,
                RequestOptions requestOptions,
                Context context);

        @Post("/browse")
        @ExpectedResponses({200})
        Mono<Response<BinaryData>> browse(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData browseRequest,
                RequestOptions requestOptions,
                Context context);

        @Post("/search/autocomplete")
        @ExpectedResponses({200})
        Mono<Response<BinaryData>> autoComplete(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData autoCompleteRequest,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Gets data using search.
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
     *     keywords: String
     *     offset: Integer
     *     limit: Integer
     *     filter: Object
     *     facets: [
     *         {
     *             count: Integer
     *             facet: String
     *             sort: Object
     *         }
     *     ]
     *     taxonomySetting: {
     *         assetTypes: [
     *             String
     *         ]
     *         facet: (recursive schema, see facet above)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     searchCount: Integer
     *     searchFacets: {
     *         assetType: [
     *             {
     *                 count: Integer
     *                 value: String
     *             }
     *         ]
     *         classification: [
     *             (recursive schema, see above)
     *         ]
     *         classificationCategory: [
     *             (recursive schema, see above)
     *         ]
     *         contactId: [
     *             (recursive schema, see above)
     *         ]
     *         fileExtension: [
     *             (recursive schema, see above)
     *         ]
     *         label: [
     *             (recursive schema, see above)
     *         ]
     *         term: [
     *             (recursive schema, see above)
     *         ]
     *     }
     *     value: [
     *         {
     *             searchScore: Float
     *             searchHighlights: {
     *                 id: [
     *                     String
     *                 ]
     *                 qualifiedName: [
     *                     String
     *                 ]
     *                 name: [
     *                     String
     *                 ]
     *                 description: [
     *                     String
     *                 ]
     *                 entityType: [
     *                     String
     *                 ]
     *             }
     *             searchText: String
     *             description: String
     *             id: String
     *             name: String
     *             owner: String
     *             qualifiedName: String
     *             entityType: String
     *             classification: [
     *                 String
     *             ]
     *             label: [
     *                 String
     *             ]
     *             term: [
     *                 {
     *                     name: String
     *                     glossaryName: String
     *                     guid: String
     *                 }
     *             ]
     *             contact: [
     *                 {
     *                     id: String
     *                     info: String
     *                     contactType: String
     *                 }
     *             ]
     *             assetType: [
     *                 String
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param searchRequest An object specifying the search criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return data using search along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> queryWithResponseAsync(BinaryData searchRequest, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.query(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                searchRequest,
                                requestOptions,
                                context));
    }

    /**
     * Gets data using search.
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
     *     keywords: String
     *     offset: Integer
     *     limit: Integer
     *     filter: Object
     *     facets: [
     *         {
     *             count: Integer
     *             facet: String
     *             sort: Object
     *         }
     *     ]
     *     taxonomySetting: {
     *         assetTypes: [
     *             String
     *         ]
     *         facet: (recursive schema, see facet above)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     searchCount: Integer
     *     searchFacets: {
     *         assetType: [
     *             {
     *                 count: Integer
     *                 value: String
     *             }
     *         ]
     *         classification: [
     *             (recursive schema, see above)
     *         ]
     *         classificationCategory: [
     *             (recursive schema, see above)
     *         ]
     *         contactId: [
     *             (recursive schema, see above)
     *         ]
     *         fileExtension: [
     *             (recursive schema, see above)
     *         ]
     *         label: [
     *             (recursive schema, see above)
     *         ]
     *         term: [
     *             (recursive schema, see above)
     *         ]
     *     }
     *     value: [
     *         {
     *             searchScore: Float
     *             searchHighlights: {
     *                 id: [
     *                     String
     *                 ]
     *                 qualifiedName: [
     *                     String
     *                 ]
     *                 name: [
     *                     String
     *                 ]
     *                 description: [
     *                     String
     *                 ]
     *                 entityType: [
     *                     String
     *                 ]
     *             }
     *             searchText: String
     *             description: String
     *             id: String
     *             name: String
     *             owner: String
     *             qualifiedName: String
     *             entityType: String
     *             classification: [
     *                 String
     *             ]
     *             label: [
     *                 String
     *             ]
     *             term: [
     *                 {
     *                     name: String
     *                     glossaryName: String
     *                     guid: String
     *                 }
     *             ]
     *             contact: [
     *                 {
     *                     id: String
     *                     info: String
     *                     contactType: String
     *                 }
     *             ]
     *             assetType: [
     *                 String
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param searchRequest An object specifying the search criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return data using search along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> queryWithResponseAsync(
            BinaryData searchRequest, RequestOptions requestOptions, Context context) {
        return service.query(
                this.client.getEndpoint(),
                this.client.getServiceVersion().getVersion(),
                searchRequest,
                requestOptions,
                context);
    }

    /**
     * Gets data using search.
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
     *     keywords: String
     *     offset: Integer
     *     limit: Integer
     *     filter: Object
     *     facets: [
     *         {
     *             count: Integer
     *             facet: String
     *             sort: Object
     *         }
     *     ]
     *     taxonomySetting: {
     *         assetTypes: [
     *             String
     *         ]
     *         facet: (recursive schema, see facet above)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     searchCount: Integer
     *     searchFacets: {
     *         assetType: [
     *             {
     *                 count: Integer
     *                 value: String
     *             }
     *         ]
     *         classification: [
     *             (recursive schema, see above)
     *         ]
     *         classificationCategory: [
     *             (recursive schema, see above)
     *         ]
     *         contactId: [
     *             (recursive schema, see above)
     *         ]
     *         fileExtension: [
     *             (recursive schema, see above)
     *         ]
     *         label: [
     *             (recursive schema, see above)
     *         ]
     *         term: [
     *             (recursive schema, see above)
     *         ]
     *     }
     *     value: [
     *         {
     *             searchScore: Float
     *             searchHighlights: {
     *                 id: [
     *                     String
     *                 ]
     *                 qualifiedName: [
     *                     String
     *                 ]
     *                 name: [
     *                     String
     *                 ]
     *                 description: [
     *                     String
     *                 ]
     *                 entityType: [
     *                     String
     *                 ]
     *             }
     *             searchText: String
     *             description: String
     *             id: String
     *             name: String
     *             owner: String
     *             qualifiedName: String
     *             entityType: String
     *             classification: [
     *                 String
     *             ]
     *             label: [
     *                 String
     *             ]
     *             term: [
     *                 {
     *                     name: String
     *                     glossaryName: String
     *                     guid: String
     *                 }
     *             ]
     *             contact: [
     *                 {
     *                     id: String
     *                     info: String
     *                     contactType: String
     *                 }
     *             ]
     *             assetType: [
     *                 String
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param searchRequest An object specifying the search criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return data using search along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> queryWithResponse(BinaryData searchRequest, RequestOptions requestOptions) {
        return queryWithResponseAsync(searchRequest, requestOptions).block();
    }

    /**
     * Get search suggestions by query criteria.
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
     *     keywords: String
     *     limit: Integer
     *     filter: Object
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             searchScore: Float
     *             searchText: String
     *             description: String
     *             id: String
     *             name: String
     *             owner: String
     *             qualifiedName: String
     *             entityType: String
     *             classification: [
     *                 String
     *             ]
     *             label: [
     *                 String
     *             ]
     *             term: [
     *                 {
     *                     name: String
     *                     glossaryName: String
     *                     guid: String
     *                 }
     *             ]
     *             contact: [
     *                 {
     *                     id: String
     *                     info: String
     *                     contactType: String
     *                 }
     *             ]
     *             assetType: [
     *                 String
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param suggestRequest An object specifying the suggest criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return search suggestions by query criteria along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> suggestWithResponseAsync(
            BinaryData suggestRequest, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.suggest(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                suggestRequest,
                                requestOptions,
                                context));
    }

    /**
     * Get search suggestions by query criteria.
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
     *     keywords: String
     *     limit: Integer
     *     filter: Object
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             searchScore: Float
     *             searchText: String
     *             description: String
     *             id: String
     *             name: String
     *             owner: String
     *             qualifiedName: String
     *             entityType: String
     *             classification: [
     *                 String
     *             ]
     *             label: [
     *                 String
     *             ]
     *             term: [
     *                 {
     *                     name: String
     *                     glossaryName: String
     *                     guid: String
     *                 }
     *             ]
     *             contact: [
     *                 {
     *                     id: String
     *                     info: String
     *                     contactType: String
     *                 }
     *             ]
     *             assetType: [
     *                 String
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param suggestRequest An object specifying the suggest criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return search suggestions by query criteria along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> suggestWithResponseAsync(
            BinaryData suggestRequest, RequestOptions requestOptions, Context context) {
        return service.suggest(
                this.client.getEndpoint(),
                this.client.getServiceVersion().getVersion(),
                suggestRequest,
                requestOptions,
                context);
    }

    /**
     * Get search suggestions by query criteria.
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
     *     keywords: String
     *     limit: Integer
     *     filter: Object
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             searchScore: Float
     *             searchText: String
     *             description: String
     *             id: String
     *             name: String
     *             owner: String
     *             qualifiedName: String
     *             entityType: String
     *             classification: [
     *                 String
     *             ]
     *             label: [
     *                 String
     *             ]
     *             term: [
     *                 {
     *                     name: String
     *                     glossaryName: String
     *                     guid: String
     *                 }
     *             ]
     *             contact: [
     *                 {
     *                     id: String
     *                     info: String
     *                     contactType: String
     *                 }
     *             ]
     *             assetType: [
     *                 String
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param suggestRequest An object specifying the suggest criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return search suggestions by query criteria along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> suggestWithResponse(BinaryData suggestRequest, RequestOptions requestOptions) {
        return suggestWithResponseAsync(suggestRequest, requestOptions).block();
    }

    /**
     * Browse entities by path or entity type.
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
     *     entityType: String
     *     path: String
     *     limit: Integer
     *     offset: Integer
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     searchCount: Integer
     *     value: [
     *         {
     *             entityType: String
     *             id: String
     *             isLeaf: Boolean
     *             name: String
     *             owner: [
     *                 {
     *                     id: String
     *                     displayName: String
     *                     mail: String
     *                     contactType: String
     *                 }
     *             ]
     *             path: String
     *             qualifiedName: String
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param browseRequest An object specifying the browse criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return browseResult along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> browseWithResponseAsync(BinaryData browseRequest, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.browse(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                browseRequest,
                                requestOptions,
                                context));
    }

    /**
     * Browse entities by path or entity type.
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
     *     entityType: String
     *     path: String
     *     limit: Integer
     *     offset: Integer
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     searchCount: Integer
     *     value: [
     *         {
     *             entityType: String
     *             id: String
     *             isLeaf: Boolean
     *             name: String
     *             owner: [
     *                 {
     *                     id: String
     *                     displayName: String
     *                     mail: String
     *                     contactType: String
     *                 }
     *             ]
     *             path: String
     *             qualifiedName: String
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param browseRequest An object specifying the browse criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return browseResult along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> browseWithResponseAsync(
            BinaryData browseRequest, RequestOptions requestOptions, Context context) {
        return service.browse(
                this.client.getEndpoint(),
                this.client.getServiceVersion().getVersion(),
                browseRequest,
                requestOptions,
                context);
    }

    /**
     * Browse entities by path or entity type.
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
     *     entityType: String
     *     path: String
     *     limit: Integer
     *     offset: Integer
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     searchCount: Integer
     *     value: [
     *         {
     *             entityType: String
     *             id: String
     *             isLeaf: Boolean
     *             name: String
     *             owner: [
     *                 {
     *                     id: String
     *                     displayName: String
     *                     mail: String
     *                     contactType: String
     *                 }
     *             ]
     *             path: String
     *             qualifiedName: String
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param browseRequest An object specifying the browse criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return browseResult along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> browseWithResponse(BinaryData browseRequest, RequestOptions requestOptions) {
        return browseWithResponseAsync(browseRequest, requestOptions).block();
    }

    /**
     * Get auto complete options.
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
     *     keywords: String
     *     limit: Integer
     *     filter: Object
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             text: String
     *             queryPlusText: String
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param autoCompleteRequest An object specifying the autocomplete criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return auto complete options along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> autoCompleteWithResponseAsync(
            BinaryData autoCompleteRequest, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.autoComplete(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                autoCompleteRequest,
                                requestOptions,
                                context));
    }

    /**
     * Get auto complete options.
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
     *     keywords: String
     *     limit: Integer
     *     filter: Object
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             text: String
     *             queryPlusText: String
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param autoCompleteRequest An object specifying the autocomplete criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return auto complete options along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> autoCompleteWithResponseAsync(
            BinaryData autoCompleteRequest, RequestOptions requestOptions, Context context) {
        return service.autoComplete(
                this.client.getEndpoint(),
                this.client.getServiceVersion().getVersion(),
                autoCompleteRequest,
                requestOptions,
                context);
    }

    /**
     * Get auto complete options.
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
     *     keywords: String
     *     limit: Integer
     *     filter: Object
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             text: String
     *             queryPlusText: String
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param autoCompleteRequest An object specifying the autocomplete criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return auto complete options along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> autoCompleteWithResponse(
            BinaryData autoCompleteRequest, RequestOptions requestOptions) {
        return autoCompleteWithResponseAsync(autoCompleteRequest, requestOptions).block();
    }
}
