package com.entity.model;

import com.entity.XueshengtiwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学生体温
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XueshengtiwenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 体温
     */
    private Double xueshengtiwenTiwen;


    /**
     * 时间类型
     */
    private Integer xueshengtiwenTypes;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 身体详情
     */
    private String xueshengtiwenContent;


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
	 * 获取：体温
	 */
    public Double getXueshengtiwenTiwen() {
        return xueshengtiwenTiwen;
    }


    /**
	 * 设置：体温
	 */
    public void setXueshengtiwenTiwen(Double xueshengtiwenTiwen) {
        this.xueshengtiwenTiwen = xueshengtiwenTiwen;
    }
    /**
	 * 获取：时间类型
	 */
    public Integer getXueshengtiwenTypes() {
        return xueshengtiwenTypes;
    }


    /**
	 * 设置：时间类型
	 */
    public void setXueshengtiwenTypes(Integer xueshengtiwenTypes) {
        this.xueshengtiwenTypes = xueshengtiwenTypes;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：身体详情
	 */
    public String getXueshengtiwenContent() {
        return xueshengtiwenContent;
    }


    /**
	 * 设置：身体详情
	 */
    public void setXueshengtiwenContent(String xueshengtiwenContent) {
        this.xueshengtiwenContent = xueshengtiwenContent;
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
