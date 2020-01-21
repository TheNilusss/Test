package com.Studium.CutomerService.entity;

import java.util.List;

public class Customer {

    private String m_firstName;
    private String m_lastName;

    public Customer(String m_firstName, String m_lastName) {
        this.m_firstName = m_firstName;
        this.m_lastName = m_lastName;
    }

    public Customer() {
    }

    public String getM_firstName() {
        return m_firstName;
    }

    public void setM_firstName(String m_firstName) {
        this.m_firstName = m_firstName;
    }

    public String getM_lastName() {
        return m_lastName;
    }

    public void setM_lastName(String m_lastName) {
        this.m_lastName = m_lastName;
    }
}
