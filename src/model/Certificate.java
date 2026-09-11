package model;

import java.io.Serializable;

public class Certificate implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String issuer;
    private String date;

    public Certificate(
            String name,
            String issuer,
            String date
    ) {
        this.name = name;
        this.issuer = issuer;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return name
                + " | Issuer: "
                + issuer
                + " | Date: "
                + date;
    }
}