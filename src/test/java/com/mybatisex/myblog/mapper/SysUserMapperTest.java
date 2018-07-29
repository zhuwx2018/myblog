package com.mybatisex.myblog.mapper;

import com.mybatisex.myblog.domain.SysuserVO;
import com.mybatisex.myblog.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserMapperTest {
    @Autowired
    private SysuserMapper sysuserMapper;
    @Autowired
    private SysUserService sysUserService;

    @Test
    public void selectTest(){
//        PageHelper.startPage(0,10);
//        PageInfo<Sysuser> pageInfo = new PageInfo<>(sysuserMapper.selectAll());
//
//        System.out.println(JSONObject.toJSONString(pageInfo));;
        StringBuffer sb = new StringBuffer(100);
        sb.append("select distinct d421_03 from D421 entity where entity.d421_02 = '");
			/*第一类：农村五保户（2）、城市三无（8）
			第二类：农村低保户（12）、建档立卡贫困户（22）、重点优抚（13）、革命五老（14）、计生特殊家庭成员（21）、
			重度残疾人（17）、孤儿（23）、城市低保户（7）

			遵循就高不就低原则。例如：一个人有一类和二类多重有效的户属性按一类民政人员进行民政补偿。*/

            sb.append("' and to_date('").append(new Date(new java.util.Date().getTime()).toString()).append(
                    "','yyyy-mm-dd') between d421_04 and d421_05 order by (case when d421_03 = '2' then '1'  when d421_03 = '8' then '1' else '2' end) asc");
        System.out.println(sb.toString());
    }
    @Test
    public void testExample(){
//        sysUserService.selectSysUserPage(1,10);
        SysuserVO sysuserVO = new SysuserVO();
//        sysuserVO.setEndTime(new java.util.Date());
//        sysuserVO.setStartTime(new java.util.Date());
//        sysuserVO.setUserid("1");
        sysuserVO.setOperatorname("程");
        sysuserMapper.selectByVO(sysuserVO);
    }
}
