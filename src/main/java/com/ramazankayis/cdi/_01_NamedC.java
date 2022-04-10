package com.ramazankayis.cdi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;

//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Named(value = "named_cdi")
@ApplicationScoped
public class _01_NamedC implements Serializable {
    public static final long serialVersionUID =1L;

    private String adi="@Named Merhabalar";

}