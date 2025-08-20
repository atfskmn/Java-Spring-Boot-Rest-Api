package com.bayram.dto;

import java.util.Date;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentIU {
    
    @Size(min = 3, max = 30, message = "İsim 3 ile 30 karakter arasında olmalıdır.")
    @NotEmpty(message = "İsim kısmı boş bırakılamaz.")
    private String firstName;
    
    @Size(min = 3, max = 30, message = "Soyisim 3 ile 30 karakter arasında olmalıdır.")
    @NotEmpty(message = "Soy isim boş bırakılamaz.")
    private String lastName;
    
    private Date birthOfDate;
}

