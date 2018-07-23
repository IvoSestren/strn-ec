package br.com.strn.ec.database.connection.hibernate;

import br.com.caelum.vraptor.environment.Environment;
import br.com.strn.ec.database.entities.client.*;
import br.com.strn.ec.database.entities.master.*;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import java.net.URL;
import java.util.Properties;

public class ConfigurationCreator {

    private Environment env;
    private Logger logger;

    /**
     * @deprecated CDI eyes only.
     */
    protected ConfigurationCreator() {
    }

    @Inject
    public ConfigurationCreator(Environment env, Logger logger) {
        this.env = env;
        this.logger = logger;
    }

    private URL getHibernateCfgLocation() {
        return env.getResource("/hibernate.cfg.xml");
    }

    @Produces
    @ApplicationScoped
    public Configuration getInstance() {
        Configuration configuration = new Configuration();

        extraConfigurations(configuration);

        URL location = getHibernateCfgLocation();
        logger.debug("building configuration using {} file", location);
        return configuration.addProperties(propConnection()).configure(location);
    }

    private Properties propConnection() {
        Properties prop = new Properties();

        String bancoType = env.get("banco.type", "postgresql");
        String bancoHost = env.get("banco.host", "localhost");
        String bancoPort = env.get("banco.port", "5432");
        String bancoName = env.get("banco.name");
        String bancoUser = env.get("banco.user");
        String bancoPass = env.get("banco.pass");

        prop.setProperty("hibernate.connection.url", "jdbc:" + bancoType + "://" + bancoHost + ":" + bancoPort + "/" + bancoName + "?ApplicationName=STRN eCommerce (public)");
        prop.setProperty("hibernate.connection.username", bancoUser);
        prop.setProperty("hibernate.connection.password", bancoPass);

        prop.setProperty("hibernate.hikari.maximumPoolSize", "10");

        return prop;
    }

    private void extraConfigurations(Configuration configuration) {
        //configuration.registerTypeOverride(new UUIDUserType(), new String[]{UUID.class.getName()});

        configuration.addAnnotatedClass(SysClient.class);
        configuration.addAnnotatedClass(SysContract.class);
        configuration.addAnnotatedClass(SysDbDatabase.class);
        configuration.addAnnotatedClass(SysDbHost.class);
        configuration.addAnnotatedClass(SysDbSchema.class);
        configuration.addAnnotatedClass(SysUrl.class);

        configuration.addAnnotatedClass(Access.class);
        configuration.addAnnotatedClass(Accessory.class);
        configuration.addAnnotatedClass(Address.class);
        configuration.addAnnotatedClass(AddressFormat.class);
        configuration.addAnnotatedClass(AdminFilter.class);
        configuration.addAnnotatedClass(Advice.class);
        configuration.addAnnotatedClass(AdviceLang.class);
        configuration.addAnnotatedClass(Alias.class);
        configuration.addAnnotatedClass(Attachment.class);
        configuration.addAnnotatedClass(AttachmentLang.class);
        configuration.addAnnotatedClass(Attribute.class);
        configuration.addAnnotatedClass(AttributeGroup.class);
        configuration.addAnnotatedClass(AttributeGroupLang.class);
        configuration.addAnnotatedClass(AttributeGroupShop.class);
        configuration.addAnnotatedClass(AttributeImpact.class);
        configuration.addAnnotatedClass(AttributeLang.class);
        configuration.addAnnotatedClass(AttributeShop.class);
        configuration.addAnnotatedClass(AuthorizationRole.class);
        configuration.addAnnotatedClass(Badge.class);
        configuration.addAnnotatedClass(BadgeLang.class);
        configuration.addAnnotatedClass(Carrier.class);
        configuration.addAnnotatedClass(CarrierGroup.class);
        configuration.addAnnotatedClass(CarrierLang.class);
        configuration.addAnnotatedClass(CarrierShop.class);
        configuration.addAnnotatedClass(CarrierTaxRulesGroupShop.class);
        configuration.addAnnotatedClass(CarrierZone.class);
        configuration.addAnnotatedClass(Cart.class);
        configuration.addAnnotatedClass(CartCartRule.class);
        configuration.addAnnotatedClass(CartProduct.class);
        configuration.addAnnotatedClass(CartRule.class);
        configuration.addAnnotatedClass(CartRuleCarrier.class);
        configuration.addAnnotatedClass(CartRuleCombination.class);
        configuration.addAnnotatedClass(CartRuleCountry.class);
        configuration.addAnnotatedClass(CartRuleGroup.class);
        configuration.addAnnotatedClass(CartRuleLang.class);
        configuration.addAnnotatedClass(CartRuleProductRule.class);
        configuration.addAnnotatedClass(CartRuleProductRuleGroup.class);
        configuration.addAnnotatedClass(CartRuleProductRuleValue.class);
        configuration.addAnnotatedClass(CartRuleShop.class);
        configuration.addAnnotatedClass(Category.class);
        configuration.addAnnotatedClass(CategoryGroup.class);
        configuration.addAnnotatedClass(CategoryLang.class);
        configuration.addAnnotatedClass(CategoryProduct.class);
        configuration.addAnnotatedClass(CategoryShop.class);
        configuration.addAnnotatedClass(Cms.class);
        configuration.addAnnotatedClass(CmsCategory.class);
        configuration.addAnnotatedClass(CmsCategoryLang.class);
        configuration.addAnnotatedClass(CmsCategoryShop.class);
        configuration.addAnnotatedClass(CmsLang.class);
        configuration.addAnnotatedClass(CmsRole.class);
        configuration.addAnnotatedClass(CmsRoleLang.class);
        configuration.addAnnotatedClass(CmsShop.class);
        configuration.addAnnotatedClass(Condition.class);
        configuration.addAnnotatedClass(ConditionAdvice.class);
        configuration.addAnnotatedClass(ConditionBadge.class);
        configuration.addAnnotatedClass(Configurations.class);
        configuration.addAnnotatedClass(ConfigurationKpi.class);
        configuration.addAnnotatedClass(ConfigurationKpiLang.class);
        configuration.addAnnotatedClass(ConfigurationLang.class);
        configuration.addAnnotatedClass(Connections.class);
        configuration.addAnnotatedClass(ConnectionsPage.class);
        configuration.addAnnotatedClass(ConnectionsSource.class);
        configuration.addAnnotatedClass(Contact.class);
        configuration.addAnnotatedClass(ContactLang.class);
        configuration.addAnnotatedClass(ContactShop.class);
        configuration.addAnnotatedClass(Country.class);
        configuration.addAnnotatedClass(CountryLang.class);
        configuration.addAnnotatedClass(CountryShop.class);
        configuration.addAnnotatedClass(Cronjobs.class);
        configuration.addAnnotatedClass(Currencies.class);
        configuration.addAnnotatedClass(CurrencyShop.class);
        configuration.addAnnotatedClass(Customer.class);
        configuration.addAnnotatedClass(CustomerGroup.class);
        configuration.addAnnotatedClass(CustomerMessage.class);
        configuration.addAnnotatedClass(CustomerMessageSyncImap.class);
        configuration.addAnnotatedClass(CustomerThread.class);
        configuration.addAnnotatedClass(Customization.class);
        configuration.addAnnotatedClass(CustomizationField.class);
        configuration.addAnnotatedClass(CustomizationFieldLang.class);
        configuration.addAnnotatedClass(CustomizedData.class);
        configuration.addAnnotatedClass(DateRange.class);
        configuration.addAnnotatedClass(Delivery.class);
        configuration.addAnnotatedClass(Emailsubscription.class);
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(EmployeeShop.class);
        configuration.addAnnotatedClass(Feature.class);
        configuration.addAnnotatedClass(FeatureLang.class);
        configuration.addAnnotatedClass(FeatureProduct.class);
        configuration.addAnnotatedClass(FeatureShop.class);
        configuration.addAnnotatedClass(FeatureValue.class);
        configuration.addAnnotatedClass(FeatureValueLang.class);
        configuration.addAnnotatedClass(Gender.class);
        configuration.addAnnotatedClass(GenderLang.class);
        configuration.addAnnotatedClass(Group.class);
        configuration.addAnnotatedClass(GroupLang.class);
        configuration.addAnnotatedClass(GroupReduction.class);
        configuration.addAnnotatedClass(GroupShop.class);
        configuration.addAnnotatedClass(Guest.class);
        configuration.addAnnotatedClass(Homeslider.class);
        configuration.addAnnotatedClass(HomesliderSlides.class);
        configuration.addAnnotatedClass(HomesliderSlidesLang.class);
        configuration.addAnnotatedClass(Hook.class);
        configuration.addAnnotatedClass(HookAlias.class);
        configuration.addAnnotatedClass(HookModule.class);
        configuration.addAnnotatedClass(HookModuleExceptions.class);
        configuration.addAnnotatedClass(Image.class);
        configuration.addAnnotatedClass(ImageLang.class);
        configuration.addAnnotatedClass(ImageShop.class);
        configuration.addAnnotatedClass(ImageType.class);
        configuration.addAnnotatedClass(ImportMatch.class);
        configuration.addAnnotatedClass(Info.class);
        configuration.addAnnotatedClass(InfoLang.class);
        configuration.addAnnotatedClass(Lang.class);
        configuration.addAnnotatedClass(LangShop.class);
        configuration.addAnnotatedClass(LayeredCategory.class);
        configuration.addAnnotatedClass(LayeredFilter.class);
        configuration.addAnnotatedClass(LayeredFilterShop.class);
        configuration.addAnnotatedClass(LayeredIndexableAttributeGroup.class);
        configuration.addAnnotatedClass(LayeredIndexableAttributeGroupLangValue.class);
        configuration.addAnnotatedClass(LayeredIndexableAttributeLangValue.class);
        configuration.addAnnotatedClass(LayeredIndexableFeature.class);
        configuration.addAnnotatedClass(LayeredIndexableFeatureLangValue.class);
        configuration.addAnnotatedClass(LayeredIndexableFeatureValueLangValue.class);
        configuration.addAnnotatedClass(LayeredPriceIndex.class);
        configuration.addAnnotatedClass(LayeredProductAttribute.class);
        configuration.addAnnotatedClass(LinkBlock.class);
        configuration.addAnnotatedClass(LinkBlockLang.class);
        configuration.addAnnotatedClass(LinkBlockShop.class);
        configuration.addAnnotatedClass(Linksmenutop.class);
        configuration.addAnnotatedClass(LinksmenutopLang.class);
        configuration.addAnnotatedClass(Log.class);
        configuration.addAnnotatedClass(Mail.class);
        configuration.addAnnotatedClass(Manufacturer.class);
        configuration.addAnnotatedClass(ManufacturerLang.class);
        configuration.addAnnotatedClass(ManufacturerShop.class);
        configuration.addAnnotatedClass(MemcachedServers.class);
        configuration.addAnnotatedClass(Message.class);
        configuration.addAnnotatedClass(MessageReaded.class);
        configuration.addAnnotatedClass(Meta.class);
        configuration.addAnnotatedClass(MetaLang.class);
        configuration.addAnnotatedClass(Module.class);
        configuration.addAnnotatedClass(ModuleAccess.class);
        configuration.addAnnotatedClass(ModuleCarrier.class);
        configuration.addAnnotatedClass(ModuleCountry.class);
        configuration.addAnnotatedClass(ModuleCurrency.class);
        configuration.addAnnotatedClass(ModuleGroup.class);
        configuration.addAnnotatedClass(ModuleHistory.class);
        configuration.addAnnotatedClass(ModulePreference.class);
        configuration.addAnnotatedClass(ModuleShop.class);
        configuration.addAnnotatedClass(OperatingSystem.class);
        configuration.addAnnotatedClass(OrderCarrier.class);
        configuration.addAnnotatedClass(OrderCartRule.class);
        configuration.addAnnotatedClass(OrderDetail.class);
        configuration.addAnnotatedClass(OrderDetailTax.class);
        configuration.addAnnotatedClass(OrderHistory.class);
        configuration.addAnnotatedClass(OrderInvoice.class);
        configuration.addAnnotatedClass(OrderInvoicePayment.class);
        configuration.addAnnotatedClass(OrderInvoiceTax.class);
        configuration.addAnnotatedClass(OrderMessage.class);
        configuration.addAnnotatedClass(OrderMessageLang.class);
        configuration.addAnnotatedClass(OrderPayment.class);
        configuration.addAnnotatedClass(OrderReturn.class);
        configuration.addAnnotatedClass(OrderReturnDetail.class);
        configuration.addAnnotatedClass(OrderReturnState.class);
        configuration.addAnnotatedClass(OrderReturnStateLang.class);
        configuration.addAnnotatedClass(Orders.class);
        configuration.addAnnotatedClass(OrderSlip.class);
        configuration.addAnnotatedClass(OrderSlipDetail.class);
        configuration.addAnnotatedClass(OrderSlipDetailTax.class);
        configuration.addAnnotatedClass(OrderState.class);
        configuration.addAnnotatedClass(OrderStateLang.class);
        configuration.addAnnotatedClass(Pack.class);
        configuration.addAnnotatedClass(Page.class);
        configuration.addAnnotatedClass(Pagenotfound.class);
        configuration.addAnnotatedClass(PageType.class);
        configuration.addAnnotatedClass(PageViewed.class);
        configuration.addAnnotatedClass(Product.class);
        configuration.addAnnotatedClass(ProductAttachment.class);
        configuration.addAnnotatedClass(ProductAttribute.class);
        configuration.addAnnotatedClass(ProductAttributeCombination.class);
        configuration.addAnnotatedClass(ProductAttributeImage.class);
        configuration.addAnnotatedClass(ProductAttributeShop.class);
        configuration.addAnnotatedClass(ProductCarrier.class);
        configuration.addAnnotatedClass(ProductCountryTax.class);
        configuration.addAnnotatedClass(ProductDownload.class);
        configuration.addAnnotatedClass(ProductGroupReductionCache.class);
        configuration.addAnnotatedClass(ProductLang.class);
        configuration.addAnnotatedClass(ProductSale.class);
        configuration.addAnnotatedClass(ProductShop.class);
        configuration.addAnnotatedClass(ProductSupplier.class);
        configuration.addAnnotatedClass(ProductTag.class);
        configuration.addAnnotatedClass(Profile.class);
        configuration.addAnnotatedClass(ProfileLang.class);
        configuration.addAnnotatedClass(QuickAccess.class);
        configuration.addAnnotatedClass(QuickAccessLang.class);
        configuration.addAnnotatedClass(RangePrice.class);
        configuration.addAnnotatedClass(RangeWeight.class);
        configuration.addAnnotatedClass(Reassurance.class);
        configuration.addAnnotatedClass(ReassuranceLang.class);
        configuration.addAnnotatedClass(Referrer.class);
        configuration.addAnnotatedClass(ReferrerCache.class);
        configuration.addAnnotatedClass(ReferrerShop.class);
        configuration.addAnnotatedClass(RequestSql.class);
        configuration.addAnnotatedClass(RequiredField.class);
        configuration.addAnnotatedClass(Risk.class);
        configuration.addAnnotatedClass(RiskLang.class);
        configuration.addAnnotatedClass(SearchEngine.class);
        configuration.addAnnotatedClass(SearchIndex.class);
        configuration.addAnnotatedClass(SearchWord.class);
        configuration.addAnnotatedClass(Sekeyword.class);
        configuration.addAnnotatedClass(Shop.class);
        configuration.addAnnotatedClass(ShopGroup.class);
        configuration.addAnnotatedClass(ShopUrl.class);
        configuration.addAnnotatedClass(SmartyCache.class);
        configuration.addAnnotatedClass(SmartyLastFlush.class);
        configuration.addAnnotatedClass(SmartyLazyCache.class);
        configuration.addAnnotatedClass(SpecificPrice.class);
        configuration.addAnnotatedClass(SpecificPricePriority.class);
        configuration.addAnnotatedClass(SpecificPriceRule.class);
        configuration.addAnnotatedClass(SpecificPriceRuleCondition.class);
        configuration.addAnnotatedClass(SpecificPriceRuleConditionGroup.class);
        configuration.addAnnotatedClass(State.class);
        configuration.addAnnotatedClass(Statssearch.class);
        configuration.addAnnotatedClass(Stock.class);
        configuration.addAnnotatedClass(StockAvailable.class);
        configuration.addAnnotatedClass(StockMvt.class);
        configuration.addAnnotatedClass(StockMvtReason.class);
        configuration.addAnnotatedClass(StockMvtReasonLang.class);
        configuration.addAnnotatedClass(Store.class);
        configuration.addAnnotatedClass(StoreLang.class);
        configuration.addAnnotatedClass(StoreShop.class);
        configuration.addAnnotatedClass(Supplier.class);
        configuration.addAnnotatedClass(SupplierLang.class);
        configuration.addAnnotatedClass(SupplierShop.class);
        configuration.addAnnotatedClass(SupplyOrder.class);
        configuration.addAnnotatedClass(SupplyOrderDetail.class);
        configuration.addAnnotatedClass(SupplyOrderHistory.class);
        configuration.addAnnotatedClass(SupplyOrderReceiptHistory.class);
        configuration.addAnnotatedClass(SupplyOrderState.class);
        configuration.addAnnotatedClass(SupplyOrderStateLang.class);
        configuration.addAnnotatedClass(Tab.class);
        configuration.addAnnotatedClass(TabAdvice.class);
        configuration.addAnnotatedClass(TabLang.class);
        configuration.addAnnotatedClass(TabModulePreference.class);
        configuration.addAnnotatedClass(Tag.class);
        configuration.addAnnotatedClass(TagCount.class);
        configuration.addAnnotatedClass(Tax.class);
        configuration.addAnnotatedClass(TaxLang.class);
        configuration.addAnnotatedClass(TaxRule.class);
        configuration.addAnnotatedClass(TaxRulesGroup.class);
        configuration.addAnnotatedClass(TaxRulesGroupShop.class);
        configuration.addAnnotatedClass(Theme.class);
        configuration.addAnnotatedClass(Timezone.class);
        configuration.addAnnotatedClass(Translation.class);
        configuration.addAnnotatedClass(Warehouse.class);
        configuration.addAnnotatedClass(WarehouseCarrier.class);
        configuration.addAnnotatedClass(WarehouseProductLocation.class);
        configuration.addAnnotatedClass(WarehouseShop.class);
        configuration.addAnnotatedClass(WebBrowser.class);
        configuration.addAnnotatedClass(WebserviceAccount.class);
        configuration.addAnnotatedClass(WebserviceAccountShop.class);
        configuration.addAnnotatedClass(WebservicePermission.class);
        configuration.addAnnotatedClass(Zone.class);
        configuration.addAnnotatedClass(ZoneShop.class);
    }
}