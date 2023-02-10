package com.ykm.server.model;

import com.ykm.server.enumeration.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.AUTO;

/**
 * @author yankunM
 * @version 1.0
 * @since 1/29/2023
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id // indicates a primary key
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(unique = true) // create a constraint on 'ipAddress' so that it is UNIQUE
    @NotEmpty(message = "IP Address cannot be empty or null") // they must send in an ipAddress
    private String ipAddress;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status; // server up / down enum
}
