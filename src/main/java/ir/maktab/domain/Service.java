package ir.maktab.domain;

import ir.maktab.base.domain.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = Service.TABLE_NAME)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Service extends BaseEntity<Long> {

    public static final String TABLE_NAME = "services";
    public static final String FLIGHT_NUMBER = "flight_number";
    public static final String INITIAL_POINT = "initial_point";
    public static final String DESTINATION = "destination";
    public static final String DEPARTURE_TIME = "departure_time";
    public static final String ARRIVAL_TIME = "arrival_time";
    public static final String PRICE = "price";
    public static final String AIRCRAFT_MODEL = "aircraft_model";
    public static final String AIRPLANE_NUMBER = "airplane_number";
    public static final String NUMBER_OF_SEATS = "number_of_seats";

    @Column(name = FLIGHT_NUMBER)
    private String flightNumber;

    @Column(name = INITIAL_POINT)
    private String initialPoint;

    @Column(name = DESTINATION)
    private String destination;

    @Column(name = DEPARTURE_TIME)
    private LocalDateTime departureTime;

    @Column(name = ARRIVAL_TIME)
    private LocalDateTime arrivalTime;

    @Column(name = PRICE)
    private Integer price;

    @Column(name = AIRCRAFT_MODEL)
    private String aircraftModel;

    @Column(name = AIRPLANE_NUMBER)
    private String airplaneNumber;

    @OneToMany
    @JoinColumn(name = "service_id")
    private List<Seat> seats = new ArrayList<>();

}