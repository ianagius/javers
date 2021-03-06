package org.javers.core.graph;

import org.javers.common.validation.Validate;
import org.javers.core.metamodel.object.Cdo;
import org.javers.core.metamodel.object.GlobalId;
import org.javers.core.metamodel.property.Property;

/**
 * @author bartosz.walacik
 */
class ShallowSingleEdge extends AbstractSingleEdge {
    private final Cdo reference;

    ShallowSingleEdge(Property property, Cdo referencedObject) {
        super(property);
        Validate.argumentIsNotNull(referencedObject);
        this.reference = referencedObject;
    }

    @Override
    GlobalId getReference() {
        return reference.getGlobalId();
    }
}
