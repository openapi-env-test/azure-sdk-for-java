// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mysqlflexibleserver.MySqlManager;
import com.azure.resourcemanager.mysqlflexibleserver.models.LogFile;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LogFilesListByServerMockTests {
    @Test
    public void testListByServer() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"sizeInKB\":2787297702458911120,\"createdTime\":\"2021-01-04T11:20:29Z\",\"type\":\"wneaiv\",\"lastModifiedTime\":\"2021-02-14T15:05:44Z\",\"url\":\"elpcirelsfeaenwa\"},\"id\":\"atklddxbjhwuaa\",\"name\":\"oz\",\"type\":\"osphyoul\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MySqlManager manager =
            MySqlManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<LogFile> response =
            manager.logFiles().listByServer("mszkkfo", "rey", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(2787297702458911120L, response.iterator().next().sizeInKB());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-04T11:20:29Z"), response.iterator().next().createdTime());
        Assertions.assertEquals("wneaiv", response.iterator().next().typePropertiesType());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-02-14T15:05:44Z"), response.iterator().next().lastModifiedTime());
        Assertions.assertEquals("elpcirelsfeaenwa", response.iterator().next().url());
    }
}
