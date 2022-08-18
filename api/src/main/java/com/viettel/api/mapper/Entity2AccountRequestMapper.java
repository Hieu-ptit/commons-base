package com.viettel.api.mapper;

import com.viettel.api.model.entity.Account;
import com.viettel.api.model.request.AccountRequest;
import com.viettel.api.model.response.AccountResponse;
import com.viettel.commons.mapper.BeanMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface Entity2AccountRequestMapper extends BeanMapper<AccountRequest, Account> {
    Entity2AccountRequestMapper INSTANCE = Mappers.getMapper(Entity2AccountRequestMapper.class);
}
