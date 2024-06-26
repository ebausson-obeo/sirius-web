/*******************************************************************************
 * Copyright (c) 2024 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.web.data;

import java.util.UUID;

/**
 * Used to store some test identifiers related to the studio projects.
 *
 * @author sbegaudeau
 */
public final class StudioIdentifiers {

    public static final UUID EMPTY_STUDIO_PROJECT = UUID.fromString("250cabc0-a211-438c-8015-2d2aa136eb81");

    public static final UUID SAMPLE_STUDIO_PROJECT = UUID.fromString("01234836-0902-418a-900a-4c0afd20323e");

    public static final UUID DOMAIN_DOCUMENT = UUID.fromString("f0e490c1-79f1-49a0-b1f2-3637f2958148");

    public static final UUID DOMAIN_OBJECT = UUID.fromString("f8204cb6-3705-48a5-bee3-ad7e7d6cbdaf");

    public static final UUID HUMAN_ENTITY_OBJECT = UUID.fromString("1731ffb5-bfb0-46f3-a23d-0c0650300005");

    public static final UUID FORM_DESCRIPTION_OBJECT = UUID.fromString("ed20cb85-a58a-47ad-bc0d-749ec8b2ea03");

    public static final UUID DIAGRAM_DESCRIPTION_OBJECT = UUID.fromString("7384dc2c-1b43-45c7-9c74-f972b28774c8");

    public static final String DIAGRAM_DESCRIPTION_ID = "siriusComponents://representationDescription?kind=diagramDescription&sourceKind=view&sourceId=fc1d7b23-2818-4874-bb30-8831ea287a44&sourceElementId=7384dc2c-1b43-45c7-9c74-f972b28774c8";

    public static final UUID PLACEHOLDER_IMAGE_OBJECT = UUID.fromString("7f8ce6ef-a23f-4c62-a6f8-381d5c237742");

    public static final UUID INSTANCE_PROJECT = UUID.fromString("bb66e0e9-4ab5-47ef-99f5-c6b26be995ea");

    public static final UUID ROOT_OBJECT = UUID.fromString("87fa4553-6889-4ce6-b017-d013987f9fae");

    public static final UUID ELLIPSE_NODE_STYLE_DESCRIPTION_OBJECT = UUID.fromString("3b3637a2-c397-4837-b42f-25fee34e5af2");

    private StudioIdentifiers() {
        // Prevent instantiation
    }
}
