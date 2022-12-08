package com.nest.studentappnewBackend.DAo;

import com.nest.studentappnewBackend.Model.Students;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentDAO extends CrudRepository <Students, Integer> {

    @Query(value = "SELECT `id`, `admission_no`, `college`, `rollno`, `name` FROM `students` WHERE `rollno`=:rollNO",nativeQuery = true)
    List<Students> Search(@Param("rollNO") Integer rollNO);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM `students` WHERE `rollno`=:rollNO",nativeQuery = true)
    void Delete(@Param("rollNO")Integer rollNO);
}
