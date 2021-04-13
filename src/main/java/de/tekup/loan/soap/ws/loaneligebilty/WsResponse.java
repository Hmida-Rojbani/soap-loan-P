//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.04.13 à 11:04:22 PM WAT 
//


package de.tekup.loan.soap.ws.loaneligebilty;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="isEligeble" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="approvedAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="criteriaMismatch" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "isEligeble",
    "approvedAmount",
    "criteriaMismatch"
})
@XmlRootElement(name = "WsResponse")
public class WsResponse {

    protected boolean isEligeble;
    protected long approvedAmount;
    @XmlElement(required = true)
    protected List<String> criteriaMismatch;

    /**
     * Obtient la valeur de la propriété isEligeble.
     * 
     */
    public boolean isIsEligeble() {
        return isEligeble;
    }

    /**
     * Définit la valeur de la propriété isEligeble.
     * 
     */
    public void setIsEligeble(boolean value) {
        this.isEligeble = value;
    }

    /**
     * Obtient la valeur de la propriété approvedAmount.
     * 
     */
    public long getApprovedAmount() {
        return approvedAmount;
    }

    /**
     * Définit la valeur de la propriété approvedAmount.
     * 
     */
    public void setApprovedAmount(long value) {
        this.approvedAmount = value;
    }

    /**
     * Gets the value of the criteriaMismatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaMismatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaMismatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCriteriaMismatch() {
        if (criteriaMismatch == null) {
            criteriaMismatch = new ArrayList<String>();
        }
        return this.criteriaMismatch;
    }

}
