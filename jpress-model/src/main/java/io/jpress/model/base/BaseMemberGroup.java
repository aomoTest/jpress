package io.jpress.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jpress.base.BaseOptionsModel;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMemberGroup<M extends BaseMemberGroup<M>> extends BaseOptionsModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

    /**
     * 会员名称
     */
	public void setName(java.lang.String name) {
		set("name", name);
	}

    /**
     * 会员名称
     */
	public java.lang.String getName() {
		return getStr("name");
	}

    /**
     * 标题
     */
	public void setTitle(java.lang.String title) {
		set("title", title);
	}

    /**
     * 标题
     */
	public java.lang.String getTitle() {
		return getStr("title");
	}

    /**
     * 会员ICON
     */
	public void setIcon(java.lang.String icon) {
		set("icon", icon);
	}

    /**
     * 会员ICON
     */
	public java.lang.String getIcon() {
		return getStr("icon");
	}

    /**
     * 会员内容、简介
     */
	public void setContent(java.lang.String content) {
		set("content", content);
	}

    /**
     * 会员内容、简介
     */
	public java.lang.String getContent() {
		return getStr("content");
	}

    /**
     * 摘要
     */
	public void setSummary(java.lang.String summary) {
		set("summary", summary);
	}

    /**
     * 摘要
     */
	public java.lang.String getSummary() {
		return getStr("summary");
	}

    /**
     * 缩略图
     */
	public void setThumbnail(java.lang.String thumbnail) {
		set("thumbnail", thumbnail);
	}

    /**
     * 缩略图
     */
	public java.lang.String getThumbnail() {
		return getStr("thumbnail");
	}

    /**
     * 视频
     */
	public void setVideo(java.lang.String video) {
		set("video", video);
	}

    /**
     * 视频
     */
	public java.lang.String getVideo() {
		return getStr("video");
	}

    /**
     * 排序编号
     */
	public void setOrderNumber(java.lang.Integer orderNumber) {
		set("order_number", orderNumber);
	}

    /**
     * 排序编号
     */
	public java.lang.Integer getOrderNumber() {
		return getInt("order_number");
	}

    /**
     * 加入的会员价格
     */
	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}

    /**
     * 加入的会员价格
     */
	public java.math.BigDecimal getPrice() {
		return get("price");
	}

    /**
     * 限时价格
     */
	public void setLimitedPrice(java.math.BigDecimal limitedPrice) {
		set("limited_price", limitedPrice);
	}

    /**
     * 限时价格
     */
	public java.math.BigDecimal getLimitedPrice() {
		return get("limited_price");
	}

    /**
     * 限时价格到期时间
     */
	public void setLimitedTime(java.util.Date limitedTime) {
		set("limited_time", limitedTime);
	}

    /**
     * 限时价格到期时间
     */
	public java.util.Date getLimitedTime() {
		return get("limited_time");
	}

    /**
     * 是否启用分销功能
     */
	public void setDistEnable(java.lang.Boolean distEnable) {
		set("dist_enable", distEnable);
	}

    /**
     * 是否启用分销功能
     */
	public java.lang.Boolean getDistEnable() {
		return get("dist_enable");
	}

    /**
     * 分销收益金额
     */
	public void setDistAmount(java.math.BigDecimal distAmount) {
		set("dist_amount", distAmount);
	}

    /**
     * 分销收益金额
     */
	public java.math.BigDecimal getDistAmount() {
		return get("dist_amount");
	}

    /**
     * 有效期（单位天）
     */
	public void setTermOfValidity(java.lang.Integer termOfValidity) {
		set("term_of_validity", termOfValidity);
	}

    /**
     * 有效期（单位天）
     */
	public java.lang.Integer getTermOfValidity() {
		return getInt("term_of_validity");
	}

    /**
     * 标识
     */
	public void setFlag(java.lang.String flag) {
		set("flag", flag);
	}

    /**
     * 标识
     */
	public java.lang.String getFlag() {
		return getStr("flag");
	}

    /**
     * 状态
     */
	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

    /**
     * 状态
     */
	public java.lang.Integer getStatus() {
		return getInt("status");
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
