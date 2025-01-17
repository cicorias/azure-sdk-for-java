// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ResourceMoveDetails will be returned in response to GetResource call from ARM. */
@Fluent
public final class ResourceMoveDetails {
    /*
     * CorrelationId of latest ResourceMove operation attempted
     */
    @JsonProperty(value = "operationId")
    private String operationId;

    /*
     * Start time in UTC of latest ResourceMove operation attempted. ISO 8601 format.
     */
    @JsonProperty(value = "startTimeUtc")
    private String startTimeUtc;

    /*
     * Completion time in UTC of latest ResourceMove operation attempted. ISO 8601 format.
     */
    @JsonProperty(value = "completionTimeUtc")
    private String completionTimeUtc;

    /*
     * ARM resource path of source resource
     */
    @JsonProperty(value = "sourceResourcePath")
    private String sourceResourcePath;

    /*
     * ARM resource path of target resource used in latest ResourceMove operation
     */
    @JsonProperty(value = "targetResourcePath")
    private String targetResourcePath;

    /** Creates an instance of ResourceMoveDetails class. */
    public ResourceMoveDetails() {
    }

    /**
     * Get the operationId property: CorrelationId of latest ResourceMove operation attempted.
     *
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: CorrelationId of latest ResourceMove operation attempted.
     *
     * @param operationId the operationId value to set.
     * @return the ResourceMoveDetails object itself.
     */
    public ResourceMoveDetails withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get the startTimeUtc property: Start time in UTC of latest ResourceMove operation attempted. ISO 8601 format.
     *
     * @return the startTimeUtc value.
     */
    public String startTimeUtc() {
        return this.startTimeUtc;
    }

    /**
     * Set the startTimeUtc property: Start time in UTC of latest ResourceMove operation attempted. ISO 8601 format.
     *
     * @param startTimeUtc the startTimeUtc value to set.
     * @return the ResourceMoveDetails object itself.
     */
    public ResourceMoveDetails withStartTimeUtc(String startTimeUtc) {
        this.startTimeUtc = startTimeUtc;
        return this;
    }

    /**
     * Get the completionTimeUtc property: Completion time in UTC of latest ResourceMove operation attempted. ISO 8601
     * format.
     *
     * @return the completionTimeUtc value.
     */
    public String completionTimeUtc() {
        return this.completionTimeUtc;
    }

    /**
     * Set the completionTimeUtc property: Completion time in UTC of latest ResourceMove operation attempted. ISO 8601
     * format.
     *
     * @param completionTimeUtc the completionTimeUtc value to set.
     * @return the ResourceMoveDetails object itself.
     */
    public ResourceMoveDetails withCompletionTimeUtc(String completionTimeUtc) {
        this.completionTimeUtc = completionTimeUtc;
        return this;
    }

    /**
     * Get the sourceResourcePath property: ARM resource path of source resource.
     *
     * @return the sourceResourcePath value.
     */
    public String sourceResourcePath() {
        return this.sourceResourcePath;
    }

    /**
     * Set the sourceResourcePath property: ARM resource path of source resource.
     *
     * @param sourceResourcePath the sourceResourcePath value to set.
     * @return the ResourceMoveDetails object itself.
     */
    public ResourceMoveDetails withSourceResourcePath(String sourceResourcePath) {
        this.sourceResourcePath = sourceResourcePath;
        return this;
    }

    /**
     * Get the targetResourcePath property: ARM resource path of target resource used in latest ResourceMove operation.
     *
     * @return the targetResourcePath value.
     */
    public String targetResourcePath() {
        return this.targetResourcePath;
    }

    /**
     * Set the targetResourcePath property: ARM resource path of target resource used in latest ResourceMove operation.
     *
     * @param targetResourcePath the targetResourcePath value to set.
     * @return the ResourceMoveDetails object itself.
     */
    public ResourceMoveDetails withTargetResourcePath(String targetResourcePath) {
        this.targetResourcePath = targetResourcePath;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
