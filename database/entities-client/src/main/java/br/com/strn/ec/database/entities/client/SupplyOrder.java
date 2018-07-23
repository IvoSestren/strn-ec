package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "supplyorder")
public class SupplyOrder implements Serializable {

    private String id;
    private Supplier supplier;
    private String supplierName;
    private Lang lang;
    private Warehouse warehouse;
    private SupplyOrderState supplyOrderState;
    private Currencies currency;
    private Currencies refCurrency;
    private String reference;
    private LocalDateTime dateAdd;
    private LocalDateTime dateUpd;
    private LocalDateTime dateDeliveryExpected;
    private BigDecimal totalTe;
    private BigDecimal totalWithDiscoountTe;
    private BigDecimal totalTax;
    private BigDecimal totalTi;
    private BigDecimal discountRate;
    private BigDecimal discountValueTe;
    private Boolean isTemplate;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_supplier")
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lang")
    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_warehouse")
    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_supply_order_state")
    public SupplyOrderState getSupplyOrderState() {
        return supplyOrderState;
    }

    public void setSupplyOrderState(SupplyOrderState supplyOrderState) {
        this.supplyOrderState = supplyOrderState;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_currency")
    public Currencies getCurrency() {
        return currency;
    }

    public void setCurrency(Currencies currency) {
        this.currency = currency;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ref_currency")
    public Currencies getRefCurrency() {
        return refCurrency;
    }

    public void setRefCurrency(Currencies refCurrency) {
        this.refCurrency = refCurrency;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

    public LocalDateTime getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(LocalDateTime dateUpd) {
        this.dateUpd = dateUpd;
    }

    public LocalDateTime getDateDeliveryExpected() {
        return dateDeliveryExpected;
    }

    public void setDateDeliveryExpected(LocalDateTime dateDeliveryExpected) {
        this.dateDeliveryExpected = dateDeliveryExpected;
    }

    public BigDecimal getTotalTe() {
        return totalTe;
    }

    public void setTotalTe(BigDecimal totalTe) {
        this.totalTe = totalTe;
    }

    public BigDecimal getTotalWithDiscoountTe() {
        return totalWithDiscoountTe;
    }

    public void setTotalWithDiscoountTe(BigDecimal totalWithDiscoountTe) {
        this.totalWithDiscoountTe = totalWithDiscoountTe;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public BigDecimal getTotalTi() {
        return totalTi;
    }

    public void setTotalTi(BigDecimal totalTi) {
        this.totalTi = totalTi;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public BigDecimal getDiscountValueTe() {
        return discountValueTe;
    }

    public void setDiscountValueTe(BigDecimal discountValueTe) {
        this.discountValueTe = discountValueTe;
    }

    public Boolean getTemplate() {
        return isTemplate;
    }

    public void setTemplate(Boolean template) {
        isTemplate = template;
    }
}