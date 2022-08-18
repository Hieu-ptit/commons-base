package com.viettel.api.mapper;

import com.viettel.api.model.entity.Account;
import com.viettel.api.model.response.AccountResponse;
import com.viettel.commons.mapper.BeanMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface Entity2AccountResponseMapper extends BeanMapper<Account, AccountResponse> {
    Entity2AccountResponseMapper INSTANCE = Mappers.getMapper(Entity2AccountResponseMapper.class);
}
