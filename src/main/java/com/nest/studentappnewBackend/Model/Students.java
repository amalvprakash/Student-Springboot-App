package com.nest.studentappnewBackend.Model;

import com.nest.studentappnewBackend.DAo.StudentDAO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "students")
public class Students {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int RollNO;
    private String AdmissionNo;
    private String College;

    public Students() {
    }

    public Students(int id, String name, int rollNO, String admissionNo, String college) {
        this.id = id;
        this.name = name;
        this.RollNO = rollNO;
        this.AdmissionNo = admissionNo;
        this.College = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNO() {
        return RollNO;
    }

    public void setRollNO(int rollNO) {
        RollNO = rollNO;
    }

    public String getAdmissionNo() {
        return AdmissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        AdmissionNo = admissionNo;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }
}