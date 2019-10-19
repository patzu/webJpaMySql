package com.wikichera.webJpaMysql.controler;

import com.wikichera.webJpaMysql.entity.Address;
import com.wikichera.webJpaMysql.entity.BankEnt;
import com.wikichera.webJpaMysql.service.bank.BankDto;
import com.wikichera.webJpaMysql.service.bank.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/rest/bank")
public class BankController {
    @Autowired
    BankService bankService;

    @PostMapping(value = "/insertNewBank",
            produces = "application/json;charset=UTF-8",
            consumes = "application/json;charset=UTF-8")
    public void saveBank(@RequestBody BankDto bankDto) {
        bankService.save(bankDto);
    }

    @GetMapping(value = "/bankList")
    public List<BankDto> getBankList() {
        return bankService.getBankList();
    }

    @DeleteMapping(value = "/deleteBank/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteBank(@PathVariable Long id) {
        bankService.deleteBank(id);
    }

    @PutMapping(value = "/updateBank", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody BankDto bankDto) {
        bankService.update(bankDto);
    }

    @GetMapping(value = "/getBank/{id}")
    public BankDto getBank(@PathVariable Long id) throws Exception {
        return bankService.getBank(id);
    }

    @GetMapping(value = "/customQuery")
    public List<BankEnt> customQuery(){
        return bankService.customQuery();
    }

    @GetMapping(value = "/sortedBanks")
    public List<BankEnt> getSortedBanks(){
        return bankService.sortedBankList();
    }

    @GetMapping(value = "/getAddressAsListById/{id}")
    public List<BankEnt> getAddressAsListById(@PathVariable Long id){
        return bankService.getAddressAsListById(id);
    }
    @GetMapping(value = "/getAddressAsEntityById/{id}")
    public BankEnt getAddressAsEntityById(@PathVariable Long id){
        return bankService.getAddressAsEntityById(id);
    }

    @GetMapping(value = "/getAddressAsOptionalById/{id}")
    public Optional<BankEnt> getAddressAsOptionalById(@PathVariable Long id){
        return bankService.getAddressAsOptionalById(id);
    }

    @GetMapping(value = "/getAddressAsStringById/{id}")
    public String getAddressAsStringById(@PathVariable Long id){
        return bankService.getAddressAsStringById(id);
    }

    @GetMapping(value = "/getAddressAsAddressById/{id}")
    public Address getAddressAsAddressById(@PathVariable Long id){
        return bankService.getAddressAsAddressById(id);
    }
}