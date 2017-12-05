package com.taotao.pojo;

import java.util.Date;

public class TbItemCat {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.id
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.parent_id
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.name
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.status
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.sort_order
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    private Integer sortOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.is_parent
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    private Boolean isParent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.created
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.updated
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    private Date updated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.id
     *
     * @return the value of tb_item_cat.id
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.id
     *
     * @param id the value for tb_item_cat.id
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.parent_id
     *
     * @return the value of tb_item_cat.parent_id
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.parent_id
     *
     * @param parentId the value for tb_item_cat.parent_id
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.name
     *
     * @return the value of tb_item_cat.name
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.name
     *
     * @param name the value for tb_item_cat.name
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.status
     *
     * @return the value of tb_item_cat.status
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.status
     *
     * @param status the value for tb_item_cat.status
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.sort_order
     *
     * @return the value of tb_item_cat.sort_order
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.sort_order
     *
     * @param sortOrder the value for tb_item_cat.sort_order
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.is_parent
     *
     * @return the value of tb_item_cat.is_parent
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public Boolean getIsParent() {
        return isParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.is_parent
     *
     * @param isParent the value for tb_item_cat.is_parent
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.created
     *
     * @return the value of tb_item_cat.created
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.created
     *
     * @param created the value for tb_item_cat.created
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.updated
     *
     * @return the value of tb_item_cat.updated
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.updated
     *
     * @param updated the value for tb_item_cat.updated
     *
     * @mbggenerated Mon Nov 13 21:44:18 CST 2017
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}