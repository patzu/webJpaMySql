package com.wikichera.webJpaMysql.service.bank;

import com.wikichera.webJpaMysql.entity.Address;
import com.wikichera.webJpaMysql.entity.BankEnt;
import com.wikichera.webJpaMysql.repositories.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankService {
    @Autowired
    BankRepository bankRepository;
    @Autowired
    BankDtoToEntConverter bankDtoToEntConverter;
    @Autowired
    BankEntToDtoConverter bankEntToDtoConverter;

    public void save(BankDto bankDto) {
        BankEnt bankEnt = bankDtoToEntConverter.convertDtoToEnt(bankDto);
        bankRepository.save(bankEnt);
    }

    public List<BankDto> getBankList() {
        List<BankEnt> bankEntList = bankRepository.findAll();
        return bankEntToDtoConverter.convertAllEntToDto(bankEntList);
    }

    public void deleteBank(Long id) {
        BankEnt bankEnt = BankEnt.builder().bankId(id).build();
        bankRepository.delete(bankEnt);
    }

    public void update(BankDto bankDto) {
        BankEnt bankEnt = bankDtoToEntConverter.convertDtoToEnt(bankDto);
        bankRepository.save(bankEnt);
    }

    public BankDto getBank(Long id) throws Exception {
        Optional<BankEnt> optionalBankEnt = bankRepository.findById(id);
        if (optionalBankEnt.isPresent()) {
            BankEnt bankEnt = optionalBankEnt.get();
            return bankEntToDtoConverter.convertEntToDto(bankEnt);
        } else {
            throw new Exception("Couldn't find bank with specified ID!");
        }
    }

    public List<BankEnt> customQuery() {
        return bankRepository.customQuery();
    }

    public List<BankEnt> sortedBankList() {
        return bankRepository.findAll(Sort.by(Sort.Direction.DESC, "bankId"));
    }

    public Page<BankEnt> bankListSortedWithPagination() {
        return bankRepository.findAll(PageRequest.of(0, 1, Sort.by(Sort.Direction.DESC, "bankId")));
    }

    public BankEnt getAddressAsEntityById(Long id) {
        return bankRepository.getAddressAsEntityById(id);
    }

    public List<BankEnt> getAddressAsListById(Long id) {
        return bankRepository.getAddressAsListById(id);
    }

    public Optional<BankEnt> getAddressAsOptionalById(Long id) {
        return bankRepository.getAddressAsOptionalById(id);
    }

    public String getAddressAsStringById(Long id) {
        return bankRepository.getAddressAsStringById(id);
    }

    public Address getAddressAsAddressById(Long id) {
        return bankRepository.getAddressAsAddressById(id);
    }

/**
 * Creating query with method name
 * find…By, read…By, query…By, count…By, and get…By.
 * findTopBy = findTop1By = findFirstBy = findFirst1By
 *  add the Distinct keyword before the first By word
 *  findTitleDistinctBy or findDistinctTitleBy
 */
}
