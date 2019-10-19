package com.wikichera.webJpaMysql.repositories;

import com.wikichera.webJpaMysql.entity.Address;
import com.wikichera.webJpaMysql.entity.BankEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BankRepository extends JpaRepository<BankEnt, Long> {
    /**
     * Native Query
     */
    //    @Query(value = "select * from bank where state='Arizona'", nativeQuery = true)
//    List<BankEnt> customQuery();

    /**
     * JPQL Query
     * 'be' is called identification variable
     *
     * @return
     */
    @Query("select be from BankEnt be where state='Arizona'")
    List<BankEnt> customQuery();

    //Cannot be cast to List<BankEnt>
    @Query("select be.address from BankEnt be where id=?1")
    List<BankEnt> getAddressAsListById(Long id);

    //Cannot be cast to List<BankEnt>
    @Query("select be.address from BankEnt be where id=?1")
    BankEnt getAddressAsEntityById(Long id);

    @Query("select be.address from BankEnt be where id=?1")
    Optional<BankEnt> getAddressAsOptionalById(Long id);

    //Cannot be cast to List<BankEnt>
    @Query("select be.address from BankEnt be where id=?1")
    String getAddressAsStringById(Long id);

    @Query("select be.address from BankEnt be where id=?1")
    Address getAddressAsAddressById(Long id);

    /**
     * use named parameters by replacing the numeric placeholders
     *
     * @param state
     * @return
     */
    @Query("select be from BankEnt be where state=:stateParam")
    List<BankEnt> getBankEntByState(@Param("state") String state);

    List<BankEnt> findAll();

}
