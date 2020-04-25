/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * HDInsight MapReduce activity type.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = HDInsightMapReduceActivity.class)
@JsonTypeName("HDInsightMapReduce")
@JsonFlatten
public class HDInsightMapReduceActivity extends ExecutionActivity {
    /**
     * Storage linked service references.
     */
    @JsonProperty(value = "typeProperties.storageLinkedServices")
    private List<LinkedServiceReference> storageLinkedServices;

    /**
     * User specified arguments to HDInsightActivity.
     */
    @JsonProperty(value = "typeProperties.arguments")
    private List<Object> arguments;

    /**
     * Debug info option. Possible values include: 'None', 'Always', 'Failure'.
     */
    @JsonProperty(value = "typeProperties.getDebugInfo")
    private HDInsightActivityDebugInfoOption getDebugInfo;

    /**
     * Class name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.className", required = true)
    private Object className;

    /**
     * Jar path. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.jarFilePath", required = true)
    private Object jarFilePath;

    /**
     * Jar linked service reference.
     */
    @JsonProperty(value = "typeProperties.jarLinkedService")
    private LinkedServiceReference jarLinkedService;

    /**
     * Jar libs.
     */
    @JsonProperty(value = "typeProperties.jarLibs")
    private List<Object> jarLibs;

    /**
     * Allows user to specify defines for the MapReduce job request.
     */
    @JsonProperty(value = "typeProperties.defines")
    private Map<String, Object> defines;

    /**
     * Get storage linked service references.
     *
     * @return the storageLinkedServices value
     */
    public List<LinkedServiceReference> storageLinkedServices() {
        return this.storageLinkedServices;
    }

    /**
     * Set storage linked service references.
     *
     * @param storageLinkedServices the storageLinkedServices value to set
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withStorageLinkedServices(List<LinkedServiceReference> storageLinkedServices) {
        this.storageLinkedServices = storageLinkedServices;
        return this;
    }

    /**
     * Get user specified arguments to HDInsightActivity.
     *
     * @return the arguments value
     */
    public List<Object> arguments() {
        return this.arguments;
    }

    /**
     * Set user specified arguments to HDInsightActivity.
     *
     * @param arguments the arguments value to set
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withArguments(List<Object> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * Get debug info option. Possible values include: 'None', 'Always', 'Failure'.
     *
     * @return the getDebugInfo value
     */
    public HDInsightActivityDebugInfoOption getDebugInfo() {
        return this.getDebugInfo;
    }

    /**
     * Set debug info option. Possible values include: 'None', 'Always', 'Failure'.
     *
     * @param getDebugInfo the getDebugInfo value to set
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withGetDebugInfo(HDInsightActivityDebugInfoOption getDebugInfo) {
        this.getDebugInfo = getDebugInfo;
        return this;
    }

    /**
     * Get class name. Type: string (or Expression with resultType string).
     *
     * @return the className value
     */
    public Object className() {
        return this.className;
    }

    /**
     * Set class name. Type: string (or Expression with resultType string).
     *
     * @param className the className value to set
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withClassName(Object className) {
        this.className = className;
        return this;
    }

    /**
     * Get jar path. Type: string (or Expression with resultType string).
     *
     * @return the jarFilePath value
     */
    public Object jarFilePath() {
        return this.jarFilePath;
    }

    /**
     * Set jar path. Type: string (or Expression with resultType string).
     *
     * @param jarFilePath the jarFilePath value to set
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withJarFilePath(Object jarFilePath) {
        this.jarFilePath = jarFilePath;
        return this;
    }

    /**
     * Get jar linked service reference.
     *
     * @return the jarLinkedService value
     */
    public LinkedServiceReference jarLinkedService() {
        return this.jarLinkedService;
    }

    /**
     * Set jar linked service reference.
     *
     * @param jarLinkedService the jarLinkedService value to set
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withJarLinkedService(LinkedServiceReference jarLinkedService) {
        this.jarLinkedService = jarLinkedService;
        return this;
    }

    /**
     * Get jar libs.
     *
     * @return the jarLibs value
     */
    public List<Object> jarLibs() {
        return this.jarLibs;
    }

    /**
     * Set jar libs.
     *
     * @param jarLibs the jarLibs value to set
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withJarLibs(List<Object> jarLibs) {
        this.jarLibs = jarLibs;
        return this;
    }

    /**
     * Get allows user to specify defines for the MapReduce job request.
     *
     * @return the defines value
     */
    public Map<String, Object> defines() {
        return this.defines;
    }

    /**
     * Set allows user to specify defines for the MapReduce job request.
     *
     * @param defines the defines value to set
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withDefines(Map<String, Object> defines) {
        this.defines = defines;
        return this;
    }

}
