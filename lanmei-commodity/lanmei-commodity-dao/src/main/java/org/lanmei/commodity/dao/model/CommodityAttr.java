package org.lanmei.commodity.dao.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table commodity_attr
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class CommodityAttr {

	/**
	 * Database Column Remarks: 属性ID This field was generated by MyBatis Generator. This field corresponds to the database column commodity_attr.attr_id
	 * @mbg.generated
	 */
	private Integer attrId;
	/**
	 * Database Column Remarks: SKU ID This field was generated by MyBatis Generator. This field corresponds to the database column commodity_attr.commodity_id
	 * @mbg.generated
	 */
	private Integer commodityId;
	/**
	 * Database Column Remarks: 名称 用户自定义 This field was generated by MyBatis Generator. This field corresponds to the database column commodity_attr.attr_name
	 * @mbg.generated
	 */
	private String attrName;
	/**
	 * Database Column Remarks: 属性值 This field was generated by MyBatis Generator. This field corresponds to the database column commodity_attr.attr_val
	 * @mbg.generated
	 */
	private String attrVal;
	/**
	 * Database Column Remarks: 分类　主体参数/规格参数 This field was generated by MyBatis Generator. This field corresponds to the database column commodity_attr.category
	 * @mbg.generated
	 */
	private String category;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_attr.attr_id
	 * @return  the value of commodity_attr.attr_id
	 * @mbg.generated
	 */
	public Integer getAttrId() {
		return attrId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_attr.attr_id
	 * @param attrId  the value for commodity_attr.attr_id
	 * @mbg.generated
	 */
	public void setAttrId(Integer attrId) {
		this.attrId = attrId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_attr.commodity_id
	 * @return  the value of commodity_attr.commodity_id
	 * @mbg.generated
	 */
	public Integer getCommodityId() {
		return commodityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_attr.commodity_id
	 * @param commodityId  the value for commodity_attr.commodity_id
	 * @mbg.generated
	 */
	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_attr.attr_name
	 * @return  the value of commodity_attr.attr_name
	 * @mbg.generated
	 */
	public String getAttrName() {
		return attrName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_attr.attr_name
	 * @param attrName  the value for commodity_attr.attr_name
	 * @mbg.generated
	 */
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_attr.attr_val
	 * @return  the value of commodity_attr.attr_val
	 * @mbg.generated
	 */
	public String getAttrVal() {
		return attrVal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_attr.attr_val
	 * @param attrVal  the value for commodity_attr.attr_val
	 * @mbg.generated
	 */
	public void setAttrVal(String attrVal) {
		this.attrVal = attrVal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_attr.category
	 * @return  the value of commodity_attr.category
	 * @mbg.generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_attr.category
	 * @param category  the value for commodity_attr.category
	 * @mbg.generated
	 */
	public void setCategory(String category) {
		this.category = category;
	}
}