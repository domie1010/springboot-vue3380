package com.entity.vo;

import com.entity.YimiaojiezhongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 疫苗接种情况
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yimiaojiezhong")
public class YimiaojiezhongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "yimiaojiezhong_name")
    private String yimiaojiezhongName;


    /**
     * 学生
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 接种状态
     */

    @TableField(value = "yimiaojiezhong_types")
    private Integer yimiaojiezhongTypes;


    /**
     * 接种时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "yimiaojiezhong_time")
    private Date yimiaojiezhongTime;


    /**
     * 备注
     */

    @TableField(value = "yimiaojiezhong_content")
    private String yimiaojiezhongContent;


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
    public String getYimiaojiezhongName() {
        return yimiaojiezhongName;
    }


    /**
	 * 获取：标题
	 */

    public void setYimiaojiezhongName(String yimiaojiezhongName) {
        this.yimiaojiezhongName = yimiaojiezhongName;
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
	 * 设置：接种状态
	 */
    public Integer getYimiaojiezhongTypes() {
        return yimiaojiezhongTypes;
    }


    /**
	 * 获取：接种状态
	 */

    public void setYimiaojiezhongTypes(Integer yimiaojiezhongTypes) {
        this.yimiaojiezhongTypes = yimiaojiezhongTypes;
    }
    /**
	 * 设置：接种时间
	 */
    public Date getYimiaojiezhongTime() {
        return yimiaojiezhongTime;
    }


    /**
	 * 获取：接种时间
	 */

    public void setYimiaojiezhongTime(Date yimiaojiezhongTime) {
        this.yimiaojiezhongTime = yimiaojiezhongTime;
    }
    /**
	 * 设置：备注
	 */
    public String getYimiaojiezhongContent() {
        return yimiaojiezhongContent;
    }


    /**
	 * 获取：备注
	 */

    public void setYimiaojiezhongContent(String yimiaojiezhongContent) {
        this.yimiaojiezhongContent = yimiaojiezhongContent;
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
