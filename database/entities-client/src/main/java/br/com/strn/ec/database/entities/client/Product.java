package br.com.strn.ec.database.entities.client;

import br.com.strn.ec.database.entities.client.enums.ProductCondition;
import br.com.strn.ec.database.entities.client.enums.ProductRedirectType;
import br.com.strn.ec.database.entities.client.enums.ProductVisibility;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
public class Product implements Serializable {

    private String id;
    private Supplier supplier;
    private Manufacturer manufacturer;
    private Category categoryDefault;
    private Shop shopDefault;
    private TaxRulesGroup taxRulesGroup;
    private Boolean onSale;
    private Boolean onlineOnly;
    private String ean13;
    private String isbn;
    private String upc;
    private BigDecimal ecotax;
    private Integer quantity;
    private Integer minimalQuantity;
    private Integer lowStockThreshold;
    private Integer lowStockAlert;
    private BigDecimal price;
    private BigDecimal wholesalePrice;
    private String unity;
    private BigDecimal unitPriceRatio;
    private BigDecimal additionalShippingCost;
    private String reference;
    private String supplierReference;
    private String location;
    private BigDecimal width;
    private BigDecimal height;
    private BigDecimal depth;
    private BigDecimal weight;
    private Integer outOfStock;
    private Boolean additionalDeliveryTimes;
    private Boolean quantityDiscount;
    private Boolean customizable;
    private Boolean uploadableFiles;
    private Boolean textFields;
    private Boolean active;
    private ProductRedirectType redirectType;
    private String typeRedirect;
    private Boolean availableForOrder;
    private LocalDateTime availableDate;
    private Boolean showCondition;
    private ProductCondition condition;
    private Boolean showPrice;
    private Boolean indexed;
    private ProductVisibility visibility;
    private Boolean cacheIsPack;
    private Boolean cacheHasAttachments;
    private Boolean isVirtual;
    private Integer cacheDefaultAttribute;
    private LocalDateTime dateAdd;
    private LocalDateTime dateUpd;
    private Boolean advancedStockManagement;
    private Integer packStockType;
    private Integer state;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_manufacturer")
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category_default")
    public Category getCategoryDefault() {
        return categoryDefault;
    }

    public void setCategoryDefault(Category categoryDefault) {
        this.categoryDefault = categoryDefault;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_shop_default")
    public Shop getShopDefault() {
        return shopDefault;
    }

    public void setShopDefault(Shop shopDefault) {
        this.shopDefault = shopDefault;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tax_rules_group")
    public TaxRulesGroup getTaxRulesGroup() {
        return taxRulesGroup;
    }

    public void setTaxRulesGroup(TaxRulesGroup taxRulesGroup) {
        this.taxRulesGroup = taxRulesGroup;
    }

    public Boolean getOnSale() {
        return onSale;
    }

    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    public Boolean getOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(Boolean onlineOnly) {
        this.onlineOnly = onlineOnly;
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

    public BigDecimal getEcotax() {
        return ecotax;
    }

    public void setEcotax(BigDecimal ecotax) {
        this.ecotax = ecotax;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getMinimalQuantity() {
        return minimalQuantity;
    }

    public void setMinimalQuantity(Integer minimalQuantity) {
        this.minimalQuantity = minimalQuantity;
    }

    public Integer getLowStockThreshold() {
        return lowStockThreshold;
    }

    public void setLowStockThreshold(Integer lowStockThreshold) {
        this.lowStockThreshold = lowStockThreshold;
    }

    public Integer getLowStockAlert() {
        return lowStockAlert;
    }

    public void setLowStockAlert(Integer lowStockAlert) {
        this.lowStockAlert = lowStockAlert;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(BigDecimal wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }

    public BigDecimal getUnitPriceRatio() {
        return unitPriceRatio;
    }

    public void setUnitPriceRatio(BigDecimal unitPriceRatio) {
        this.unitPriceRatio = unitPriceRatio;
    }

    public BigDecimal getAdditionalShippingCost() {
        return additionalShippingCost;
    }

    public void setAdditionalShippingCost(BigDecimal additionalShippingCost) {
        this.additionalShippingCost = additionalShippingCost;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getDepth() {
        return depth;
    }

    public void setDepth(BigDecimal depth) {
        this.depth = depth;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(Integer outOfStock) {
        this.outOfStock = outOfStock;
    }

    public Boolean getAdditionalDeliveryTimes() {
        return additionalDeliveryTimes;
    }

    public void setAdditionalDeliveryTimes(Boolean additionalDeliveryTimes) {
        this.additionalDeliveryTimes = additionalDeliveryTimes;
    }

    public Boolean getQuantityDiscount() {
        return quantityDiscount;
    }

    public void setQuantityDiscount(Boolean quantityDiscount) {
        this.quantityDiscount = quantityDiscount;
    }

    public Boolean getCustomizable() {
        return customizable;
    }

    public void setCustomizable(Boolean customizable) {
        this.customizable = customizable;
    }

    public Boolean getUploadableFiles() {
        return uploadableFiles;
    }

    public void setUploadableFiles(Boolean uploadableFiles) {
        this.uploadableFiles = uploadableFiles;
    }

    public Boolean getTextFields() {
        return textFields;
    }

    public void setTextFields(Boolean textFields) {
        this.textFields = textFields;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Enumerated(EnumType.STRING)
    public ProductRedirectType getRedirectType() {
        return redirectType;
    }

    public void setRedirectType(ProductRedirectType redirectType) {
        this.redirectType = redirectType;
    }

    public String getTypeRedirect() {
        return typeRedirect;
    }

    public void setTypeRedirect(String typeRedirect) {
        this.typeRedirect = typeRedirect;
    }

    public Boolean getAvailableForOrder() {
        return availableForOrder;
    }

    public void setAvailableForOrder(Boolean availableForOrder) {
        this.availableForOrder = availableForOrder;
    }

    public LocalDateTime getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(LocalDateTime availableDate) {
        this.availableDate = availableDate;
    }

    public Boolean getShowCondition() {
        return showCondition;
    }

    public void setShowCondition(Boolean showCondition) {
        this.showCondition = showCondition;
    }

    @Enumerated(EnumType.STRING)
    public ProductCondition getCondition() {
        return condition;
    }

    public void setCondition(ProductCondition condition) {
        this.condition = condition;
    }

    public Boolean getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(Boolean showPrice) {
        this.showPrice = showPrice;
    }

    public Boolean getIndexed() {
        return indexed;
    }

    public void setIndexed(Boolean indexed) {
        this.indexed = indexed;
    }

    @Enumerated(EnumType.STRING)
    public ProductVisibility getVisibility() {
        return visibility;
    }

    public void setVisibility(ProductVisibility visibility) {
        this.visibility = visibility;
    }

    public Boolean getCacheIsPack() {
        return cacheIsPack;
    }

    public void setCacheIsPack(Boolean cacheIsPack) {
        this.cacheIsPack = cacheIsPack;
    }

    public Boolean getCacheHasAttachments() {
        return cacheHasAttachments;
    }

    public void setCacheHasAttachments(Boolean cacheHasAttachments) {
        this.cacheHasAttachments = cacheHasAttachments;
    }

    public Boolean getVirtual() {
        return isVirtual;
    }

    public void setVirtual(Boolean virtual) {
        isVirtual = virtual;
    }

    public Integer getCacheDefaultAttribute() {
        return cacheDefaultAttribute;
    }

    public void setCacheDefaultAttribute(Integer cacheDefaultAttribute) {
        this.cacheDefaultAttribute = cacheDefaultAttribute;
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

    public Boolean getAdvancedStockManagement() {
        return advancedStockManagement;
    }

    public void setAdvancedStockManagement(Boolean advancedStockManagement) {
        this.advancedStockManagement = advancedStockManagement;
    }

    public Integer getPackStockType() {
        return packStockType;
    }

    public void setPackStockType(Integer packStockType) {
        this.packStockType = packStockType;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}