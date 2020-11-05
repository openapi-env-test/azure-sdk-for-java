/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
import rx.functions.Func1;

/**
 * An instance of this class provides access to all the operations defined
 * in PrivateEndpointConnections.
 */
public class PrivateEndpointConnectionsInner {
    /** The Retrofit service to perform REST calls. */
    private PrivateEndpointConnectionsService service;
    /** The service client containing this operation class. */
    private CosmosDBManagementClientImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateEndpointConnectionsInner(Retrofit retrofit, CosmosDBManagementClientImpl client) {
        this.service = retrofit.create(PrivateEndpointConnectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PrivateEndpointConnections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PrivateEndpointConnectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.PrivateEndpointConnections listByDatabaseAccount" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/databaseAccounts/{accountName}/privateEndpointConnections")
        Observable<Response<ResponseBody>> listByDatabaseAccount(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.PrivateEndpointConnections get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/databaseAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.PrivateEndpointConnections createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/databaseAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Body PrivateEndpointConnectionInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.PrivateEndpointConnections beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/databaseAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Body PrivateEndpointConnectionInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.PrivateEndpointConnections delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/databaseAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.PrivateEndpointConnections beginDelete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/databaseAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> beginDelete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List all private endpoint connections on a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PrivateEndpointConnectionInner&gt; object if successful.
     */
    public List<PrivateEndpointConnectionInner> listByDatabaseAccount(String resourceGroupName, String accountName) {
        return listByDatabaseAccountWithServiceResponseAsync(resourceGroupName, accountName).toBlocking().single().body();
    }

    /**
     * List all private endpoint connections on a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PrivateEndpointConnectionInner>> listByDatabaseAccountAsync(String resourceGroupName, String accountName, final ServiceCallback<List<PrivateEndpointConnectionInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByDatabaseAccountWithServiceResponseAsync(resourceGroupName, accountName), serviceCallback);
    }

    /**
     * List all private endpoint connections on a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PrivateEndpointConnectionInner&gt; object
     */
    public Observable<List<PrivateEndpointConnectionInner>> listByDatabaseAccountAsync(String resourceGroupName, String accountName) {
        return listByDatabaseAccountWithServiceResponseAsync(resourceGroupName, accountName).map(new Func1<ServiceResponse<List<PrivateEndpointConnectionInner>>, List<PrivateEndpointConnectionInner>>() {
            @Override
            public List<PrivateEndpointConnectionInner> call(ServiceResponse<List<PrivateEndpointConnectionInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * List all private endpoint connections on a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PrivateEndpointConnectionInner&gt; object
     */
    public Observable<ServiceResponse<List<PrivateEndpointConnectionInner>>> listByDatabaseAccountWithServiceResponseAsync(String resourceGroupName, String accountName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        final String apiVersion = "2019-08-01-preview";
        return service.listByDatabaseAccount(this.client.subscriptionId(), resourceGroupName, accountName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<PrivateEndpointConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<PrivateEndpointConnectionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PrivateEndpointConnectionInner>> result = listByDatabaseAccountDelegate(response);
                        List<PrivateEndpointConnectionInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<PrivateEndpointConnectionInner>> clientResponse = new ServiceResponse<List<PrivateEndpointConnectionInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PrivateEndpointConnectionInner>> listByDatabaseAccountDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PrivateEndpointConnectionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PrivateEndpointConnectionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionInner object if successful.
     */
    public PrivateEndpointConnectionInner get(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return getWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName).toBlocking().single().body();
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionInner> getAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, final ServiceCallback<PrivateEndpointConnectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<PrivateEndpointConnectionInner> getAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return getWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName).map(new Func1<ServiceResponse<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner>() {
            @Override
            public PrivateEndpointConnectionInner call(ServiceResponse<PrivateEndpointConnectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<ServiceResponse<PrivateEndpointConnectionInner>> getWithServiceResponseAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        final String apiVersion = "2019-08-01-preview";
        return service.get(this.client.subscriptionId(), resourceGroupName, accountName, privateEndpointConnectionName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateEndpointConnectionInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateEndpointConnectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateEndpointConnectionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateEndpointConnectionInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateEndpointConnectionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateEndpointConnectionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters the PrivateEndpointConnectionInner value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionInner object if successful.
     */
    public PrivateEndpointConnectionInner createOrUpdate(String resourceGroupName, String accountName, String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName, parameters).toBlocking().last().body();
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters the PrivateEndpointConnectionInner value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionInner> createOrUpdateAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters, final ServiceCallback<PrivateEndpointConnectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName, parameters), serviceCallback);
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters the PrivateEndpointConnectionInner value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<PrivateEndpointConnectionInner> createOrUpdateAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName, parameters).map(new Func1<ServiceResponse<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner>() {
            @Override
            public PrivateEndpointConnectionInner call(ServiceResponse<PrivateEndpointConnectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters the PrivateEndpointConnectionInner value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<PrivateEndpointConnectionInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2019-08-01-preview";
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, accountName, privateEndpointConnectionName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<PrivateEndpointConnectionInner>() { }.getType());
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters the PrivateEndpointConnectionInner value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionInner object if successful.
     */
    public PrivateEndpointConnectionInner beginCreateOrUpdate(String resourceGroupName, String accountName, String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName, parameters).toBlocking().single().body();
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters the PrivateEndpointConnectionInner value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionInner> beginCreateOrUpdateAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters, final ServiceCallback<PrivateEndpointConnectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName, parameters), serviceCallback);
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters the PrivateEndpointConnectionInner value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<PrivateEndpointConnectionInner> beginCreateOrUpdateAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName, parameters).map(new Func1<ServiceResponse<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner>() {
            @Override
            public PrivateEndpointConnectionInner call(ServiceResponse<PrivateEndpointConnectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters the PrivateEndpointConnectionInner value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<ServiceResponse<PrivateEndpointConnectionInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2019-08-01-preview";
        return service.beginCreateOrUpdate(this.client.subscriptionId(), resourceGroupName, accountName, privateEndpointConnectionName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateEndpointConnectionInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateEndpointConnectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateEndpointConnectionInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateEndpointConnectionInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateEndpointConnectionInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateEndpointConnectionInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        deleteWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName).toBlocking().last().body();
    }

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return deleteWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        final String apiVersion = "2019-08-01-preview";
        Observable<Response<ResponseBody>> observable = service.delete(this.client.subscriptionId(), resourceGroupName, accountName, privateEndpointConnectionName, apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginDelete(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        beginDeleteWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName).toBlocking().single().body();
    }

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginDeleteAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(beginDeleteWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> beginDeleteAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return beginDeleteWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginDeleteWithServiceResponseAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        final String apiVersion = "2019-08-01-preview";
        return service.beginDelete(this.client.subscriptionId(), resourceGroupName, accountName, privateEndpointConnectionName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = beginDeleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> beginDeleteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
