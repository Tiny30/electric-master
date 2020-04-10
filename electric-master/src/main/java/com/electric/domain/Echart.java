package com.electric.domain;

public class Echart {
    private Integer power_consumption;
    private Integer people_number;
    private Integer arrears_people;

    @Override
    public String toString() {
        return "Echart{" +
                "power_consumption=" + power_consumption +
                ", people_number=" + people_number +
                ", arrears_people=" + arrears_people +
                '}';
    }

    public Integer getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(Integer power_consumption) {
        this.power_consumption = power_consumption;
    }

    public Integer getPeople_number() {
        return people_number;
    }

    public void setPeople_number(Integer people_number) {
        this.people_number = people_number;
    }

    public Integer getArrears_people() {
        return arrears_people;
    }

    public void setArrears_people(Integer arrears_people) {
        this.arrears_people = arrears_people;
    }
}
