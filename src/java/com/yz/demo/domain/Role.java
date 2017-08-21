package com.yz.demo.domain;

import java.io.Serializable;

public class Role implements Serializable{

    private Long id;
    private String role_name;
    private String description;
    private Boolean available=Boolean.FALSE;

    public Role() {
    }

    public Role(String role_name, String description, Boolean available) {
        this.role_name = role_name;
        this.description = description;
        this.available = available;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        return id != null ? id.equals(role.id) : role.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role_name='" + role_name + '\'' +
                ", description='" + description + '\'' +
                ", available=" + available +
                '}';
    }
}
