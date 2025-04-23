package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 学生体温
 *
 * @author 
 * @email
 */
@TableName("xueshengtiwen")
public class XueshengtiwenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XueshengtiwenEntity() {

	}

	public XueshengtiwenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 体温
     */
    @TableField(value = "xueshengtiwen_tiwen")

    private Double xueshengtiwenTiwen;


    /**
     * 时间类型
     */
    @TableField(value = "xueshengtiwen_types")

    private Integer xueshengtiwenTypes;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 身体详情
     */
    @TableField(value = "xueshengtiwen_content")

    private String xueshengtiwenContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：体温
	 */
    public Double getXueshengtiwenTiwen() {
        return xueshengtiwenTiwen;
    }
    /**
	 * 获取：体温
	 */

    public void setXueshengtiwenTiwen(Double xueshengtiwenTiwen) {
        this.xueshengtiwenTiwen = xueshengtiwenTiwen;
    }
    /**
	 * 设置：时间类型
	 */
    public Integer getXueshengtiwenTypes() {
        return xueshengtiwenTypes;
    }
    /**
	 * 获取：时间类型
	 */

    public void setXueshengtiwenTypes(Integer xueshengtiwenTypes) {
        this.xueshengtiwenTypes = xueshengtiwenTypes;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：身体详情
	 */
    public String getXueshengtiwenContent() {
        return xueshengtiwenContent;
    }
    /**
	 * 获取：身体详情
	 */

    public void setXueshengtiwenContent(String xueshengtiwenContent) {
        this.xueshengtiwenContent = xueshengtiwenContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xueshengtiwen{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", xueshengtiwenTiwen=" + xueshengtiwenTiwen +
            ", xueshengtiwenTypes=" + xueshengtiwenTypes +
            ", insertTime=" + insertTime +
            ", xueshengtiwenContent=" + xueshengtiwenContent +
            ", createTime=" + createTime +
        "}";
    }
}
