// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LocationType. */
public final class LocationType extends ExpandableStringEnum<LocationType> {
    /** Static value Region for LocationType. */
    public static final LocationType REGION = fromString("Region");

    /** Static value EdgeZone for LocationType. */
    public static final LocationType EDGE_ZONE = fromString("EdgeZone");

    /**
     * Creates or finds a LocationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LocationType.
     */
    @JsonCreator
    public static LocationType fromString(String name) {
        return fromString(name, LocationType.class);
    }

    /**
     * Gets known LocationType values.
     *
     * @return known LocationType values.
     */
    public static Collection<LocationType> values() {
        return values(LocationType.class);
    }
}