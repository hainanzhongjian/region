package com.wm.service.model;

import java.util.Date;

/**
 * ���ڵ������νṹ
 */
public class ComRegion {
    /**
     * ����
     */
    private Long id;

    /**
     * ����
     */
    private String name;

    /**
     * ��ڵ�
     */
    private Integer left;

    /**
     * �ҽڵ�
     */
    private Integer right;

    /**
     * ���
     */
    private Integer layer;

    /**
     * ����ʱ��
     */
    private Date createTime;

    /**
     * �޸�ʱ��
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getRight() {
        return right;
    }

    public void setRight(Integer right) {
        this.right = right;
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}