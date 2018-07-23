package br.com.strn.ec.util.token;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.HashMap;
import java.util.Map;

public class TokenUtil {

    private static final Algorithm ALGORITHM = Algorithm.HMAC512("secret");

    public static String toString(Token token) {

        JWTCreator.Builder builder = JWT.create();
        builder.withIssuer("STRN-EC");

        //LocalDateTime expires = LocalDateTime.now().plusMinutes(30);
        //builder.withExpiresAt(Date.from(expires.atZone(ZoneId.systemDefault()).toInstant()));

        for (String key : token.toClaims().keySet()) {
            String value = token.toClaims().get(key);
            if (value != null) {
                builder.withClaim(key, value);
            }
        }

        return builder.sign(ALGORITHM);
    }

    public static Token fromString(String str) {
        Token token = new Token();

        try {
            JWT.require(ALGORITHM).withIssuer("STRN-EC").build().verify(str);
            DecodedJWT jwt = JWT.decode(str);

            Map<String, String> claims = new HashMap<>();
            for (String key : jwt.getClaims().keySet()) {
                claims.put(key, jwt.getClaim(key).asString());
            }

            token.fromClaims(claims);
        } catch (Exception ignored) {
        }

        return token;
    }
}
