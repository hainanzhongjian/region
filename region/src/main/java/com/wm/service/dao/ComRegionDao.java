package com.wm.service.dao;

import com.wm.service.model.ComRegion;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComRegionDao {

    public int insert(ComRegion record);

    public ComRegion selectByPrimaryKey(Long id);

    /**
     * @note ��ȡ���ڵ�
     * @return
     */
    public ComRegion selectRootPoints();

    public ComRegion selectOneByPointsLayerName(@Param("left") int left, @Param("right") int right , @Param("layer") int layer, @Param("name") String name);

    public List<ComRegion> selectByNameLayer(@Param("name") String name, @Param("layer") int layer);

    /**
     * @note ���ݸ�point(left,right)��layer��ȡ�ڵ���ӽڵ��б�
     * @param left
     * @param right
     * @param layer
     * @return
     */
    public List<ComRegion> selectNextByPointsLayer(@Param("left") int left, @Param("right") int right , @Param("layer") int layer);

    /**
     * @note ���ݸ�point(left,right)��layer����point��name��ȡ�ڵ���ӽڵ�
     * @param left
     * @param right
     * @param layer
     * @param name
     * @return
     */
    public ComRegion selectNextByPointsLayerName(@Param("left") int left, @Param("right") int right , @Param("layer") int layer ,@Param("name") String name);

    public List<ComRegion> selectAll();

    public int updateByPrimaryKey(ComRegion record);


}