package com.example.study.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

    @NotNull
    @Size(min = 3,max = 50)
    private String name;

    @NotNull
    @Size(min = 3,max = 100)
    private String password;
}
