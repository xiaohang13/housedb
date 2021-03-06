package com.github.coolcool.sloth.lianjiadb.service;
import java.util.*;
import com.github.coolcool.sloth.lianjiadb.model.Process;
import com.github.coolcool.sloth.lianjiadb.common.Page;
import javax.annotation.Generated;

@Generated(
	value = {
		"https://github.com/coolcooldee/sloth",
		"Sloth version:1.0"
	},
	comments = "This class is generated by Sloth"
)
public interface ProcessService{


	/**
	 * 获取在售房源和已经成交的房源链接地址
	 */
	void fetchHouseUrls() throws InterruptedException;

	void fetchHouseDetail() throws InterruptedException;

	void checkChange() throws InterruptedException;


	Integer save(Process process);

	Integer count();

	Process getById(Object id);

	void deleteById(Object id);

	void update(Process process);

	List<Process> list();

	Page<Process> page(int pageNo, int pageSize);

	Integer increment();

	/**
	 * 生成每日执行任务
	 */
	void genProcesses();

	/**
	 * 计算城区区域下，今天的计划任务数量
	 * @param areaCode
	 * @return
     */
	int countTodayProcessByAreaCode(String areaCode);
}