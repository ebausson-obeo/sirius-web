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
package org.eclipse.sirius.components.papaya.provider.spec;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.sirius.components.papaya.Constructor;
import org.eclipse.sirius.components.papaya.NamedElement;
import org.eclipse.sirius.components.papaya.provider.ConstructorItemProvider;
import org.eclipse.sirius.components.papaya.provider.PapayaItemProviderAdapterFactory;
import org.eclipse.sirius.components.papaya.provider.spec.images.VisibilityOverlayImageProvider;

/**
 * Customization of the item provider implementation generated by EMF.
 *
 * @author sbegaudeau
 */
public class ConstructorItemProviderSpec extends ConstructorItemProvider {
    public ConstructorItemProviderSpec(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    @Override
    public Object getImage(Object object) {
        if (object instanceof Constructor constructor) {
            var visibilityImage = new VisibilityOverlayImageProvider().overlayImage(this.getResourceLocator(), constructor.getVisibility());

            return new ComposedImage(List.of(
                    this.getResourceLocator().getImage("full/obj16/Constructor.svg"),
                    visibilityImage
            ));
        }
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/Constructor.svg"));
    }

    @Override
    public String getText(Object object) {
        if (object instanceof Constructor constructor) {
            if (constructor.eContainer() instanceof NamedElement namedElement && namedElement.getName() != null && !namedElement.getName().isBlank()) {
                var text = namedElement.getName();

                return text + constructor.getParameters().stream()
                        .map(parameter -> {
                            var adapter = new PapayaItemProviderAdapterFactory().adapt(parameter, IItemLabelProvider.class);
                            if (adapter instanceof IItemLabelProvider itemLabelProvider) {
                                return itemLabelProvider.getText(parameter);
                            }
                            return "";
                        })
                        .collect(Collectors.joining(", ", "(", ")"));
            }
        }
        return super.getText(object);
    }
}