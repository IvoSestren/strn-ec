package br.com.strn.ec.database.entities.client;

import br.com.strn.ec.database.entities.client.enums.ProductShopCondition;
import br.com.strn.ec.database.entities.client.enums.ProductShopRedirectType;
import br.com.strn.ec.database.entities.client.enums.ProductShopVisibility;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "productshop")
public class ProductShop implements Serializable {

    private String id;
    private Product product;
    private Shop shop;
    private Category categoryDefault;
    private TaxRulesGroup taxRulesGroup;
    private Boolean onSale;
    private Boolean onlineOnly;
    private BigDecimal ecotax;
    private Integer minimalQuantity;
    private Integer lowStockThreshold;
    private Boolean lowStockAlert;
    private BigDecimal price;
    private BigDecimal wholesalePrice;
    private String unity;
    private BigDecimal unitPriceRatio;
    private BigDecimal additionalShippingCost;
    private Boolean customizable;
    private Boolean uploadableFiles;
    private Boolean textFields;
    private Boolean active;
    private ProductShopRedirectType redirectType;
    private String typeRedirect;
    private Boolean availableForOrder;
    private LocalDateTime availableDate;
    private Boolean showCondition;
    private ProductShopCondition condition;
    private Boolean showPrice;
    private Boolean indexed;
    private ProductShopVisibility visibility;
    private Integer cacheDefaultAttribute;
    private Boolean advancedStockManagement;
    private LocalDateTime dateAdd;
    private LocalDateTime dateUpd;
    private Integer packStockType;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @JoinColumn(name = "id_shop")
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
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

    public BigDecimal getEcotax() {
        return ecotax;
    }

    public void setEcotax(BigDecimal ecotax) {
        this.ecotax = ecotax;
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

    public Boolean getLowStockAlert() {
        return lowStockAlert;
    }

    public void setLowStockAlert(Boolean lowStockAlert) {
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
    public ProductShopRedirectType getRedirectType() {
        return redirectType;
    }

    public void setRedirectType(ProductShopRedirectType redirectType) {
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
    public ProductShopCondition getCondition() {
        return condition;
    }

    public void setCondition(ProductShopCondition condition) {
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
    public ProductShopVisibility getVisibility() {
        return visibility;
    }

    public void setVisibility(ProductShopVisibility visibility) {
        this.visibility = visibility;
    }

    public Integer getCacheDefaultAttribute() {
        return cacheDefaultAttribute;
    }

    public void setCacheDefaultAttribute(Integer cacheDefaultAttribute) {
        this.cacheDefaultAttribute = cacheDefaultAttribute;
    }

    public Boolean getAdvancedStockManagement() {
        return advancedStockManagement;
    }

    public void setAdvancedStockManagement(Boolean advancedStockManagement) {
        this.advancedStockManagement = advancedStockManagement;
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

    public Integer getPackStockType() {
        return packStockType;
    }

    public void setPackStockType(Integer packStockType) {
        this.packStockType = packStockType;
    }
}