package org.valrio.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import org.valrio.enums.TipoPersonaEnum;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
@JsonIgnoreProperties(ignoreUnknown = true)
@MappedSuperclass
public class Fiscale {

    private String partitaIva;
    private String tipoPersona;
    private String ragioneSociale;
    private String iban;
    private String pec;
    private String sdi;
    private boolean isCliente;
    private boolean isFornitore;
}
