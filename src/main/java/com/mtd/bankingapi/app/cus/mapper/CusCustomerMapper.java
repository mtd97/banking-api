package com.mtd.bankingapi.app.cus.mapper;


import com.mtd.bankingapi.app.cus.dto.CusCustomerDto;
import com.mtd.bankingapi.app.cus.dto.CusCustomerSaveDto;
import com.mtd.bankingapi.app.cus.dto.CusCustomerUpdateDto;
import com.mtd.bankingapi.app.cus.entity.CusCustomer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CusCustomerMapper {

    CusCustomerMapper INSTANCE = Mappers.getMapper(CusCustomerMapper.class);

    List<CusCustomerDto> convertToCusCustomerDtoList(List<CusCustomer> cusCustomerList);

    CusCustomerDto convertToCusCustomerDto(CusCustomer cusCustomer);

    CusCustomer convertToCusCustomer(CusCustomerSaveDto cusCustomerSaveDto);

    CusCustomer convertToCusCustomer(CusCustomerUpdateDto cusCustomerUpdateDto);
}
