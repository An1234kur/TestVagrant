package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author : Kamal
 * @project : TestVagrant
 * @created : 22/08/2022 - 11:57 AM
 */

public class Player {
    private String name;
    private String country;
    private String role;
    @JsonProperty("price-in-crores")
    private String priceInCrores;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPriceInCrores() {
        return priceInCrores;
    }

    public void setPriceInCrores(String priceInCrores) {
        this.priceInCrores = priceInCrores;
    }
}
