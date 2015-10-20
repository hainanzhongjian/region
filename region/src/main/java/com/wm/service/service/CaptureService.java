package com.wm.service.service;

import com.wm.service.model.LonLat;
import com.wm.service.utils.CircleUtils;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @note 抓取service层
 * @author wangmeng
 * @date 2015年7月29日下午8:34:14
 */
@Service
public class CaptureService {

    /**
     * @note 抓取百度行政区
     * @author wangmeng
     * @date 2015年8月1日下午5:26:41
     */
    public void captureBaiduDistrict() {
        for (int i = 0; i < 100; i++) {
            List<LonLat> lonLatList = CircleUtils.getOneCircleLonLatList(i);

            if ((lonLatList == null) || (lonLatList.size() == 1)) {}
        }
    }
}

