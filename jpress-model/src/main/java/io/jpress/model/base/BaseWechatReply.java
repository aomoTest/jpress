package io.jpress.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWechatReply<M extends BaseWechatReply<M>> extends JbootModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

    /**
     * 关键字
     */
	public void setKeyword(java.lang.String keyword) {
		set("keyword", keyword);
	}

    /**
     * 关键字
     */
	public java.lang.String getKeyword() {
		return getStr("keyword");
	}

    /**
     * 回复内容
     */
	public void setContent(java.lang.String content) {
		set("content", content);
	}

    /**
     * 回复内容
     */
	public java.lang.String getContent() {
		return getStr("content");
	}

    /**
     * 创建时间
     */
	public void setCreated(java.util.Date created) {
		set("created", created);
	}

    /**
     * 创建时间
     */
	public java.util.Date getCreated() {
		return get("created");
	}

    /**
     * 修改时间
     */
	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}

    /**
     * 修改时间
     */
	public java.util.Date getModified() {
		return get("modified");
	}

}
