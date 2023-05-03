package com.cbs.user.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {
    private String line1;
    private String line2;
    private String town;
    private String county;
    private String postcode;

    public String getFormattedAddress() {
        return line1 + ", " + line2 + ", " + town + ", " + county + ", " + postcode;
    }
}
