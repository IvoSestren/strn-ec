package br.com.strn.ec.util.token;

import com.auth0.jwt.interfaces.Claim;

import javax.enterprise.inject.Vetoed;
import java.util.HashMap;
import java.util.Map;

@Vetoed
public class Token {

    private String idEmployee;
    private String idCustomer;
    private String idTheme;
    private String idStore;

    public Map<String, String> toClaims() {
        Map<String, String> claims = new HashMap<>();

        claims.put("idEmployee", idEmployee);
        claims.put("idCustomer", idCustomer);
        claims.put("idTheme", idTheme);
        claims.put("idStore", idStore);

        return claims;
    }

    public void fromClaims(Map<String, String> claims) {
        this.idEmployee = readClaim(claims, "idEmployee");
        this.idCustomer = readClaim(claims, "idCustomer");
        this.idTheme = readClaim(claims, "idTheme");
        this.idStore = readClaim(claims, "idStore");
    }

    private String readClaim(Map<String, String> claims, String key) {
        if (claims.containsKey(key)) {
            return claims.get(key);
        }

        return null;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdTheme() {
        return idTheme;
    }

    public void setIdTheme(String idTheme) {
        this.idTheme = idTheme;
    }

    public String getIdStore() {
        return idStore;
    }

    public void setIdStore(String idStore) {
        this.idStore = idStore;
    }
}
