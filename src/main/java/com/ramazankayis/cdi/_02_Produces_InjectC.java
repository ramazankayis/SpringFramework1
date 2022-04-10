package com.ramazankayis.cdi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Named(value = "produces_inject_cdi")
@ApplicationScoped
public class _02_Produces_InjectC {

    //üreten
    @Produces
    public List<String> getUreten() {
        List<String> listem = new ArrayList<>();
        listem.add("Html5");
        listem.add("css3");
        listem.add("js");
        listem.add("java");
        listem.add("Hibernate");
        return listem;
    }


    //tüketim
    @Inject
    List<String> getTuketen;

    public List<String> getGetTuketen() {
        return getTuketen;
    }
}
