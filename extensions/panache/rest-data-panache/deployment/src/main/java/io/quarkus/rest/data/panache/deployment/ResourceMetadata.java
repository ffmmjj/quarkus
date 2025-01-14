package io.quarkus.rest.data.panache.deployment;

import java.util.Map;

import org.jboss.jandex.Type;

public class ResourceMetadata {

    /**
     * Generated class that implements RestDataResource.
     */
    private final String resourceClass;

    /**
     * Application interface that extends RestDataResource interface.
     */
    private final String resourceInterface;

    /**
     * Entity class that is used by the resource.
     */
    private final String entityType;

    /**
     * ID class/interface that is used by the resource.
     */
    private final String idType;

    /**
     * Map containing the field names by field types.
     */
    private final Map<String, Type> fields;

    public ResourceMetadata(String resourceClass, String resourceInterface, String entityType, String idType,
            Map<String, Type> fields) {
        this.resourceClass = resourceClass;
        this.resourceInterface = resourceInterface;
        this.entityType = entityType;
        this.idType = idType;
        this.fields = fields;
    }

    public String getResourceClass() {
        return resourceClass;
    }

    public String getResourceInterface() {
        return resourceInterface;
    }

    public String getEntityType() {
        return entityType;
    }

    public String getIdType() {
        return idType;
    }

    public Map<String, Type> getFields() {
        return fields;
    }
}
