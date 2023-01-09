package com.emmanuelamet.springdatajpa.repository;

import com.emmanuelamet.springdatajpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmpId(Long id);

    Employee deleteByEmpId(Long id);

    Employee findTopByNameOrderBySalaryDesc(String name);

    @Query("select e from Employee e")
    List<Employee> findAllEmployeeQuery();

    @Query("select e from Employee e where e.age=:activeState and e.designation in :designationList")
    List<Employee> findEmployeeByDesignationQuery(@Param("activeState") Boolean activeState, @Param("designationList") List<String> designationList);

    @Modifying
    @Query("update Employee e set e.name= ?1 where e.empId in ?2")
    int updateEmployeeNameByEmpId(String name, List<Long> empIdList);
}
