package com.musala.drone.model;

import com.musala.drone.base.model.BaseEntity;
import com.musala.drone.enums.DroneModel;
import com.musala.drone.enums.DroneState;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "drone")
public class Drone extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "drone_id_sequence")
    @SequenceGenerator(name = "drone_id_sequence", sequenceName = "drone_id_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "model")
    @Enumerated(EnumType.STRING)
    private DroneModel model;

    @Column(name = "drone_state")
    @Enumerated(EnumType.STRING)
    private DroneState state;

    @Column(name = "weight_limit")
    private Integer weightLimit;

    @Column(name = "battery_capacity")
    private Integer batteryCapacity;

//    @OneToMany(mappedBy = "drone",
//            fetch = FetchType.LAZY)
//    List<Medication> medicationList;
//
//    public void setDroneToMedication() {
//        if (this.getMedicationList() != null)
//            this.getMedicationList().forEach(medication -> medication.setDrone(this));
//    }


}
