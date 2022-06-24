package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="Table_QRCode")
@NoArgsConstructor
@AllArgsConstructor
public class Table_QRCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tableId", nullable = true)
    private Tables tables;

    @ManyToOne
    @JoinColumn(name = "QRCodeId", nullable = true)
    private QRCode qrCode;
}
