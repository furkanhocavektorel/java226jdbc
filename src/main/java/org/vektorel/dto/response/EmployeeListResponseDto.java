package org.vektorel.dto.response;

import java.util.Date;

public class EmployeeListResponseDto {
    private String name;
    private String title;
    private Date birth_date;


    @Override
    public String toString() {
        return "EmployeeListResponseDto{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", birth_date=" + birth_date +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }
}
