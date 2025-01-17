// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Get Device static interface maps as per topology. */
@Fluent
public final class GetStaticInterfaceMapsPropertiesItemInner {
    /*
     * The interface name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The interface description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The interface identifier.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /*
     * The interface type. Example: Ethernet
     */
    @JsonProperty(value = "interfaceType")
    private String interfaceType;

    /*
     * The physical cable connector type. Example: Optical
     */
    @JsonProperty(value = "connectorType")
    private String connectorType;

    /*
     * Connected to ARM resource or external interface
     */
    @JsonProperty(value = "connectedTo")
    private String connectedTo;

    /*
     * The interface speed. Example: 100
     */
    @JsonProperty(value = "speed")
    private Float speed;

    /*
     * The port channel group id.
     */
    @JsonProperty(value = "channelGroupId")
    private Float channelGroupId;

    /** Creates an instance of GetStaticInterfaceMapsPropertiesItemInner class. */
    public GetStaticInterfaceMapsPropertiesItemInner() {
    }

    /**
     * Get the name property: The interface name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The interface name.
     *
     * @param name the name value to set.
     * @return the GetStaticInterfaceMapsPropertiesItemInner object itself.
     */
    public GetStaticInterfaceMapsPropertiesItemInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: The interface description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The interface description.
     *
     * @param description the description value to set.
     * @return the GetStaticInterfaceMapsPropertiesItemInner object itself.
     */
    public GetStaticInterfaceMapsPropertiesItemInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the identifier property: The interface identifier.
     *
     * @return the identifier value.
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: The interface identifier.
     *
     * @param identifier the identifier value to set.
     * @return the GetStaticInterfaceMapsPropertiesItemInner object itself.
     */
    public GetStaticInterfaceMapsPropertiesItemInner withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the interfaceType property: The interface type. Example: Ethernet.
     *
     * @return the interfaceType value.
     */
    public String interfaceType() {
        return this.interfaceType;
    }

    /**
     * Set the interfaceType property: The interface type. Example: Ethernet.
     *
     * @param interfaceType the interfaceType value to set.
     * @return the GetStaticInterfaceMapsPropertiesItemInner object itself.
     */
    public GetStaticInterfaceMapsPropertiesItemInner withInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }

    /**
     * Get the connectorType property: The physical cable connector type. Example: Optical.
     *
     * @return the connectorType value.
     */
    public String connectorType() {
        return this.connectorType;
    }

    /**
     * Set the connectorType property: The physical cable connector type. Example: Optical.
     *
     * @param connectorType the connectorType value to set.
     * @return the GetStaticInterfaceMapsPropertiesItemInner object itself.
     */
    public GetStaticInterfaceMapsPropertiesItemInner withConnectorType(String connectorType) {
        this.connectorType = connectorType;
        return this;
    }

    /**
     * Get the connectedTo property: Connected to ARM resource or external interface.
     *
     * @return the connectedTo value.
     */
    public String connectedTo() {
        return this.connectedTo;
    }

    /**
     * Set the connectedTo property: Connected to ARM resource or external interface.
     *
     * @param connectedTo the connectedTo value to set.
     * @return the GetStaticInterfaceMapsPropertiesItemInner object itself.
     */
    public GetStaticInterfaceMapsPropertiesItemInner withConnectedTo(String connectedTo) {
        this.connectedTo = connectedTo;
        return this;
    }

    /**
     * Get the speed property: The interface speed. Example: 100.
     *
     * @return the speed value.
     */
    public Float speed() {
        return this.speed;
    }

    /**
     * Set the speed property: The interface speed. Example: 100.
     *
     * @param speed the speed value to set.
     * @return the GetStaticInterfaceMapsPropertiesItemInner object itself.
     */
    public GetStaticInterfaceMapsPropertiesItemInner withSpeed(Float speed) {
        this.speed = speed;
        return this;
    }

    /**
     * Get the channelGroupId property: The port channel group id.
     *
     * @return the channelGroupId value.
     */
    public Float channelGroupId() {
        return this.channelGroupId;
    }

    /**
     * Set the channelGroupId property: The port channel group id.
     *
     * @param channelGroupId the channelGroupId value to set.
     * @return the GetStaticInterfaceMapsPropertiesItemInner object itself.
     */
    public GetStaticInterfaceMapsPropertiesItemInner withChannelGroupId(Float channelGroupId) {
        this.channelGroupId = channelGroupId;
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
