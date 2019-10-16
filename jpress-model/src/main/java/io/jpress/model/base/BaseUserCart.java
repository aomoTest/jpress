package io.jpress.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jpress.base.BaseOptionsModel;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserCart<M extends BaseUserCart<M>> extends BaseOptionsModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

    /**
     * 购买的用户
     */
	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}

    /**
     * 购买的用户
     */
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

    /**
     * 商品的所属用户
     */
	public void setSellerId(java.lang.Long sellerId) {
		set("seller_id", sellerId);
	}

    /**
     * 商品的所属用户
     */
	public java.lang.Long getSellerId() {
		return getLong("seller_id");
	}

    /**
     * 分销用户
     */
	public void setDistUserId(java.lang.Long distUserId) {
		set("dist_user_id", distUserId);
	}

    /**
     * 分销用户
     */
	public java.lang.Long getDistUserId() {
		return getLong("dist_user_id");
	}

	public void setProductId(java.lang.Long productId) {
		set("product_id", productId);
	}

	public java.lang.Long getProductId() {
		return getLong("product_id");
	}

    /**
     * 商品的类别，默认是 product ，但是未来可能是 模板、文件、视频等等...
     */
	public void setProductType(java.lang.String productType) {
		set("product_type", productType);
	}

    /**
     * 商品的类别，默认是 product ，但是未来可能是 模板、文件、视频等等...
     */
	public java.lang.String getProductType() {
		return getStr("product_type");
	}

	public void setProductTypeText(java.lang.String productTypeText) {
		set("product_type_text", productTypeText);
	}

	public java.lang.String getProductTypeText() {
		return getStr("product_type_text");
	}

    /**
     * 商品标题
     */
	public void setProductTitle(java.lang.String productTitle) {
		set("product_title", productTitle);
	}

    /**
     * 商品标题
     */
	public java.lang.String getProductTitle() {
		return getStr("product_title");
	}

    /**
     * 商品缩略图
     */
	public void setProductThumbnail(java.lang.String productThumbnail) {
		set("product_thumbnail", productThumbnail);
	}

    /**
     * 商品缩略图
     */
	public java.lang.String getProductThumbnail() {
		return getStr("product_thumbnail");
	}

    /**
     * 商品加入购物车时的价格
     */
	public void setProductPrice(java.math.BigDecimal productPrice) {
		set("product_price", productPrice);
	}

    /**
     * 商品加入购物车时的价格
     */
	public java.math.BigDecimal getProductPrice() {
		return get("product_price");
	}

    /**
     * 商品的最新价格
     */
	public void setProductNewPrice(java.math.BigDecimal productNewPrice) {
		set("product_new_price", productNewPrice);
	}

    /**
     * 商品的最新价格
     */
	public java.math.BigDecimal getProductNewPrice() {
		return get("product_new_price");
	}

    /**
     * 商品数量
     */
	public void setProductCount(java.lang.Integer productCount) {
		set("product_count", productCount);
	}

    /**
     * 商品数量
     */
	public java.lang.Integer getProductCount() {
		return getInt("product_count");
	}

    /**
     * 查看的网址路径，访问时时，会添加orderid
     */
	public void setViewPath(java.lang.String viewPath) {
		set("view_path", viewPath);
	}

    /**
     * 查看的网址路径，访问时时，会添加orderid
     */
	public java.lang.String getViewPath() {
		return getStr("view_path");
	}

    /**
     * 查看的文章内容，比如：查看、下载
     */
	public void setViewText(java.lang.String viewText) {
		set("view_text", viewText);
	}

    /**
     * 查看的文章内容，比如：查看、下载
     */
	public java.lang.String getViewText() {
		return getStr("view_text");
	}

    /**
     * 选中状态
     */
	public void setSelected(java.lang.Boolean selected) {
		set("selected", selected);
	}

    /**
     * 选中状态
     */
	public java.lang.Boolean getSelected() {
		return get("selected");
	}

	public void setOptions(java.lang.String options) {
		set("options", options);
	}

	public java.lang.String getOptions() {
		return getStr("options");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}

	public java.util.Date getModified() {
		return get("modified");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}

	public java.util.Date getCreated() {
		return get("created");
	}

}
