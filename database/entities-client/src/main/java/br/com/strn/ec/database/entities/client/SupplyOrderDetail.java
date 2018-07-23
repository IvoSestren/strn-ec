package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "supplyorderdetail")
public class SupplyOrderDetail implements Serializable {

    private String id;
    private SupplyOrder supplyOrder;
    private Currencies currency;
    private Product product;
    private ProductAttribute productAttribute;
    private String reference;
    private String supplierReference;
    private String name;
    private String ean13;
    private String isbn;
    private String upc;
    private BigDecimal exchangeRate;
    private BigDecimal unitPriceTe;
    private Integer quantityExpected;
    private Integer quantityReceived;
    private BigDecimal priceTe;
    private BigDecimal discountRate;
    private BigDecimal discountValueTe;
    private BigDecimal priceWithDiscountTe;
    private BigDecimal taxRate;
    private BigDecimal taxValue;
    private BigDecimal priceTi;
    private BigDecimal taxValueWithOrderDiscount;
    private BigDecimal priceWithOrderDiscountTe;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_supply_order")
    public SupplyOrder getSupplyOrder() {
        return supplyOrder;
    }

    public void setSupplyOrder(SupplyOrder supplyOrder) {
        this.supplyOrder = supplyOrder;
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
    @JoinColumn(name = "id_product")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product_attribute")
    public ProductAttribute getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(ProductAttribute productAttribute) {
        this.productAttribute = productAttribute;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getSupplierReference() {
        return supplierReference;
    }

    public void setSupplierReference(String supplierReference) {
        this.supplierReference = supplierReference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public BigDecimal getUnitPriceTe() {
        return unitPriceTe;
    }

    public void setUnitPriceTe(BigDecimal unitPriceTe) {
        this.unitPriceTe = unitPriceTe;
    }

    public Integer getQuantityExpected() {
        return quantityExpected;
    }

    public void setQuantityExpected(Integer quantityExpected) {
        this.quantityExpected = quantityExpected;
    }

    public Integer getQuantityReceived() {
        return quantityReceived;
    }

    public void setQuantityReceived(Integer quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    public BigDecimal getPriceTe() {
        return priceTe;
    }

    public void setPriceTe(BigDecimal priceTe) {
        this.priceTe = priceTe;
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

    public BigDecimal getPriceWithDiscountTe() {
        return priceWithDiscountTe;
    }

    public void setPriceWithDiscountTe(BigDecimal priceWithDiscountTe) {
        this.priceWithDiscountTe = priceWithDiscountTe;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(BigDecimal taxValue) {
        this.taxValue = taxValue;
    }

    public BigDecimal getPriceTi() {
        return priceTi;
    }

    public void setPriceTi(BigDecimal priceTi) {
        this.priceTi = priceTi;
    }

    public BigDecimal getTaxValueWithOrderDiscount() {
        return taxValueWithOrderDiscount;
    }

    public void setTaxValueWithOrderDiscount(BigDecimal taxValueWithOrderDiscount) {
        this.taxValueWithOrderDiscount = taxValueWithOrderDiscount;
    }

    public BigDecimal getPriceWithOrderDiscountTe() {
        return priceWithOrderDiscountTe;
    }

    public void setPriceWithOrderDiscountTe(BigDecimal priceWithOrderDiscountTe) {
        this.priceWithOrderDiscountTe = priceWithOrderDiscountTe;
    }
}