package com.wikichera.webJpaMysql.common;

import java.util.List;

public abstract class DtoToEntConverter<dtoClass, entClass> {
    public abstract entClass convertDtoToEnt(dtoClass dtoClass);

    public abstract List<entClass> convertAllDtoToEnt(List<dtoClass> dtoClassList);
}
