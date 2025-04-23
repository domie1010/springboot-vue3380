package com.entity.model;

import com.entity.HejianzhaungtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 核酸检测情况
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HejianzhaungtaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String hejianzhaungtaiName;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 检测状态
     */
    private Integer hejianzhaungtaiTypes;


    /**
     * 检测时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date hejianzhaungtaiTime;


    /**
     * 详情
     */
    private String hejianzhaungtaiContent;


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
    public String getHejianzhaungtaiName() {
        return hejianzhaungtaiName;
    }


    /**
	 * 设置：标题
	 */
    public void setHejianzhaungtaiName(String hejianzhaungtaiName) {
        this.hejianzhaungtaiName = hejianzhaungtaiName;
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
	 * 获取：检测状态
	 */
    public Integer getHejianzhaungtaiTypes() {
        return hejianzhaungtaiTypes;
    }


    /**
	 * 设置：检测状态
	 */
    public void setHejianzhaungtaiTypes(Integer hejianzhaungtaiTypes) {
        this.hejianzhaungtaiTypes = hejianzhaungtaiTypes;
    }
    /**
	 * 获取：检测时间
	 */
    public Date getHejianzhaungtaiTime() {
        return hejianzhaungtaiTime;
    }


    /**
	 * 设置：检测时间
	 */
    public void setHejianzhaungtaiTime(Date hejianzhaungtaiTime) {
        this.hejianzhaungtaiTime = hejianzhaungtaiTime;
    }
    /**
	 * 获取：详情
	 */
    public String getHejianzhaungtaiContent() {
        return hejianzhaungtaiContent;
    }


    /**
	 * 设置：详情
	 */
    public void setHejianzhaungtaiContent(String hejianzhaungtaiContent) {
        this.hejianzhaungtaiContent = hejianzhaungtaiContent;
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
