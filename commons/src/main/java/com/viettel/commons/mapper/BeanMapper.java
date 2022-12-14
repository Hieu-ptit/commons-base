package com.viettel.commons.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface BeanMapper<T, R> {
    R map(T source);

    void mapTo(T source, @MappingTarget R target);
}
