// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.purview.purviewcatalog.CollectionClient;
import com.azure.purview.purviewcatalog.CollectionClientBuilder;
import com.azure.purview.purviewcatalog.DiscoveryClient;
import com.azure.purview.purviewcatalog.DiscoveryClientBuilder;
import com.azure.purview.purviewcatalog.EntityClient;
import com.azure.purview.purviewcatalog.EntityClientBuilder;
import com.azure.purview.purviewcatalog.GlossaryClient;
import com.azure.purview.purviewcatalog.GlossaryClientBuilder;
import com.azure.purview.purviewcatalog.LineageClient;
import com.azure.purview.purviewcatalog.LineageClientBuilder;
import com.azure.purview.purviewcatalog.RelationshipClient;
import com.azure.purview.purviewcatalog.RelationshipClientBuilder;
import com.azure.purview.purviewcatalog.TypesClient;
import com.azure.purview.purviewcatalog.TypesClientBuilder;

class PurviewCatalogServiceRestApiDocumentClientTestBase extends TestBase {
    protected EntityClient entityClient;

    protected GlossaryClient glossaryClient;

    protected DiscoveryClient discoveryClient;

    protected LineageClient lineageClient;

    protected RelationshipClient relationshipClient;

    protected TypesClient typesClient;

    protected CollectionClient collectionClient;

    @Override
    protected void beforeTest() {
        EntityClientBuilder entityClientbuilder =
                new EntityClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            entityClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            entityClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        entityClient = entityClientbuilder.buildClient();

        GlossaryClientBuilder glossaryClientbuilder =
                new GlossaryClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            glossaryClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            glossaryClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        glossaryClient = glossaryClientbuilder.buildClient();

        DiscoveryClientBuilder discoveryClientbuilder =
                new DiscoveryClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            discoveryClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            discoveryClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        discoveryClient = discoveryClientbuilder.buildClient();

        LineageClientBuilder lineageClientbuilder =
                new LineageClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            lineageClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            lineageClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        lineageClient = lineageClientbuilder.buildClient();

        RelationshipClientBuilder relationshipClientbuilder =
                new RelationshipClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            relationshipClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            relationshipClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        relationshipClient = relationshipClientbuilder.buildClient();

        TypesClientBuilder typesClientbuilder =
                new TypesClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            typesClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            typesClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        typesClient = typesClientbuilder.buildClient();

        CollectionClientBuilder collectionClientbuilder =
                new CollectionClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            collectionClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            collectionClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        collectionClient = collectionClientbuilder.buildClient();
    }
}
