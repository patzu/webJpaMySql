package com.wikichera.webJpaMysql.common;

import java.util.List;

public abstract class EntToDtoConverter<entClass, dtoClass> {
    public abstract dtoClass convertEntToDto(entClass entClass);

    public abstract List<dtoClass> convertAllEntToDto(List<entClass> entClassList);
}
