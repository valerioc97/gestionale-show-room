package org.valrio.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
@JsonIgnoreProperties(ignoreUnknown = true)
@MappedSuperclass
public class Residenza extends Fiscale {
    private String indirizzoResidenza;
    private String capResidenza;
    private String nazionalita;
    private String citta;
    private String provincia;
}
