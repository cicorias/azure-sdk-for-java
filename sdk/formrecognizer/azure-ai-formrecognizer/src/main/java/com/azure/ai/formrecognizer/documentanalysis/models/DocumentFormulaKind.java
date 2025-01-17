// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.documentanalysis.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Formula kind. */
public final class DocumentFormulaKind extends ExpandableStringEnum<DocumentFormulaKind> {
    /** Static value inline for DocumentFormulaKind. */
    public static final DocumentFormulaKind INLINE = fromString("inline");

    /** Static value display for DocumentFormulaKind. */
    public static final DocumentFormulaKind DISPLAY = fromString("display");

    /**
     * Creates a new instance of DocumentFormulaKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DocumentFormulaKind() {}

    /**
     * Creates or finds a DocumentFormulaKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DocumentFormulaKind.
     */
    @JsonCreator
    public static DocumentFormulaKind fromString(String name) {
        return fromString(name, DocumentFormulaKind.class);
    }

    /**
     * Gets known DocumentFormulaKind values.
     *
     * @return known DocumentFormulaKind values.
     */
    public static Collection<DocumentFormulaKind> values() {
        return values(DocumentFormulaKind.class);
    }
}
