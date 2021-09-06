package com.example.springdbstudy.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class SalaryModel {
    private int id;
    @NonNull @Builder.Default private String name = "NULL Name"; // null 값을 허용하지 않는다.
    private String email;
}
