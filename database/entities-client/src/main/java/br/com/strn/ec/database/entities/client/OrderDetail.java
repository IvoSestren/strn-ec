package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orderdetail")
public class OrderDetail implements Serializable {

	private String id;
    private Orders order;
    private OrderInvoice orderInvoice;
    private Warehouse warehouse;
    private Shop shop;
    private Product product;
    private ProductAttribute productAttribute;
    private Customization customization;
    private String productName;
    private Integer productQuantity;
    private Integer productQuantityInStock;
    private Integer productQuantityRefunded;
    private Integer productQuantityReturn;
    private Integer productQuantityReinjected;
    private BigDecimal productPrice;
    private BigDecimal reductionPercent;
    private BigDecimal reductionAmount;
    private BigDecimal reductionAmountTaxIncl;
    private BigDecimal reductionAmountTaxExcl;
    private BigDecimal groupReduction;
    private BigDecimal productQuantityDiscount;
    private String productEan13;
    private String productIsbn;
    private String productUpc;
    private String productReference;
    private String productSupplierReference;
    private BigDecimal productWeight;
    private TaxRulesGroup taxRulesGroup;
    private Boolean taxComputationMethod;
    private String taxName;
    private BigDecimal taxRate;
    private BigDecimal ecotax;
    private BigDecimal ecotaxTarRate;
    private Boolean discountQuantityApplied;
    private String downloadHash;
    private Integer downloadNb;
    private LocalDateTime downloadDeadline;
    private BigDecimal totalPriceTaxIncl;
    private BigDecimal totalPriceTaxExcl;
    private BigDecimal unitPriceTaxIncl;
    private BigDecimal unitPriceTaxExcl;
    private BigDecimal totalShippingPriceTaxIncl;
    private BigDecimal totalShippingPriceTaxExcl;
    private BigDecimal purchaseSupplierPrice;
    private BigDecimal originalProductPrice;
    private BigDecimal originalWholesalePrice;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order")
    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order_invoice")
    public OrderInvoice getOrderInvoice() {
        return orderInvoice;
    }

    public void setOrderInvoice(OrderInvoice orderInvoice) {
        this.orderInvoice = orderInvoice;
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
    @JoinColumn(name = "id_shop")
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_customization")
    public Customization getCustomization() {
        return customization;
    }

    public void setCustomization(Customization customization) {
        this.customization = customization;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Integer getProductQuantityInStock() {
        return productQuantityInStock;
    }

    public void setProductQuantityInStock(Integer productQuantityInStock) {
        this.productQuantityInStock = productQuantityInStock;
    }

    public Integer getProductQuantityRefunded() {
        return productQuantityRefunded;
    }

    public void setProductQuantityRefunded(Integer productQuantityRefunded) {
        this.productQuantityRefunded = productQuantityRefunded;
    }

    public Integer getProductQuantityReturn() {
        return productQuantityReturn;
    }

    public void setProductQuantityReturn(Integer productQuantityReturn) {
        this.productQuantityReturn = productQuantityReturn;
    }

    public Integer getProductQuantityReinjected() {
        return productQuantityReinjected;
    }

    public void setProductQuantityReinjected(Integer productQuantityReinjected) {
        this.productQuantityReinjected = productQuantityReinjected;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getReductionPercent() {
        return reductionPercent;
    }

    public void setReductionPercent(BigDecimal reductionPercent) {
        this.reductionPercent = reductionPercent;
    }

    public BigDecimal getReductionAmount() {
        return reductionAmount;
    }

    public void setReductionAmount(BigDecimal reductionAmount) {
        this.reductionAmount = reductionAmount;
    }

    public BigDecimal getReductionAmountTaxIncl() {
        return reductionAmountTaxIncl;
    }

    public void setReductionAmountTaxIncl(BigDecimal reductionAmountTaxIncl) {
        this.reductionAmountTaxIncl = reductionAmountTaxIncl;
    }

    public BigDecimal getReductionAmountTaxExcl() {
        return reductionAmountTaxExcl;
    }

    public void setReductionAmountTaxExcl(BigDecimal reductionAmountTaxExcl) {
        this.reductionAmountTaxExcl = reductionAmountTaxExcl;
    }

    public BigDecimal getGroupReduction() {
        return groupReduction;
    }

    public void setGroupReduction(BigDecimal groupReduction) {
        this.groupReduction = groupReduction;
    }

    public BigDecimal getProductQuantityDiscount() {
        return productQuantityDiscount;
    }

    public void setProductQuantityDiscount(BigDecimal productQuantityDiscount) {
        this.productQuantityDiscount = productQuantityDiscount;
    }

    public String getProductEan13() {
        return productEan13;
    }

    public void setProductEan13(String productEan13) {
        this.productEan13 = productEan13;
    }

    public String getProductIsbn() {
        return productIsbn;
    }

    public void setProductIsbn(String productIsbn) {
        this.productIsbn = productIsbn;
    }

    public String getProductUpc() {
        return productUpc;
    }

    public void setProductUpc(String productUpc) {
        this.productUpc = productUpc;
    }

    public String getProductReference() {
        return productReference;
    }

    public void setProductReference(String productReference) {
        this.productReference = productReference;
    }

    public String getProductSupplierReference() {
        return productSupplierReference;
    }

    public void setProductSupplierReference(String productSupplierReference) {
        this.productSupplierReference = productSupplierReference;
    }

    public BigDecimal getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(BigDecimal productWeight) {
        this.productWeight = productWeight;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tax_rules_group")
    public TaxRulesGroup getTaxRulesGroup() {
        return taxRulesGroup;
    }

    public void setTaxRulesGroup(TaxRulesGroup taxRulesGroup) {
        this.taxRulesGroup = taxRulesGroup;
    }

    public Boolean getTaxComputationMethod() {
        return taxComputationMethod;
    }

    public void setTaxComputationMethod(Boolean taxComputationMethod) {
        this.taxComputationMethod = taxComputationMethod;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getEcotax() {
        return ecotax;
    }

    public void setEcotax(BigDecimal ecotax) {
        this.ecotax = ecotax;
    }

    public BigDecimal getEcotaxTarRate() {
        return ecotaxTarRate;
    }

    public void setEcotaxTarRate(BigDecimal ecotaxTarRate) {
        this.ecotaxTarRate = ecotaxTarRate;
    }

    public Boolean getDiscountQuantityApplied() {
        return discountQuantityApplied;
    }

    public void setDiscountQuantityApplied(Boolean discountQuantityApplied) {
        this.discountQuantityApplied = discountQuantityApplied;
    }

    public String getDownloadHash() {
        return downloadHash;
    }

    public void setDownloadHash(String downloadHash) {
        this.downloadHash = downloadHash;
    }

    public Integer getDownloadNb() {
        return downloadNb;
    }

    public void setDownloadNb(Integer downloadNb) {
        this.downloadNb = downloadNb;
    }

    public LocalDateTime getDownloadDeadline() {
        return downloadDeadline;
    }

    public void setDownloadDeadline(LocalDateTime downloadDeadline) {
        this.downloadDeadline = downloadDeadline;
    }

    public BigDecimal getTotalPriceTaxIncl() {
        return totalPriceTaxIncl;
    }

    public void setTotalPriceTaxIncl(BigDecimal totalPriceTaxIncl) {
        this.totalPriceTaxIncl = totalPriceTaxIncl;
    }

    public BigDecimal getTotalPriceTaxExcl() {
        return totalPriceTaxExcl;
    }

    public void setTotalPriceTaxExcl(BigDecimal totalPriceTaxExcl) {
        this.totalPriceTaxExcl = totalPriceTaxExcl;
    }

    public BigDecimal getUnitPriceTaxIncl() {
        return unitPriceTaxIncl;
    }

    public void setUnitPriceTaxIncl(BigDecimal unitPriceTaxIncl) {
        this.unitPriceTaxIncl = unitPriceTaxIncl;
    }

    public BigDecimal getUnitPriceTaxExcl() {
        return unitPriceTaxExcl;
    }

    public void setUnitPriceTaxExcl(BigDecimal unitPriceTaxExcl) {
        this.unitPriceTaxExcl = unitPriceTaxExcl;
    }

    public BigDecimal getTotalShippingPriceTaxIncl() {
        return totalShippingPriceTaxIncl;
    }

    public void setTotalShippingPriceTaxIncl(BigDecimal totalShippingPriceTaxIncl) {
        this.totalShippingPriceTaxIncl = totalShippingPriceTaxIncl;
    }

    public BigDecimal getTotalShippingPriceTaxExcl() {
        return totalShippingPriceTaxExcl;
    }

    public void setTotalShippingPriceTaxExcl(BigDecimal totalShippingPriceTaxExcl) {
        this.totalShippingPriceTaxExcl = totalShippingPriceTaxExcl;
    }

    public BigDecimal getPurchaseSupplierPrice() {
        return purchaseSupplierPrice;
    }

    public void setPurchaseSupplierPrice(BigDecimal purchaseSupplierPrice) {
        this.purchaseSupplierPrice = purchaseSupplierPrice;
    }

    public BigDecimal getOriginalProductPrice() {
        return originalProductPrice;
    }

    public void setOriginalProductPrice(BigDecimal originalProductPrice) {
        this.originalProductPrice = originalProductPrice;
    }

    public BigDecimal getOriginalWholesalePrice() {
        return originalWholesalePrice;
    }

    public void setOriginalWholesalePrice(BigDecimal originalWholesalePrice) {
        this.originalWholesalePrice = originalWholesalePrice;
    }
}