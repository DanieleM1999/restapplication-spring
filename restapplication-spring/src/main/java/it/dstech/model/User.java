package it.dstech.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "USERS")
public class User {


    @Id
    @Column(name = "USERNAME", length = 50, unique = true)
    @NotNull
    private String username;

    @Column(name = "PASSWORD", length = 100)
    @NotNull
    private String password;

    @Column(name = "ENABLED")
    @NotNull
    private Boolean enabled;

    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "USERS_AUTHORITIES",
//            joinColumns = {@JoinColumn(name = "USER_USERNAME", referencedColumnName = "USERNAME")},
//            inverseJoinColumns = {@JoinColumn(name = "AUTHORITY_ID", referencedColumnName = "ID")})
    private List<Authority> authorities;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }


}
