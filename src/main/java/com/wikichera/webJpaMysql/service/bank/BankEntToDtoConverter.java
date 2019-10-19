package com.wikichera.webJpaMysql.service.bank;

import com.wikichera.webJpaMysql.common.EntToDtoConverter;
import com.wikichera.webJpaMysql.entity.BankEnt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BankEntToDtoConverter extends EntToDtoConverter<BankEnt, BankDto> {

    @Override
    public BankDto convertEntToDto(BankEnt bankEnt) {
        return BankDto.builder()
                .address(bankEnt.getAddress())
                .bankId(bankEnt.getBankId())
                .contacts(bankEnt.getContacts())
                .createdBy(bankEnt.getCreatedBy())
                .createdDate(bankEnt.getCreatedDate())
                .international(bankEnt.isInternational())
                .lastUpdatedBy(bankEnt.getLastUpdatedBy())
                .lastUpdatedDate(bankEnt.getLastUpdatedDate())
                .name(bankEnt.getName())
                .build();
    }

    @Override
    public List<BankDto> convertAllEntToDto(List<BankEnt> bankEntList) {
        List<BankDto> bankDtoList = new ArrayList<>();
        for (BankEnt bankEnt : bankEntList) {
            bankDtoList.add(convertEntToDto(bankEnt));
        }
        return bankDtoList;
    }
}
