package com.samsung.tddspringboot.repository.models;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Customer {
    private String name;
    private String number;
    private String email;
    private LocalDateTime createdAt;
}
