/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The indexes for the path.
 */
public class Indexes {
    /**
     * The datatype for which the indexing behavior is applied to. Possible
     * values include: 'String', 'Number', 'Point', 'Polygon', 'LineString',
     * 'MultiPolygon'.
     */
    @JsonProperty(value = "dataType")
    private DataType dataType;

    /**
     * The precision of the index. -1 is maximum precision.
     */
    @JsonProperty(value = "precision")
    private Integer precision;

    /**
     * Indicates the type of index. Possible values include: 'Hash', 'Range',
     * 'Spatial'.
     */
    @JsonProperty(value = "kind")
    private IndexKind kind;

    /**
     * Get the datatype for which the indexing behavior is applied to. Possible values include: 'String', 'Number', 'Point', 'Polygon', 'LineString', 'MultiPolygon'.
     *
     * @return the dataType value
     */
    public DataType dataType() {
        return this.dataType;
    }

    /**
     * Set the datatype for which the indexing behavior is applied to. Possible values include: 'String', 'Number', 'Point', 'Polygon', 'LineString', 'MultiPolygon'.
     *
     * @param dataType the dataType value to set
     * @return the Indexes object itself.
     */
    public Indexes withDataType(DataType dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get the precision of the index. -1 is maximum precision.
     *
     * @return the precision value
     */
    public Integer precision() {
        return this.precision;
    }

    /**
     * Set the precision of the index. -1 is maximum precision.
     *
     * @param precision the precision value to set
     * @return the Indexes object itself.
     */
    public Indexes withPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    /**
     * Get indicates the type of index. Possible values include: 'Hash', 'Range', 'Spatial'.
     *
     * @return the kind value
     */
    public IndexKind kind() {
        return this.kind;
    }

    /**
     * Set indicates the type of index. Possible values include: 'Hash', 'Range', 'Spatial'.
     *
     * @param kind the kind value to set
     * @return the Indexes object itself.
     */
    public Indexes withKind(IndexKind kind) {
        this.kind = kind;
        return this;
    }

}
