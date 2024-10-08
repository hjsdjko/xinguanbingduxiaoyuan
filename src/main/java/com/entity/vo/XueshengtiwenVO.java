package com.entity.vo;

import com.entity.XueshengtiwenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学生体温
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xueshengtiwen")
public class XueshengtiwenVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
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

}
