package com.entity.vo;

import com.entity.HejianzhaungtaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 核酸检测情况
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("hejianzhaungtai")
public class HejianzhaungtaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
