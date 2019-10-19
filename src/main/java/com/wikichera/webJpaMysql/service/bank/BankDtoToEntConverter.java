package com.wikichera.webJpaMysql.service.bank;

import com.wikichera.webJpaMysql.common.DtoToEntConverter;
import com.wikichera.webJpaMysql.entity.BankEnt;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankDtoToEntConverter extends DtoToEntConverter<BankDto, BankEnt> {

    @Override
    public BankEnt convertDtoToEnt(BankDto dto) {
        return BankEnt.builder()
                .bankId(dto.getBankId())
                .createdBy(dto.getCreatedBy())
                .createdDate(dto.getCreatedDate())
                .international(dto.isInternational())
                .lastUpdatedBy(dto.getLastUpdatedBy())
                .lastUpdatedDate(dto.getLastUpdatedDate())
                .name(dto.getName())
                .address(dto.getAddress())
                .contacts(dto.getContacts())
                .build();
    }

    @Override
    public List<BankEnt> convertAllDtoToEnt(List<BankDto> bankDtos) {

        return null;
    }
}
