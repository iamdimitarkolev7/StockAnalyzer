package com.kolev.stock.app.myapp.models;

import com.kolev.stock.app.myapp.enums.TransactionType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "transactions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId;

    private TransactionType transactionType;
    private Long value;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
