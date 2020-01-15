package com.karvy.courier.test.util;

import static com.karvy.courier.test.util.TestDataReader.use;

import com.karvy.courier.test.entity.User;

public class CvsDataReader {

	public String calaculate() {
		
		
		return use(CsvReader.class).withTarget(User.class).read();
	}
}
