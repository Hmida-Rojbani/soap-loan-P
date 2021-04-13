//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.04.13 à 09:44:37 PM WAT 
//


package de.tekup.loan.soap.ws.loaneligebilty;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yearlyIncome" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cibilScore" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="employmentMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerName",
    "age",
    "yearlyIncome",
    "cibilScore",
    "employmentMode"
})
@XmlRootElement(name = "CustomerRequest")
public class CustomerRequest {

    @XmlElement(required = true)
    protected String customerName;
    protected int age;
    protected long yearlyIncome;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cibilScore;
    @XmlElement(required = true)
    protected String employmentMode;

    /**
     * Obtient la valeur de la propriété customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Définit la valeur de la propriété customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtient la valeur de la propriété age.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Définit la valeur de la propriété age.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Obtient la valeur de la propriété yearlyIncome.
     * 
     */
    public long getYearlyIncome() {
        return yearlyIncome;
    }

    /**
     * Définit la valeur de la propriété yearlyIncome.
     * 
     */
    public void setYearlyIncome(long value) {
        this.yearlyIncome = value;
    }

    /**
     * Obtient la valeur de la propriété cibilScore.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCibilScore() {
        return cibilScore;
    }

    /**
     * Définit la valeur de la propriété cibilScore.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCibilScore(BigInteger value) {
        this.cibilScore = value;
    }

    /**
     * Obtient la valeur de la propriété employmentMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentMode() {
        return employmentMode;
    }

    /**
     * Définit la valeur de la propriété employmentMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentMode(String value) {
        this.employmentMode = value;
    }

}
