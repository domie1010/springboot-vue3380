package com.entity.model;

import com.entity.YimiaojiezhongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 疫苗接种情况
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YimiaojiezhongModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String yimiaojiezhongName;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 接种状态
     */
    private Integer yimiaojiezhongTypes;


    /**
     * 接种时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yimiaojiezhongTime;


    /**
     * 备注
     */
    private String yimiaojiezhongContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getYimiaojiezhongName() {
        return yimiaojiezhongName;
    }


    /**
	 * 设置：标题
	 */
    public void setYimiaojiezhongName(String yimiaojiezhongName) {
        this.yimiaojiezhongName = yimiaojiezhongName;
    }
    /**
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：接种状态
	 */
    public Integer getYimiaojiezhongTypes() {
        return yimiaojiezhongTypes;
    }


    /**
	 * 设置：接种状态
	 */
    public void setYimiaojiezhongTypes(Integer yimiaojiezhongTypes) {
        this.yimiaojiezhongTypes = yimiaojiezhongTypes;
    }
    /**
	 * 获取：接种时间
	 */
    public Date getYimiaojiezhongTime() {
        return yimiaojiezhongTime;
    }


    /**
	 * 设置：接种时间
	 */
    public void setYimiaojiezhongTime(Date yimiaojiezhongTime) {
        this.yimiaojiezhongTime = yimiaojiezhongTime;
    }
    /**
	 * 获取：备注
	 */
    public String getYimiaojiezhongContent() {
        return yimiaojiezhongContent;
    }


    /**
	 * 设置：备注
	 */
    public void setYimiaojiezhongContent(String yimiaojiezhongContent) {
        this.yimiaojiezhongContent = yimiaojiezhongContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
