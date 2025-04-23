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
 * 核酸检测情况
 *
 * @author 
 * @email
 */
@TableName("hejianzhaungtai")
public class HejianzhaungtaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HejianzhaungtaiEntity() {

	}

	public HejianzhaungtaiEntity(T t) {
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
     * 标题
     */
    @TableField(value = "hejianzhaungtai_name")

    private String hejianzhaungtaiName;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 检测状态
     */
    @TableField(value = "hejianzhaungtai_types")

    private Integer hejianzhaungtaiTypes;


    /**
     * 检测时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "hejianzhaungtai_time")

    private Date hejianzhaungtaiTime;


    /**
     * 详情
     */
    @TableField(value = "hejianzhaungtai_content")

    private String hejianzhaungtaiContent;


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
	 * 设置：标题
	 */
    public String getHejianzhaungtaiName() {
        return hejianzhaungtaiName;
    }
    /**
	 * 获取：标题
	 */

    public void setHejianzhaungtaiName(String hejianzhaungtaiName) {
        this.hejianzhaungtaiName = hejianzhaungtaiName;
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
	 * 设置：检测状态
	 */
    public Integer getHejianzhaungtaiTypes() {
        return hejianzhaungtaiTypes;
    }
    /**
	 * 获取：检测状态
	 */

    public void setHejianzhaungtaiTypes(Integer hejianzhaungtaiTypes) {
        this.hejianzhaungtaiTypes = hejianzhaungtaiTypes;
    }
    /**
	 * 设置：检测时间
	 */
    public Date getHejianzhaungtaiTime() {
        return hejianzhaungtaiTime;
    }
    /**
	 * 获取：检测时间
	 */

    public void setHejianzhaungtaiTime(Date hejianzhaungtaiTime) {
        this.hejianzhaungtaiTime = hejianzhaungtaiTime;
    }
    /**
	 * 设置：详情
	 */
    public String getHejianzhaungtaiContent() {
        return hejianzhaungtaiContent;
    }
    /**
	 * 获取：详情
	 */

    public void setHejianzhaungtaiContent(String hejianzhaungtaiContent) {
        this.hejianzhaungtaiContent = hejianzhaungtaiContent;
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
        return "Hejianzhaungtai{" +
            "id=" + id +
            ", hejianzhaungtaiName=" + hejianzhaungtaiName +
            ", yonghuId=" + yonghuId +
            ", hejianzhaungtaiTypes=" + hejianzhaungtaiTypes +
            ", hejianzhaungtaiTime=" + hejianzhaungtaiTime +
            ", hejianzhaungtaiContent=" + hejianzhaungtaiContent +
            ", createTime=" + createTime +
        "}";
    }
}
