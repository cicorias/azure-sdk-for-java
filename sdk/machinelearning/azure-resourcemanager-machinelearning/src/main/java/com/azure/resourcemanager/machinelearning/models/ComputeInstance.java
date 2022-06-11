// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** An Azure Machine Learning compute instance. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "computeType")
@JsonTypeName("ComputeInstance")
@Fluent
public final class ComputeInstance extends Compute {
    /*
     * Properties of ComputeInstance
     */
    @JsonProperty(value = "properties")
    private ComputeInstanceProperties properties;

    /**
     * Get the properties property: Properties of ComputeInstance.
     *
     * @return the properties value.
     */
    public ComputeInstanceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of ComputeInstance.
     *
     * @param properties the properties value to set.
     * @return the ComputeInstance object itself.
     */
    public ComputeInstance withProperties(ComputeInstanceProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ComputeInstance withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ComputeInstance withResourceId(String resourceId) {
        super.withResourceId(resourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ComputeInstance withDisableLocalAuth(Boolean disableLocalAuth) {
        super.withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
    }
}