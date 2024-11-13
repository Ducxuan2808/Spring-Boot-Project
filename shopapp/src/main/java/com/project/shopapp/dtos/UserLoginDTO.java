package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginDTO {
    @JsonProperty("phone_number")
    @NotBlank(message = "Phone number  is required")
    private String phoneNumber;

    @NotBlank(message = "Password is not blank")
    private String password;

    @Min(value = 0, message = "You must enter role's Id")
    @JsonProperty("role_id")
    private Long roleId;
}
