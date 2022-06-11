// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GrantType. */
public final class GrantType extends ExpandableStringEnum<GrantType> {
    /** Static value Student for GrantType. */
    public static final GrantType STUDENT = fromString("Student");

    /** Static value Academic for GrantType. */
    public static final GrantType ACADEMIC = fromString("Academic");

    /**
     * Creates or finds a GrantType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GrantType.
     */
    @JsonCreator
    public static GrantType fromString(String name) {
        return fromString(name, GrantType.class);
    }

    /**
     * Gets known GrantType values.
     *
     * @return known GrantType values.
     */
    public static Collection<GrantType> values() {
        return values(GrantType.class);
    }
}