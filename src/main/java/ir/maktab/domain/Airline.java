package ir.maktab.domain;

import ir.maktab.base.domain.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = Airline.TABLE_NAME)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Airline extends BaseEntity<Long> {

    public static final String TABLE_NAME = "airline_list";
    public static final String AIRLINE_NAME = "airline_name";
    public static final String BALANCE = "balance";

    @Column(name = AIRLINE_NAME)
    private String airlineName;

    @Column(name = BALANCE)
    private Integer balance;

}