package com.musala.drone.model;

import com.musala.drone.base.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Alber Rashad
 * @created 04/11/2022
 * @description
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "drone_medication")
public class DroneMedication extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "drone_medication_id_sequence")
    @SequenceGenerator(name = "drone_medication_id_sequence", sequenceName = "drone_medication_id_sequence", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "drone_id", referencedColumnName = "id", nullable = false)
    private Drone drone;

    @ManyToOne
    @JoinColumn(name = "medication_id", referencedColumnName = "id", nullable = false)
    private Medication medication;

    @Column(name = "items_count")
    private int itemsCount;

}
