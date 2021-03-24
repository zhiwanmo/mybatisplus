package com.wanmo.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanmo.mybatisplus.entity.User;
import com.wanmo.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisplusApplicationTests {

	@Autowired
	private UserMapper userMapper;

    /***
     * 测试逻辑删除
     */
    @Test
    public void testLogicDelete() {
        int result = userMapper.deleteById(1L);
        System.out.println(result);
    }

    /**
     * 简单条件删除
     */
    @Test
    public void testDeleteByMap() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "Jack");
        map.put("age", 20);
        int result = userMapper.deleteByMap(map);
        System.out.println(result);
    }

    /**
     * 根据ID查询
     */
    @Test
    public void testDeleteById(){
        int result = userMapper.deleteById(1374616697929248770L);
        System.out.println(result);
    }

    /**
     * 批量ID查询
     */
    @Test
    public void testDeleteBatchIds() {
        int result = userMapper.deleteBatchIds(Arrays.asList(3, 4, 5));
        System.out.println(result);
    }

    /**
     * 分页查询
     */
    @Test
    public void testSelectMapsPage() {
        //Page不需要泛型
        Page<Map<String, Object>> page = new Page<>(1, 5);
        Page<Map<String, Object>> pageParam = userMapper.selectMapsPage(page, null);
        List<Map<String, Object>> records = pageParam.getRecords();
        for (Map<String, Object> record : records) {
            System.out.println(record);
        }
        // records.forEach(System.out::println);
        System.out.println(pageParam.getCurrent());
        System.out.println(pageParam.getPages());
        System.out.println(pageParam.getSize());
        System.out.println(pageParam.getTotal());
        System.out.println(pageParam.hasNext());
        System.out.println(pageParam.hasPrevious());
    }

    /**
     * 分页查询
     */
    @Test
    public void testSelectPage() {
        Page<User> page = new Page<User>(1,3);
        Page<User> userPage = userMapper.selectPage(page, null);
        //返回对象得到分页所有数据
        long pages = userPage.getPages(); //总页数
        long current = userPage.getCurrent(); //当前页
        List<User> records = userPage.getRecords(); //查询数据集合
        long total = userPage.getTotal(); //总记录数
        boolean hasNext = userPage.hasNext();  //下一页
        boolean hasPrevious = userPage.hasPrevious(); //上一页

        System.out.println(pages);
        System.out.println(current);
        System.out.println(records);
        System.out.println(total);
        System.out.println(hasNext);
        System.out.println(hasPrevious);
    }


    /**
     * 简单条件查询
     */
    @Test
    public void selectByMap() {
        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("name","Jack");
        columnMap.put("age",20);
        List<User> users = userMapper.selectByMap(columnMap);
        System.out.println(users);
    }

    /**
     * 批量ID查询
     */
	@Test
	public void selectBatchIds() {
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        System.out.println(users);
    }

    /**
     * 更新测试
     */
	@Test
	public void updateById() {
        User user = userMapper.selectById(1374633733820596225L);
        user.setAge(18);

        int update = userMapper.updateById(user);
        System.out.println(update);
    }

    /**
     * 添加测试
     */
	@Test
	public void inserTest() {
	    User user = new User();
	    user.setName("王五");
	    user.setAge(20);
	    user.setEmail("zhangsan@163.com");
        userMapper.insert(user);
    }


    /**
     * 根据ID查询
     */
    @Test
    public void selectById() {
        User user = userMapper.selectById(1374606009118756865L);
        System.out.println(user);
    }

    /**
     * 查询所有数据
     */
	@Test
	public void selectList() {
		List<User> users = userMapper.selectList(null);
		System.out.println(users);

	}

}
