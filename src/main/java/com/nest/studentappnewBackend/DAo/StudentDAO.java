package com.nest.studentappnewBackend.DAo;

import com.nest.studentappnewBackend.Model.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository <Students, Integer> {
}
