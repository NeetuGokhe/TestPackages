package com.halodoc.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.halodoc.models.LocationDAO;

public class EntityMapper {
    ObjectMapper objectMapper;
    public Object getEntityObject(String EntityObject, Class aClass) throws JsonProcessingException {
        objectMapper = new ObjectMapper();
        Object entityValue = objectMapper.readValue(EntityObject, aClass);
        return entityValue;
    }
}
