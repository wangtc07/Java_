package com.abc.demo;

import com.abc.demo.task.AsyncTask;
import com.abc.demo.task.SyncTask;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private AsyncTask asyncTask;

	@Autowired
	private SyncTask syncTask;

	@Test
	void contextLoads() throws Exception {

		// 同步處理
		syncTask.doTaskOne();
		syncTask.doTaskTwo();

		// 異步處理
		asyncTask.asyncMethodWithReturnType();
		asyncTask.asyncMethodWithVoidReturnType();
	}

}
