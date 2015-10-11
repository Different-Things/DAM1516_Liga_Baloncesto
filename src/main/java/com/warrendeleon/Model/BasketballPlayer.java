package com.warrendeleon.Model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * Created by warrendeleonofalla on 11/10/15.
 */

@Entity
@Table(name="developers")
@PrimaryKeyJoinColumn(name="developer_id")
public class BasketballPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="employee_id")
    private Long id;

    @Column
    @NotNull
    @Size(min=5, max=50)
    private String name;

    @Column
    @NotNull
    @Size(min=5, max=50)
    private String lastname;

    @Column(name="birth_date")
    private LocalDate birthDate;

    @Column
    private int assists;

    @Column
    private int baskets;

    @Column
    @NotNull
    private Position position;

    @Column
    @NotNull
    private int number;

    public BasketballPlayer(String name, String lastname, LocalDate birthDate, Position position) {
        this.name = name;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getBaskets() {
        return baskets;
    }

    public void setBaskets(int baskets) {
        this.baskets = baskets;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasketballPlayer that = (BasketballPlayer) o;

        if (getAssists() != that.getAssists()) return false;
        if (getBaskets() != that.getBaskets()) return false;
        if (getNumber() != that.getNumber()) return false;
        if (!getId().equals(that.getId())) return false;
        if (!getName().equals(that.getName())) return false;
        if (!getLastname().equals(that.getLastname())) return false;
        if (getBirthDate() != null ? !getBirthDate().equals(that.getBirthDate()) : that.getBirthDate() != null)
            return false;
        return getPosition() == that.getPosition();

    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getLastname().hashCode();
        result = 31 * result + (getBirthDate() != null ? getBirthDate().hashCode() : 0);
        result = 31 * result + getAssists();
        result = 31 * result + getBaskets();
        result = 31 * result + getPosition().hashCode();
        result = 31 * result + getNumber();
        return result;
    }

    @Override
    public String toString() {
        return "BasketballPlayer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthDate=" + birthDate +
                ", assists=" + assists +
                ", baskets=" + baskets +
                ", position=" + position +
                ", number=" + number +
                '}';
    }
}
